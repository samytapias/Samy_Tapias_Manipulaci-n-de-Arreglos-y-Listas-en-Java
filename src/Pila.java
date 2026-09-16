public class Pila {

    // El tope apunta a la pizza que esta arriba de la pila
    private Nodo tope;

    public Pila() {
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
    public void push(Pizza pizza) {

        // Creamos un nuevo nodo que contiene la pizza
        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al nodo que estaba en el tope
        nuevo.siguienteNodo = tope;

        // El nuevo nodo pasa a ser el nuevo tope
        tope = nuevo;
    }
    
    // =========================================================
    // POP: sacar la pizza que esta en el TOPE
    // =========================================================

    public Pizza pop() {

         // Si la pila esta vacia, no hay ninguna pizza para retirar
        if (isEmpty()) {
            return null;
    }

    // Guardamos la pizza que esta en el tope
       Nodo aux = tope;

        // El tope pasa a ser la siguiente pizza
        tope = tope.siguienteNodo;

        // La pizza retirada queda separada de la lista
        aux.siguienteNodo = null;

        // Devolvemos la pizza que retiramos
        return aux.pizza;
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
    return tope.pizza;
    }
}   
