
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {

    public void exportarArchivoEstudiantesIngenieria(LinkedList<ObjEstudianteIngenieria> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de estudiantes de ingeniería está vacía, no se puede exportar el archivo.");
            return;
        }

        try (FileWriter e = new FileWriter("EstudiantesIngenieria.txt")) {
            for (ObjEstudianteIngenieria obj : lista) {
                e.write("Cédula: " + obj.cedula + "\n");
                e.write("Nombre: " + obj.nombre + "\n");
                e.write("Apellido: " + obj.apellido + "\n");
                e.write("Teléfono: " + obj.telefono + "\n");
                e.write("Número de Semestre: " + obj.numSemestre + "\n");
                e.write("Promedio: " + obj.promedio + "\n");
                e.write("Serial: " + obj.serial + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo de estudiantes de ingeniería exportado correctamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exportarArchivoEstudiantesDiseno(LinkedList<ObjEstudianteDiseño> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de estudiantes de diseño está vacía, no se puede exportar el archivo.");
            return;
        }

        try (FileWriter e = new FileWriter("EstudiantesDiseno.txt")) {
            for (ObjEstudianteDiseño obj : lista) {
                e.write("Cédula: " + obj.cedula + "\n");
                e.write("Nombre: " + obj.nombre + "\n");
                e.write("Apellido: " + obj.apellido + "\n");
                e.write("Teléfono: " + obj.telefono + "\n");
                e.write("Modalidad: " + obj.modalidaEs + "\n");
                e.write("Asignaturas Viendo: " + obj.asigViendo + "\n");
                e.write("Serial: " + obj.serial + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo de estudiantes de diseño exportado correctamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exportarArchivoTabletas(LinkedList<Objtableta> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de tabletas está vacía, no se puede exportar el archivo.");
            return;
        }

        try (FileWriter e = new FileWriter("Tabletas.txt")) {
            for (Objtableta obj : lista) {
                e.write("Serial: " + obj.serial + "\n");
                e.write("Marca: " + obj.marca + "\n");
                e.write("Tamaño: " + obj.tamano + "\n");
                e.write("Precio: " + obj.precio + "\n");
                e.write("Almacenamiento: " + obj.almacenamiento + "\n");
                e.write("Peso: " + obj.peso + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo de tabletas exportado correctamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exportarArchivoComputadores(LinkedList<ObjComputador> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de computadores está vacía, no se puede exportar el archivo.");
            return;
        }

        try (FileWriter e = new FileWriter("Computadores.txt")) {
            for (ObjComputador obj : lista) {
                e.write("Serial: " + obj.serial + "\n");
                e.write("Marca: " + obj.marca + "\n");
                e.write("Tamaño: " + obj.tamaño + "\n");
                e.write("Precio: " + obj.precio + "\n");
                e.write("Sistema Operativo: " + obj.sisOperativo + "\n");
                e.write("Procesador: " + obj.procesador + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo de computadores exportado correctamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


