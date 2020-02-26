package templets;

/**
 * Rectangle
 */
public class Rectangle extends Figura{
    private float base,altura;

    public Rectangle(String mesura, float base, float altura) {
        super(mesura);
        this.base = base;
        this.altura = altura;
        area = base * altura;
        parimetre =base * 2 + altura * 2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
        area = base * altura;
        parimetre =base * 2 + altura * 2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        area = base * altura;
        parimetre =base * 2 + altura * 2;
    }
    
}