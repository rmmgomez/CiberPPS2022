import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void ejemplo1() {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int adivina = (int) (Math.random() * 10 + 1);
        int num;

        do {
            System.out.print("Adivina el número del 1 al 10: ");
            num = sc.nextInt();
            intentos++;
        } while (adivina != num && intentos < 3);

        if (adivina == num) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Has fallado. El número era: " + adivina);
        }

    }

    public static void ejemplo2() {
        for (int i = 1; i < 10000; i *= 2) {
            System.out.println("Repetición número " + i);
        }
    }

    public static void ejemplo3() {
        int[] numeros = new int[5];
        numeros[0] = 34;
        numeros[1] = 25;
        numeros[2] = 46;
        numeros[3] = 13;
        numeros[4] = 65;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición: " + i + ". Valor: " + numeros[i]);
        }

        int[] numeros2 = { 34, 25, 46, 13, 65 };

        for(int num: numeros2) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(numeros2));
    }

    public static void ejemplo4() {
        int[] numeros = { 34, 25, 46, 13, 65 };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        String[] palabras = { "motocicleta", "gol", "casa", "amapola", "llaves" };
        Arrays.sort(palabras); // Ordena alfabéticamente
        System.out.println(Arrays.toString(palabras));

        Arrays.sort(palabras, (s1, s2) -> s1.length() - s2.length()); // Ordenar por longitud
        System.out.println(Arrays.toString(palabras));
    }

    public static void main(String[] args) throws Exception {
        // ejemplo1();
        // ejemplo2();
        // ejemplo3();
        ejemplo4();
    }
}
