package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        //this(0);
    }

//    public Asignatura(int codigoInterno,Tipo tipo) {
//        this("Sin nombre", codigoInterno, 0,tipo);
//    }

    public Asignatura(int codigoExterno,Tipo tipo) { //Se elimina el anterior constructor por ambiguedad y teniendo en cuenta que después se agrega un código interno
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

//    public void cambiarDatos(int codigoInterno) {
//        this.codigoInterno = codigoInterno;
//    }

    public void cambiarDatos(int codigoExterno) { //se comenta el anterior método por ambiguedad con este y teniendo en cuenta que no se había método para cambiar código externo
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
