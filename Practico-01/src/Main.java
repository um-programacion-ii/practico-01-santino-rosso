public class Main {
    public static void main(String[] args) {

        Ingrediente ingrediente1 = new Ingrediente("Harina", 500);
        Ingrediente ingrediente2 = new Ingrediente("Azúcar", 250);
        Ingrediente ingrediente3 = new Ingrediente("Huevos", 6);

        System.out.println("Ingredientes:");
        System.out.println(ingrediente1);
        System.out.println(ingrediente2);
        System.out.println(ingrediente3);

        Despensa despensa = new Despensa(5);

        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);
        despensa.addIngrediente(ingrediente3);

        System.out.println("Ingredientes de la despensa:");
        for (Ingrediente ingrediente : despensa.getIngredientes()) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }

        despensa.getIngrediente(0,200);
        despensa.getIngrediente(1,300);
        despensa.getIngrediente(2,6);

        System.out.println("Ingredientes restantes de la despensa:");
        for (Ingrediente ingrediente : despensa.getIngredientes()) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }

    }
}
