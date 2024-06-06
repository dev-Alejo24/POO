public class Vuelo {

    protected String origen;
    protected String destino;
    protected String duracion;
    protected String aerolinea;
    protected String tipoAvion;
    protected int capacidadPasajeros;

    //constructor


    public Vuelo(String origen, String destino, String duracion, String aerolinea, String tipoAvion, int capacidadPasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.aerolinea = aerolinea;
        this.tipoAvion = tipoAvion;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void imprimir(){
        System.out.println("Aeropuerto origen: " +this.origen);
        System.out.println("Aeropuerto destino: " +this.destino);
        System.out.println("Duracion de Vuelo: " +this.duracion);
        System.out.println("Aerolinea: " +this.aerolinea);
        System.out.println("Tipo de Avion: " +this.tipoAvion);
        System.out.println("Capacidad Pasajeros: " +this.capacidadPasajeros);
        System.out.println(System.lineSeparator());
    }
}
