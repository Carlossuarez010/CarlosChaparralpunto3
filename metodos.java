import java.util.Arrays;
import java.util.Stack;

public class Metodos {
    public int[][] llenarmatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    public Stack<Integer> llenarPila(int[][] m, int[][] m2) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                pila.push(m[i][j] * m2[i][j]);
            }
        }
        return pila;
    }

    public Stack<Integer> ordenarPila(Stack<Integer> pila) {
        int n = pila.size();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = pila.pop();
        }
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            pila.push(arreglo[i]);
        }
        return pila;
    }

    public void MostrarPilaOrdenada(Stack<Integer> pila) {
        System.out.println(pila);
    }
}
