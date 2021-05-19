package co.com.sofkaU;

import java.util.Scanner;

public class Factorizacion {

    public static double factorizar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese le numero factorial:  ");
        int number = in.nextInt();
        double factorial = 1;
        factorial = calcular(number, factorial);
        return factorial;
    }

    private static double calcular(int number, double factorial) {
        while (number != 0){
            factorial = factorial * number;
            number--;
        }
        return factorial;

        // COMERTARIO DE MATEO DE PRUEBA
    }


}
