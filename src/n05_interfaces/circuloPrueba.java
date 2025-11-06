package n05_interfaces;

public class circuloPrueba implements figuraPrueba, Dibujable, Rotable{
    private double radio;

    public circuloPrueba() {
    }

    public circuloPrueba(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando circulo");
    }




}
