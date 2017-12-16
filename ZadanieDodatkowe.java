import java.util.Random;
import java.util.Scanner;

public class ZadanieDodatkowe {
    public static void main ( String[] args ) {
        System.out.println ( "Losuje 10 liczb" );
        Random gr = new Random ();
        Scanner sc = new Scanner ( System.in );
        int tab[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            tab[i] = gr.nextInt ( 10 );
            System.out.print ( tab[i]+"," );
        }
        System.out.println ( " \n\nDodaj 11 element. \n a ja stworze nową tablice" );
        int newNumber = sc.nextInt ();

        int tabNew[] = new int[11];

        for (i = 0; i <10; i++) {
            tabNew[i] = tab[i];
            tabNew[10] = newNumber;
        }

        System.out.println ( "Wypisanie dwóch tablic i porównanie ich" );

        for (i = 0; i < 10; i++) {
        System.out.print ( tab[i]+"," );

        System.out.println ( tabNew[i]+"," );
            //System.out.println ("");
    }
        System.out.println (tabNew[10]);


    }
}
