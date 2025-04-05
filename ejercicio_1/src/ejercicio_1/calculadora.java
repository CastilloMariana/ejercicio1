package ejercicio_1;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        double num1, num2, resultado;
	        int opcion;

	        // Menú de operaciones
	        System.out.println("Selecciona una operación:");
	        System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");
	        System.out.print("Ingresa el número de la operación que deseas realizar: ");
	        opcion = scanner.nextInt();

	        // Pedir los dos números al usuario
	        System.out.print("Ingresa el primer número: ");
	        num1 = scanner.nextDouble();

	        System.out.print("Ingresa el segundo número: ");
	        num2 = scanner.nextDouble();

	        // Llenar las operaciones y salidas de datos:
	     
	        switch(opcion) {
	            case 1:
	                resultado = num1 + num2;
	                System.out.println("El resultado de la suma es: " + resultado);
	                break;
	            case 2:
	                resultado = num1 - num2;
	                System.out.println("El resultado de la resta es: " + resultado);
	                break;
	            case 3:
	                resultado = num1 * num2;
	                System.out.println("El resultado de la multiplicación es: " + resultado);
	                break;
	            case 4:
	                if(num2 != 0) {
	                    resultado = num1 / num2;
	                    System.out.println("El resultado de la división es: " + resultado);
	                } else {
	                	
	                }
	                    System.out.println("Error: No se puede dividir entre cero.");
	                }
	                break;
	            default:
	                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
	                break;

	               
	        scanner.close();
	    }
	}


