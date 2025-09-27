package EjercicioGrupo2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--Menu de Mascotas--");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Conejo");
        System.out.print("Elige el numero de la mascota que quieres adoptar (1-3): ");
        
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Has adoptado un Perro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Has adoptado un Gato");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Has adoptado un Conejo");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida. Por favor elige del 1 al 3");
                break;
        }
        
        sc.close();
    }
}
