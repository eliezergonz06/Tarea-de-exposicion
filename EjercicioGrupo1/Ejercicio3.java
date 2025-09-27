package EjercicioGrupo1;

import java.util.Scanner;

public class Ejercicio3 {
    public void mostrarMayorMenor() {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int var2 = var1.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int var3 = var1.nextInt();
        if (var2 > var3) {
            System.out.println("El mayor es: " + var2);
            System.out.println("El menor es: " + var3);
        } else if (var3 > var2) {
            System.out.println("El mayor es: " + var3);
            System.out.println("El menor es: " + var2);
        } else {
            System.out.println("Ambos numeros son iguales: " + var2);
        }


        var1.close();
    }
}
