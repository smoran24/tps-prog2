package comandero;


import java.util.Scanner;

public abstract class Menu {

    //private static Scanner leer = new Scanner(System.in);
    private static Cliente miCliente;
    private static Empleado miEmpleado;
    private static Integer contadorProductos = 0;
    private static Integer ejecucionesRealizadas = 0;

    public static void menuPrincipal() {

        Scanner leer = new Scanner(System.in);
        String opcionUsuarioStr;
        Integer opcionUsuario = 0;
        String nombreUsuario;

        System.out.println("Bienvenidos/as a pizzería Betos");
        do {
            System.out.println("Por favor, elija la opción que desee");
            System.out.println("1. Cliente");
            System.out.println("2. Empleado");
            System.out.println("3. Salir");

            // Se almacena la elección en un string para porder validar si lo ingresado es un entero.
            opcionUsuarioStr = leer.nextLine();

            // Si lo ingresado es -1, se dice qué está fuera de rango (especialmente porque el método validarInt devuelve -1 si no es un entero).
            if (opcionUsuarioStr.equals("-1")) {
                System.out.println("El número fuera de rango. Intente nuevamente...");
                continue;
            }

            opcionUsuario = Validaciones.validarInt(opcionUsuarioStr);

            // -1 es lo que devuelve el método en el catch, significa que no ingresó un entero.
            if(opcionUsuario == -1) {
                System.out.println("Debe ingresar un entero. Intente nuevamente...");
                continue;
            }
            if (opcionUsuario > 0 && opcionUsuario < 4)
                break;
            System.out.println("El número fuera de rango. Intente nuevamente...");

        } while(opcionUsuario < 1  || opcionUsuario > 3);

        if (opcionUsuario == 1) {

            System.out.print("Por favor, ingrese su nombre: ");
            nombreUsuario = leer.nextLine();

            miCliente = new Cliente();
            menuCliente(nombreUsuario);

        } else if (opcionUsuario == 2) {
            miEmpleado = new Empleado();
            menuEmpleado();
        } else {
            System.out.println("Muchas gracias por elegirnos, hasta pronto!");
        }
    }

    private static void menuCliente(String nombre) {

        String opcionClienteStr;
        Integer opcionCliente;
        Scanner leer = new Scanner(System.in);

        System.out.println("\n\n------------------------------------\n");
        System.out.println("Bienvenido "+ nombre);
        do {
            System.out.println("Por favor, elija la opción que desee");
            System.out.println("1- Mostrar menú");
            System.out.println("2- Agregar producto al pedido");
            System.out.println("3- Eliminar producto al pedido");
            System.out.println("4- Terminar pedido");
            opcionClienteStr = leer.nextLine();

            opcionCliente = Validaciones.validarInt(opcionClienteStr);

            if(opcionClienteStr.equals("-1")) {
                System.out.println("Debe ingresar un entero. Intente nuevamente...");
                continue;
            }
            if (opcionCliente == -1) {
                System.out.println("Debe ingresar un entero. Intente nuevamente...");
                continue;
            }

            if (opcionCliente > 0 && opcionCliente < 5)
                break;
            System.out.println("Número ingreado fuera de rango. Intente nuevamente...");

        } while (opcionCliente < 1 || opcionCliente > 4);

        switch (opcionCliente) {
            case 1:
                System.out.println("\n\n------------------------------------\n");
                System.out.println("Cátalago de productos");
                System.out.println("1. Pizza");
                System.out.println("2. Empanadas");
                System.out.println("3. Hamburguesas");
                System.out.println("4. Papas");

                menuCliente(nombre);
                break;
            case 2:
                String productoStr;
                Integer producto = 0;
                do {
                    System.out.println("Ingrese el producto que desea agregar");
                    productoStr = leer.nextLine();

                    if(productoStr.equals("-1")) {
                        System.out.println("Debe ingresar un entero. Intente nuevamente...");
                        continue;
                    }

                    producto = Validaciones.validarInt(productoStr);

                    if (producto == -1) {
                        System.out.println("Debe ingresar un entero. Intente nuevamente...");
                        continue;
                    }

                    if (producto > 0 && producto < 5)
                        break;
                    System.out.println("Número ingreado fuera de rango. Intente nuevamente...");

                } while(producto < 0 || producto > 4);

                Menu.miCliente.agregarProducto(producto);
                contadorProductos++;
                System.out.println("Producto agregado correctamente!");
                System.out.println("En su orden, usted tiene: "+ contadorProductos +" productos");

                Menu.menuCliente(nombre);
                break;

            case 3:
                String eliminarProductoStr;
                Integer eliminarProducto = 0;

                if (contadorProductos == 0)
                    System.out.println("No tiene productos en su pedido.");
                else {
                    do {
                        System.out.println("Ingrese el producto que desea eliminar");
                        eliminarProductoStr = leer.nextLine();

                        if(eliminarProductoStr.equals("-1")) {
                            System.out.println("Debe ingresar un entero. Intente nuevamente...");
                            continue;
                        }

                        eliminarProducto = Validaciones.validarInt(eliminarProductoStr);

                        if (eliminarProducto == -1) {
                            System.out.println("Debe ingresar un entero. Intente nuevamente...");
                            continue;
                        }

                        if (eliminarProducto > 0 && eliminarProducto < 5)
                            break;
                        System.out.println("Número ingreado fuera de rango. Intente nuevamente...");

                    } while(eliminarProducto < 0 || eliminarProducto > 4);

                    if (miCliente.buscarProducto(eliminarProducto)) {
                        Menu.miCliente.eliminarProducto(eliminarProducto);
                        contadorProductos--;
                        System.out.println("Producto eliminado correctamente!");
                    } else {
                        System.out.println("No se ha encontrado el producto seleccionado dentro de su pedido.");
                        Menu.menuCliente(nombre);
                    }

                }

                Menu.menuCliente(nombre);
                break;

            default:
                if (contadorProductos == 0) {
                    System.out.println("No tiene productos en su pedido.");
                    menuPrincipal();
                }
                else {
                    Menu.miCliente.nuevoPedido();
                    System.out.println("Muchas gracias por elegirnos. Hasta luego");

                    System.out.println("\n\n------------------------------------\n");
                    contadorProductos = 0;
                    Menu.menuPrincipal();
                }
                break;
        }
    }

