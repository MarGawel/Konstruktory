package pracaDomowa;

public class BankAccount {
    private int number;
    private double cash;

    public BankAccount(int number) {
        this.number = number;
        this.cash = 0;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void deposidCash(double amount){
        if (amount >=0) {
            this.cash += amount;
        } else {
            System.out.println("NIe można dodać kwoty mniejszej bądź równej 0!");
        }
    }

    public double withdrawCash(double amount){
        if (amount > 0) {
            if (this.cash >= amount) {
                this.cash -= amount;
                return amount;
            } else if (this.cash < amount) {
                amount = this.cash;
                this.cash = 0;
                return amount;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public String printInfo (){
         return "Nr konta: " + this.number + ", stan konta: " + this.cash;

    }

}
