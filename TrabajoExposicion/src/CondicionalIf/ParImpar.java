package CondicionalIf;
import java.util.Scanner;

public class ParImpar {

    public void verificarNumero() {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
          System.out.println("El numero " + numero + "Es Par.");

        } else{
            System.out.println("El numero " + numero + " Es Impar.");
        }
    }

}
