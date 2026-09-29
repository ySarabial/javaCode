import java.util.Scanner;

public class Week3Expenses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String week;
        char currency = '$';

        int workDays = 5;
        int coffeeCount;
        long accountNumber;
        double weeklyBudget;
        double groceries;
        double transportation;
        double dining;
        double entertainment;
        double coffeePrice;

        float savingsGoal;

        boolean stayedWithinBudget;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter the week: ");
        week = input.nextLine();

        System.out.print("Enter your weekly budget: $");
        weeklyBudget = input.nextDouble();

        System.out.print("Enter grocery expenses: $");
        groceries = input.nextDouble();

        System.out.print("Enter transportation expenses: $");
        transportation = input.nextDouble();

        System.out.print("Enter dining expenses: $");
        dining = input.nextDouble();

        System.out.print("Enter entertainment expenses: $");
        entertainment = input.nextDouble();

        System.out.print("How many coffees did you buy this week? ");
        coffeeCount = input.nextInt();

        System.out.print("Enter the price of one coffee: $");
        coffeePrice = input.nextDouble();

        System.out.print("Enter your weekly savings goal: $");
        savingsGoal = input.nextFloat();

        System.out.print("Enter your account number: ");
        accountNumber = input.nextLong();

        double coffeeTotal = coffeeCount * coffeePrice;

        double totalExpenses = groceries + transportation
                + dining + entertainment + coffeeTotal;

        double moneyRemaining = weeklyBudget - totalExpenses;

        double dailyAverage = totalExpenses / 7;

        double workDayAverage = totalExpenses / workDays;

        stayedWithinBudget = totalExpenses <= weeklyBudget;

        int wholeDollarExpenses = (int) totalExpenses;

        String expenseText = Double.toString(totalExpenses);

        System.out.println("\n==================================");
        System.out.println("\tWEEKLY EXPENSE REPORT");
        System.out.println("==================================");

        System.out.println("Name:\t\t" + name);
        System.out.println("Week:\t\t" + week);
        System.out.println("Account:\t" + accountNumber);

        System.out.println("\nEXPENSES");
        System.out.println("Groceries:\t" + currency + groceries);
        System.out.println("Transportation:\t" + currency + transportation);
        System.out.println("Dining:\t\t" + currency + dining);
        System.out.println("Entertainment:\t" + currency + entertainment);
        System.out.println("Coffee:\t\t" + currency + coffeeTotal);

        System.out.println("\nSUMMARY");
        System.out.println("Weekly Budget:\t" + currency + weeklyBudget);
        System.out.println("Total Expenses:\t" + currency + totalExpenses);
        System.out.println("Money Remaining:" + "\t" + currency + moneyRemaining);
        System.out.println("Daily Average:\t" + currency + dailyAverage);
        System.out.println("Workday Average:" + "\t" + currency + workDayAverage);
        System.out.println("Savings Goal:\t" + currency + savingsGoal);
        System.out.println("Within Budget:\t" + stayedWithinBudget);

        System.out.println("\nDATA CONVERSION");
        System.out.println("Expenses as whole dollars:\t" + wholeDollarExpenses);
        System.out.println("Expenses converted to String:\t" + expenseText);

        System.out.println("\n" + name + ", you spent " + currency
                + totalExpenses + " during " + week + ".");

        input.close();
    }
}