/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_estatica;

import java.util.Scanner;

/**
 *
 * @author Tecnicos
 */
public class cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Scanner sc=new Scanner (System.in);
        //datos
        int alt,bas;
        //entrada
        System.out.println("altura deseada: ");
        alt=sc.nextInt();
        System.out.println("base deseada: ");
        bas=sc.nextInt();
        //proceso
        //salida
        if(alt<2){
            System.out.println("altura minima 2");
        }else{
        
            for(int j=0;j<bas;j++){
            System.out.print("*");
            }
            System.out.println();
        
        for(int i=0;i<alt-2;i++){
            System.out.print("*");
            for(int j=0;j<bas-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

            for(int j=0;j<bas;j++){
            System.out.print("*");
            }
            System.out.println();

        }*/
        
        pru();
    }
    
    public static void pru(){
        
        Scanner sc=new Scanner(System.in);
        int filas=0;
        
        filas=sc.nextInt();
        
        for(int i=0;i<filas;i++){
            System.out.print("*");
            for(int j=0;j<filas;j++){
                if(i>0 && i<filas -1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("*");
        }
    }
    }
    

