import java.util.List;
import  java.util.ArrayList;
public class ListaEstudiante {

     public List<Estudiante> estudiantes;

    public ListaEstudiante() {

        // agrega estudiantes
        estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Juan", 20, 101, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102, 4.1));
        estudiantes.add(new Estudiante("Camila", 21, 103, 3.8));
    }
}

