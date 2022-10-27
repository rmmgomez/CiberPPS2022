import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void ejemplo1() {
        String nombre = "Pepe";
        int edad = 34;
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }

    public static void ejemplo2() {
        String s1 = "hola";
        String s2 = "ho";
        s2 += "la";
        System.out.println(s1 == s2); // false. No son el mismo objeto en memoria
        System.out.println(s1.equals(s2)); // true. Son iguales. Compara valores
        System.out.println(!s1.equals(s2)); // false. No son distinas. Compara valores
        System.out.println(s1 + " - " + s2);
    }

    public static void ejemplo3() {
        double dec = 23.63;
        int entero = (int) dec; // Eliminamos la parte decimal
        System.out.println(entero); // 23

        int a = 11, b = 4;
        System.out.println(a / (double) b);

        char c = 'b';
        char c2 = '↗';
        System.out.println("El caracter '" + c + "' tiene la posición " + (int) c);
        System.out.println("El caracter '" + c2 + "' tiene la posición " + (int) c2);

    }

    public static void ejemplo4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

    public static void ejemplo5() {
        LocalDate date = LocalDate.now();
        // switch (date.getDayOfWeek().getValue()) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("Dia laborable");
        // break;
        // case 6:
        // case 7:
        // System.out.println("Fin de semana");
        // }
        switch (date.getDayOfWeek().getValue()) {
            case 1, 2, 3, 4, 5 -> System.out.println("Dia laborable");
            case 6, 7 -> System.out.println("Fin de semana");
        }
    }

    public static void ejemplo6() {
        LocalDateTime date = LocalDateTime.now();
        int hora = date.getHour();
        System.out.println("Estamos en la " + (hora < 12 ? "primera" : "segunda") + " mitad del día");
    }

    /**
     * Pregunta al usuario por su edad y su nombre (en este orden)
     * Comprueba si es mayor de edad y dile "Nombre eres mayor de edad"
     * o "Nombre eres menor de edad" dependiendo
     * int edad = Integer.parseInt(edadString)
     */
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();

        if(edad < 18) {
            System.out.println(nombre + " eres menor de edad");
        } else {
            System.out.println(nombre + " eres mayor de edad");
        }
    }   

    public static void main(String[] args) throws Exception {
        // ejemplo1();
        // ejemplo2();
        // ejemplo3();
        // ejemplo4();
        // ejemplo5();
        // ejemplo6();
        ejercicio1();
    }
}
