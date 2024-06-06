import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {

    protected String codigo;
    protected String nombre;
    protected String poblacion;
    protected String pais;
    protected int GMT;

    private List<Vuelo> vueloSalida;
    private List<Vuelo> vueloLlegada;

    //constructor
    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int GMT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.GMT = GMT;
        this.vueloSalida = new ArrayList<>();
        this.vueloLlegada = new ArrayList<>();
    }

    //agrega los vuelos de salida los areopuertos
    public void addVuuelosSalida (Vuelo vuelo){
        vueloSalida.add(vuelo);
    }

    //agrega los vuelos llegando los areopuertos
    public void addVuelosLlegada(Vuelo vuelo){
        vueloLlegada.add(vuelo);
    }

    //muestra desde donde sale el vuelo
    public void showVuelosSalida(){
        System.out.println("Vuelos de salida desde: " +this.nombre);
        for (Vuelo vuelo : this.vueloSalida){
            vuelo.imprimir();
        }
    }

    //muestra a donde llega el vuelo
    public void showVuelosLlegada(){
        System.out.println("Vuelos de llegada a: " +this.nombre);
        for (Vuelo vuelo : vueloLlegada){
            vuelo.imprimir();
        }
    }

    public void showAeropuerto(){
        System.out.println("Codigo: " +this.codigo +" Nombre: " +this.nombre +" Poblacion: " +this.poblacion +" Pais: " +this.pais +" GMT: " +this.GMT);
    }

    //getter and setter


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getGMT() {
        return GMT;
    }

    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    public List<Vuelo> getVueloSalida() {
        return vueloSalida;
    }

    public void setVueloSalida(List<Vuelo> vueloSalida) {
        this.vueloSalida = vueloSalida;
    }

    public List<Vuelo> getVueloLlegada() {
        return vueloLlegada;
    }

    public void setVueloLlegada(List<Vuelo> vueloLlegada) {
        this.vueloLlegada = vueloLlegada;
    }
}
