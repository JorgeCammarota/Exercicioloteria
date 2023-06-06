package Loteria;

import java.util.Random;
import java.util.Scanner;
    public class Loteria01 {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            boolean acertou = false;
            int tentativas = 10;
            int numero_aleatorio = random.nextInt(50);
            int chute = 0;

            System.out.println(numero_aleatorio);

            while(tentativas > 0 && acertou == false){
                System.out.println("Qual seu chute?");
                chute = input.nextInt();

                if(numero_aleatorio == chute){
                    System.out.println("Você acertou!!");
                    acertou = true;
                } else if(chute < numero_aleatorio){
                    --tentativas;
                    System.out.println("Numero muito pequeno!" + tentativas + " tentativas restantes.");
                } else{
                    --tentativas;
                    System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");
                }

            }

        }
    }

