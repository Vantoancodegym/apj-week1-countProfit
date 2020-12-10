import java.util.Scanner;

public class CountProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amout of money: ");
        int amount = scanner.nextInt();
        System.out.println("enter how many months you want");
        int mounth = scanner.nextInt();
        System.out.println("enter interset rate per month");
        double interset_rate = scanner.nextDouble();
        double profit = 0.0;
        for (int i = 1; i <= mounth; i++) {
            profit += (amount+profit)*interset_rate;
        }
        System.out.println("Profit is: "+profit);
    }
}