    private static void menuEmpleado() {

        Scanner leer = new Scanner(System.in);
        final String CLAVE = "123";
        String claveIngresada;
        Integer intentosClave = 0;
        String opcionEmpleadoStr;
        Integer opcionEmpleado = 0;

        if (ejecucionesRealizadas == 0){
            do {
                System.out.println("Por favor, ingrese la clave para ingresar:");
                claveIngresada = leer.nextLine();

                if (claveIngresada.equals(CLAVE))
                    break;
                System.out.println("Clave incorrecta.");
                intentosClave++;
            } while(!claveIngresada.equals(CLAVE) && intentosClave < 3);
        }

        if(intentosClave == 3)
            System.out.println("Número máximo de intentos alcanzado. Hasta luego.");
        else {
            System.out.println("\n\n------------------------------------\n");
            System.out.println("Bienvenido!");
            ejecucionesRealizadas ++;

            do {
                System.out.println("Elija la opción que desee");
                System.out.println("1- Mostrar pedidos");
                System.out.println("2- Preparar pedido");
                System.out.println("3- Cerrar sesión");
                opcionEmpleadoStr = leer.nextLine();

                if(opcionEmpleadoStr.equals("-1")) {
                    System.out.println("Debe ingresar un entero. Intente nuevamente...");
                    continue;
                }

                opcionEmpleado = Validaciones.validarInt(opcionEmpleadoStr);

                if (opcionEmpleado == -1) {
                    System.out.println("Debe ingresar un entero. Intente nuevamente...");
                    continue;
                }
                if (opcionEmpleado > 0 && opcionEmpleado < 4)
                    break;

                System.out.println("Número ingreado fuera de rango. Intente nuevamente...");

            } while(opcionEmpleado < 0 || opcionEmpleado > 3);

            switch (opcionEmpleado) {
                case 1:
                    miEmpleado.mostrarPedido();
                    menuEmpleado();
                    break;
                case 2:
                    miEmpleado.prepararPedido();
                    menuEmpleado();
                    break;
                default:
                    ejecucionesRealizadas = 0;
                    menuPrincipal();
                    break;
            }
        }
    }
}
