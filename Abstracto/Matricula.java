public class Matricula {
private int contador;
private String nombre;
private Curso[] curso;
private Alumno[] alumnos;
Matricula(String nombre){
    this.nombre = nombre;
    this.contador = 0;
    this.curso = new Curso[2];
    this.alumnos = new Alumno[2];
}    
public void setCurso(Curso curso) {

    this.curso[this.contador++] = curso;
}

public Curso[] getCurso() {
    return curso;
}
public void setAlumno(Alumno alumnos) {

    this.alumnos[this.contador++] = alumnos;
}

public Alumno[] getAlumno() {
    return alumnos;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void mostrarSemestre(){
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("El Presente semestre es: "+getNombre());
    System.out.println();
}
}
