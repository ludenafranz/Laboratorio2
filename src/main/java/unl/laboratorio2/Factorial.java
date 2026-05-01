package unl.laboratorio2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingerse un nuemro ");
        int numero = sc.nextInt();
        System.out.println("La respuest es: "+ factorial(numero));

    }
    public  static int factorial(int num){
        if (num == 0){
            return 1;
        }
        int subrespuesta = factorial(num - 1);
        int respuesta = subrespuesta * num;
        return respuesta;
    }
}
