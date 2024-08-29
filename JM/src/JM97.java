public class JM97 {
    public static void main(String[] args) {
        printInformation("Mama");
        printInformation("");
        printInformation("\t     \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("First index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("Second index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l'));

        String helloWorldLower = "Hello World".toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring cases");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }

    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length of string: %d %n", length);

        if (string.isEmpty()){
            System.out.println("Empty string");
        } else if (string.isBlank()) {
            System.out.println("Blank string");
        } else {
            System.out.printf("First character = %c %n", string.charAt(0));

            System.out.printf("Last char = %c %n", string.charAt(length - 1));
        }
    }
}
