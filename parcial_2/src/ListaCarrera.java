import java.util.List;
import java.util.ArrayList;

public class ListaCarrera {
    public List<Carrera> carreras;

    //recibe los estudiantes
    public ListaCarrera(List<Estudiante> estudiantes) {
        this.carreras = new ArrayList<>();
        this.carreras.add(new Carrera(101, "Ingeniería de Sistemas"));
        this.carreras.add(new Carrera(102, "Ingeniería Industrial"));
        this.carreras.add(new Carrera(103, "Matemáticas"));

        calcularPromedios(estudiantes);
    }

    //1. CALCULAR PROMEDIOS SEGUN LA CARRERA Y LA EDAD DE LOS ESTUDIANTES
    //recibe estudiantes como parametro para poder hacer las operaciones
    private void calcularPromedios(List<Estudiante> estudiantes) {
        for (Carrera carrera : carreras) {
            double totalNotas = 0.0;
            double totalEdad = 0.0;
            int contador = 0;
            //recorre los estudiantes
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getCarrera() == carrera.getCodigo()) {
                    totalNotas += estudiante.getPromedio();
                    totalEdad += estudiante.getEdad();
                    contador++;
                }
            }
            if (contador > 0) {
                carrera.setPromedioNotas(totalNotas / contador);
                carrera.setPromedioEdad(totalEdad / contador);
            }
        }
    }

    //lista que guarda la carrer con el promedio de las notas y edad de los estudiantes
    public List<Carrera> getCarreras() {
        return carreras;
    }
}

