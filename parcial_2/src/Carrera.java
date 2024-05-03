public class Carrera {

    private int codigo;
    private String nombre;
    private double promedioNotas;
    private double promedioEdad;

    //getter and setter


    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioEdad(double promedioEdad) {
        this.promedioEdad = promedioEdad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedioNotas = 0.0;
        this.promedioEdad = 0.0;
    }

    //para que los datos se agregue a Listacarrera
    public String toString() {
        return "Carrera: " + nombre + ", Código: " + codigo;
    }
}
