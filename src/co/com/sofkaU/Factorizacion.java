package co.com.sofkaU;

import java.util.Scanner;

public class Factorizacion {

    public double factorizar(int number){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese le numero factorial:  ");
        number = in.nextInt();
        double factorial = 1;
        while (number != 0){
            factorial=factorial*number;
            number--;
        }
        //System.out.println(factorial);
        return factorial;
    }


}
