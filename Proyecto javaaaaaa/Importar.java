import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {

    public LinkedList<ObjEstudianteIngenieria> importarArchivoEstudiantesIngenieria() {
        String rutaArchivo = "EstudiantesIngenieria.txt";
        LinkedList<ObjEstudianteIngenieria> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ObjEstudianteIngenieria obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cédula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new ObjEstudianteIngenieria();
                    obj.cedula = linea.substring(8).trim();
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.nombre = linea.substring(8).trim();
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.apellido = linea.substring(10).trim();
                    }
                } else if (linea.startsWith("Teléfono:")) {
                    if (obj != null) {
                        obj.telefono = linea.substring(10).trim();
                    }
                } else if (linea.startsWith("Número de Semestre:")) {
                    if (obj != null) {
                        obj.numSemestre = Integer.parseInt(linea.substring(19).trim());
                    }
                } else if (linea.startsWith("Promedio:")) {
                    if (obj != null) {
                        obj.promedio = Float.parseFloat(linea.substring(10).trim());
                    }
                } else if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        obj.serial = linea.substring(8).trim();
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo de estudiantes de ingeniería importado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public LinkedList<ObjEstudianteDiseño> importarArchivoEstudiantesDiseno() {
        String rutaArchivo = "EstudiantesDiseno.txt";
        LinkedList<ObjEstudianteDiseño> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ObjEstudianteDiseño obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cédula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new ObjEstudianteDiseño();
                    obj.cedula = linea.substring(8).trim();
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.nombre = linea.substring(8).trim();
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.apellido = linea.substring(10).trim();
                    }
                } else if (linea.startsWith("Teléfono:")) {
                    if (obj != null) {
                        obj.telefono = linea.substring(10).trim();
                    }
                } else if (linea.startsWith("Modalidad:")) {
                    if (obj != null) {
                        obj.modalidaEs = linea.substring(10).trim();
                    }
                } else if (linea.startsWith("Asignaturas Viendo:")) {
                    if (obj != null) {
                        obj.asigViendo = Integer.parseInt(linea.substring(19).trim());
                    }
                } else if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        obj.serial = Integer.parseInt(linea.substring(8).trim());
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo de estudiantes de diseño importado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public LinkedList<Objtableta> importarArchivoTabletas() {
        String rutaArchivo = "Tabletas.txt";
        LinkedList<Objtableta> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            Objtableta obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new Objtableta();
                    obj.serial = linea.substring(8).trim();
                } else if (linea.startsWith("Marca:")) {
                    if (obj != null) {
                        obj.marca = linea.substring(7).trim();
                    }
                } else if (linea.startsWith("Tamaño:")) {
                    if (obj != null) {
                        obj.tamano = Float.parseFloat(linea.substring(8).trim());
                    }
                } else if (linea.startsWith("Precio:")) {
                    if (obj != null) {
                        obj.precio = Float.parseFloat(linea.substring(8).trim());
                    }
                } else if (linea.startsWith("Almacenamiento:")) {
                    if (obj != null) {
                        obj.almacenamiento = linea.substring(15).trim();
                    }
                } else if (linea.startsWith("Peso:")) {
                    if (obj != null) {
                        obj.peso = Float.parseFloat(linea.substring(6).trim());
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo de tabletas importado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public LinkedList<ObjComputador> importarArchivoComputadores() {
        String rutaArchivo = "Computadores.txt";
        LinkedList<ObjComputador> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ObjComputador obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new ObjComputador();
                    obj.serial = linea.substring(8).trim();
                } else if (linea.startsWith("Marca:")) {
                    if (obj != null) {
                        obj.marca = linea.substring(7).trim();
                    }
                } else if (linea.startsWith("Tamaño:")) {
                    if (obj != null) {
                        obj.tamaño = Float.parseFloat(linea.substring(8).trim());
                    }
                } else if (linea.startsWith("Precio:")) {
                    if (obj != null) {
                        obj.precio = Float.parseFloat(linea.substring(8).trim());
                    }
                } else if (linea.startsWith("Sistema Operativo:")) {
                    if (obj != null) {
                        obj.sisOperativo = linea.substring(18).trim();
                    }
                } else if (linea.startsWith("Procesador:")) {
                    if (obj != null) {
                        obj.procesador = linea.substring(12).trim();
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo de computadores importado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}