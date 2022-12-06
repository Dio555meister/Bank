public class Bank {
    private int balanc = 190_000;

    public int getBalac() {
        return balanc;
    }

    public void setBalac(int balanc) {
        if (balanc < this.balanc)
            this.balanc = balanc;
    }


    public void getSum(int sum, Client client) {
        if(this.balanc >= sum) {
            client.setBalanc(client.getBalanc() + sum);
            this.balanc -= sum;
            cmcPush(client, sum);
        }else
            System.out.println(" Недостаточно средств в банке");


    }


    private void cmcPush(Client client, int sum) {
        if (client.getBalanc() >= 100) {
            System.out.println("было пополненно " + sum);
            client.setBalanc(client.getBalanc() - 100);
            System.out.println("-100р за смс уведомление");
        }else {
            System.out.println("Не хватает средств для СМС уведомлений");
        }
    }

    public void getBalanceBank(int sum, Client client) {
        if (client.getBalanc() >= sum) {
            this.balanc += sum;
            client.setBalanc(client.getBalanc() - sum);
            cmcPush(client,sum);
        }else {
            System.out.println(" Не хватает средств на балансе клиента");
        }


    }
}
