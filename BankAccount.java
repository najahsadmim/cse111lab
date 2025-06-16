
public class BankAccount {

    public int accno = 0;
    public String acctype = "Not Set";

    public String printDetails() {
        return "Account No: " + accno + "\nType: " + acctype;
    }

    public void setInfo(int accno, String acctype) {
        this.accno = accno;
        this.acctype = acctype;
        System.out.println("Account information updated!");
    }
}
