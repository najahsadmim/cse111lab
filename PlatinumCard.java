
public class PlatinumCard extends CreditCard {

    public int points;

    public PlatinumCard(String cardHolder, String accountNo) {
        super(cardHolder, accountNo, 100);
    }

    public void spendCash(int cash) {
        System.out.println("Previous Reward Points: " + super.rewardPoints);
        points = (cash / 100) * 2;
        super.rewardPoints += points;
        System.out.println("Reward points after spending " + cash + " taka: " + super.rewardPoints);
    }
}
