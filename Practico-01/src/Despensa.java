public class Despensa {
    private Ingrediente[] ingredientes;

    public Despensa(int capacidad) {
        this.ingredientes = new Ingrediente[capacidad];
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] == null) {
                ingredientes[i] = ingrediente;
                System.out.println("Ingrediente " + ingrediente.getNombre() + " agregado a la despensa.");
                return;
            }
        }
        System.out.println("La despensa está llena, no se puede agregar más ingredientes.");
    }

    public void getIngrediente(int posicion, int cantidadASacar) {
        if (posicion >= 0 && posicion < ingredientes.length && ingredientes[posicion] != null) {
            Ingrediente ingredienteAModificar = ingredientes[posicion];
            if (ingredienteAModificar.sacar(cantidadASacar)) {
                Ingrediente ingredienteModificado = new Ingrediente(ingredienteAModificar.getNombre(), ingredienteAModificar.getCantidad());
                ingredientes[posicion] = ingredienteModificado;
                System.out.println("Se sacó de la despensa: " + ingredienteModificado.getNombre());
            }
            else {
                return;
            }
        }
        else {
            System.out.println("No se pudo sacar el ingrediente de la despensa.");
        }
    }
}
