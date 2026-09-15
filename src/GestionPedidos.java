public class GestionPedidos {

    // Pila principal: guarda las pizzas registradas
    private Pila pilaPrincipalPila;

    // Pila secundaria: guarda las pizzas que fueron deshechas
    private Pila pilaSecundaria;

    // Constructor
    public GestionPedidos() {
        pilaPrincipalPila = new Pila();
        pilaSecundaria = new Pila();
    }

    // =========================================================
    // REGISTRAR: agregar una pizza a la pila principal
    // =========================================================

    public void registrarPizza(Pizza pizza) {

        // Agregamos la pizza al tope de la pila principal
        pilaPrincipalPila.push(pizza);

        // Al registrar una nueva pizza, se limpia la pila de rehacer
        pilaSecundaria = new Pila();

        System.out.println("Pizza registrada correctamente.");
        System.out.println("Pizza agregada: " + pizza.getNombre());
        System.out.println("Ingredientes:");

        for (String ingrediente : pizza.getIngredientes()) {
            System.out.println("- " + ingrediente);
        }
    }

    // =========================================================
    // DESHACER: quitar la última pizza registrada
    // =========================================================

    public void deshacer() {

        // Sacamos la última pizza de la pila principal
        Pizza pizza = pilaPrincipalPila.pop();

        if (pizza == null) {
            System.out.println("No hay pedidos para deshacer.");
            return;
            
        }

        // Guardamos la pizza retirada en la pila de rehacer
        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho correctamente.");
        System.out.println("Pizza retirada: " + pizza.getNombre());
        System.out.println("Ingredientes:");

        for (String ingrediente : pizza.getIngredientes()) {
            System.out.println("- " + ingrediente);
        }
    }
    
    // =========================================================
    // REHACER: recuperar la última pizza deshecha
    // =========================================================

    public void rehacer() {

        // Sacamos la pizza de la pila de rehacer
        Pizza pizza = pilaSecundaria.pop();

        if (pizza == null) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        // Volvemos a colocar la pizza en la pila principal
        pilaPrincipalPila.push(pizza);

        System.out.println("Pedido rehecho correctamente.");
        System.out.println("Pizza recuperada: " + pizza.getNombre());
        System.out.println("Ingredientes:");

        for (String ingrediente : pizza.getIngredientes()) {
            System.out.println("- " + ingrediente);
        }
    }

    // =========================================================
    // MOSTRAR: consultar la pizza que está en el TOPE
    // =========================================================

    public void mostrarPedidoActual() {

        // Consultamos la pizza del tope sin eliminarla
        Pizza pizza = pilaPrincipalPila.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        // Mostramos la información de la pizza
        pizza.mostrarPizza();
    }
}