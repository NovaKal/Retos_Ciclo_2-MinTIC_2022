public class Destino {
    private String nombre;
    private int distanciaMetros;

    public Destino(String nombre, int distanciaMetros){
        setNombre(nombre);
        setDistanciaMetros(distanciaMetros);
    }

    public String getNombre() {
        return nombre;
    }
    public int getDistanciaMetros() {
        return distanciaMetros;
    }
    public void setDistanciaMetros(int distanciaMetros) {
        distanciaMetros = (distanciaMetros <= 0)?5000:distanciaMetros;
        this.distanciaMetros = distanciaMetros;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
