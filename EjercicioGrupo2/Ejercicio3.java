package EjercicioGrupo2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un caracter: ");
        String caracter = sc.nextLine();

        switch (caracter) {
            case "a":
            case "A":
                System.out.println("Es una vocal");
                break;
            case "e":
            case "E":
                System.out.println("Es una vocal");
                break;
            case "i":
            case "I":
                System.out.println("Es una vocal");
                break;
            case "o":
            case "O":
                System.out.println("Es una vocal");
                break;
            case "u":
            case "U":
                System.out.println("Es una vocal");
                break;
                
            default:
                System.out.println("No es una vocal");
                break;
        }
        
        sc.close();
    }
}
