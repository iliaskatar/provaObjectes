package shop.templates;

import java.util.ArrayList;

public class funcions {

    public static void menu(){
        System.out.println("##########################");
        System.out.println("#        Menu            #");
        System.out.println("##########################");
        System.out.println("# 1- crear client        #");
        System.out.println("# 2- mostrar clients     #");
        System.out.println("# 3- productes           #");
        System.out.println("# 4- mostrar productes   #");
        System.out.println("# 5- factura             #");
        System.out.println("# 6- sortir              #");
        System.out.println("##########################");
    }

    public static void printClient(ArrayList<Client> al){
        for (Client client : al) {
            System.out.println(" - nom: " + client.getNom() + " - cognom: " + client.getCognom() + " -dni: "
                    + client.getDni() + " - poblacio: " + client.getPoblacio() + " telefon: " + client.getTelefon());
        }
    }
    public static void printProductes(ArrayList<infoProductes> pro){
        for (infoProductes product : pro) {
            System.out.println("Referencia: " + product.getReferencia().getRef() + " Nom: " + product.getReferencia().getDesc() + " Preu: "
                    + product.getReferencia().getPreu() + "€ Quantitat: " + product.getQuantitat());
        }  
    }
    public static infoProductes producteDelMagatzem(ArrayList<infoProductes> al, String ref){
        
        for (infoProductes all : al) {
            if (all.getReferencia().getRef().equals(ref)) {
                return all;
            }
        }
        return null;
    }
    public static boolean existeixProducta(ArrayList<infoProductes> al, String prducta) {
        for (infoProductes infoProductes : al) {
            if (infoProductes.getReferencia().getRef().equals(prducta)) {
                return true;
            }
        }
        return false;
    
    }
    public static Client prova() {
        Client prova = new Client("88888888A");
       // prova.setAniversari("01/01/0001");
        prova.setNom("nom");
        prova.setCognom("cognmom");
        prova.setPoblacio("ciutat");
        prova.setTelefon(000000000);
        return prova;
    }
    public static void clear(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
}