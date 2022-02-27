public class Eagle implements Flyable,Lively{
    @Override
    public void fly() {
        System.out.println("Flapping feather.....Flying");
    }

    @Override
    public String getName() {
        return "White eagle";
    }

    @Override
    public int getLivingYears() {
        return 45;
    }
}
