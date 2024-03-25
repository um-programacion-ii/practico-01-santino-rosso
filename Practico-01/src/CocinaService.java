public class CocinaService {
    private Despensa despensa;

    public CocinaService(Despensa despensa) {
        this.despensa = despensa;
    }

    public void prepararReceta(Receta receta, Chef chef){

        Ingrediente[] ingredientesNecesarios = receta.getIngredientes();

        boolean ingredientesSuficientes = true;
        for(Ingrediente ingrediente : ingredientesNecesarios){
            int cantidadNecesaria = ingrediente.getCantidad();
            int cantidadActual = despensa.getCantidad(ingrediente);
            if (cantidadActual < cantidadNecesaria){
                ingredientesSuficientes = false;
                System.out.println("No hay suficiente cantidad de " + ingrediente.getNombre() + " en la despensa.");
                System.out.println("Faltan " + (cantidadNecesaria - cantidadActual) + " unidades.");
            }
        }

        if(ingredientesSuficientes){
            System.out.println(chef.getNombre() + " está preparando la receta:");
            System.out.println(receta.getPreparacion());

            for (Ingrediente ingrediente : ingredientesNecesarios) {
                int cantidadNecesaria = ingrediente.getCantidad();
                String nombreIngrediente = ingrediente.getNombre();
                despensa.getIngrediente(nombreIngrediente, cantidadNecesaria);
            }

            System.out.println("Cantidad de ingredientes restantes en la despensa:");
            for (Ingrediente ingrediente : despensa.getIngredientes()) {
                System.out.println(ingrediente.getNombre() + ": " + despensa.getCantidad(ingrediente));
            }
        }
    }
}
