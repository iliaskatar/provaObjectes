package shop.templates;

public class Producte {
    private String ref,desc;
    private float preu;
 

    public Producte(String ref) {
        this.ref = ref;
    }
    

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesc() {
        return desc;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
   
}