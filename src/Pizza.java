public class Pizza {
//    vi vil gerne opnå at pizzaer kun kan tilgås via menukort

    private int nr;
    private String navn;
    private String ingredienser;
    private int pris;

    public Pizza(int nr) {
        this.nr = nr;
    }

    public Pizza(int nr, String navn, String ingredienser, int pris) {
        this.nr = nr;
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(String ingredienser) {
        this.ingredienser = ingredienser;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "pizza " + "nr. " + nr + ": " + navn;
    }
}
