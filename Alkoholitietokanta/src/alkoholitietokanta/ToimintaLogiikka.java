/*
 * Tänne tulee kirjautumisen jälkeinen menu, jossa kirjautunut käyttäjä suorittaa haluamiaan asioita.
 */
package alkoholitietokanta;

import java.util.Scanner;

public class ToimintaLogiikka {
    private String tunnus;

    public ToimintaLogiikka(String tunnus) {
        this.tunnus=tunnus;
        //BaariHallinta hallinta = new baariHallinta("src/paikat/"+tunnus+".txt");
        //JuomaHallinta hallinta = new JuomaHallinta("src/juomat/"+tunnus+".txt");
        
        
        Scanner lukija = new Scanner(System.in);
        int valinta = 0;
        
        System.out.println("Olet kirjautunut sisään käyttäjänä: "+this.tunnus);
        while (valinta != 7) {
            System.out.println("---------------------");
            System.out.println("1. Lisää juoma");
            System.out.println("2. Poista juoma");
            System.out.println("3. Lisää juomiskerta");
            System.out.println("4. Top 5 juoduimmat");
            System.out.println("5. Top 5 paras alkoholi/hinta ");
            System.out.println("6. Top 5 paras kokemus/hinta");
            System.out.println("7. Palaa kirjautumisvalikkoon");
            System.out.println("---------------------");
            System.out.print("Anna valintanumero: ");
            valinta = lukija.nextInt();

            if (valinta == 1) {
            }
            if (valinta == 2) {
            }

            if (valinta == 3) {
            }

            if (valinta == 4) {
                
            }
            if (valinta < 1 || valinta > 7) {
                System.out.println("Ole hyvä ja valitse 1-3 väliltä.\n");
            }
        }
    }
}
