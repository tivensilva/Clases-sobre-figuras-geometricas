/**
 * Esta clase define objetos de tipo Rectángulo con una base y una
 * altura como atributos.
 * @version 1.2/2020
 */
public class Rectángulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * @return Área de un rectángulo
     */
    double calcularArea() {
        return base * altura;
    }
    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * @return Perímetro de un rectángulo
     */
    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}