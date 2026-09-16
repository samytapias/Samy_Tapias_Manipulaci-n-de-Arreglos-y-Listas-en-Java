public class Pizza {

    // Guarda el nombre de la pizza
    private String nombre;

     // Arreglo fijo de 3 ingredientes
    private String[] ingredientes = new String[3];

     // Constructor
     public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;

        for (int i = 0; i < 3; i++) {
            this.ingredientes[i] = ingredientes[i];
        }
    }

    // Obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Obtener los ingredientes
    public String[] getIngredientes() {
        return ingredientes;
    }

    // Mostrar la información de la pizza
    public void mostrarPizza() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < 3; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}