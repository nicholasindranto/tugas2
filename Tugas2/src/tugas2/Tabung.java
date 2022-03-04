package tugas2;

public class Tabung extends Lingkaran implements MenghitungRuang{
    
    private float tinggi;

    public Tabung(int tinggi, int jariJari) {
        super(jariJari);
        setTinggi(tinggi);
    }

    public void setTinggi(int tinggi) {
        float t = (float) tinggi;
        this.tinggi = t;
    }

    @Override
    public float volume() {
        return ((super.luas()) * (this.tinggi));
    }

    @Override
    public float luasPermukaan() {
        return ((2.0f * (super.luas())) + ((this.tinggi) * (super.keliling())));
    }
}