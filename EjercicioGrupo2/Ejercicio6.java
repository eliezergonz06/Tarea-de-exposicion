package EjercicioGrupo2;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dinero = 1000; // Dinero inicial
        int opcion = 0;
        
        System.out.println("=== Cajero Automatico ===");
        System.out.println("1. Consultar dinero");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion (1-4): ");
        
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Tu saldo actual es: $" + dinero);
                break;
                
            case 2:
                System.out.print("Ingrese la cantidad a depositar: $");
                int deposito = sc.nextInt();
                
                if (deposito < 0) {
                    System.out.println("No se puede depositar dinero negativo");
                } else if (deposito > 1000) {
                    System.out.println("No se puede depositar mas de $1000");
                } else {
                    dinero = dinero + deposito;
                    System.out.println("Deposito exitoso. Tu nuevo saldo es: $" + dinero);
                }
                break;
                
            case 3:
                System.out.print("Ingrese la cantidad a retirar: $");
                int retiro = sc.nextInt();
                
                if (retiro < 0) {
                    System.out.println("No se puede retirar dinero negativo");
                } else if (retiro > dinero) {
                    System.out.println("No tienes suficiente dinero. Tu saldo actual es: $" + dinero);
                } else if (retiro > 1000) {
                    System.out.println("No se puede retirar mas de $1000");
                } else {
                    dinero = dinero - retiro;
                    System.out.println("Retiro exitoso. Tu nuevo saldo es: $" + dinero);
                }
                break;
                
            case 4:
                System.out.println("Gracias por usar el cajero automatico");
                break;
                
            default:
                System.out.println("Opcion no valida. Por favor elige del 1 al 4");
                break;
        }
        
        sc.close();
    }
}