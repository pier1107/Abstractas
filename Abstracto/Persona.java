
 public abstract class Persona{
    protected String nombres;
    protected String apellidos;
    protected Integer dni;
    protected Integer fechaNacido;
    protected Integer fechaActual;

    Persona(String nombres, String apellidos, Integer dni, Integer fechaNacido, Integer fechaActual){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni; 
        this.fechaNacido = fechaNacido;
        this.fechaActual = fechaActual;

    }
    public String getApellidos() {
        return apellidos;
    }
    public Integer getDni() {
        return dni;
    }
    public Integer getFechaNacido() {
        return fechaNacido;
    }
    public String getNombres() {
        return nombres;
    }
    public Integer getFechaActual() {
        return fechaActual;
    }

    public Integer calcularEdad(){
        int edad;
        edad = getFechaActual() - getFechaNacido();
        return edad;
        
        }

    
}
