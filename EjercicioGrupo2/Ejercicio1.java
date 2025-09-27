package EjercicioGrupo2;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7");
        int opcion = sc.nextInt();

        if(opcion>7 || opcion<1)
        {
            System.exit(0);
        }else{
            switch (opcion) {
                case 1:
                    System.out.println("Lunes");
                break;
                case 2:
                    System.out.println("Martes");
                break;
                case 3:
                    System.out.println("Miercoles");
                break;
                case 4:
                    System.out.println("Jueves");
                break;
                case 5:
                    System.out.println("Viernes");
                break;
                case 6:
                    System.out.println("Sabado");
                break;
                case 7:
                    System.out.println("Domingo");
                break;

                default:
                    break;
            }
        }
        sc.close();
    }
}
