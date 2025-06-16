
public class SignatureCard extends CreditCard {

    public int companion;
    public int points;

    public SignatureCard(String cardHolder, String accountNo) {
        super(cardHolder, accountNo, 200);
        this.companion = 5;
    }

    public void spendCash(int cash) {
        System.out.println("Previous Reward Points: " + super.rewardPoints);
        points = (cash / 100) * 4;
        super.rewardPoints += points;
        System.out.println("Reward points after spending " + cash + " taka: " + super.rewardPoints);
    }

    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: " + companion);
    }
}
