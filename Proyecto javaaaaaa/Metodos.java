
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    //metodo para estudiantes de ingenieria//
    Scanner sc = new Scanner(System.in);

    public LinkedList<ObjEstudianteIngenieria> IngresarRegistro(LinkedList<ObjEstudianteIngenieria> lista) {
        boolean continuar = true;

        int opt = 0;
        while (continuar) {
            ObjEstudianteIngenieria obj = new ObjEstudianteIngenieria();

            System.out.println("Ingrese los datos del estudiante de ingenieria \n");

            System.out.println("Ingrese cedula: ");
            obj.setCedula(sc.nextLine());

            System.out.println("Ingrese nombre: ");
            obj.setNombre(sc.next());

            System.out.println("Ingrese apellido: ");
            obj.setApellido(sc.next());

            System.out.println("Ingrese telefono: ");
            obj.setTelefono(sc.next());

            System.out.println("Ingrese Semestre Actualmente Cursado: ");
            obj.setNumSemestre(sc.nextInt());
            sc.nextLine(); // Consumir la nueva línea

            System.out.println("Ingrese el Promedio Acumulado: ");
            obj.setPromedio(sc.nextFloat());
            sc.nextLine(); // Consumir la nueva línea

            System.out.println("Ingrese serial: ");
            obj.setSerial(sc.next());

            lista.add(obj);
            System.out.println("Desea continuar ingresando datos 1:Si, 2:No");
            opt = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            if (opt == 2) {
                continuar = false;
            }
        }

        return lista;
    }

    // metodo para mostrar el registro//
    public void MostrarIngenieria(LinkedList<ObjEstudianteIngenieria> lista) {
        for (ObjEstudianteIngenieria obj : lista) {
            System.out.println("Cedula ingresada: " + obj.getCedula());
            System.out.println("Nombre ingresado: " + obj.getNombre());
            System.out.println("Apellido ingresado: " + obj.getApellido());
            System.out.println("Telefono ingresado: " + obj.getTelefono());
            System.out.println("Semestre Actualmente cursado: " + obj.getNumSemestre());
            System.out.println("Promedio Acumulado: " + obj.getPromedio());
            System.out.println("Serial ingresado: " + obj.getSerial());
            System.out.println("");
        }

    }

    //metodo buscar//
    public void buscarIngenieria(LinkedList<ObjEstudianteIngenieria> lista) {
        System.out.println("Ingrese el Dato a Buscar: ");
        String asd = sc.nextLine();

        // Inicializamos las variables con valores que no afectarán las comparaciones
        int numerosemestre = -1; // Semestres normalmente no son negativos
        float promedio = -1.0f; // Promedios normalmente no son negativos

        // Intentamos convertir el valor de entrada a numérico solo si es posible
        try {
            numerosemestre = Integer.parseInt(asd);
        } catch (NumberFormatException e) {
            // El valor ingSSSSresado no es un número entero, ignoramos la excepción
        }

        try {
            promedio = Float.parseFloat(asd);
        } catch (NumberFormatException e) {
            // El valor ingresado no es un número flotante, ignoramos la excepción
        }

        // Realizamos la búsqueda
        boolean encontrado = false; // Para indicar si se encontró algún resultado
        for (ObjEstudianteIngenieria obj : lista) {
            if (obj.getCedula().equalsIgnoreCase(asd)
                    || obj.getNombre().equalsIgnoreCase(asd)
                    || obj.getApellido().equalsIgnoreCase(asd)
                    || obj.getTelefono().equalsIgnoreCase(asd)
                    || obj.getNumSemestre() == numerosemestre
                    || obj.getPromedio() == promedio
                    || obj.getSerial().equalsIgnoreCase(asd)) {

                encontrado = true;
                System.out.println("\nInformación según el dato buscado: ");
                System.out.println("Cédula: " + obj.getCedula());
                System.out.println("Nombre: " + obj.getNombre());
                System.out.println("Apellido: " + obj.getApellido());
                System.out.println("Teléfono: " + obj.getTelefono());
                System.out.println("Semestre Actual: " + obj.getNumSemestre());
                System.out.println("Promedio Acumulado: " + obj.getPromedio());
                System.out.println("Serial: " + obj.getSerial());
            }
        }

    }

    public void modificarIngenieria(LinkedList<ObjEstudianteIngenieria> lista) {
        Scanner teclado = new Scanner(System.in);
        String modificar;
        String serial;
        String cedula;
        System.out.println("Modificar Prestamo de Equipo por; Serial o Cedula");
        modificar = teclado.next();
        for (ObjEstudianteIngenieria obj : lista) {
            if (modificar.equalsIgnoreCase("Serial")) {
                System.out.println("Ingrese Serial del Equipo: ");
                serial = teclado.next();

                obj.setSerial(serial);
                System.out.println("Serial Modificado Correctamente");

            } else if (modificar.equalsIgnoreCase("Cedula")) {
                System.out.println("Ingrese Cedula: ");
                cedula=teclado.next();
                
                obj.setCedula(modificar);
                System.out.println("Cedula Modificada Correctamente");
            } else {
                System.out.println("Opcion no Valida, Intente Nuevamente...");
            }

        }

    }

    //metodo para eliminar registro de ingenieria//
    public LinkedList<ObjEstudianteIngenieria> EliminarRegistro(LinkedList<ObjEstudianteIngenieria> lista) {
        Scanner teclado = new Scanner(System.in);
        String serial;
        int cedula;
        String eliminar;
        System.out.println("Devolucion del equipo por: Serial o Cedula");
        eliminar = teclado.next();

        for (ObjEstudianteIngenieria obj : lista) {
            if (eliminar.equalsIgnoreCase("serial")) {
                System.out.println("Ingrese Serial del Equipo: ");
                serial = teclado.next();
                lista.remove(obj.getSerial() == eliminar);
                System.out.println("El Registro " + serial + "a Sido Eliminado Correctamente ");

            } else if (eliminar.equalsIgnoreCase("Cedula")) {
                System.out.println("Ingrese Cedula: ");
                cedula = teclado.nextInt();
                lista.remove(obj.getCedula());
                System.out.println("El registro " + cedula + "a Sido Eliminado Correctamente ");
            } else {
                System.out.println("Opcion no valida, Intente Nuevamente...");
            }

        }

        return lista;
    }

    //metodo exportar ingenieria//
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

    //metodo importar para ingenieria//
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
    //----------------------------------------------------------------------------//

    // metodos para tableta 
    public LinkedList<Objtableta> listaTableta(LinkedList<Objtableta> lista) {
        boolean continuar = true;
        // Inicialmente se puede considerar como true para indicar que no se ha hecho ninguna selección
        int stop = 0;
        while (continuar) {

            Objtableta obj = new Objtableta();
            boolean almacenamiento = false; // Se establece a false para comenzar a solicitar almacenamiento

            System.out.println("----------------------------------------------------------");

            System.out.println("Ingrese Serial: ");
            obj.setSerial(sc.next());
            System.out.println("Ingrese Marca: ");
            obj.setMarca(sc.next());
            System.out.println("Ingrese Tamaño: ");
            obj.setTamano(sc.nextFloat());
            System.out.println("Ingrese Precio: ");
            obj.setPrecio(sc.nextFloat());
            while (!almacenamiento) {
                System.out.println("Escoja la Capacidad de Almacenamiento: 1=256GB 2=512GB 3=1TB");
                int almac = sc.nextInt();

                switch (almac) {
                    case 1:
                        obj.setAlmacenamiento("256GB");
                        almacenamiento = true; // Sale del bucle
                        break;
                    case 2:
                        obj.setAlmacenamiento("512GB");
                        almacenamiento = true; // Sale del bucle
                        break;
                    case 3:
                        obj.setAlmacenamiento("1TB");
                        almacenamiento = true; // Sale del bucle
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo");
                        break;
                }

            }
            System.out.println("Ingrese el Peso: ");
            obj.setPeso(sc.nextFloat());
            lista.add(obj);
            System.out.println("¿Desea añadir mas registros? 1=SI 2=NO");
            stop = sc.nextInt();
            //if para el si y el no//
            if (stop == 2) {
                continuar = false;
            }

        }

        return lista;
    }

    //mostrar registros//
    public void mostrarTableta(LinkedList<Objtableta> lista) {
        for (Objtableta obj : lista) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
            System.out.println("Serial Ingresado: " + obj.getSerial());
            System.out.println("Marca Ingresada: " + obj.getMarca());
            System.out.println("Tamaño Ingresado: " + obj.getTamano());
            System.out.println("Precio ingresado " + obj.getPrecio());
            System.out.println("Almacenamiento Ingresado: " + obj.getAlmacenamiento());
            System.out.println("Peso: " + obj.getPeso());

        }
    }

    public void buscarTableta(LinkedList<Objtableta> lista) {
        String asd;
        System.out.println("Ingrese el Dato a Bucar: ");
        asd = sc.next();
        float tamaño = Float.parseFloat(asd);
        float precio = Float.parseFloat(asd);
        float peso = Float.parseFloat(asd);
        for (Objtableta obj : lista) {
            if (obj.getSerial().equalsIgnoreCase(asd)
                    || obj.getMarca().equalsIgnoreCase(asd)
                    || obj.getTamano() == tamaño
                    || obj.getPrecio() == precio
                    || obj.getAlmacenamiento().equalsIgnoreCase(asd)
                    || obj.getPeso() == peso) {
                System.out.println(obj.getSerial());
                System.out.println(obj.getMarca());
                System.out.println(obj.getTamano());
                System.out.println(obj.getPrecio());
                System.out.println(obj.getAlmacenamiento());
                System.out.println(obj.getPeso());
            }

        }

    }

    //metodo para exportar tableta//
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

    //metodo para importar archivo de tableta//
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
    //----------------------------------------------------------//

