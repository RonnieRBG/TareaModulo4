package adivinaNumero_AE3_ABP;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	
	   public static void main(String[] args) {
		   /**
		    * Clase principal que ejecuta un juego de adivinanza de números.
		    * El programa genera un número secreto aleatorio entre 1 y 100 y
		    * el usuario debe adivinarlo. El sistema da pistas si el número
		    * ingresado es mayor o menor que el secreto.
		    * 
		    * <p>
		    * Al finalizar, muestra cuántos intentos tomó y cuáles fueron.
		    * </p>
		    */ 
		   Scanner teclado = new Scanner (System.in);
		   //Numero aleatorio generado entre 1 y 100
		   int numeroSecreto = (int)(Math.random() * 100) + 1;
		   
		   //Lista para guardar los intentos del usuario
		   ArrayList<Integer> intentos = new ArrayList <Integer>();
		   
		   
		   //System.out.println(numeroSecreto); 
		   int numeroUsuario;
		   
		   //Bucle hasta que el usario adivine, se recomienda ingresar de 10 en 10
					   while (true) {
						   System.out.print("Por favor ingresa el número: ");
						   numeroUsuario = teclado.nextInt();
						   intentos.add(numeroUsuario);
						   	if (numeroUsuario > numeroSecreto) {
						   		System.out.println("Intenta con un numero mas pequeño");
						   		System.out.println();
						   	} else {
						   		if (numeroUsuario < numeroSecreto) {
						   			System.out.println("intenta con un numero mas grande");
						   			System.out.println();
						   		} else {
						   			System.out.println("Adivinaste el numero. Es el :  "  + numeroSecreto);
						   			break;
						   				}
						   		}
					   				}
				teclado.close();
		   {	System.out.println("¡Adivinaste!");
		   		System.out.println("Te tomo " + intentos.size() + " intentos adivinar el numero");
		   		System.out.println("Tus intentos fueron:"+ intentos );
	   }
	       }
	
	   					}
