public class Despensa {
    private Ingrediente[] ingredientes;

    public Despensa(int capacidad) {
        this.ingredientes = new Ingrediente[capacidad];
    }

    public Ingrediente[] getIngredientes(){
        return ingredientes;
    }

    public int getCantidad(Ingrediente ingredienteNecesario) {
        int cantidad = 0;
        for(Ingrediente ingrediente : ingredientes){
            if(ingrediente.getNombre() == ingredienteNecesario.getNombre()){
                cantidad = ingrediente.getCantidad();
                break;
            }
        }
        return cantidad;
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

    public void getIngrediente(String nombreIngrediente, int cantidadASacar) {

        Ingrediente ingredienteAModificar = null;
        int posicion = -1;
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null && ingredientes[i].getNombre().equals(nombreIngrediente)) {
                ingredienteAModificar = ingredientes[i];
                posicion = i;
                break;
            }
        }

        if (ingredienteAModificar != null) {
            if (ingredienteAModificar.sacar(cantidadASacar)) {
                Ingrediente ingredienteModificado = new Ingrediente(ingredienteAModificar.getNombre(), ingredienteAModificar.getCantidad());
                ingredientes[posicion] = ingredienteModificado;
                System.out.println("Se sacó de la despensa: " + ingredienteModificado.getNombre());
            } else {
                System.out.println("No hay suficiente cantidad de " + nombreIngrediente + " en la despensa.");
            }
        } else {
            System.out.println("No se encontró el ingrediente " + nombreIngrediente + " en la despensa.");
        }
    }

}
