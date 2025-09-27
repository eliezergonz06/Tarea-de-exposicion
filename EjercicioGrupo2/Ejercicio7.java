package EjercicioGrupo2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero del 1 al 10: ");
        int numero = sc.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("El numero " + numero + " en romano es: I");
                break;
            case 2:
                System.out.println("El numero " + numero + " en romano es: II");
                break;
            case 3:
                System.out.println("El numero " + numero + " en romano es: III");
                break;
            case 4:
                System.out.println("El numero " + numero + " en romano es: IV");
                break;
            case 5:
                System.out.println("El numero " + numero + " en romano es: V");
                break;
            case 6:
                System.out.println("El numero " + numero + " en romano es: VI");
                break;
            case 7:
                System.out.println("El numero " + numero + " en romano es: VII");
                break;
            case 8:
                System.out.println("El numero " + numero + " en romano es: VIII");
                break;
            case 9:
                System.out.println("El numero " + numero + " en romano es: IX");
                break;
            case 10:
                System.out.println("El numero " + numero + " en romano es: X");
                break;
                
            default:
                System.out.println("Numero no valido. Ingrese un numero del 1 al 10");
                break;
        }
        
        sc.close();
    }
}