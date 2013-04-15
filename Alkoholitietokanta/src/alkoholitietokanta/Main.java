
package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.Transaction;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.config.dbplatform.SQLitePlatform;
import java.io.IOException;
/**
 * 
 * @author katu
 * 
 * Tämä luokka alustaa EbeanServerin oikeilla asetuksilla sekä mainin kautta käynnistää Kirjautuminen-luokan, jossa sijaitsee myös ensimmäinen menu.
 * Tässä luotua EbeanServer serveriä siirretään myös Kirjautuminen-luokkaan ja sieltä myöhemmin avattavaan ToimintaLogiikka-luokkaan
 * 
 **/

public class Main {
    
    public static void main(String[] args) throws IOException {
        boolean tuhotaanJaLuodaanTaulut = true;
        EbeanServer server = initializeDatabase(tuhotaanJaLuodaanTaulut);
        new Kirjautuminen(server).ohjelmanAloitus(tuhotaanJaLuodaanTaulut);
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


        if (tuhotaanJaLuodaanTaulut) {
            config.setDdlGenerate(true);
            config.setDdlRun(true);

        }
        return EbeanServerFactory.create(config);
    }  
}
