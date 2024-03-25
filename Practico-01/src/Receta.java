public class Receta {
    protected int tiempoCoccion;
    protected Ingrediente[] ingredientes;
    protected String preparacion;

    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion){
        this.tiempoCoccion = tiempoCoccion;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
    }

    public Ingrediente[] getIngredientes(){
        return ingredientes;
    }

    public String getPreparacion(){
        return preparacion;
    }

    public void mostrarReceta(){
        System.out.println("Los ingredientes son:");
        for (Ingrediente ingrediente: ingredientes){
            System.out.println(ingrediente);
        }
        System.out.println("Tiempo de coccion: " + tiempoCoccion + " minutos");
        System.out.println("Preparacion: " + preparacion);
    }

}
