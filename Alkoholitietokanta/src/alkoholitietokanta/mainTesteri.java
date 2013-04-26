/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import alkoholitietokanta.hallinta.JuomaHallinta;
import alkoholitietokanta.domain.Juoma;
import alkoholitietokanta.domain.BaariReissu;
import alkoholitietokanta.domain.Kayttaja;
import alkoholitietokanta.domain.Baari;
import alkoholitietokanta.domain.RyyppyReissu;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.Transaction;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.config.dbplatform.SQLitePlatform;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * Testiluokka, jolla debugaillaan ja testaillaan juttuja. Ei kovinkaan
 * merkityksellinen.
 *
 *
 */
public class mainTesteri {

    public static void main(String[] args) throws IOException, Exception {
        boolean tuhotaanJaLuodaanTaulut = true;
        EbeanServer server = initializeDatabase(tuhotaanJaLuodaanTaulut);

        Kayttaja k1 = new Kayttaja("asd", "222");
        Juoma j1 = new Juoma("Black Rat", "Natural dry apple cider", 4.7, "Matti");
        Juoma j2 = new Juoma("Karhu", "Perusbisse", 4.7, "Hattiwatti");
        Baari b1 = new Baari("William K", "Mukava oluthuone");
        Baari b2 = new Baari("Koti", "Oma koti kullan kallis");
        BaariReissu br1 = new BaariReissu();
        br1.setKuvaus("Kotona alottelin juomaan.");
        BaariReissu br2 = new BaariReissu();
        br2.setKuvaus("Matka jatkuin William K:hon, jossa tuli vedettyä naamat ja kaatuiltua kotiin.");
        server.save(k1);
        server.save(j1);
        server.save(b1);

        JuomaHallinta jHallinta = new JuomaHallinta(server);
        
        br1.lisaaJuoma(jHallinta.LoytyykoJuomaNimellaPalautetaanJuoma("Karhu"), 3);
        br2.lisaaJuoma(jHallinta.LoytyykoJuomaNimellaPalautetaanJuoma("Karhu"), 10);

        server.save(br1);
        server.save(br2);

        System.out.println("---------------------");
        List<BaariReissu> tulostettavatBaariReissut = server.find(BaariReissu.class).findList();
        Iterator<BaariReissu> iteraattori = tulostettavatBaariReissut.iterator();
        int i = 1;
        while (iteraattori.hasNext())
        {
            System.out.println(i);
            BaariReissu b = iteraattori.next();
            System.out.println(b.toString());
            i++;

        }
        
        System.out.println("---------------------");
        Scanner odotetaanEnteria = new Scanner(System.in);
        System.out.println("Paina enteriä jatkaaksesi.");
        odotetaanEnteria.nextLine();

    }

    private static EbeanServer initializeDatabase(boolean tuhotaanJaLuodaanTaulut) {
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
        config.addClass(Baari.class);
        config.addClass(BaariReissu.class);
        config.addClass(RyyppyReissu.class);



        if (tuhotaanJaLuodaanTaulut) {
            config.setDdlGenerate(true);
            config.setDdlRun(true);

        }
        return EbeanServerFactory.create(config);
    }
}
