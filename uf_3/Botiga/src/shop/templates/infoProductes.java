package shop.templates;

/**
 * infoProductes
 */
public class infoProductes {
     private Producte referencia;
     private Integer quantitat = 0;

     public infoProductes(Producte referencia) {
          this.referencia = referencia;
     }

	public void sumaQuantitat(int quantitat) {
          this.quantitat += quantitat;
	}

     public Producte getReferencia() {
          return referencia;
     }

     public void setReferencia(Producte referencia) {
          this.referencia = referencia;
     }

     public Integer getQuantitat() {
          return quantitat;
     }

     public void setQuantitat(Integer quantitat) {
          this.quantitat = quantitat;
     }

	
     
}