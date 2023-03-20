package com.company
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        while (num == -1) {
            try{
                num = scanner.nextInt();
                num = Factorial.Factorial(num);
                System.out.println("Esse numero fatorial é: " + num);

            }catch(IllegalArgumentException exception){
                System.out.println("O numero não deve ser negativo");
                num = -1;
            }catch(InputMismatchException exception){
                System.out.println("Um NUMERO INTEIRO");
                scanner = new Scanner(System.in);
                num = -1;
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }
}
