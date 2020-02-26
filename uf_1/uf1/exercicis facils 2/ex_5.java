/**
 * ex_5
 */
public class ex_5 {

    public static void main(String[] args) {

        // 5 - Demanar nombre per teclat i preguntar si vol posar més. Mostrar la suma
        // dels positius i negatius,
        // suma dels parells i imparells, quantitat de positius i negatius, quantitat de
        // parells i imparells i mitja de tots els números

        // Scanner s = new Scanner(System.in);
        // String str = s.nextLine();

        boolean stop = false;

        int[] array = new int[10];
        int i = 0;
        int mitjana = 0;
        String Lletre;



        int suma_nagatiu = 0;
        int suma_pusitu = 0;
        int suma_parell = 0;
        int suma_senar = 0;
        int quantitat_nagatiu = 0;
        int quantitat_pusitu = 0;
        int quantitat_parell = 0;
        int quantitat_senar = 0;

        while (!stop) {

            System.out.println("escriu un numero");
            array[i] = Integer.parseInt(System.console().readLine());

            boolean t = false;
            while (!t) {

                System.out.println("vols posar mes numeros?  si/no");
                Lletre = System.console().readLine();

                if (Lletre.equals("si")) {
                    t = true;
                } else if (Lletre.equals("no")) {
                    t = true;
                    stop = true;
                } else {
                    System.out.println("no megrada el valor");
                }
                i++;
            }

        }

        for (int s = 0; s < array.length; s++) {
            System.out.println(array[s]);
        }

        for (int j = 0; j <= array[i]; j++) {

            if (array[j] < 0) {
                quantitat_nagatiu++;
                suma_nagatiu = suma_nagatiu + array[j];
                mitjana = suma_nagatiu / quantitat_nagatiu;
            } else {
                quantitat_pusitu++;
                suma_pusitu = suma_pusitu + array[j];
                mitjana = suma_pusitu / quantitat_pusitu;
            }
        }

        for (int j = 0; j <= array[i]; j++) {

            if (array[j] % 2 == 0) {
                quantitat_parell++;
                suma_parell = suma_parell + array[j];
                mitjana = suma_parell / quantitat_parell;
            } else {
                quantitat_senar++;
                suma_senar = suma_senar + array[j];
                mitjana = suma_senar / quantitat_senar;
            }
        }
        System.out.println("\n ");
        System.out.println(" la seva suma dels negatius : " + suma_nagatiu);
        System.out.println("la suma dels  positiu es : " + suma_pusitu);
        System.out.println("la suma dels parell es : " + suma_parell);
        System.out.println("la suma dels imparell es : " + suma_senar);
        System.out.println("\n ");
        System.out.println("la mitjana de tots els nombres es : " + mitjana);
        System.out.println("\n ");
        System.out.println("numeros negatius hi han : " + quantitat_nagatiu);
        System.out.println("numeros pusitiu hi han : " + quantitat_pusitu);
        System.out.println("numeros parell hi han : " + quantitat_parell);
        System.out.println("numeros senar hi han : " + quantitat_senar);

    }
}