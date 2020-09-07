package classroom;

public class Asignatura {

    String nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
        this.nombre= "Sin nombre";
        this.codigoExterno = 0;
    }

    Asignatura(int codigoExterno) {
        this.nombre = "Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = codigoExterno;
    }

    Asignatura(double codigoExterno) {
        this.nombre ="Sin nombre";
        this.codigoInterno= 0;
        this.codigoExterno = (int) codigoExterno;
    }

    Asignatura(String nombre) {
        this.nombre=nombre;
        this.codigoExterno= 0;
        this.codigoInterno= 0;
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(double codigoExterno) {
        this.codigoExterno = (int) codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
