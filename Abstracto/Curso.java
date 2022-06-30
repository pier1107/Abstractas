public class Curso{
    private int contador;
    private String nombre;
    private Profesor[] profesor;
    Curso(String nombre){
        this.nombre = nombre;
        this.contador = 0;
        this.profesor =new Profesor[1];
    }
    public void setProfesor(Profesor profesor) {

        this.profesor[this.contador++] = profesor;
    }

    public Profesor[] getProfesor() {
        return profesor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarCurso(){
        System.out.println("Curso del presente semestre: "+getNombre());                  
    }
}