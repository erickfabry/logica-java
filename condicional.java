package main.java;

public class condicional {

    public static void main(String[] args) {
        System.out.println("HOla esto es prueva de if");

        int edad = 17;
        int cantidad = 2;
        if (edad >= 18) {
            System.out.println("usted puede entrar");
        } else {

            if (cantidad >= 2) {
                System.out.println("Usted es menor pero "
                        + "por ser acompaniado de "
                        + "mayores de edad es");
            } else {
                System.out.println("Usted no esta permitido a "
                        + "entrar");
            }
            System.out.println("Bienvenido");

        }

    }
}
