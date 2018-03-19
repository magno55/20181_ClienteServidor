package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


public class Profesor {
    String sNombre;
    int nEdad;
    int nCantidadCursos;
    String sFechaIngreso;


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

    public void setNCantidadCursos(int nCantidadCursos) {
        this.nCantidadCursos = nCantidadCursos;
    }

    public int getNCantidadCursos() {
        return nCantidadCursos;
    }


    public void setSFechaIngreso(String sFechaIngreso) {
        this.sFechaIngreso = sFechaIngreso;
    }

    public String getSFechaIngreso() {
        return sFechaIngreso;
    }


    /*METODOS*/
    public int Dias_Laborados(String Fecha_ingreso) throws ParseException {                    
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            
            Calendar cal=Calendar.getInstance();
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
        int diaHoy = cal.get(cal.DATE);
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
        int mesHoy = cal.get(cal.MONTH);
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
        int anioHoy = cal.get(cal.YEAR); 
            
            String fechaAnterior = Fecha_ingreso;
            String[] fechaAnt = fechaAnterior.split("/"); 
            int diaAnt = Integer.parseInt(fechaAnt[0]); 
            int mesAnt = Integer.parseInt(fechaAnt[1]); 
            int anioAnt = Integer.parseInt(fechaAnt[2]); 
            Integer Total_dias=0;
           
            Date fechaInicial=formato.parse(Fecha_ingreso);
            Date fechaFinal=formato.parse(diaHoy+"/"+mesHoy+"/"+anioHoy);  
            int dias=0;
            dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);                        
            return dias;
        }
    
    public Profesor() {
        super();
    }

    public static void main(String[] args) throws IOException, ParseException {
        Profesor profesor = new Profesor();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        String sNombreDocente;
        int nCantidadCursos;
        String sFechaIngreso;
        
        System.out.println("Ingrese Nombre de Docente"); 
        sNombreDocente=buffer.readLine();
        System.out.println("Ingrese la Cantidad de cursos asignados");
        nCantidadCursos=Integer.parseInt( buffer.readLine());
        System.out.println("Ingrese fecha de Ingreso");
        sFechaIngreso=buffer.readLine();
       
        profesor.setSNombre(sNombreDocente);        
        profesor.setNCantidadCursos(nCantidadCursos);        

        System.out.println("Usted es "+ profesor.getSNombre() 
                           + " y lleva laborando " +profesor.Dias_Laborados(sFechaIngreso)
                           + " dias y tiene "+ profesor.getNCantidadCursos()+ " cursos asignados"); 
    }
}