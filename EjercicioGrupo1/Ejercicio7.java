package EjercicioGrupo1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7");
        int opcion = sc.nextInt();

        if(opcion>7 || opcion<1)
        {
            System.exit(0);
        }else{
            if(opcion == 1){
                System.out.println("Lunes");
            }else if(opcion ==2){
                System.out.println("Martes");
            }else if(opcion ==3){
                System.out.println("Miercoles");
            }else if(opcion ==4){
                System.out.println("Jueves");
            }else if(opcion ==5){
                System.out.println("Viernes");
            }else if(opcion ==6){
                System.out.println("Sabado");
            }else if(opcion ==7){
                System.out.println("Domingo");
            }

        }
        sc.close();
    }
}
