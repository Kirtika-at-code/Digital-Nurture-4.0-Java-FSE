
public class FinancialForecast {
    
    public static double forecast(double presentValue, double rate, int years){
        if(years==0){
            return presentValue;
        }
        return forecast(presentValue,rate,years-1)*(1+rate);
    }
    public static void main(String[] args){
        double presentValue=100;
        double annualrate=0.03;
        int years=7;

        double futureValue=forecast(presentValue, annualrate, years);
        System.out.printf("Future Value after %d years: %.2f\n",years,futureValue);
    }
}
