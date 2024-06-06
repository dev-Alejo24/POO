import java.util.ArrayList;
import  java.util.List;

public class SistemaAeropuerto {

    private List<Aeropuerto> aeropuertos;
    private List<Vuelo> vuelos;

    //constructor
    public SistemaAeropuerto() {
        this.aeropuertos = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    //aggerga vuelos y compra con el codigo los aeropuertos de salida y  llegada
    public void addVuelo(Vuelo vuelo){

       // vuelos.add(vuelo);

        //recorre los aeropuertos de los vuelos
        for (Aeropuerto aeropuerto : aeropuertos){
            //compara con el codigo del aeropuerto el origen del vuelo
            //el aeropuerto de donde sale el vuelo
            if (aeropuerto.getCodigo().equals(vuelo.origen)){
                aeropuerto.addVuuelosSalida(vuelo);

                //compara con el codigo el aeropuerto al que llega el vuelo
            }if (aeropuerto.getCodigo().equals(vuelo.destino)){
                aeropuerto.addVuelosLlegada(vuelo);
            }
        }
    }

    //imprimir los aeropuertos de salida
    public void imprimirVuelosSalida(){
        for (Aeropuerto aeropuerto : aeropuertos){
            aeropuerto.showVuelosLlegada();
        }
    }

    public void imprimirVuelosLlegada(){
        for (Aeropuerto aeropuerto : aeropuertos){
            aeropuerto.showVuelosLlegada();
        }
    }

    //agrega aeropuertos
    public void addAeropuerto(Aeropuerto aeropuerto){
        aeropuertos.add(aeropuerto);
    }

    //imprime los aeropuertos
    public void imprimirAeropuerto(){
        for(Aeropuerto aeropuerto: aeropuertos){
            aeropuerto.showAeropuerto();
        }
    }

    //imprime vuelos
    public void imprimirVuelos(){
        for(Vuelo vuelo : vuelos){
            vuelo.imprimir();
        }
    }

}
