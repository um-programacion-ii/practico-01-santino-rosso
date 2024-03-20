public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public boolean sacar(int cantidadASacar) {
        if (cantidad >= cantidadASacar) {
            cantidad -= cantidadASacar;
            return true;
        } else {
            System.out.println("No hay suficiente cantidad de " + nombre + " para sacar.");
            return false;
        }
    }
    @Override
    public String toString(){
        return "Nombre = " + nombre +
                ", Cantidad = " + cantidad;
    }
}
