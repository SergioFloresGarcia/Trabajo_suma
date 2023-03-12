package trabajosuma;

import java.util.Scanner;

public class TRABAJOSUMA {
    public static void main(String[args]) {
        Scanner obj = new Scanner(System.in);
        int n1;
        int n2;
        int resultado;
        
        System.out.println("Ingresar el primer sumando")

        n1 = obj.nextInt()

        System.out.println("Ingresar el segundo sumando")

        n2 = obj.nextInt()

        resultado = n1 + n2;

        System.out.println("El resultado final"+resultado)