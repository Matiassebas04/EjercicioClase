import java.util.Scanner;

public class Materia {
    private String nombreMateria;
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;
    private int codigo=0;
    private int numHoras=0;
    public Materia(){

    }

    public Materia(String nombreMateria, Profesor profesor1, Profesor profesor2, Profesor profesor3, int codigo, int numHoras) {
        this.nombreMateria = nombreMateria;
        profesor1 = profesor1;
        profesor2 = profesor2;
        this.profesor3 = profesor3;
        this.codigo = codigo;
        this.numHoras = numHoras;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public void ingresardatos(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del materia:"+i);
        this.nombreMateria=sc.next();
        System.out.println("Ingrese el nrc del materia:"+i);
        this.codigo=sc.nextInt();
        System.out.println("Ingrese el numero de horas del materia"+i);
        this.numHoras=sc.nextInt();
    }
    public void ingresarProfesor(int i){
        if(i==1){
            profesor1=new Profesor();
            profesor1.ingresardatos(i);
        }else if (i==2){
            profesor2.ingresardatos(i);
            profesor2=new Profesor();
        }else{
            profesor3.ingresardatos(i);
            profesor3=new Profesor();
        }
    }
}
