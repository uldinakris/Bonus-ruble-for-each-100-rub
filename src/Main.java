public class Main {
    public static void main(String[] args) {
        int balance = 347;
        int refillBalance = 650;
        int bonusRate = 100;
        int bonus = 0;
        if (refillBalance > 1000) {
            bonus = refillBalance / bonusRate;
        }
        int totalBalance = balance + refillBalance + bonus;
        System.out.println(totalBalance);
    }
}
