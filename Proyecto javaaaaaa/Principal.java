
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int inventario=0;
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        InventarioTotal in = new InventarioTotal();
        LinkedList<ObjEstudianteIngenieria> listaIngenieria = new LinkedList<>();
        LinkedList<Objtableta> listaTableta = new LinkedList<>();
        LinkedList<ObjEstudianteDiseño> listaDiseno = new LinkedList<>();
        LinkedList<ObjComputador> listaComputador = new LinkedList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("--------------------------------");
            System.out.println("Universidad Juan de Dios");
            System.out.println("");
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Gestionar Estudiantes de Ingeniería");
            System.out.println("2. Gestionar Tabletas");
            System.out.println("3. Gestionar Estudiantes de Diseño");
            System.out.println("4. Gestionar Computadores");
            System.out.println("5. Imprimir Inventario total");
            System.out.println("6. Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    gestionarEstudiantesIngenieria(m, listaIngenieria, sc);
                    break;
                case 2:
                    gestionarTabletas(m, listaTableta, sc);
                    break;
                case 3:
                    gestionarEstudiantesDiseno(m, listaDiseno, sc);
                    break;
                case 4:
                    gestionarComputadores(m, listaComputador, sc);
                    break;
                case 5:
                 in.mostrarInventario();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        sc.close();
    }

    private static void gestionarEstudiantesIngenieria(Metodos m, LinkedList<ObjEstudianteIngenieria> lista, Scanner sc) {
        boolean oping = true;
        while (oping) {
            System.out.println("\nGestionar Estudiantes de Ingeniería:");
            System.out.println("1. Registrar Prestamo de Equipo");
            System.out.println("2. Modificar Prestamo de Equipo");
            System.out.println("3. Devolucion de Equipo");
            System.out.println("4. Buscar Equipo");
            System.out.println("5. Exportar Archivo");
            System.out.println("6. Importar Archivo");
            System.out.println("7. Volver al Menu Principal");
            int opIng = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opIng) {
                case 1:
                    lista = m.IngresarRegistro(lista);
                    break;
                case 2:
                    m.modificarIngenieria(lista);
                    break;
                case 3:
                    m.EliminarRegistro(lista);
                    break;

                case 4:
                    m.buscarIngenieria(lista);
                    break;

                case 5:
                    m.exportarArchivoEstudiantesIngenieria(lista);
                    break;

                case 6:
                    m.importarArchivoEstudiantesIngenieria();
                    break;
                case 7:
                    oping = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }

    }

    private static void gestionarTabletas(Metodos m, LinkedList<Objtableta> lista, Scanner sc) {
        boolean tabla = true;
        while (tabla) {
            System.out.println("\nGestionar Tabletas:");
            System.out.println("1. Ingresar Registro");
            System.out.println("2. Mostrar Registros");
            System.out.println("3. Buscar Tableta");
            System.out.println("4. Exportar Archivo");
            System.out.println("5. Importar Archivo");
            System.out.println("6. Volver al Menu Principal");
            int opTab = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opTab) {
                case 1:
                    lista = m.listaTableta(lista);
                    break;
                case 2:
                    m.mostrarTableta(lista);
                    break;
                case 3:
                    m.buscarTableta(lista);
                    break;
                case 4:
                    m.exportarArchivoTabletas(lista);
                    break;
                case 5:
                    m.importarArchivoTabletas();
                    break;
                case 6:
                    tabla = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }
    }

    private static void gestionarEstudiantesDiseno(Metodos m, LinkedList<ObjEstudianteDiseño> lista, Scanner sc) {
        boolean diseno = true;
        while (diseno) {
            System.out.println("\nGestionar Estudiantes de Diseño:");
            System.out.println("1. Registrar Prestamo de Equipo");
            System.out.println("2. Modificar Prestamo de Equipo");
            System.out.println("3. Devolucion de Equipo");
            System.out.println("4. Buscar Equipo");
            System.out.println("5. Exportar Archivo");
            System.out.println("6. Importar Archivo");
            System.out.println("7. Mostrar Inventario");
            System.out.println("8. Volver al Menu Principal");
            int opDis = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea
            switch (opDis) {
                case 1:
                    lista = m.listaDiseno(lista);
                    break;
                case 2:
                    m.modificarDiseno(lista);
                    break;
                case 3:
                    m.eliminarDiseño(lista);
                    break;
                case 4:
                    m.buscarDiseno(lista);
                case 5:
                    m.exportarArchivoEstudiantesDiseno(lista);
                    break;
                case 6:
                    m.importarArchivoEstudiantesDiseno();
                    break;
                case 7:
                    m.mostrarDiseño(lista);
                    break;
                case 8:
                    diseno=false;
                    break;  
                default:
                    System.out.println("Opción no válida.");
            }

        }

    }

    private static void gestionarComputadores(Metodos m, LinkedList<ObjComputador> lista, Scanner sc) {
        boolean pc = true;
        while (pc) {
            System.out.println("\nGestionar Computadores:");
            System.out.println("1. Ingresar Registro");
            System.out.println("2. Mostrar Registros");
            System.out.println("3. Buscar Computador");
            System.out.println("4. Exportar Archivo");
            System.out.println("5. Importar Archivo");
            System.out.println("6. Volver al Menu Principal");
            int opComp = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opComp) {
                case 1:
                    lista = m.listaComputador(lista);
                    break;
                case 2:
                    m.mostrarComputador(lista);
                    break;
                case 3:
                    m.buscarComputador(lista);
                    break;
                case 4:
                    m.exportarArchivoComputadores(lista);
                    break;
                case 5:
                    m.importarArchivoComputadores();
                    break;
                case 6:
                    pc = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }
    }
}
