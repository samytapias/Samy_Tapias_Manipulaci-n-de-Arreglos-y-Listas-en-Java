public class Nodo {

    // Guarda una pizza dentro del nodo
    Pizza pizza;

    // Apunta al siguiente nodo de la lista
    Nodo siguienteNodo;

    // Constructor del nodo
    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguienteNodo = null;
    }
}
