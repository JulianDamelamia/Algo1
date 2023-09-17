package ejercicios;
import ejercicios.Marca;
import ejercicios.Modelo;
public class Auto {
    private String color;
    private int velocidad;
    private boolean encendido;
    private Modelo modelo;
    private Marca marca;

// setters
    public void encender(){
        this.encendido = true;
    }
    public void apagar(){
        this.encendido = false;
    }

    public void acelerar(){
        this.velocidad ++;
    }
    public void frenar(){
        this.velocidad --;
    }
// constructor
    public Auto(Marca marca, Modelo modelo, String color){
        this.velocidad = 0;
        this.encendido = false;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
// getters
    public boolean getEncendido(){
        return this.encendido;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
}
