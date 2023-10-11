public class Materia {
    private String nombreMateria;
    private String Profesor1;
    private String Profesor2;
    private int codigo=0;
    private int numHoras=0;
    public Materia(String nombreMateria, String profesor1, String profesor2, int codigo, int numHoras){
        this.nombreMateria=nombreMateria;
        this.codigo=codigo;
        this.Profesor1=profesor1;
        this.Profesor2=profesor2;
        this.numHoras=numHoras;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getProfesor1() {
        return Profesor1;
    }

    public void setProfesor1(String profesor1) {
        Profesor1 = profesor1;
    }

    public String getProfesor2() {
        return Profesor2;
    }

    public void setProfesor2(String profesor2) {
        Profesor2 = profesor2;
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
}
