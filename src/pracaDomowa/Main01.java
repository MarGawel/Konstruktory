package pracaDomowa;

public class Main01 {
    public static void main(String[] args) {
        BankAccount client = new BankAccount(123);
        client.printInfo();

        client.deposidCash(1000);
        System.out.println(client.printInfo());
        System.out.println("Odejmujemy 500");
        client.withdrawCash(500);
        System.out.println(client.printInfo());
        //client.withdrawCash(600);
        System.out.println("Po wypłacie 600 wypłaciło:");
        System.out.println(client.withdrawCash(600));
        System.out.println(client.printInfo());


    }
}
