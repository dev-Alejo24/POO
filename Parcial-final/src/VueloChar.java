public class VueloChar extends Vuelo{

    private String paquete;
    private String fechaHora;

    //Constructor
    public VueloChar(String origen, String destino, String duracion, String aerolinea, String tipoAvion, int capacidadPasajeros, String paquete, String fechaHora) {
        super(origen, destino, duracion, aerolinea, tipoAvion, capacidadPasajeros);
        this.paquete = paquete;
        this.fechaHora = fechaHora;
    }

    public void imprimir(){
        System.out.println("Aeropuerto origen: " +this.origen);
        System.out.println("Aeropuerto destino: " +this.destino);
        System.out.println("Duracion de Vuelo: " +this.duracion);
        System.out.println("Aerolinea: " +this.aerolinea);
        System.out.println("Tipo de Avion: " +this.tipoAvion);
        System.out.println("Capacidad Pasajeros: " +this.capacidadPasajeros);
        System.out.println("Paquete: " +this.paquete);
        System.out.println("Fecha y Hora: " +this.fechaHora);
        System.out.println(System.lineSeparator());
    }

}
