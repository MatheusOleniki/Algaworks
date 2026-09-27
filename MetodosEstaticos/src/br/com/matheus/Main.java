package br.com.matheus;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado que voce deseja saber a área: ");
        double ladoDoQuadrado = sc.nextDouble();
        double areaQuadrado = CalculoArea.calcularQuadrado(ladoDoQuadrado);

        System.out.println("A área do quadrado é : " + areaQuadrado);


        System.out.println("Digite o valor do raio do circulo que vc deseja saber a área: ");
        double raioDoCirculo = sc.nextDouble();
        double areaCirculo = CalculoArea.calcularCirculo(raioDoCirculo);

        System.out.println("A área do circulo é: " + areaCirculo);
    }
}
