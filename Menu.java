// package ATIVIDADES_19_10_2022;
import java.util.Scanner;

import java.io.*;

public class Menu {
    public static final String txtAmarelo="\u001B[33m";
    public static final String txtAzul="\u001B[34m";
    public static final String txtVerde="\u001B[32m";
    public static final String txtVermelho="\u001B[31m";
    public static final String txtReset="\u001B[0m";
    public static void main(String[] args) {

        String esc = " ";
        Scanner scan = new Scanner(System.in);
        while (!esc.equals("x")){
            System.out.println(txtAzul+"-=-=-=-=-Menu-=-=-=-=-"+txtReset);
            System.out.println(txtVerde+"a)"+txtAmarelo+" Questão 00"+txtVerde);
            System.out.println("b)"+txtAmarelo+" Questão 01"+txtVerde);
            System.out.println("c)"+txtAmarelo+" Questão 02"+txtVerde);
            System.out.println("d)"+txtAmarelo+" Questão 03"+txtVerde);
            System.out.println("e)"+txtAmarelo+" Questão 04"+txtVerde);
            System.out.println("f)"+txtAmarelo+" Questão 05"+txtVermelho);
            System.out.println("x) Para encerrar"+txtReset);

            esc = scan.next();


            switch (esc) {
                case "a":
                    System.out.println("-- Questao00 --");
                    qst0.main(args);
                    esc = " ";
                    break;
                case "b":
                    System.out.println("-- Questao01 --");
                    qst1.main(args);
                    esc = " ";
                    break;
                case "c":
                    System.out.println("-- Questao02 --");
                    qst2.main(args);
                    esc = " ";
                    break;
                case "d":
                    System.out.println("-- Questao03 --");
                    qst3.main(args);
                    esc = " ";
                    break;
                case "e":
                    System.out.println("-- Questao04 --");
                    qst4.main(args);
                    esc = " ";
                    break;
                case "f":
                    System.out.println("-- Questao05 --");
                    qst5.main(args);
                    esc = " ";
                    break;
                case "x":
                    System.out.println("-- Saindo... --");
                    break;
                default:
                    System.out.println("Escolha outra opção");
                    break;
            }
        }
        scan.close();
    }
}
