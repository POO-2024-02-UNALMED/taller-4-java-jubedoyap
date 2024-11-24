package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo = 0; //se elimina el final para que el código del grupo pueda ser modificado
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo; 
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        //Persona[] personas = new Persona[cantidadEstudiantes]; si quiero invocar otro constructor el this siempre debe ir primero
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
    }

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
