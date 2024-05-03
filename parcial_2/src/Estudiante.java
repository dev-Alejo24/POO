public class Estudiante {

    private String nombre;
    private int edad;
    private int carrera;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante(String nombre, int edad, int carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    //para que la lista se agreguen a ListaEstudiante
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }

}
