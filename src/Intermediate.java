
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Intermediate extends JFrame
{
    
    ImageIcon guy = new ImageIcon("com\\icons\\Untitled.gif");
        JLabel pn = new JLabel(guy);
        JPanel panel = new JPanel();
     public Intermediate() throws IOException{
         super("Advanced Audio Equalizer");
        setSize(700,450);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(panel);
        JLabel im = new JLabel(new ImageIcon("com\\icons\\Untitled.gif"));
        panel.add(im);
            add(pn);
	//JLabel background = new JLabel(new ImageIcon("C:\\Users\\akashb\\Dropbox\\PClub Project\\Dhruv's Code\\MusicPlayer\\src\\musicplayer\\image.jpg"));
	//add(background);
	//background.setLayout(new FlowLayout());
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\akashb\\Dropbox\\PClub Project\\Dhruv's Code\\MusicPlayer\\build\\classes\\musicplayer\\bg.png")));
        /*BufferedImage myPicture = ImageIO.read(new File("image.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);*/
    }
}
