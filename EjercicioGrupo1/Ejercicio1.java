package EjercicioGrupo1;
import java.util.Scanner;

public class Ejercicio1 {

    public void verificarNumero() {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + "Es Par.");

        } else{
            System.out.println("El numero " + numero + " Es Impar.");
        }
        sc.close();
    }

}
