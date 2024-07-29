public class JM58 {
    public static void main(String[] args) {
        char letter = 'M';
        switch (letter) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            default -> System.out.println(letter + " is not found");
        }
    }
}
