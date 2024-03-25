import java.security.CodeSigner;

public class Chef {
    private String nombre;
    private int estrellasMichelin;

    public Chef(String nombre, int estrellasMichelin){
        this.estrellasMichelin = estrellasMichelin;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEstrellasMichelin(){
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin){
        this.estrellasMichelin = estrellasMichelin;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Cantidad de estrellas michelin: " + estrellasMichelin;
    }
}

