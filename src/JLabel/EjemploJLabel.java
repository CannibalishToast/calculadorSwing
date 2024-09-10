package JLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EjemploJLabel {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);
        
        JLabel etiqueta = new JLabel("Hola Mundo!", SwingConstants.CENTER);
        etiqueta.setBounds(350,10,150,50);
        ventana.add(etiqueta);
        
        ventana.setVisible(true);
    }
    
}