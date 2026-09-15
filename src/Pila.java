public class Pila {

    // El tope apunta a la pizza que esta arriba de la pila
    private pizza tope;

    public pila () {
        tope = null;
    }

     // =========================================================
    // ISEMPTY: comprobar si la pila esta vacia
    // =========================================================

    public boolean isEmpty() {

         // Si el tope es null, significa que no hay pizzas
        return tope == null;
    }

    // =========================================================
    // PUSH: agregar una nueva pizza al TOPE de la pila
    // =========================================================

    // La nueva pizza apunta a la que estaba en el tope
    public void push(pizza pizza) {
        pizza.siguiente = tope;
        // La nueva pizza pasa a ser el nuevo tope
        tope = pizza;
    }
    
    // =========================================================
    // POP: sacar la pizza que esta en el TOPE
    // =========================================================

    public pizza pop() {

         // Si la pila esta vacia, no hay ninguna pizza para retirar
        if (isEmpty()) {
            return null;
    }

    // Guardamos la pizza que esta en el tope
        Pizza aux = tope;

        // El tope pasa a ser la siguiente pizza
        tope = tope.siguiente;

        // La pizza retirada queda separada de la lista
        aux.siguiente = null;

        // Devolvemos la pizza que retiramos
        return aux;
    }

    // =================================================
    // PEEK: consultar la pizza del TOPE sin eliminarla
    // =================================================

    public Pizza peek() {
        // Si la pila esta vacia, no hay ninguna pizza para mostrar
    if (isEmpty()) {
        return null;
    }

    // Devolvemos la pizza que esta en el tope
    return tope;
    }
}   
