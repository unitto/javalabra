package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.Transaction;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.config.dbplatform.SQLitePlatform;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean dropAndCreateTables = true;
        EbeanServer server = initializeDatabase(dropAndCreateTables);
        Scanner lukija = new Scanner(System.in);
        KayttajaHallinta hallinta = new KayttajaHallinta(server);



        System.out.println("Tervetuloa Alkoholitietokantaan! \nJatka valitsemalla alla olevasta menusta. ");
        int valinta = 0;

        while (valinta != 4) {
            System.out.println("---------------------");
            System.out.println("1. Lisää käyttäjä");
            System.out.println("2. Kirjaudu sisään");
            System.out.println("3. Poista käyttäjä");
            System.out.println("4. Lopeta");
            System.out.println("---------------------");
            System.out.print("Anna valintanumero: ");
            valinta = lukija.nextInt();

            if (valinta == 1) {
                tunnuksenLisays(lukija, hallinta);
            }
            if (valinta == 2) {
                System.out.println("Anna tunnus: ");
                String tun = lukija.next();
                System.out.print("Anna salasana: ");
                String sal = lukija.next();
                if (hallinta.Loytyyko(tun, sal) == true) {
                    ToimintaLogiikka kirjauduttuSisaanToimintalogiikkaan = new ToimintaLogiikka(hallinta.HaeKayttaja(tun, sal), server);
                } else {
                    System.out.println("Kirjautuminen epäonnistui, tarkasta tunnus ja salasana.");
                }
            }

            if (valinta == 3) {
                tunnuksenPoisto(lukija, hallinta);
            }

            if (valinta == 4) {
                System.out.println("Kiitoksia käytöstä & hyvää päivänjatkoa!\n");
                valinta = 4;
            }
            if (valinta < 1 || valinta > 4) {
                System.out.println("Ole hyvä ja valitse 1-4 väliltä.\n");
            }
        }
    }

    private static void tunnuksenLisays(Scanner lukija, KayttajaHallinta hallinta) throws IOException {
        System.out.print("Anna tunnus: ");
        String tun = lukija.next();
        System.out.print("Anna salasana: ");
        String sal = lukija.next();
        if (hallinta.lisaa(tun, sal) == true) {
            System.out.println("Tunnuksen lisäys onnistui, tallennetaan.");
        } else {
            System.out.println("Tunnuksen lisääminen ei onnistunut, kokeile toista tunnusta.");
        }
    }

    private static void tunnuksenPoisto(Scanner lukija, KayttajaHallinta hallinta) throws IOException {
        System.out.print("Anna poistettava tunnus: ");
        String tun = lukija.next();
        System.out.print("Anna poistettavan tunnuksen salasana: ");
        String sal = lukija.next();
        if (hallinta.poista(tun, sal) == true) {
            System.out.println("Tunnuksen poistaminen onnistui.");
        } else {
            System.out.println("Tunnuksen poistaminen ei onnistunut, tarkasta tunnuksen ja salasanan oikeinkirjoitus.");
        }
    }

    private static EbeanServer initializeDatabase(boolean dropAndCreateDatabase) {
        ServerConfig config = new ServerConfig();
        config.setName("alkoholitietokantaDB");

        DataSourceConfig sqLite = new DataSourceConfig();
        sqLite.setDriver("org.sqlite.JDBC");
        sqLite.setUsername("tunnus");
        sqLite.setPassword("salasana");
        sqLite.setUrl("jdbc:sqlite:alkoholi.db");
        config.setDataSourceConfig(sqLite);
        config.setDatabasePlatform(new SQLitePlatform());
        config.getDataSourceConfig().setIsolationLevel(Transaction.READ_UNCOMMITTED);
        config.setDefaultServer(false);
        config.setRegister(false);

        config.addClass(Kayttaja.class);
        config.addClass(Juoma.class);
        

        if (dropAndCreateDatabase) {
            config.setDdlGenerate(true);
            config.setDdlRun(true);
          
        }
        return EbeanServerFactory.create(config);
    }
}
