package alpha;

public class Geographical extends Checker{
    Geographical (int checker){

        this.checker=checker;
    }

    @Override
    protected void write(String pay) {
        System.out.println("unusual location");
    }
}
