public class HourlyEmployee extends Employee{
    private double hourlyPayrate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayrate) {
        super(name, birthDate, hireDate);
        this.hourlyPayrate = hourlyPayrate;
    }

    public void getDoublePay(){
        hourlyPayrate *= 2;
    }
}
