package alpha;

public class Blacklist extends Checker{
    Blacklist (int checker){

        this.checker=checker;
    }

    @Override
    protected void write(String pay) {
        System.out.println("merchant or service providers ");
    }
}
