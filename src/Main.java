public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor();
        Profesor profesor3 = new Profesor();

        profesor1.ingresardatos(1);
        profesor2.ingresardatos(2);
        profesor3.ingresardatos(3);

        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        Materia materia3 = new Materia();

        materia1.ingresardatos(1);
        materia2.ingresardatos(2);
        materia3.ingresardatos(3);

        materia1.setProfesor1(profesor1);
        materia2.setProfesor2(profesor2);
        materia3.setProfesor3(profesor3);

        Estudiante estudiante = new Estudiante("12345", 6789, "Juan", materia1, materia2, materia3);

        estudiante.imprimirTodoprof();
    }
}