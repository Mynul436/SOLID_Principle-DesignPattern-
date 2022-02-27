public class Aeroplane implements Flyable,Sellable{
    @Override
    public void fly() {
        System.out.println("Running through runway...");
    }

    @Override
    public String getName() {
        return "passenger plane";
    }

    @Override
    public int getPrice() {
        return 25000000;
    }
}
