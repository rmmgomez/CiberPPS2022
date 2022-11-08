package ejemplopoo1.modelo;

public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
