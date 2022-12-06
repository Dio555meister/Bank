import java.util.Scanner;

public class Terminal {
    private Client client = new Client();
    private Bank bank = new Bank();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("1 получить сумму с банка");
        System.out.println("2 пополнить сумму в банке");
        System.out.println("3 проверить свой баланс");
        System.out.println("4 проверить  баланс банка");

        String answer = scanner.nextLine();

        switch (answer) {
            case "1" -> {
                getSum();
                start();

            }
            case "2" -> {
                putSum();
                start();
            }
            case "3" -> {
                System.out.println(" Ваш баланс равен: " + client.getBalanc());
                start();
            }
            case "4" -> {
                System.out.println(" Баланс банка: " + bank.getBalac());
                start();
            }
            default -> {
                System.out.println("Нет такого пункта.");
                start();
            }

        }
    }
    private void getSum(){
        System.out.println("Какую сумму Вы хотите получить?");
        int sum = scanner.nextInt();
        scanner.nextLine();
        bank.getSum(sum, client);

    }


    private void putSum(){
        System.out.println("Какую сумму Вы хотите отправить?");
        int sum = scanner.nextInt();
        scanner.nextLine();
        bank.getBalanceBank(sum, client);

    }

}
