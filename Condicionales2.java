
public class Condicionales2 {

    public static void main(String[] args) {
        System.out.println("HOla esto es prueva de if "
                + "digame su edad ");

        int edad = 18;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        if (puedeEntrar) {

            System.out.println("usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no esta permitido a "
                    + "entrar");
        }

    }

}
