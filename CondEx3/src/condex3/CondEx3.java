/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condex3;

import java.util.Scanner;

/**
 *
 * @author fabao
 */
public class CondEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println ("Digite um lado do triangulo: ");
        int num1 = entrada.nextInt();
        
        System.out.println ("Digite o segundo lado do triangulo: ");
        int num2 = entrada.nextInt();
        
        System.out.println ("Digite o terceiro lado do triangulo: ");
        int num3 = entrada.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1)
            {
                if (num1 == num2 && num1 == num3 && num2 == num3)
                    System.out.println("Equilatero");
                else
                {
                    if (num1 != num2 && num1 != num3 && num2 != num3)
                        System.out.println("Escaleno");
                    else
                    {
                        if (num1 == num2 && num1 != num3 || num1 == num3 && num1 != num2 || num2 == num3 && num2 == num1)
                            System.out.println("Isóceles");
                        else
                            System.out.println("Número Invalido");
                    }
                } 
            }
            else
                System.out.println("Número Invalido");
            
    }
    
}
