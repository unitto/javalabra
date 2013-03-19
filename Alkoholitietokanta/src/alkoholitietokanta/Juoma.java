package alkoholitietokanta;


public class Juoma {

    private String juomanNimi;
    private String juomanKuvaus;
    private double juomanAlkoholiprosentti;

    public Juoma(String juomanNimi, String juomanKuvaus, double juomanAlkoholiProsentti ) {
        this.juomanNimi = juomanNimi;
        this.juomanKuvaus = juomanKuvaus;
        this.juomanAlkoholiprosentti = juomanAlkoholiProsentti;
    }

    public String getNimi() {
        return this.juomanNimi;
    }

    public String getJuomanKuvaus() {
        return this.juomanKuvaus;
    }
    
    public double getJuomanProsentit(){
        return this.juomanAlkoholiprosentti;
    }
    
    @Override
    public String toString(){
     return this.juomanNimi+": "+this.juomanKuvaus;
    }
}
