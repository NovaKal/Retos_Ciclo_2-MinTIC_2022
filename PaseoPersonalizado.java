public class PaseoPersonalizado {
    private int id;
    private Destino[] destino;
    private Persona persona;

    public PaseoPersonalizado(int id, Destino[] destino, Persona persona){
        setId(id);
        setDestino(destino);
        setPersona(persona);
    }

    public int getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Destino[] getDestino() {
        return destino;
    }

    public void setDestino(Destino[] destino) {
        this.destino = destino;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public double EstimarCostoPaseoPersonalizado(){
        double costoKilometro;
        double costoDestino = 0;
        costoKilometro = (persona.getEdad() >= 18)?375000:400000;
        
        if(destino != null){
            for (Destino i : destino){
                if (i != null){
                    costoDestino += ((double)i.getDistanciaMetros() / 1000) * costoKilometro;
                }
            }
        }
        return costoDestino;
    }
}