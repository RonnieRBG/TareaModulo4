package controlNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lista de estudiantes, cada uno con su lista de notas
        ArrayList<ArrayList<Double>> estudiantes = new ArrayList<>();

        // Creamos 5 estudiantes
        for (int i = 0; i < 5; i++) {
            estudiantes.add(new ArrayList<>()); // cada estudiante tiene su lista de notas
        }

        // Pedimos 3 notas por cada estudiante (ejemplo)
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Ingrese 3 notas para el estudiante " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                double nota = teclado.nextDouble();
                estudiantes.get(i).add(nota);
            }
        }

        // Mostrar todas las notas
        System.out.println("\nNotas de los estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
        	ArrayList <Double> notas = estudiantes.get(i);
            System.out.println("Estudiante " + (i+1) + ": " + estudiantes.get(i));
            double suma = 0;
            for (double n : notas) {
            	suma += n;
            }
            
            double promedio = suma / notas.size();
            
            if (promedio >= 6) {
                System.out.println("✅ Aprobaste, ¡Felicidades!");
            } else {
                System.out.println("❌ Reprobaste, lo siento :(");
            }
        
       
        }

        teclado.close();
    }
}