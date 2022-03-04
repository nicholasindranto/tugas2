package tugas2;

public class PersegiPanjang implements MenghitungBidang{
    
    private float panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }

    public void setPanjang(int panjang) {
        float p = (float) panjang;
        this.panjang = p;
    }

    public void setLebar(int lebar) {
        float l = (float) lebar;
        this.lebar = l;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    @Override
    public float luas() {
        return ((getPanjang()) * (getLebar()));
    }

    @Override
    public float keliling() {
        return ((2.0f * (getPanjang())) + (2.0f * (getLebar())));
    }
}