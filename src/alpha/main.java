package alpha;

public class main {
    public static void main(String[] args) {

        Checker basic = new Basic(Checker.Basic);
        Checker geographical = new Geographical(Checker.Geographical);
        Checker blacklist = new Blacklist(Checker.Blacklist);
        Checker highRisk = new HighRisk(Checker.HighRisk);


        basic.setNextChecker(geographical);
        geographical.setNextChecker(blacklist);
        blacklist.setNextChecker(highRisk);


        basic.checkPay(Checker.Basic, "suspicious account");
        basic.checkPay(Checker.Geographical, "unusual location ");
        basic.checkPay(Checker.Blacklist, " fraudulent activity");
        basic.checkPay(Checker.HighRisk, "account marked as high-risk");
    }
}
