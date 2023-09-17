package ejercicios;

public class Main {
 public static void main(String[] args) {
        // Crear una instancia de la clase Marca para "Renault"
        Marca renault = new Marca("Renault");

        // Crear una instancia de la clase Modelo para "12" perteneciente a "Renault"
        Modelo modeloRenault12 = new Modelo(renault, "12",  1996);
        modeloRenault12.setPrecioRepuestos(PrecioRepuestos.Baratos);
        // Agregar el modelo "12" a la lista de modelos de "Renault"
        renault.agregarModelo(modeloRenault12);
        // Crear una instancia de la clase Auto para "Renault 12"
        Auto renault12 = new Auto(renault, modeloRenault12, "Azul");
        
        // Encender el Renault 12
        renault12.encender();

        // Acelerar el Renault 12
        renault12.acelerar();
        renault12.acelerar();

        // Verificar el estado y la velocidad del Renault 12
        System.out.println("GRACIAS GPT POR NUESTRO CÓDIGO DE CADA DÍA");
        System.out.println("El Renault 12 está encendido: " + renault12.getEncendido());
        System.out.println("Velocidad del Renault 12: " + renault12.getVelocidad());

        // Obtener la lista de modelos de "Renault"
        System.out.println("Modelos de Renault:");
        for (Modelo modelo : renault.getModelos()) {
            System.out.println(modelo.getNombre() + ". Repuestos:" + modelo.getPrecioRepuestos());
        }
    }
}