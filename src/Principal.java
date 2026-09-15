import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        // Creamos el objeto que administra las pilas
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            // =========================================================
            // MENÚ PRINCIPAL
            // =========================================================

            System.out.println("\n=================================");
            System.out.println("        PIZZA-TRACK");
            System.out.println("=================================");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar pedido actual");
            System.out.println("0. Salir");
            System.out.println("=================================");
            System.out.print("Seleccione una opción: ");

            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {

                case 1:

                    // =================================================
                    // REGISTRAR PIZZA
                    // =================================================

                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombre = lector.nextLine();

                    // Arreglo fijo de 3 ingredientes
                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++) {

                        System.out.print(
                            "Ingrese el ingrediente " + (i + 1) + ": "
                        );

                        ingredientes[i] = lector.nextLine();
                    }

                    // Creamos la pizza
                    Pizza pizza = new Pizza(nombre, ingredientes);

                    // Registramos la pizza en la pila principal
                    gestion.registrarPizza(pizza);

                    break;

                case 2:

                    // =================================================
                    // DESHACER
                    // =================================================

                    gestion.deshacer();

                    break;

                case 3:

                    // =================================================
                    // REHACER
                    // =================================================

                    gestion.rehacer();

                    break;

                case 4:

                    // =================================================
                    // MOSTRAR PEDIDO ACTUAL
                    // =================================================

                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("Saliendo de Pizza-Track...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        // Cerramos el Scanner
        lector.close();
    }
}