public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Student s = new Student("S92300" + i,
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

    }
}