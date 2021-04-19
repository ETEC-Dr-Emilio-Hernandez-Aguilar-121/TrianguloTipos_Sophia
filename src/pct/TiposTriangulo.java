/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;
/**
 *
 * @author win
 */
public class TiposTriangulo {
    public static void main(String[] args) {
        
        //Variáveis
        int a, b, c;
        
        //Objeto de Entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\nDescubra a Classificação do Triângulo!!\n");
        
        //Entradas
        System.out.println("\nDigite o valor do lado A:\n ");
        a = entrada.nextInt();
        System.out.println("\nDigite o valor do lado B:\n ");
        b = entrada.nextInt();
        System.out.println("\nDigite o valor do lado C:\n ");
        c = entrada.nextInt();
        
        //Processamento
        //Será que é um triângulo?
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("É um Triângulo!");
      
            //Triângulo Equilátero
            if ((a == b) && (b == c) && (a == c)){
                System.out.println("É um triângulo Equilátero! ");
                }
            
              //Triângulo Isósceles
                else if((a == b) || (b == c) || (a == c)) {
                    System.out.println("É um triângulo Isósceles");  
             }
           
             //Triângulo Escaleno
                else if  ((a != b) && (b != c) && (a != c)){
                    System.out.println("É um triângulo Escaleno!");
                }
        }
        else
        {
            System.out.println("Não é um Triângulo!");
        }
    }
}
                
           
           
           
           
        
    

