package alkoholitietokanta;

public class Kayttaja {

    private String tunnus;
    private String salasana;

    public Kayttaja(String tunnus, String salasana) {
        this.tunnus = tunnus;
        this.salasana = salasana;
    }
    
    @Override
    public String toString()
    {
        return this.tunnus+" "+this.salasana;
    }
}
