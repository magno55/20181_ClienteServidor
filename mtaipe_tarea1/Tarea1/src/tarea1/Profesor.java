package Tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

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
    public int Dias_Laborados(String Fecha_ingreso){                    
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            Calendar cal=Calendar.getInstance();             
            int diaHoy = cal.get(cal.DATE); 
            int mesHoy = cal.get(cal.MONTH); 
            int anioHoy = cal.get(cal.YEAR); 
            
            String fechaAnterior = Fecha_ingreso;
            String[] fechaAnt = fechaAnterior.split("/"); 
            int diaAnt = Integer.parseInt(fechaAnt[0]); 
            int mesAnt = Integer.parseInt(fechaAnt[1]); 
            int anioAnt = Integer.parseInt(fechaAnt[2]); 

            Integer Total_dias=(anioHoy-anioAnt)*365+(mesAnt-mesHoy)*30+(diaAnt-diaHoy);
            return Total_dias;
        }
    

    public Profesor() {
        super();
    }

    public static void main(String[] args) throws IOException{
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