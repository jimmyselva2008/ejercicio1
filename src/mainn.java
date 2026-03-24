import javax.swing.JOptionPane;

public class mainn {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese un numero entero:");

        if (entrada == null) {
            return;
        }

        int numero = Integer.parseInt(entrada);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar.");
        }
    }
}
