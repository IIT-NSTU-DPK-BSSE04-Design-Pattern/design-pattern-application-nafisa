package alpha;

public class HighRisk extends Checker{
    HighRisk (int checker){

        this.checker=checker;
    }

    @Override
    protected void write(String pay) {
        System.out.println("sophiscticated ");
    }
}
