public class Main extends Object{
    public static void main(String[] args) {

        Worker worker = new Worker("Ivo", "17/12/1984");
        System.out.println(worker.getAge());

        Employee ivo = new Employee("Ivo", "17/12/1984", "26/05/2024");
        System.out.println(ivo);
        System.out.println("Age: " + ivo.getAge());
        System.out.println("Pay: " + ivo.collectPay());

        Employee john = new Employee("John", "11/11/1986", "12/12/1912");
        System.out.println(john);

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____________");
    }
}

class GradStudent{
    private String name;
    private int age;

    public GradStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends GradStudent{
    private String parentName;
    private int age;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}