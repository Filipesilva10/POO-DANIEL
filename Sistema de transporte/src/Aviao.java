public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Altitude Máx: " + altitudeMax;
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }
}