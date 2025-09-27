package EjercicioGrupo1;
import java.util.Scanner;

public class Ejercicio4 {
    public void mostrarMayorMenor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 & num1 > num3) {
            if (num2 > num3) {
                System.out.println("El numero mayor es el: "+num1 );
                System.out.println("El numero menor es el: "+num3);
            }else if (num2<num3) {
                System.out.println("El numero mayor es el: "+num1 );
                System.out.println("El numero menor es el: "+num2);
            }
        }else if(num2 > num1 & num2 > num3) {
            if (num1 > num3) {
                System.out.println("El numero mayor es el: "+num2 );
                System.out.println("El numero menor es el: "+num3);
            }else if (num1<num3) {
                System.out.println("El numero mayor es el: "+num2 );
                System.out.println("El numero menor es el: "+num1);
            }
        }else if(num3 > num1 & num3 > num2) {
            if (num1 > num2) {
                System.out.println("El numero mayor es el: "+num3 );
                System.out.println("El numero menor es el: "+num2);
            }else if (num1<num2) {
                System.out.println("El numero mayor es el: "+num3 );
                System.out.println("El numero menor es el: "+num1);
            }
        }
        sc.close();
    }
    
    // Método main necesario para ejecutar y hacer debug
    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
        ejercicio.mostrarMayorMenor();
    }
}

