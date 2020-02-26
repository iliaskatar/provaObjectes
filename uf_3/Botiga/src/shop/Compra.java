package shop;

import java.util.ArrayList;
import java.util.Scanner;
import shop.templates.*;

public class Compra {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Client> cli = new ArrayList<>();
        ArrayList<infoProductes> magatzem = new ArrayList<>();
        ArrayList<Comanda> coman = new ArrayList<>();

        bb: while (true) {
            funcions.menu();

            System.out.print("tria una opcio: ");
            int opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
            case 1:
                funcions.clear();
                while (true) {
                    System.out.print("introdueix dni:(0 per sortir) ");
                    Client client = new Client(sc.nextLine());
                    if (client.getDni().equals("0")) {
                        break;
                    }
                    System.out.print("introdueix nom: ");
                    client.setNom(sc.nextLine());
                    System.out.print("introdueix cognom: ");
                    client.setCognom(sc.nextLine());
                    System.out.print("introdueix poblacio: ");
                    client.setPoblacio(sc.nextLine());
                    System.out.print("introdueix telefon: ");
                    client.setTelefon(sc.nextInt());
                    sc.nextLine();
                    cli.add(client);
                }
                break;
            case 2:
                funcions.printClient(cli);
                break;
            case 3:
                funcions.clear();
                while (true) {
                    infoProductes product;
                    Boolean existeix = true;
                    System.out.print("introdueix la referencia(0 per sortir): ");
                    String id = sc.nextLine();
                    if (id.equals("0")) {
                        break;
                    } else if (!funcions.existeixProducta(magatzem, id)) {
                        Producte item = new Producte(id);
                        System.out.print("Descripció del producta: ");
                        item.setDesc(sc.nextLine());
                        System.out.print("Preu del producta: ");
                        item.setPreu(sc.nextFloat());
                        sc.nextLine();
                        product = new infoProductes(item);
                        existeix = false;
                    } else {
                        product = funcions.producteDelMagatzem(magatzem, id);
                        magatzem.remove(product);
                    }
                    System.out.print("Quantitat del producta: ");
                    product.sumaQuantitat(sc.nextInt());
                    sc.nextLine();
                    magatzem.add(product);
                    if (existeix) {
                        System.out.println("El producta s'ha actualitzat correctament. (intro per continuar)");
                    } else {
                        System.out.println("Producta afagit correctament. (intro per continuar)");
                    }
                    sc.nextLine();
                }

                break;
            case 4:
                funcions.printProductes(magatzem);
                break;
            case 5:
                for (Comanda comanda : coman) {
                    comanda.factura();
                }
                break;
            case 6:
                break bb;
            }
        }

    }

}