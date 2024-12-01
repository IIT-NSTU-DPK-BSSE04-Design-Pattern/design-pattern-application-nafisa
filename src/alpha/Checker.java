package alpha;

public abstract class Checker {
    public static int Basic = 1;
    public static int Geographical =2;
    public static int Blacklist = 3;
    public static int HighRisk = 4;
    protected  int checker;
      protected Checker nextChecker;
   public void setNextChecker(Checker nextChecker){
       this.nextChecker=nextChecker;
   }
   public  void checkPay(int checker,String pay){
       if(this.checker <=checker){
           write(pay);
       }
       if(nextChecker!=null){
           nextChecker.checkPay(checker,pay);
       }

   }
   protected  abstract  void write(String pay);

}
