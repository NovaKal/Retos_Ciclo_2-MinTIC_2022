public class Main {
    public static void main(String[] args) {
        Destino[] destinos = new Destino[3];
        Persona person = new Persona("10000343", 17, "Juanito");
        Destino dest1 = new Destino("Guajira Fantastica", 0);
        Destino dest2 = new Destino("Guajira Fantastica", 0);
        Destino dest3 = new Destino("Orinoco Magnifico", 0);
        destinos[0] = dest1;
        destinos[1] = dest2;
        destinos[2] = dest3;

        PaseoPersonalizado viaje = new PaseoPersonalizado();
        viaje.EstimarCostoPaseoPersonalizado(1, destinos, person);
    }
}