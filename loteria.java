package Loteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class loteria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = 0;
        int chute = 0;
        int[] pontuacao = new int[10];
        int soma = 0;

        // System.out.println(numeroSecreto);
        System.out.println("Digite 1 - Easy 2 - Medio");
        int opcao = input.nextInt();
        switch(opcao){
            case 1:
        numeroSecreto = random.nextInt(10);
                break;
            case 2:
        numeroSecreto = random.nextInt(100);
        break;
            default:
                System.out.println("valor invalido");
                break;
        }
        System.out.println(numeroSecreto);
        int i = 0;
        List<Integer> chutevariavel = new ArrayList<>();
        while (tentativas > 0 && acertou == false) {
            System.out.println("Qual seu chute?");
            chute = input.nextInt();
            chutevariavel.add(chute);
            if (numeroSecreto == chute) {
                System.out.println("Você acertou!!");
                pontuacao[i] = 10;
                acertou = true;
            } else if (chute == numeroSecreto + 1) {
                pontuacao[i] = 5;
                --tentativas;
                System.out.println("Numero muito pequeno!" + tentativas + " tentativas restantes.");
            } else if (chute == numeroSecreto - 1) {
                pontuacao[i] = 5;
                --tentativas;
                System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");

            } else {
                System.out.println("estafrio");
                pontuacao[i] = 0;
            }
            i++;
        }
       for (int x = 0; x< pontuacao.length; x++) {
           soma +=(pontuacao[x]);

       }
        System.out.println(soma);
        System.out.println(chutevariavel);
    }

}
