import java.time.LocalDateTime;
import java.util.Arrays;

public class App {
    static void hola(String nombre) {
        System.out.println("Hola " + nombre);
    }

    static int suma(int n1, int n2) {
        return n1 + n2;
    }

    static void mostrarDatos(String nombre, String ...lenguajes) {
        System.out.println(nombre);
        System.out.println("Lenguajes que domina: " + Arrays.toString(lenguajes));
    }

    static void cambiaArray(int[] numeros) {
        numeros[0] = 99;
    }

    public static void main(String[] args) throws Exception {
        hola("Pepe");
        hola("Ana");
        int total = suma(5, 7);
        System.out.println(total);
        mostrarDatos("Juan");
        mostrarDatos("Juan", "Java");
        mostrarDatos("Juan", "Java", "C#", "C++", "Python", "JavaScript");
        
        int[] nums = {1, 2, 3, 4, 5};
        cambiaArray(nums);
        System.out.println(Arrays.toString(nums));

        String cadena = "Hola que tal estás";
        System.out.println(cadena.indexOf("que"));
        System.out.println(cadena.toUpperCase());

        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha);
    }
}