package templets;

/**
 * Rodona
 */
public class Rodona extends Figura{
    private final float pi = 3.1416f;
    private float radi;

    public Rodona(String mesura, float radi) {
        super(mesura);
        this.radi = radi;
        area = pi *(radi*radi);
        parimetre = 2 * pi * radi;
    }

    public float getRadi() {
        return radi;
    }

    public void setRadi(float radi) {
        this.radi = radi;
        area = pi *(radi*radi);
        parimetre = 2 * pi * radi;
    }
    

}