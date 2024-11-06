import java.util.LinkedList;
import java.util.Scanner;

public class InventarioTotal {

    LinkedList<ObjComputador> listaComputadores = new LinkedList<>();
    LinkedList<Objtableta> listaTabletas = new LinkedList<>();

    public InventarioTotal() {
    }

   
    public void mostrarInventario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de inventario que desea ver:");
        System.out.println("1. Inventario de Computadores");
        System.out.println("2. Inventario de Tabletas");
        int tipo = sc.nextInt();

        if (tipo == 1) { 
            System.out.println("Inventario de Computadores:");
            if (listaComputadores.isEmpty()) {
                System.out.println("No hay computadores en el inventario.");
            } else {
                for (ObjComputador computador : listaComputadores) {
                    System.out.println("Serial: " + computador.getSerial());
                    System.out.println("Marca: " + computador.getMarca());
                    System.out.println("Tamaño: " + computador.getTamaño());
                    System.out.println("Precio: " + computador.getPrecio());
                    System.out.println("Sistema Operativo: " + computador.getSisOperativo());
                    System.out.println("Procesador: " + computador.getProcesador());
                    System.out.println("------------------------------------");
                }
            }
        } else if (tipo == 2) { 
            System.out.println("Inventario de Tabletas:");
            if (listaTabletas.isEmpty()) {
                System.out.println("No hay tabletas en el inventario.");
            } else {
                for (Objtableta obj : listaTabletas) {
                    System.out.println("Serial: " + obj.getSerial());
                    System.out.println("Marca: " + obj.getMarca());
                    System.out.println("Tamaño: " + obj.getTamano());
                    System.out.println("Precio: " + obj.getPrecio());
                    System.out.println("Almacenamiento: " + obj.getAlmacenamiento());
                    System.out.println("Peso: " + obj.getPeso());
                    System.out.println("------------------------------------");
                }
            }
        } else {
            System.out.println("Opción no válida. No se puede mostrar el inventario.");
        }
    }

   
}

