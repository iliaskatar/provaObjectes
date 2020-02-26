package app;
//no le pogut acabar, em falta temps.

// he comensat amb arrays normal fins que he vist com els tenia que printar que seria millor amb arrays bi. Ho he intantat fer-ho i no em soria s'em printa 
//malament i avia perdut molt de temps fento el final ho he fet aray normal em surten millor que el bi.
//em costa fer funciona els arrays bi. l'examan es mooooooooooolt llarg. em falta temps per acabar i per comprobar, etc... 
// 

public class App {
    public static void main(String[] args) throws Exception {
        boolean sortir = false;
        String[] matricula = new String[1];
        String[] unitats = new String[1];
        String[] uf = new String[3];
        int[] array = new int[3];
        String[] alu = new String[3];

        while (!sortir) {
            System.out.println("---------------------------------------");
            System.out.println("-------GESTIONES CIRVIANUM-------------");
            System.out.println("---------------------------------------");
            System.out.println("----------MANU PRINCIPAL---------------");
            System.out.println("---------------------------------------");
            System.out.println(
                    " 1- introdueix modul profecional \n 2- intrudoir unitat formativa \n 3-veure curriculom \n 4- intruduir alumne \n 5-llista d'alumnes \n 6- mostrar matricula alumnes \n 7- mostrar matricula alumnes \n sortir");

            int opcio = Integer.parseInt(System.console().readLine());

            switch (opcio) {

            case 1:
                modul(matricula, unitats);
                break;
            case 2:
                modulformatibas(matricula, unitats, uf, array);
                break;
            case 3:
                curricolum(matricula, unitats, uf, array);
                break;
            case 4:
                alumne(alu);
                break;
            case 5:
                llistAlumne(alu);
                break;
            case 6:
                ufalu(alu, matricula, unitats, uf, array);
                break;
            case 7:

                break;
            case 8:
                sortir = true;
                break;

            default:
                break;
            }

        }

    }

    public static void printar(String[] matricula, String[] unitats) {
        int a = 0;
        for (int i = 0; i < matricula.length; i++) {
            for (int j = 0; j < unitats.length; j++) {
                a++;
                System.err.println(i + " - " + matricula[i] + " - " + unitats[j]);

            }

        }
    }

    public static void modul(String[] matricula, String[] unitats) {
        boolean sortir = false;
        String descripcio = " ";
        String mp = " ";
        String surt = " ";
        while (!sortir) {
            System.out.println("intrudueix el codi MP (0 per tornar el menu)");
            surt = System.console().readLine();
            if (surt.equals("0")) {
                sortir = true;
            } else {
                mp = surt;
                System.out.println("introdueix una descripcio del codi: " + mp);
                descripcio = System.console().readLine();
                for (int i = 0; i < matricula.length; i++) {
                    matricula[i] = mp;
                }
                for (int i = 0; i < unitats.length; i++) {

                    unitats[i] = descripcio;
                }

            }

        }

    }

    public static void modulformatibas(String[] matricula, String[] unitats, String[] uf, int[] array) {
        boolean sortir = false;
        String nom = " ";
        int hores = 1;
        int a = 1;
        printar(matricula, unitats);
        int opcio = Integer.parseInt(System.console().readLine(" opcio: "));
        while (!sortir) {

            System.out.println(" introdueix el nom de la uf" + a + " del " + matricula[opcio] + " (0 per menu)");

            nom = System.console().readLine();
            if (nom.equals("0")) {
                sortir = true;
            } else {
                System.out.println(" introdueix les hores uf " + a + matricula[opcio] + "(" + nom + ")");
                a++;
                hores = Integer.parseInt(System.console().readLine());
                for (int i = 0; i < uf.length; i++) {
                    uf[i] = nom;
                }
                for (int i = 0; i < array.length; i++) {
                    array[i] = hores;
                }

            }

        }

    }

    public static void curricolum(String[] matricula, String[] unitats, String[] uf, int[] array) {
        printar(matricula, unitats);
        for (int i = 0; i < uf.length; i++) {
            System.out.println();
        }
    }

    public static void alumne(String[] alu) {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("introdueix nom: (0 per tornar el menu)");
            String nom = System.console().readLine();
            if (nom.equals("0")) {
                sortir = true;
            } else {
                System.out.println(" intrudoeix cognom; ");
                String cognom = System.console().readLine();
                System.out.println("GENERANT ADREÇA e-mail....");
                System.out.println("e-mail assignat: " + nom + "." + cognom + "@cirvianum.cat");
                for (int i = 0; i < alu.length; i++) {
                    alu[i] = nom;
                    alu[i] = cognom;
                }

            }

        }

    }

    public static void llistAlumne(String[] alu) {
        // nomes sem guarda el segon nom i el primer no me lensenya
        for (int i = 0; i < alu.length; i++) {
            if (i == (alu.length - 1)) {
                System.err.println(alu[i] + alu[i]);
            } else {
                System.out.println(alu[i] + "." + alu[i] + "@cirvianum.cat");
            }
            System.out.println();

        }

    }

    public static void ufalu(String[] alu, String[] matricula, String[] unitats, String[] uf, int[] array) {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("introdueix lalumne que vols matricular: (0 per menu)");
            llistAlumne(alu);
            String nom = System.console().readLine();
            if (nom.equals("0")) {
                sortir = true;
            } else {
                System.out.println("introdueix el mp que vols matricular: ");
                printar(matricula, unitats);
                System.out.println("introdueix la uf que vols matricular " + nom);
                System.out.println("si vols matricularte a totes les uf tecleja 0 ");
                int a = 1;
                for (int i = 0; i < uf.length; i++) {

                    System.out.println(i + " UF " + a + uf[i]);
                }
                System.out.println("matricula realitzada");

            }

        }

    }
    public static void  fet(String[] alu, String[] matricula, String[] unitats, String[] uf, int[] array) {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("introdueix lalumne que vols matricular: (0 per menu)");
            llistAlumne(alu);
            String nom = System.console().readLine();
            if (nom.equals("0")) {
                sortir = true;
            } else{
                printar(matricula, unitats);
                curricolum(matricula, unitats, uf, array);
            }
        }
    }

}