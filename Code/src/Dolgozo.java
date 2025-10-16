public class Dolgozo
{
    public static final int MIN_MUNKAIDO = 0;

    private String azonosito;
    private String nev;
    private String beosztas;
    private int munkaido;
    private int berezes;
    private int tuloraPotlek;

    public Dolgozo(String azonosito, String nev, String beosztas, int munkaido,int berezes, int tuloraPotlek)
    {
        setAzonosito(azonosito);
        setNev(nev);
        setBeosztas(beosztas);
        setMunkaido(munkaido);
        setBerezes(berezes);
        setTuloraPotlek(tuloraPotlek);
        //setLedolgozottEloirt(ledolgozottEloirt);
        //setNemledolgozottEloir(nemledolgozottEloir);
        //setLedolgozottTulora(ledolgozottTulora);
    }

    String getAzonosito() { return azonosito; }
    void setAzonosito(String azonosito) { this.azonosito = azonosito; }

    String getNev() { return nev; }
    void setNev(String nev) { this.nev = nev; }

    String getBeosztas() { return beosztas; }
    void setBeosztas(String beosztas) { this.beosztas = beosztas; }

    int getMunkaido() { return munkaido; }
    void setMunkaido(int munkaido)
    {
        if(munkaido < MIN_MUNKAIDO)
        {
            throw new IllegalArgumentException("A munkaidő nem lehet negatív");
        }
        this.munkaido = munkaido;
    }

    int getBerezes() { return berezes; }
    void setBerezes(int berezes) { this.berezes = berezes; }

    int getTuloraPotlek() { return tuloraPotlek; }
    void setTuloraPotlek(int tuloraPotlek) { this.tuloraPotlek = tuloraPotlek; }
    /*
    int getLedolgozottEloirt() { return ledolgozottEloirt; }
    void setLedolgozottEloirt(int ledolgozottEloirt) { this.ledolgozottEloirt = ledolgozottEloirt; }

    int getNemledolgozottEloir() { return nemledolgozottEloir; }
    void setNemledolgozottEloir(int nemledolgozottEloir) { this.nemledolgozottEloir = nemledolgozottEloir; }

    int getLedolgozottTulora() { return ledolgozottTulora; }
    void setLedolgozottTulora(int ledolgozottTulora) { this.ledolgozottTulora = ledolgozottTulora; }
    */
    @Override
    public String toString()
    {
        return String.format("%s\t%s\t%s\t%d\t%d\t%d",azonosito,nev,beosztas,munkaido,berezes,tuloraPotlek);
    }
}
