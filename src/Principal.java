import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal {
    public static void main(String[] args) {
        Marco marco = new Marco ();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible (true);   
    }
}

class Marco extends JFrame{
    public Marco(){
        setBounds (300, 300, 300, 300);
        setTitle("MI EDITOR DE TEXTO");
        Panel p = new Panel(); 
        add(p);   
    }

    /*private void add(Panel p) {
    } */

}

class Panel extends JPanel {
    public Panel(){
        JLabel etiqueta = new JLabel ("Hola mundo");
        add(etiqueta);
    }
}