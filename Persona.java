public class Persona {
    private String cedula;
    private int edad;
    private String nombre;

    public Persona(String cedula, int edad, String nombre){
        setCedula(cedula);
        setEdad(edad);
        setNombre(nombre);
    }
    
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
