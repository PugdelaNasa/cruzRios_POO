package n05_interfaces;

public class cuadradoPrueba implements figuraPrueba , Dibujable{

    private double lado;

    public cuadradoPrueba() {
    }

    public cuadradoPrueba(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }




}
