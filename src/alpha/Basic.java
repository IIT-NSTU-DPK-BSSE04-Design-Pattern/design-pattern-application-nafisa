package alpha;

public class Basic extends Checker{
    Basic (int checker){

      this.checker=checker;
    }

    @Override
    protected void write(String pay) {
        System.out.println("suspicious account behaviour");
    }
}
