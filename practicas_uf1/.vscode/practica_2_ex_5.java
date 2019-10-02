/**
 * practica_2_ex_5
 */
public class practica_2_ex_5 {
    public static void main(String[] args) {
        
    //5 - Demana a l'usuari 3 preguntes. Cada pregunta val un punt. Finalment Informa a l'usuari de la puntuació obtinguda.


    boolean stop = false;
    String pregunta1 = "hola";
    String pregunta2 = "hola";
    String pregunta3 = "hola";

    System.out.println("que es diu cuan saludas?");
    String usuari = System.console().readLine();
    int punt = 0;
    if(!stop)
    {
        if(usuari.equalsIgnoreCase("hola"))
        {
            punt++;   
        }
        else
        {
            punt--;
        }
        System.out.println("que es diu cuan sospens?");
        usuari = System.console().readLine();
        if(usuari.equalsIgnoreCase("hola"))
        {
            punt++;   
        }
        else
        {
            punt--;
        }
        System.out.println("que es diu cuan aproves?");
        usuari = System.console().readLine();
        if(usuari.equalsIgnoreCase("hola"))
        {
            punt++;   
        }
        else
        {
            punt--;
        }
    }

    System.out.println("has tret " + punt);

    }
}