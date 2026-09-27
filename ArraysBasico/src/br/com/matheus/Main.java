package br.com.matheus;

import java.util.Scanner;

public class Main {
    static void main() {
        Calendario cal = new Calendario();

        cal.mes = new Mes[12];

        Mes mes1 = new Mes();
        mes1.nome = "Janeiro";
        mes1.numero = 1;

        Mes mes2 = new Mes();
        mes2.nome = "Fevereiro";
        mes2.numero = 2;

        Mes mes3 = new Mes();
        mes3.nome = "Março";
        mes3.numero = 3;

        Mes mes4 = new Mes();
        mes4.nome = "Abril";
        mes4.numero = 4;

        Mes mes5 = new Mes();
        mes5.nome = "Maio";
        mes5.numero = 5;

        Mes mes6 = new Mes();
        mes6.nome = "Junho";
        mes6.numero = 6;

        Mes mes7 = new Mes();
        mes7.nome = "Julho";
        mes7.numero = 7;

        Mes mes8 = new Mes();
        mes8.nome = "Agosto";
        mes8.numero = 8;

        Mes mes9 = new Mes();
        mes9.nome = "Setembro";
        mes9.numero = 9;

        Mes mes10 = new Mes();
        mes10.nome = "Outubro";
        mes10.numero = 10;

        Mes mes11 = new Mes();
        mes11.nome = "Novembro";
        mes11.numero = 11;

        Mes mes12 = new Mes();
        mes12.nome = "Dezembro";
        mes12.numero = 12;

        cal.mes[0] = mes1;
        cal.mes[1] = mes2;
        cal.mes[2] = mes3;
        cal.mes[3] = mes4;
        cal.mes[4] = mes5;
        cal.mes[5] = mes6;
        cal.mes[6] = mes7;
        cal.mes[7] = mes8;
        cal.mes[8] = mes9;
        cal.mes[9] = mes10;
        cal.mes[10] = mes11;
        cal.mes[11] = mes12;

        cal.obterNomeMes(2);


        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
    }
}
