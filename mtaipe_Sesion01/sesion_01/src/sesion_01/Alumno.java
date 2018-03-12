package sesion_01;

public class Alumno {
    /*VARIABLES*/
    String sNombre;
    int nEdad;
    
    /*GET SET*/
    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }
    /*METODO */
    public String SaludoBienvenida(String psNombre) {
        return " Hola mundo!! Bienvenid@ " + psNombre;
    }
    /*CONSTRUCTORES*/
    public Alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }
    public Alumno() {
        super();
    }
    
    public static void main(String[] args) {
        Alumno myAlumno = new Alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.SaludoBienvenida("Magno Taipe"));
        }
    }
    
}