//aqui los metodos para estudiante de diseño
    public LinkedList<ObjEstudianteDiseño> listaDiseno(LinkedList<ObjEstudianteDiseño> lista) {
        boolean continuar = true;
        int stop = 0;

        ObjEstudianteDiseño obj = new ObjEstudianteDiseño();
        while (continuar) {
            boolean modalidadEs = false;
            String mdes;
            System.out.println("-----------------------------------------------");
            System.out.println("");
            System.out.println("Ingrese cedula: ");
            obj.setCedula(sc.next());
            System.out.println("Ingrese nombre: ");
            obj.setNombre(sc.next());
            System.out.println("Ingrese apellido: ");
            obj.setApellido(sc.next());
            System.out.println("Ingrese el telefono: ");
            obj.setTelefono(sc.next());
            while (!modalidadEs) {
                System.out.println("Ingrese Modalidad de estudio: Virtual/Presencial ");
                mdes = sc.next();
                if (mdes.equals("Virtual")
                        || mdes.equals("Presencial"))//estudiar porque use equals aca//
                {
                    obj.setModalidaEs(sc.next());
                }
                modalidadEs = true;
            }
            System.out.println("Ingrese Serial:  ");
            obj.setSerial(sc.nextInt());
            lista.add(obj);
            System.out.println("¿Desea añadir mas registros?  1=SI 2=NO");
            stop = sc.nextInt();

            //if para el si y no//
            if (stop == 2) {
                continuar = false;
            }

        }
        return lista;
    }

