import CondicionalIf.ParImpar;
import CondicionalIf.Producto;
import CondicionalIf.CompararNumeros;

public class EjemploParImpar {

    public static void main(String[] args) {
        ParImpar pi = new ParImpar();
        Producto p = new Producto();
        CompararNumeros cn = new CompararNumeros();

        System.out.println(" Verificacion de numero de Par o Impar ");
        pi.verificarNumero();

        System.out.println("=== Total a pagar ===");
        p. CalcularTotal();

        System.out.println("=== Comparacion de dos numeros ===");
        cn.mostrarMayorMenor();

    }
}