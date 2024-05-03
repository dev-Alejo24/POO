import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ListaEstudiante listaEstudiante = new ListaEstudiante();
        System.out.println("Informacion Estudiantes");
        for(Estudiante estudiantes: listaEstudiante.estudiantes){
            System.out.println(estudiantes);
        }
        System.out.println(" ");

        //CARRERA CON PROMEDIO
        ListaCarrera listaCarrera = new ListaCarrera(listaEstudiante.estudiantes);
        System.out.println("LISTA DE CARRERAS");
        for(Carrera carrera : listaCarrera.carreras){
            System.out.println(carrera);
        }
        System.out.println(" ");

        // Imprimir reportes
        imprimirReportes(listaCarrera.getCarreras());
    }

    //2. IMPRIME REPORTE DE CARRERAS
    public static void imprimirReportes(List<Carrera> carreras) {
        System.out.println("Reporte de Carreras:");
        for (Carrera carrera : carreras) {
            System.out.println("Carrera: " + carrera.getNombre());
            System.out.println("Código: " + carrera.getCodigo());
            System.out.println("Promedio Notas: " + carrera.getPromedioNotas());
            System.out.println("Promedio Edad: " + carrera.getPromedioEdad());
            System.out.println();
        }
    }
}
