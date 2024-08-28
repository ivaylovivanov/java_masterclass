public class Main{
    public static void main(String[] args) {

        Worker worker = new Worker("Ivo", "17/12/1984");
        System.out.println(worker.getAge());

        Employee ivo = new Employee("Ivo", "17/12/1984", "26/05/2024");
        System.out.println(ivo);
        System.out.println("Age: " + ivo.getAge());
        System.out.println("Pay: " + ivo.collectPay());

        Employee john = new Employee("John", "11/11/1986", "12/12/1912");
        System.out.println(john);

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension paycheck = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday paycheck = $" + mary.getDoublePay());

    }
}