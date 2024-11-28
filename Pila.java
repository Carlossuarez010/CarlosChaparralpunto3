import java.util.Scanner;
import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("ingrese la dimension de la matriz");
        n = sc.nextInt();
        Stack<Integer> pila = new Stack<>();
        Metodos metod = new Metodos();
        int[][] m = new int[n][n];
        int[][] m1 = new int[n][n];
        m = metod.llenarmatriz(m);
        m1 = metod.llenarmatriz(m1);
        pila = metod.llenarPila(m1, m);
        System.out.println("pila original");
        metod.MostrarPilaOrdenada(pila);
        pila = metod.ordenarPila(pila);
        System.out.println("pila ordenada");
        metod.MostrarPilaOrdenada(pila);

        System.out.println("HOLI");
    }
}