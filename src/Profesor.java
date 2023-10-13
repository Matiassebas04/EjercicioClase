import java.util.Scanner;

public class Profesor {
    private String nombreProfesor="";
    private int cedulaProf;
    private int codigoProf;
    public Profesor(String nombreProfesor, int cedulaProf, int codigoProf){
        this.cedulaProf = cedulaProf;
        this.nombreProfesor = nombreProfesor;
        this.codigoProf = codigoProf;
    }

    public Profesor() {
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getCedulaProf() {
        return cedulaProf;
    }

    public void setCedulaProf(int cedulaProf) {
        this.cedulaProf = cedulaProf;
    }

    public int getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(int codigoProf) {
        this.codigoProf = codigoProf;
    }
    public void ingresardatos(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor:"+i);
        this.nombreProfesor=sc.next();
        System.out.println("Ingrese la cedula del profesor:"+i);
        this.cedulaProf=sc.nextInt();
        System.out.println("Ingrese el codigo del profesor"+i);
        this.codigoProf=sc.nextInt();
    }
}
