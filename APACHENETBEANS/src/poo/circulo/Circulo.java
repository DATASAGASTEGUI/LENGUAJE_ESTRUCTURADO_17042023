package poo.circulo;

public class Circulo {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    public static void cabecera() {
        System.out.printf("%-3s  %6s  %10s  %11s\n", "N", "RADIO", "AREA", "PERIMETRO");
        System.out.printf("%-3s  %6s  %10s  %11s\n", "-", "-----", "----", "---------");
    }

    public void cuerpo(int i) {
        System.out.printf("%-3d  %6.2f  %10.2f  %11.2f\n", i, this.getRadio(), this.area(), this.perimetro());
    }

}
