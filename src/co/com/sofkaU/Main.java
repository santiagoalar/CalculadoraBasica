package co.com.sofkaU;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese le numero factorial:  ");
        int number = in.nextInt();
        double factorial = 1;
        while (number != 0){
            factorial=factorial*number;
            number--;
        }
        System.out.println(factorial);
    }
}
