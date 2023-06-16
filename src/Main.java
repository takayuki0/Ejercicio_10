/**
 * 10.- Cree su propia clase de excepción utilizando la palabra clave extends.
 * Escriba un constructor para dicha clase que tome un argumento String y lo
 * almacene dentro del objeto como una referencia de tipo String.
 * Escriba un método que muestre la cadena de caracteres almacenada.
 * Cree una cláusula try-catch para probar la nueva excepción.
 */
public class Main {
    public static void main(String[] args) {

        try {

            throw new MiExcepcion("Este es el mensaje de Referencia para mis Excepciones.");

        } catch (MiExcepcion e) {

            System.out.println("Mensaje de la Excepción:\n" + e.mostrarCadena());

        }

    }
}