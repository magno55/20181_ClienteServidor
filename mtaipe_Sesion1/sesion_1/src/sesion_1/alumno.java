package sesion_1;

public class alumno {
    public alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;        
    }
    String sNombre="Magno";
    String sApellidos="Taipe Charca";
    String sFechaNacimiento="15/05/1**0";
    String sCodigoAlumno="2014124369";
    int sexo=1;

    public void setSApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }

    public String getSApellidos() {
        return sApellidos;
    }

    public void setSFechaNacimiento(String sFechaNacimiento) {
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public String getSFechaNacimiento() {
        return sFechaNacimiento;
    }

    public void setSCodigoAlumno(String sCodigoAlumno) {
        this.sCodigoAlumno = sCodigoAlumno;
    }

    public String getSCodigoAlumno() {
        return sCodigoAlumno;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getSexo() {
        return sexo;
    }

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
    int nEdad;
    public alumno() {
        super();
    }
    public String SaludoBienvenida(String psNombre) {
        return "Hola mundo!!. Bienvenid@ " + psNombre;
    }
    
    public String Modificar()
    {
        
        return "Se modificaron los datos";
    }
    
    public static void main(String[] args) {
        alumno myAlumno = new alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.SaludoBienvenida("Magno"));
        }
    }
}
