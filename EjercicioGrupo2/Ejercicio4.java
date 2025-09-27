package EjercicioGrupo2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un color: ");
        String color = sc.nextLine();
        
        switch (color) {
            case "Rojo":
            case "rojo":
                System.out.println("Color Primario");
                break;
            case "Verde":
            case "verde":
                System.out.println("Color Primario");
                break;
            case "Azul":
            case "azul":
                System.out.println("Color Primario");
                break;
                
            default:
                System.out.println("No es color primario");
                break;
        }
        
        sc.close();
    }
}
