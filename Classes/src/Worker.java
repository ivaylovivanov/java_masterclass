public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.split("/")[2]);
        return (currentYear - birthYear);
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public double collectPay(){
        System.out.println("Collected the Pay");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
