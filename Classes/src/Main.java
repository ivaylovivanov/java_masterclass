public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                        case 0 -> "Mary";
                        case 1 -> "John";
                        case 2 -> "Jane";
                        case 3 -> "Bob";
                        case 4 -> "Jack";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Tim", "05/1/1985", "java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}