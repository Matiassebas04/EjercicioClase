public class Estudiante {
    private String matriculaNumero="";
    private int cedulaNumero=0;
    private String nombreEstudiante="";
    private String materia1="";
    private String materia2="";
    private String materia3="";
    public Estudiante(){

    }
    public Estudiante(String nombreEstudiante, int cedulaNumero, String matriculaNumero, String materia1, String materia2, String matieria3){
        this.nombreEstudiante = nombreEstudiante;
        this.cedulaNumero = cedulaNumero;
        this.matriculaNumero =matriculaNumero;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = matieria3;
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

    public String getMatieria1() {
        return materia1;
    }

    public void setMatieria1(String matieria1) {
        this.materia1 = matieria1;
    }

    public String getMatieria2() {
        return materia2;
    }

    public void setMatieria2(String matieria2) {
        this.materia2 = matieria2;
    }

    public String getMatieria3() {
        return materia3;
    }

    public void setMatieria3(String matieria3) {
        this.materia3 = matieria3;
    }

}
