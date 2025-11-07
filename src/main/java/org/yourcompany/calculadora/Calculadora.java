package org.yourcompany.calculadora;
import java.util.Random;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {
        //System.out.println("Nombre de cares en 50 llançaments: " + numcares(50));
        //System.out.println("Nombre de cares en 100 llançaments: " + numcares(100));
        //System.out.println("Nombre de cares en 1000 llançaments: " + numcares(1000));    

        PreuCinema(5,true,true);
        
    

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

    
        // Exemples de crida per al mètode sumaPrimersNumeros
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));


        // Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

       
        
    }

    public static  int sumaPrimersNumeros(int n) {
    int suma = 1;
    for (int i = 1; i <=n; i++) {
        suma +=i;
    }
    return suma;
        }

    public static int numcares(int repeticions) {
    Random random = new Random();
    int cara =0;
    int intent =0;
    while(intent > repeticions){
    int moneda = random.nextInt(0,2);
    intent++;
    if(moneda == 1){
     cara++;
    }

    }
    return cara;
    
    }

    public static double PreuCinema(double Preu,boolean capdesetmana,boolean carnetjove) {
        
        
        if (capdesetmana) {
            Preu = Preu * 1.1; // Increment del 10% si és cap de setmana
        }
        if (carnetjove) {
            Preu = Preu * 0.85; // Descompte del 15% si té carnet jove
        }
        return Preu;        
      
     }
    

    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }


    public static  int calcularFactorial(int n) {
    int multi = 1;
    for (int i = 1; i <=n; i++) {
        multi *=i;
    }
    return multi;
        }
    
    public static  int sumaQuadrats(int n) {
    int suma = 1;
    for (int i = 1; i <=n; i++) {
        suma +=i *i;
    }
    return suma;

}
    public static  long  calcularPotencia(int base,int exponent) {
    long resultat = 0;
    for (int i = 0; i < 10; i++) {
    resultat *= base;
    }
    return resultat;
}
}

