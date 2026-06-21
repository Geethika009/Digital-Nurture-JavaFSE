import java.util.Scanner;

public class FinancialForecasting {

    // Recursive Method
    public static double predictFutureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double growthRate = sc.nextDouble() / 100;

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue = predictFutureValue(currentValue, growthRate, years);

        System.out.printf("\nPredicted Future Value after %d years = ₹%.2f", years, futureValue);

        sc.close();
    }
}