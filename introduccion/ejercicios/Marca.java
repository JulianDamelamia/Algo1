package ejercicios;
import  ejercicios.Modelo;
import java.util.List;
import java.util.ArrayList;
public class Marca {
    private String nombre;
    private List<Modelo> modelos; // Una lista de modelos de autos
    
    public Marca(String nombre) {
        this.nombre = nombre;
        this.modelos = new ArrayList<>();
    }
    public Marca(String nombre, List<Modelo> modelos) {
        this.nombre = nombre;
        this.modelos = modelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }



    public void agregarModelo(Modelo modelo) {
        modelos.add(modelo);
    }


}