
public class EjemploScope {

    public static void main(String[] args) {
        System.out.println("HOla esto es prueva de if "
                + "digame su edad ");

        int edad = 18;
        int cantidadPersonas = 2;

        boolean esPareja;
        
        if (cantidadPersonas > 1) {
            esPareja = true;
        } else {
            esPareja = false;
        }

        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println("El valor de la condiciion es " + esPareja);

        if (puedeEntrar) {

            System.out.println("usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no esta permitido a "
                    + "entrar");
        }

    }

}
