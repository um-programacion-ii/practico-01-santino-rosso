public class Main {
    public static void main(String[] args) {
        HuevoDuro huevoDuro = new HuevoDuro();
        ArrozBlanco arrozBlanco = new ArrozBlanco();
        HuevosRevueltos huevosRevueltos = new HuevosRevueltos();

        System.out.println("Receta de Huevo Duro");
        huevoDuro.mostrarReceta();
        System.out.println("");

        System.out.println("Receta de arroz blanco");
        arrozBlanco.mostrarReceta();
        System.out.println("");

        System.out.println("Receta de huevos revueltos");
        huevosRevueltos.mostrarReceta();
    }
}
