package org.yourcompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Llamada al menú interactivo
        Mostrar_Menu(0);
    }

    public static void Mostrar_Menu(int n) {
        Scanner lector = new Scanner(System.in);
        int eleccion = 0;
        
        while (eleccion != 6) {
            System.out.println("---MENU---");
            System.out.println("1. Número de dígits");
            System.out.println("2. Suma primeros números");
            System.out.println("3. Calcular factorial");
            System.out.println("4. Suma de cuadrados");
            System.out.println("5. Calcular potencia");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            eleccion = lector.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Has escogido: Número de dígits");
                    System.out.print("Introduce un número: ");
                    int num = lector.nextInt();
                    int resultadoDigits = nombreDigits(num);  // Aquí declaramos y calculamos la cantidad de dígitos
                    System.out.println("Número de dígits: " + resultadoDigits);
                    break;

                case 2:
                    System.out.println("Has escogido: Suma primeros números");
                    System.out.print("Introduce un número (n): ");
                    n = lector.nextInt();
                    int resultadoSuma = sumaPrimersNumeros(n);
                    System.out.println("La suma de los primeros " + n + " números es: " + resultadoSuma);
                    break;

                case 3:
                    System.out.println("Has escogido: Calcular factorial");
                    System.out.print("Introduce un número (n): ");
                    int numFactorial = lector.nextInt();
                    int resultadoFactorial = calcularFactorial(numFactorial);
                    System.out.println("El factorial de " + numFactorial + " es: " + resultadoFactorial);
                    break;

                case 4:
                    System.out.println("Has escogido: Suma de cuadrados");
                    System.out.print("Introduce un número (n): ");
                    int numCuadrados = lector.nextInt();
                    int resultadoCuadrados = sumaQuadrats(numCuadrados);
                    System.out.println("La suma de los cuadrados de los primeros " + numCuadrados + " números es: " + resultadoCuadrados);
                    break;

                case 5:
                    System.out.println("Has escogido: Calcular potencia");
                    System.out.print("Introduce la base: ");
                    int base = lector.nextInt();
                    System.out.print("Introduce el exponente: ");
                    int exponente = lector.nextInt();
                    long resultadoPotencia = calcularPotencia(base, exponente);
                    System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultadoPotencia);
                    break;

                case 6:
                    System.out.println("Has elegido salir. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
            }
        }
    }

    // Método para contar los dígitos de un número
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // El 0 tiene un dígito
        }
        int contador = 0;
        while (nombre != 0) {
            nombre /= 10;
            contador++;
        }
        return contador;
    }

    // Método para sumar los primeros 'n' números
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Método para calcular el factorial de un número
    public static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para sumar los cuadrados de los primeros 'n' números
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    // Método para calcular la potencia de un número (base^exponente)
    public static long calcularPotencia(int base, int exponent) {
        long resultado = 1;
        for (int i = 0; i < exponent; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
