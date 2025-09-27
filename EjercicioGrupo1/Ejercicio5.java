package EjercicioGrupo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad ");
        int edad = sc.nextInt();

        if (edad >= 18 & edad <= 20) {
            System.out.print("Eres mayor de edad");
        }else if(edad >=21 & edad <= 64){
            System.out.print("Tienes la mayoria de edad");
        }else if(edad >=65 ){
            System.out.print("Eres de la tercera edad");
        }else if(edad<18 ){
            System.out.print("Es menor de edad");
        }
        sc.close();
    }
}
