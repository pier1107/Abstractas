
public class Alumno extends Persona{
    Integer codigo;
    Alumno(String nombres, String apellidos, Integer dni, Integer fechaNacido,Integer fechaActual, Integer codigo) {
        super(nombres, apellidos, dni, fechaNacido,fechaActual);
        this.codigo = codigo;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void mostrarDatos(){
        System.out.println ("Estudiante: " + getNombres() + " " +  getApellidos() + "\n"+
                            "Codigo de Estudiante: " + getCodigo()
                            +"\n"+"DNI de Estudiante:"+getDni());}
    @Override
     public Integer calcularEdad(){      
            int edad;
            edad = getFechaActual() - getFechaNacido();
            System.out.println("Su edad es:"+edad);
             return edad;           
      }

 }
