package br.com.matheus;

public class Main {
    static void main() {
        Participante participante1 = new Participante("João");
        Participante participante2 = new Participante("Maria", 10_000);

        System.out.printf("%s tem %d pontos%n", participante1.nome, participante1.saldoDePontos);
        System.out.printf("%s tem %d pontos%n", participante2.nome, participante2.saldoDePontos);
    }
}
