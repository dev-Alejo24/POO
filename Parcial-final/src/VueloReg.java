public class VueloReg extends Vuelo {

    private String diasHorarios;
    private String infoAdicional;

    //constructor
    public VueloReg(String origen, String destino, String duracion, String aerolinea, String tipoAvion, int capacidadPasajeros, String diasHorarios, String infoAdicional) {
        super(origen, destino, duracion, aerolinea, tipoAvion, capacidadPasajeros);
        this.diasHorarios = diasHorarios;
        this.infoAdicional = infoAdicional;
    }

    public void imprimir(){
        System.out.println("Aeropuerto origen: " +this.origen);
        System.out.println("Aeropuerto destino: " +this.destino);
        System.out.println("Duracion de Vuelo: " +this.duracion);
        System.out.println("Aerolinea: " +this.aerolinea);
        System.out.println("Tipo de Avion : " +this.tipoAvion);
        System.out.println("Capacidad Pasajeros: " +this.capacidadPasajeros);
        System.out.println("Dias y Horarios: " +this.diasHorarios);
        System.out.println("Informacion Adicional: " +this.infoAdicional);
        System.out.println(System.lineSeparator());
    }
}
