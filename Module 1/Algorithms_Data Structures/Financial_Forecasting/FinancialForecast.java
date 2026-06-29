// FinancialForecast.java
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double initialValue, double growthRate, int years) {
        // Base case: year 0
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: calculate for previous year, then apply growth
        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000;   // starting amount
        double growthRate = 0.10;     // 10% growth per year
        int years = 5;                // forecast for 5 years

        double futureValue = forecast(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
