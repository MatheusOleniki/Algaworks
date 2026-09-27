package br.com.matheus;

public class Calendario {
    Mes[] mes;


    void obterNomeMes(int numeroMes) {
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] != null && mes[i].numero == numeroMes) {
                System.out.printf("%d - %s", mes[i].numero, mes[i].nome);
            }
        }
    }

}
