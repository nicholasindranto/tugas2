package tugas2;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    
    private float tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        setTinggi(tinggi);
    }

    public void setTinggi(int tinggi) {
        float t = (float) tinggi;
        this.tinggi = t;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    public float volume() {
        return ((super.luas()) * (getTinggi()));
    }

    @Override
    public float luasPermukaan() {
        return ((2.0f * (super.luas())) + (2.0f * (super.getPanjang()) * (getTinggi())) + (2.0f * (super.getLebar()) * (this.tinggi)));
    }
    
}