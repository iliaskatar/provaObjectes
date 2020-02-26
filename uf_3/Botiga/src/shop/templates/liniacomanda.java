package shop.templates;



/**
 * liniacomanda
 */
public class liniacomanda {
  
    private Producte producte;
    private int quantitatlinia;
    private float preulinia; 
    private Client client;
    

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public int getQuantitatlinia() {
        return quantitatlinia;
    }

    public void setQuantitatlinia(int quantitatlinia) {
        this.preulinia = producte.getPreu()* quantitatlinia;
        this.quantitatlinia = quantitatlinia;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getPreulinia() {
        return preulinia;
    }

    public void setPreulinia(float preulinia) {
        this.preulinia = preulinia;
    }
    

   

    
    
}