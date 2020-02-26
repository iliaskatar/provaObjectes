/**
 * ex_1
 */
import java.util.Scanner;
public class ex_1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("quina es la teva edat? ");
        //int edat =  System.console().readLine();
        float edat = Float.parseFloat(System.console().readLine());

        if(edat<65)
        {
            System.out.println(" encara ets jova");
        }
        else
        {
            System.out.println("ja et pots juvilar");
        }

    }
}