package org.ejemplos.depositos.modelo;

public class Cilindro {
    private double radio;
    private double altura;
    private double area;
    private double volumen;

    public Cilindro() {
        this(0, 0);
    }

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        actualizarCalculos();
    }

    public double calcularArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    private void actualizarCalculos() {
        this.area = calcularArea();
        this.volumen = calcularVolumen();
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; actualizarCalculos(); }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; actualizarCalculos(); }

    public double getArea() { return area; }
    public double getVolumen() { return volumen; }

    @Override
    public String toString() {
        return String.format("Cilindro [radio=%.4f m, altura=%.4f m, area=%.4f m², volumen=%.4f m³]",
                radio, altura, area, volumen);
    }
}
