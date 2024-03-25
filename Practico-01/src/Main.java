public class Main {
    public static void main(String[] args) {

        Ingrediente Huevo = new Ingrediente("Huevo", 4);
        Ingrediente Aceite = new Ingrediente("Aceite", 2);
        Ingrediente Agua = new Ingrediente("Agua", 2);

        Despensa despensa = new Despensa(3);
        despensa.addIngrediente(Huevo);
        despensa.addIngrediente(Aceite);
        despensa.addIngrediente(Agua);

        Chef chef = new Chef("Juan", 1);

        CocinaService cocinaService = new CocinaService(despensa);

        HuevoDuro huevoDuro = new HuevoDuro();

        System.out.println("\nEscenario 1: Ingredientes suficientes");
        cocinaService.prepararReceta(huevoDuro, chef);

        HuevosRevueltos huevosRevueltos = new HuevosRevueltos();

        System.out.println("\nEscenario 2: Ingredientes insuficientes");
        cocinaService.prepararReceta(huevosRevueltos, chef);

    }
}

