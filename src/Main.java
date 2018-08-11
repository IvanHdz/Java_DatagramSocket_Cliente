
import javax.swing.JFrame;

/**
 *
 * @author Viruz
 */
public class Main {

    public static void main(String args[]) {
        VentanaCliente cliente = new VentanaCliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cliente.esperarPaquetesServidor();
    }
}
