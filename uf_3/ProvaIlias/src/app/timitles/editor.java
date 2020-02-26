package app.timitles;

/**
 * editor
 */
public class editor extends posts {

    private String titul, contingut;
    private String majoroManor;

    public editor(String nom, String pasword, String titul) {
        super(nom, pasword);
        this.titul=titul;
        // TODO Auto-generated constructor stub
    }

	public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public String getContingut() {
        return contingut;
    }

    public void setContingut(String contingut) {
        this.contingut = contingut;
    }

    public String getMajoroManor() {
        return majoroManor;
    }

    public void setMajoroManor(String majoroManor) {
        this.majoroManor = majoroManor;
    }

}