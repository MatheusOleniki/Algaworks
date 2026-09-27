package br.com.matheus;

public class CalculoArea {
    double lado;
    double raio;

    public static double calcularQuadrado(double lado) {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public static double calcularCirculo(double raio) {
        double pi = 3.14159265358979323846;
        double areaCirculo = (raio * raio) * pi;
        return areaCirculo;
    }
}
