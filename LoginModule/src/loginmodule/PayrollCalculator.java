package loginmodule;

public class PayrollCalculator {
    private double regularPay, overtimePay;
    
    public double getTotalSalary(double hourlyRate, double hours, double overtime) {
        double netSalary = 0.0;
        regularPay = hours * hourlyRate; //compute regular work pay
        overtimePay = (hourlyRate * 1.5) * overtime; //compute overtime pay
        netSalary = overtimePay + regularPay; ////compute total pay
        return netSalary;
    }
    
    public double getRegularPay(){
        return this.regularPay;
    }
    
    public double getOverTimePay(){
        return this.overtimePay;
    }
    
      public double calculateGrossPay(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public double calculateNetPay(double grossPay, double taxRate) {
        return grossPay - (grossPay * taxRate);
    }
}
