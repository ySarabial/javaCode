import java.util.Scanner;

public class MonthlyExpense {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        char currency = '$';

        double rent;
        double groceries;
        double savings;
        double entertainment;
        double schoolExpenses;
        double internet;
        double vacationFund;
        double transportation;
        double dining;

        double monthlyIncome;
        double moneySaved;

        boolean moneySavedReached;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your Monthly Income: ");
        monthlyIncome = input.nextDouble();

        System.out.print("Enter your rent expenses: $");
        rent = input.nextDouble();

        System.out.print("Enter your groceries expenses: $");
        groceries = input.nextDouble();

        System.out.print("Enter entertainment expenses: $");
        entertainment = input.nextDouble();

        System.out.print("Enter savings expenses: $");
        savings = input.nextDouble();

        System.out.print("Enter school expenses: $");
        schoolExpenses = input.nextDouble();

        System.out.print("Enter internet expenses: $");
        internet = input.nextDouble();

        System.out.print("Enter vacation Fund: $");
        vacationFund = input.nextDouble();

        System.out.print("Enter transportation expenses: $");
        transportation = input.nextDouble();

        System.out.print("Enter dining expenses: $");
        dining = input.nextDouble();

        System.out.print("How much money do you want to save for you: $");
        moneySaved = input.nextDouble();

        double totalExpenses = rent + groceries + entertainment + savings + schoolExpenses + vacationFund + transportation + dining;
        double remainingMoney = monthlyIncome - totalExpenses;
        double weeklyExpenses = totalExpenses / 4.0;

        moneySavedReached = remainingMoney >= moneySaved;

        int weeklyEstimate = (int) weeklyExpenses;

        String expenseText = Double.toString(totalExpenses);

        System.out.println("\n==================================");
        System.out.println("\tMONTHLY EXPENSE REPORT");
        System.out.println("==================================");

        System.out.println("Name:\t\t" + name);
        System.out.println("Income:\t\t" + monthlyIncome);

        System.out.println("\nEXPENSES");
        System.out.println("Groceries:\t" + currency + groceries);
        System.out.println("Transportation:\t" + currency + transportation);
        System.out.println("Dining:\t\t" + currency + dining);
        System.out.println("Entertainment:\t" + currency + entertainment);
        System.out.println("Rent:\t" + currency + rent);
        System.out.println("School Expenses:\t" + currency + schoolExpenses);
        System.out.println("Savings:\t" + currency + savings);
        System.out.println("Internet:\t" + currency + internet);
        System.out.println("Vacation Fund:\t" + currency + vacationFund);

        System.out.println("-----------------------");
        System.out.println("Total Expenses:\t" + currency + totalExpenses);
        System.out.println("Money Remaining:\t" + currency + remainingMoney);
        System.out.println("Weekly Expense Estimate:\t" + currency + weeklyEstimate);
        System.out.println("Money saved goal reached:\t" + moneySavedReached);


        input.close();




    }


}
