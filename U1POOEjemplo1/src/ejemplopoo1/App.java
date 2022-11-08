package ejemplopoo1;

import ejemplopoo1.modelo.Cuadrado;
import ejemplopoo1.modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona("Pepito", 24);
        System.out.println(p.getNombre() + " - " + p.getEdad());

        Cuadrado c = new Cuadrado(6);
        System.out.println("Área: " + c.getArea());
        c.setLado(11);
        System.out.println("Área: " + c.getArea());
    }
}
