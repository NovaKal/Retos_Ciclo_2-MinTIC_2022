import java.util.ArrayList;

public class Paseo{

    private int Id;
    private String Nombre;
    private int DistanciaMetros;

    public Paseo(int _Id, String _Nombre, int _DistanciaMetros) {
        this.Id = _Id;
        this.Nombre = _Nombre;
        this.DistanciaMetros = _DistanciaMetros;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDistanciaMetros() {
        return DistanciaMetros;
    }

    public static ArrayList<Paseo> VerPaseosDisponibles(Paseo[] paseos, double presupuesto) {
        ArrayList<Paseo> paseosDisponibles = new ArrayList<>();
        final int precioKm = 375000;
        int costoPaseo;
        if (paseos != null) {
            for (Paseo i : paseos) {
                if (i != null) {
                    if(i.getDistanciaMetros() > 0) {
                        costoPaseo = (i.getDistanciaMetros() / 1000) * precioKm;
                        if(costoPaseo <= presupuesto) {
                            paseosDisponibles.add(i);
                        }
                    }
                }
            }
        }
        return paseosDisponibles;
    }
}