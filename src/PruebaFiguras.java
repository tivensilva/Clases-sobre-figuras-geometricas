import javax.swing.JOptionPane;

public class PruebaFiguras {

    public static void main(String[] args) {
        boolean finPrograma = false;
        while (!finPrograma) {
            String menu = "Seleccione una opción:\n"
                    + "1. Círculo\n"
                    + "2. Rectángulo\n"
                    + "3. Cuadrado\n"
                    + "4. Triángulo rectángulo\n"
                    + "5. Salir";

            String eleccion = JOptionPane.showInputDialog(menu);
            int opcion = Integer.parseInt(eleccion);

            switch (opcion) {
                case 1: {
                    String radio = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
                    Círculo figura1 = new Círculo(Integer.parseInt(radio));
                    JOptionPane.showMessageDialog(null, "El área del círculo es = " + figura1.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perímetro del círculo es = " + figura1.calcularPerímetro());
                    break;
                }
                case 2: {
                    String base = JOptionPane.showInputDialog("Ingrese la base del rectángulo:");
                    String altura = JOptionPane.showInputDialog("Ingrese la altura del rectángulo:");
                    Rectángulo figura2 = new Rectángulo(Integer.parseInt(base), Integer.parseInt(altura));
                    JOptionPane.showMessageDialog(null, "El área del rectángulo es = " + figura2.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es = " + figura2.calcularPerímetro());
                    break;
                }
                case 3: {
                    String lado = JOptionPane.showInputDialog("Ingrese el lado del cuadrado:");
                    Cuadrado figura3 = new Cuadrado(Integer.parseInt(lado));
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es = " + figura3.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perímetro del cuadrado es = " + figura3.calcularPerímetro());
                    break;
                }
                case 4: {
                    String base = JOptionPane.showInputDialog("Ingrese la base del triángulo rectángulo:");
                    String altura = JOptionPane.showInputDialog("Ingrese la altura del triángulo rectángulo:");
                    TriánguloRectángulo figura4 = new TriánguloRectángulo(Integer.parseInt(base), Integer.parseInt(altura));
                    JOptionPane.showMessageDialog(null, "El área del triángulo rectángulo es = " + figura4.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perímetro del triángulo rectángulo es = " + figura4.calcularPerimetro());
                    figura4.determinarTipoTriangulo();
                    JOptionPane.showMessageDialog(null, "Se ha determinado el tipo de triángulo.");
                    break;
                }
                case 5: {
                    finPrograma = true;
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor ingrese una opción válida.");
                    break;
            }
        }
    }
}
