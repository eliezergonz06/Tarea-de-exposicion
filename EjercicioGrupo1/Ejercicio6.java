package EjercicioGrupo1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero Uno");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el numero Dos");
        int numero2 = sc.nextInt();

        System.out.println("Ingrese lo que desea hacer");
        System.out.println("1 Suma\n2 Resta\n3 Multiplicacion\n4 Division ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("--Suma--");
                int suma = numero1+numero2;
                System.out.println("La suma entre "+numero1+" + "+numero2+" es: "+suma);
                break;

            case 2:
                System.out.println("--Resta--");
                int resta = numero1-numero2;
                System.out.println("La resta entre "+numero1+" - "+numero2+" es: "+resta);
            break;

            case 3:
                System.out.println("--Multiplicacion--");
                int multiplicacion = numero1*numero2;
                System.out.println("La multiplicacion entre "+numero1+" * "+numero2+" es: "+multiplicacion);
            break;
            case 4:
                System.out.println("--Division--");
                float division = numero1/numero2;
                if (numero1 == 0 || numero2 ==0) {
                    System.exit(0);;
                }else{
                    
                System.out.println("La division entre "+numero1+" / "+numero2+" es: "+division);
                }
                break;
        
            default:
                break;
        }



        sc.close();
    }
}
