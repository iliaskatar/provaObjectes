package shop.templates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Comanda {
    private LocalDateTime hora;
    private Client persona;
    private ArrayList<liniacomanda> pro = new ArrayList<>();

    private String numeroReferencia;

    public Comanda(String numeroReferencia) {
        this.hora = LocalDateTime.now();
        this.numeroReferencia = numeroReferencia;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Client getPersona() {
        return persona;
    }

    public void setPersona(Client persona) {
        this.persona = persona;
    }

    public ArrayList<liniacomanda> getPro() {
        return pro;
    }

    public void setPro(ArrayList<liniacomanda> pro) {
        this.pro = pro;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public void factura() {

        System.out.println("---------------------------------------");
        System.out.println("data: " + hora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")));
        System.out.println("Nom client Client: " + persona.getNom());
        for (liniacomanda producte : pro) {
            System.out.println("Producte: " + producte.getProducte().getDesc() + " Quantitat: "
                    + producte.getQuantitatlinia() + " Preu: " + producte.getPreulinia());
        }
        System.out.println("----------------------------------------");
    }

}