package test;

import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import frame.MyFrame;

//import java.awt.Color;

//import javax.swing.ImageIcon;
//import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        // JFrame è una GUI al quale aggiungere componenti

        /*
         * JFrame frame = new JFrame(); // crea un frame
         * frame.setTitle("Tutorial"); // imposta il titolo della finestra
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // imposta la chiusura
         * dell'applicazione anzichè nasconderla e basta. Si può anche usare DO_NOTHING
         * o HIDE (default)
         * frame.setResizable(true); //imposta la possibilità di modificare la
         * dimensione della finestra
         * frame.setSize(1280, 720); // imposta dimensione standard, prima x e poi y
         * frame.setVisible(true); // imposta il frame visibile, da mettere alla fine
         * 
         * ImageIcon icon = new ImageIcon("JavaSwingTutorial\\icon.png"); //crea un
         * ImageIcon
         * frame.setIconImage(icon.getImage()); // cambia l'icona
         * Color custom = new Color(0xBEE16E); // crea un colore custom
         * frame.getContentPane().setBackground(custom); // cambia il colore del
         * backgroun con il colore custom
         */

        MyFrame frame = new MyFrame();

        // JLable permette di mostrare del testo, un immagine o entrambi

        JLabel lable = new JLabel(); // puoi anche passare il testo qui JLabel lable = new JLabel("Lorem ipsum dolor
                                     // sit amet consectetur adipisicing elit.");
        lable.setText("BOTTOM TEXT"); // mette il testo
        frame.add(lable); // aggiunge la lable al frame
        ImageIcon image = new ImageIcon(new URL(" https://picsum.photos/300/300"));
        lable.setIcon(image); // aggiunge l'immagine
        lable.setHorizontalTextPosition(JLabel.CENTER); // mette il testo a sinistra, destra o al centro dell'immagine
        lable.setVerticalTextPosition(JLabel.BOTTOM); // mette il testo sopra, sotto o al centro dell'immagine
        lable.setForeground(Color.white); // cambia il colore del font
        lable.setFont(new Font("Impact", Font.BOLD, 40)); // imposta il font, il tipo e la dimensione
        lable.setIconTextGap(2); // imposta il gap tra l'immagine e il testo
        lable.setBackground(Color.black); // cambia il colore dello sfonto della lable
        lable.setOpaque(true); // imposta l'opacità dello sfondo della lable

        Border Border = BorderFactory.createLineBorder(Color.white, 3); // crea un bordo
        lable.setBorder(Border); // applica il bordo alla lable

        lable.setVerticalAlignment(JLabel.CENTER); // imposta la posizione della lable verticalmente
        lable.setHorizontalAlignment(JLabel.CENTER); // e orizzontalmente

        // frame.setLayout(null); // imposta il layoutManager a null per poter decidere
        // le dimensioni e la posizione della lable manualmente

        // lable.setBounds(0, 0, 400, 400); // imposta la posizione x e y nel frame e le
        // dimensioni x e y della lable

        frame.pack();  // da mettere alla fine

    }

}