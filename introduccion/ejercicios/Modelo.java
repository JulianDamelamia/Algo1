package ejercicios;

public class Modelo {
    private String nombre;
    private int año;
    private Marca marca;
    private PrecioRepuestos precioRepuestos; 

    public Modelo(Marca marca, String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
        this.marca = marca;
        this.precioRepuestos = null;
        }

    // Getters y setters para los atributos de Modelo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setPrecioRepuestos(PrecioRepuestos precioRepuestos) {
        this.precioRepuestos = precioRepuestos;
    }

    public PrecioRepuestos getPrecioRepuestos() {
        return precioRepuestos;
    }



}