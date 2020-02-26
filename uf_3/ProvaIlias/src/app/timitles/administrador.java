package app.timitles;

/**
 * administrador
 */
public class administrador extends posts {

    protected String usuari, pasword;

    public administrador(String usuari, String pasword) {
        super(usuari, pasword);
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    public boolean contrasenyaCorrecta(String pasword) {
        if (this.pasword.equals(pasword)) {
            System.out.println("Contrasenya Valida");
            return true;
        } else {
            System.out.println("Constrasenya invalida");
            return false;
        }
    }

}