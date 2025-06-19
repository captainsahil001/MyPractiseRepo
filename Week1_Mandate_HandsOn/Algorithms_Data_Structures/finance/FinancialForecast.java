package finance;

public class FinancialForecast {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized using iteration (optional)
    public static double predictFutureValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.08; // 8% annual growth
        int years = 5;

        System.out.println("Recursive Future Value: " +
            predictFutureValue(currentValue, growthRate, years));

        System.out.println("Iterative Future Value: " +
            predictFutureValueIterative(currentValue, growthRate, years));
    }
}
