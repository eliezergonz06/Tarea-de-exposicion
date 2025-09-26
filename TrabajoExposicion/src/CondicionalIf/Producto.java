package CondicionalIf;
import java.util.Scanner;

public class Producto {

    public void CalcularTotal(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el Precio del producto: ");
        double precio = sc.nextDouble();

        double subtotal = precio;
        double descuento = 0.0;

        if(precio > 100){
            descuento = subtotal * 0.05;
        }
       double total = subtotal - descuento;

        System.out.println("\n=== Factura ===");
        System.out.println("Producto: " + nombre);
        System.out.println("Subtotal: L." + subtotal);
        System.out.println("Descuento: L." + descuento);
        System.out.println("Total a pagar: L." + total);


    }
}
