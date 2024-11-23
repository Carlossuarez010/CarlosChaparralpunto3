import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    public void ejecutar() {
        int cantidad;
        int Numero;
        Stack<Integer> pila = new Stack<>();
        Objpila obj = new Objpila();
        System.out.println("Ingrese elementos de la pila: ");
        cantidad = teclado.nextInt();

        System.out.println("Ingrese numeros: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numero: " + (i + 1));
            Numero = teclado.nextInt();
            pila.push(Numero);
        }

        obj.setNumeros(pila);
        Stack<Integer> pilabien = new Stack<>();
        Stack<Integer> pilaOriginal = obj.getNumeros();

        for (Integer objf : pilaOriginal) {
            int resultado = 0;

            if (objf < 0) {
                resultado = 0;

            } else if (objf >= 8 && objf <= 20) {
                resultado = 50;

            } else if (objf >= 60 && objf < 62) {
                resultado = 100;

            } else {
                double raiz = Math.sqrt(objf);
                System.out.println("Raiz de " + objf + " es: " + raiz);
                resultado = (int) raiz;
            }

            pilabien.push(resultado);
        }

        obj.setPpilas(pilabien);

        System.out.println("------------------");
        System.out.println("Pila: ");
        Stack<Integer> pilaInvertida = new Stack<>();
        
        while (!pilabien.isEmpty()) {
            pilaInvertida.push(pilabien.pop());
        }

        while (!pilaInvertida.isEmpty()) {
            System.out.println(pilaInvertida.pop());
        }
    }
}

