/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_de_una_dimension;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int[] array = new int[15];
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Insertar un numero y pulse Enter (Hasta 15 numeros)");
			array [i]= sc.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		int num14= array[14];
		
		System.out.println(" ");
		for(int i=array.length-1; i>=0;i--) {
			if (i!=0) {
				array[i]=array[i-1];
				
			}else {
				array[0]=num14;
				
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
	}

}