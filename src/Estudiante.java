import java.sql.SQLOutput;
import java.util.Scanner;

public class Estudiante {
    private String matriculaNumero="";
    private int cedulaNumero=0;
    private String nombreEstudiante="";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;
    public Estudiante(){

    }

    public Estudiante(String matriculaNumero, int cedulaNumero, String nombreEstudiante, Materia materia1, Materia materia2, Materia materia3) {
        this.matriculaNumero = matriculaNumero;
        this.cedulaNumero = cedulaNumero;
        this.nombreEstudiante = nombreEstudiante;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public String getMatriculaNumero() {
        return matriculaNumero;
    }

    public void setMatriculaNumero(String matriculaNumero) {
        this.matriculaNumero = matriculaNumero;
    }

    public int getCedulaNumero() {
        return cedulaNumero;
    }

    public void setCedulaNumero(int cedulaNumero) {
        this.cedulaNumero = cedulaNumero;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public void imprimirTodoprof(){
        String nomProfesor1=materia1.getProfesor1().getNombreProfesor();
        System.out.println("El nombre del profesor correspondiente a la materia:"+materia1+" es:"+nomProfesor1);
        String nomProfesor2=materia3.getProfesor2().getNombreProfesor();
        System.out.println("El nombre del profesor 2 correspondiente a la materia:"+materia3+" es:"+nomProfesor2);
    }

    public void


}
