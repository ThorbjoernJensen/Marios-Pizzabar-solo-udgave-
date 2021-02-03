import java.util.Date;

public class OrderLine {

    private Pizza pizza;
    private int antal;
    private int linjeNummer;

    //    Todo generer en id der er unik for alle ordrelinier i ordreListen...
    private int orderLineId;

    //    ordrelinje-objektet skal have en reference til ordre-objektet for at
    private Order order;

    public OrderLine(Order order, Pizza pizza, int antal) {
        this.pizza = pizza;
        this.antal = antal;
        this.linjeNummer = generateOrderLineId(order);

    }

//    Den vil vel starte forfra, hver gang vi har en ny ordre
    private int generateOrderLineId(Order order) {
        return order.getOrderLines().size() + 1;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    //    todo lav en funktion der gemmer ordrelinjer i en fil som svarer til sql-øvelsesdatabase
    public void saveOrderlinesToFile() {


    }

    @Override
    public String toString() {
        return "linje " + linjeNummer + ": " + pizza.toString() + ", antal = " + antal + "\n";
    }
}