//metodo para mostrar lista//
    public void mostrarDiseño(LinkedList<ObjEstudianteDiseño> lista) {
        for (ObjEstudianteDiseño obj : lista) {
            System.out.println("Cedula Ingresada: " + obj.getCedula());
            System.out.println("Nombre Ingresado: " + obj.getNombre());
            System.out.println("Apellido Ingresado: " + obj.getApellido());
            System.out.println("Telefono Ingresado: " + obj.getTelefono());
            System.out.println("Modalidad de estudio: " + obj.getModalidaEs());
            System.out.println("Asignaturas en curso: " + obj.getAsigViendo());
            System.out.println("Serial Ingresado: " + obj.getSerial());

        }
    }

    public void buscarDiseno(LinkedList<ObjEstudianteDiseño> lista) {
        String asd;
        System.out.println("Ingrese el Dato a Bucar: ");
        asd = sc.next();
        float buscar = Float.parseFloat(asd);
        float precio = Float.parseFloat(asd);
        int serall = Integer.parseInt(asd);
        int asignaturasviendo = Integer.parseInt(asd);
        for (ObjEstudianteDiseño obj : lista) {
            if (obj.getCedula().equalsIgnoreCase(asd)
                    || obj.getNombre().equalsIgnoreCase(asd)
                    || obj.getApellido().equalsIgnoreCase(asd)
                    || obj.getTelefono().equalsIgnoreCase(asd)
                    || obj.getModalidaEs().equalsIgnoreCase(asd)
                    || obj.getAsigViendo() == asignaturasviendo
                    || obj.getSerial() == serall) {
                System.out.println(obj.getCedula());
                System.out.println(obj.getNombre());
                System.out.println(obj.getApellido());
                System.out.println(obj.getTelefono());
                System.out.println(obj.getModalidaEs());
                System.out.println(obj.getAsigViendo());
                System.out.println(obj.getSerial());
            }

        }

    }
    //modificar registro diseño/

    public void modificarDiseno(LinkedList<ObjEstudianteDiseño> lista) {
        Scanner teclado = new Scanner(System.in);
        String modificarr;
        boolean validasis = true;
        int serial = 0;
        while (validasis) {
            System.out.println("Modificar Prestamo de Equipo por; Serial o Cedula");
            modificarr = teclado.next();
            for (ObjEstudianteDiseño obj : lista) {
                if (modificarr.equalsIgnoreCase("Serial")) {
                    validasis = false;
                    System.out.println("Ingrese Serial del Equipo: ");
                    obj.setSerial(serial);
                    System.out.println("Serial Modificado Correctamente");

                } else if (modificarr.equalsIgnoreCase("Cedula")) {
                    validasis = false;
                    System.out.println("Ingrese Cedula: ");
                    obj.setCedula(modificarr);
                    System.out.println("Cedula Modificada Correctamente");

                } else {
                    System.out.println("Opcion no Valida, Intente Nuevamente...");
                }

            }

        }
    }

    //metodo para eliminar registro diseño//
    public LinkedList<ObjEstudianteDiseño> eliminarDiseño(LinkedList<ObjEstudianteDiseño> lista) {
        Scanner teclado = new Scanner(System.in);
        String serial;
        int cedula;
        String eliminar;
        System.out.println("Devolucion del equipo por; Serial o Cedula");
        eliminar = teclado.next();

        for (ObjEstudianteDiseño obj : lista) {
            if (eliminar.equalsIgnoreCase("serial")) {
                System.out.println("Ingrese Serial del Equipo: ");
                serial = teclado.next();
                lista.remove(obj.getSerial());
                System.out.println("El Registro " + serial + "a Sido Eliminado Correctamente ");

            } else if (eliminar.equalsIgnoreCase("Cedula")) {
                System.out.println("Ingrese Cedula: ");
                cedula = teclado.nextInt();
                lista.remove(obj.getCedula());
                System.out.println("El registro " + cedula + "a Sido Eliminado Correctamente ");
            } else {
                System.out.println("Opcion no valida, Intente Nuevamente...");
            }

        }

        return lista;
    }

    //metodo exportar diseño//
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

    //metodo importar diseño//
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
    //----------------------------------------------------------------//

    //Aqui los metodos de computador 
    public LinkedList<ObjComputador> listaComputador(LinkedList<ObjComputador> lista) {
        boolean continuar = true;
        while (continuar) {
            ObjComputador obj = new ObjComputador();

            System.out.println("-------------------------------------------------------");
            System.out.println("Ingrese el Serial: ");
            obj.setSerial(sc.next());
            System.out.println("Ingrese Marca: ");
            obj.setMarca(sc.next());
            System.out.println("Ingrese el Tamaño: ");
            obj.setTamaño(sc.nextFloat());
            System.out.println("Ingrese Precio: ");
            obj.setPrecio(sc.nextFloat());

            // Menú para seleccionar el sistema operativo
            String sistemaOperativo = "";
            boolean seleccionado = false;
            while (!seleccionado) {
                System.out.println("Escoja el Windows: 1=Windows 7  2=Windows 10  3=Windows 11");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        sistemaOperativo = "Windows 7";
                        seleccionado = true;
                        break;
                    case 2:
                        sistemaOperativo = "Windows 10";
                        seleccionado = true;
                        break;
                    case 3:
                        sistemaOperativo = "Windows 11";
                        seleccionado = true;
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            }
            obj.setSisOperativo(sistemaOperativo);

            // Menú para seleccionar el procesador
            String procesador = "";
            seleccionado = false; // reiniciamos la variable
            while (!seleccionado) {
                System.out.println("Escoja el procesador: 1=AMD Ryzen  2=Intel® Core™ i5");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        procesador = "AMD Ryzen";
                        seleccionado = true;
                        break;
                    case 2:
                        procesador = "Intel® Core™ i5";
                        seleccionado = true;
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            }
            obj.setProcesador(procesador);

            lista.add(obj); // Agregamos el objeto a la lista

            System.out.println("¿Desea añadir más registros? 1=Sí 2=No");
            int opt = sc.nextInt();
            if (opt == 2) {
                continuar = false;
            }
        }
        return lista; // Devolvemos la lista con todos los computadores ingresados
    }

    //metodo para mostrar lista//
    public void mostrarComputador(LinkedList<ObjComputador> lista) {
        for (ObjComputador obj : lista) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
            System.out.println("Serial Ingresado: " + obj.getSerial());
            System.out.println("Marca Ingresada: " + obj.getMarca());
            System.out.println("Tamaño Ingresado " + obj.getTamaño());
            System.out.println("Precio: " + obj.getPrecio());
            System.out.println("Sistema Operativo: " + obj.getSisOperativo());
            System.out.println("Procesador: " + obj.getProcesador());
            System.out.println("");

        }
    }

    public void buscarComputador(LinkedList<ObjComputador> lista) {
        String asd;
        System.out.println("Ingrese el Dato a Bucar: ");
        asd = sc.next();
        float buscar = Float.parseFloat(asd);
        float precio = Float.parseFloat(asd);
        for (ObjComputador obj : lista) {
            if (obj.getSerial().equalsIgnoreCase(asd)
                    || obj.getMarca().equalsIgnoreCase(asd)
                    || obj.getTamaño() == buscar
                    || obj.getPrecio() == precio
                    || obj.getSisOperativo().equalsIgnoreCase(asd)
                    || obj.getProcesador().equalsIgnoreCase(asd)) {
                System.out.println(obj.getSerial());
                System.out.println(obj.getMarca());
                System.out.println(obj.getTamaño());
                System.out.println(obj.getPrecio());
                System.out.println(obj.getSisOperativo());
                System.out.println(obj.getProcesador());
            }

        }

    }

    //metodo para exportar computador//
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

    //metodo para importar computador//
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

// public void Exportar(LinkedList<ObjEmpleado> lista) {
// Exportar Exp = new Exportar();
// Exp.exportarArchivo(lista);
// }
// public LinkedList<ObjEmpleado> Importar() {
// Importar i = new Importar();
// LinkedList<ObjEmpleado> lista = i.ImportarArchivo();
// return lista;
// }
// public LinkedList<ObjEmpleado> Modificarregistro(LinkedList<ObjEmpleado>
// lista) {
// int cedula = 0;
// System.out.println("Ingrese la cedula a modificar");
// cedula = sc.nextInt();
// for (ObjEmpleado obj : lista) {
// if (obj.getCedula() == cedula) {
// System.out.println("ingrese el nombre");
// obj.setNombre(sc.next());
// }
// }
// return lista;
// }
