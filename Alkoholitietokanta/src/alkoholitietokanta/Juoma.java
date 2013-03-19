package alkoholitietokanta;


public class Juoma {

    private String juomanNimi;
    private String juomanKuvaus;
    private int juomanAlkoholiprosentti;

    public Juoma(String juomanNimi, String juomanKuvaus) {
        this.juomanNimi = juomanNimi;
        this.juomanKuvaus = juomanKuvaus;
    }

    public String getNimi() {
        return this.juomanNimi;
    }

    public String getJuomanKuvaus() {
        return this.juomanKuvaus;
    }
    
    @Override
    public String toString(){
     return this.juomanNimi+": "+this.juomanKuvaus;
    }
}
