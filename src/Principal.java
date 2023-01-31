import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Metodo MAIN > 
    /*
    -para que las clases que ya hemos creado se ejecuten, estas tienen que
    estar instanciadas a traves de un OBJETO en la clase principal (main). 
    */  
        //Clase JFRAME (de la libreria SWING)> 
            /* -SWING: componentes de interfaces visuales 
            -La clase JFrame encapsula el concepto de una ventana.  
            - CLASES > Objetos       
            */
                // Aparte de INSTANCIAR OBJETOS en algunas clases, en determinados casos tendremos que agregarlos con el metodo ADD.
                 
        
// CLASE MAIN
public class Principal {
    public static void main(String[] args) {
      //Objeto marco  
        Marco marco = new Marco ();
       //Metodo .setDefaultCloseOperation 
            //-recibe como parametro una constante estatica
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //Metodo  setVisible recibe un booleano como parametro. 
        marco.setVisible (true);   
       
    }
}

// CLASE MARCO
class Marco extends JFrame{
        //palabra reservada EXTENDS nos indica que se heredara de la clase JFRAME.
        //El objeto MARCO heredara de JFRAME.
    public Marco(){
    //Metodo CONSTRUCTOR de la clase MARCO.  
        setBounds (300, 300, 300, 300);
       //Metodo setBouns:
            //-recibe 4 parametros
        setTitle("MI EDITOR DE TEXTO");
       //Metodo setTitle: recibe un parametro STRING (una cadena de texto) 
        Panel p = new Panel(); 
      //Objeto PANEL. 
      //Se creo un objeto panel para INSTANCIAR la clase panel creada anteriormente allá abajo.
        add(p);  
      //Metodo ADD para agregar objetos de forma visible gg.   
    }

    /*private void add(Panel p) {
    } */

}

// CLASE PANEL
class Panel extends JPanel {
        //palabra reservada EXTENDS nos indica que se heredara de la clase JPANEL.
    public Panel(){
    //Metodo CONSTRUCTOR de la clase MARCO.
        JLabel etiqueta = new JLabel ("Hola mundo");
        add(etiqueta);
    }
}

//gggggg