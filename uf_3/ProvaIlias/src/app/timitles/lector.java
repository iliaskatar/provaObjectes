package app.timitles;

import java.time.LocalDate;

/**
 * lector
 */
public class lector extends posts {

    private String nom, contrasenya;
    private LocalDate edat;

    public lector(String nom, String pasword, LocalDate edat) {
        super(nom, pasword);
        this.edat=edat;
        // TODO Auto-generated constructor stub
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public LocalDate getEdat() {
        return edat;
    }

    public void setEdat(LocalDate edat) {
        this.edat = edat;
    }

}