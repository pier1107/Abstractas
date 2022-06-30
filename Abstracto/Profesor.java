public class Profesor extends Persona{
    Profesor(String nombres, String apellidos, Integer dni, Integer fechaNacido, Integer fechaActual) {
        super(nombres, apellidos, dni, fechaNacido,fechaActual);
    }
    
    public void mostrarDatos2(){
        System.out.println ("Profesor: " + getNombres() + " " +  getApellidos() + "\n"+
                            "DNI de Profesor: " +getDni()+ "\n"); }

    @Override
    public Integer calcularEdad(){      
        int edad;
        edad = getFechaActual() - getFechaNacido();
        System.out.println("Su edad es:"+edad);
        return edad;           
    }
}