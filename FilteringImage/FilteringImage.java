import ij.IJ;
import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.plugin.filter.Convolver;
import ij.plugin.filter.PlugInFilter;
import ij.process.FloatProcessor;
import ij.process.ImageProcessor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GaborFilterPlugin implements PlugInFilter 
{
    private ImagePlus imp;

    @Override
    public int setup(String arg, ImagePlus imp) 
    {
        this.imp = imp;
        return DOES_ALL;
    }

    @Override
    public void run(ImageProcessor ip) 
    {
        // Afficher une boîte de dialogue pour définir les paramètres
        GenericDialog gd = new GenericDialog("Paramètres du filtre de Gabor");
        gd.addNumericField("Fréquence spatiale :", 0.1, 2);
        gd.addNumericField("Orientation (en degrés) :", 0, 0);
        gd.showDialog();

        if (gd.wasCanceled()) 
        {
            return;
        }

        // Récupérer les paramètres de l'utilisateur
        double frequency = gd.getNextNumber();
        double theta = gd.getNextNumber();

        // Appliquer le filtre de Gabor
        ImageProcessor filteredIp = applyGaborFilter(ip, frequency, theta);

        // Afficher l'image filtrée
        ImagePlus filteredImage = new ImagePlus("Image Filtrée", filteredIp);
        filteredImage.show();
    }

    private ImageProcessor applyGaborFilter(ImageProcessor ip, double frequency, double theta) 
    {
        // Créer le noyau de Gabor
        int size = 10; // Taille du noyau (à ajuster selon les besoins)
        float[][] kernel = createGaborKernel(size, frequency, theta);

        // Appliquer le noyau à l'image
        Convolver convolver = new Convolver();
        FloatProcessor fp = ip.convertToFloatProcessor();
        convolver.convolve(fp, kernel, size, size);

        return fp;
    }

    private float[][] createGaborKernel(int size, double frequency, double theta) 
    {
        float[][] kernel = new float[size][size];
        double sigma = 2.0;
        double gamma = 1.0;
        double psi = 0.0;

        double thetaRad = Math.toRadians(theta);

        for (int x = 0; x < size; x++) 
        {
            for (int y = 0; y < size; y++) 
            {
                double xTheta = x * Math.cos(thetaRad) + y * Math.sin(thetaRad);
                double yTheta = -x * Math.sin(thetaRad) + y * Math.cos(thetaRad);

                double value = Math.exp(-(xTheta * xTheta + gamma * gamma * yTheta * yTheta) / (2 * sigma * sigma))
                        * Math.cos(2 * Math.PI * frequency * xTheta + psi);

                kernel[x][y] = (float) value;
            }
        }

        return kernel;
    }

    public static void main(String[] args) 
    {
        // Créer une interface utilisateur simple
        JFrame frame = new JFrame("Filtre de Gabor");
        JButton openButton = new JButton("Charger une image");
        openButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                IJ.run("Image Sequence...");
            }
        });

        JPanel panel = new JPanel();
        panel.add(openButton);
        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
