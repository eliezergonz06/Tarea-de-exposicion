package CondicionalIf;
import java.util.Scanner;

public class CompararNumeros {
    public void mostrarMayorMenor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Ambos numeros son iguales: " + num1);
        }
    }
}

