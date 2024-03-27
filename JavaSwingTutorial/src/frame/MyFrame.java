package frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    //JFrame è una GUI al quale aggiungere componenti

    public MyFrame() {

        this.setTitle("Tutorial"); // imposta il titolo della finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // imposta la chiusura dell'applicazione anzichè nasconderla e basta. Si può anche usare DO_NOTHING o HIDE (default)
        this.setResizable(true);  //imposta la possibilità di modificare la dimensione della finestra
        this.setSize(1280, 720); // imposta dimensione standard, prima x e poi y
        this.setVisible(true); // imposta il frame visibile, da mettere alla fine

        ImageIcon icon = new ImageIcon("JavaSwingTutorial\\icon.png"); //crea un ImageIcon
        this.setIconImage(icon.getImage());  // cambia l'icona
        Color custom = new Color(0xBEE16E);   // crea un colore custom
        this.getContentPane().setBackground(custom);   // cambia il colore del backgroun con il colore custom

    }
    
}
