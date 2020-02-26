package templets;

/**
 * Triangle
 */
public class Triangle extends Figura{

    public Triangle(String mesura) {
        super(mesura);
        // TODO Auto-generated constructor stub
    }

    protected float costat, costat2, costat3;

    public float getCostat() {
        return costat;
    }

    public void setCostat(float costat) {
        this.costat = costat;
    }

    public float getCostat2() {
        return costat2;
    }

    public void setCostat2(float costat2) {
        this.costat2 = costat2;
    }

    public float getCostat3() {
        return costat3;
    }

    public void setCostat3(float costat3) {
        this.costat3 = costat3;
    }
    
}