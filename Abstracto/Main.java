
public class Main {
public static void main(String[] args) {
  
  Matricula matricula = new Matricula("2022 IV");
  Curso cursowea = new Curso("Programacion en Ruby");   
  Profesor profesor = new Profesor("nombres", "apellidos", 17568452, 1984, 2022);
  Curso curso2 = new Curso("Base de Datos");
  Profesor profesor2 = new Profesor("Mario", "Castañeda", 71648861, 1985, 2022);
  Alumno alumno1 = new Alumno("Juaneto", "anacleto", 3215165, 2011, 2022, 321321);
  Alumno alumno2 = new Alumno("nombres", "apellidos", 456456, 2001, 2022, 12455354);
  
  
    matricula.mostrarSemestre();
    matricula.getNombre();
    cursowea.mostrarCurso();
    cursowea.getNombre();
    System.out.println();
    profesor.mostrarDatos2();
    profesor.calcularEdad();
    System.out.println();
    curso2.getNombre();
    curso2.mostrarCurso();
    profesor2.mostrarDatos2();
    profesor2.calcularEdad();
    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("Alumnos pre inscritos:");
    alumno1.mostrarDatos();
    alumno1.calcularEdad();
    System.out.println();
    alumno2.mostrarDatos();
    alumno2.calcularEdad();
    System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
    
}
