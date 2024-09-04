public class Main {
    public static void main(String[] args) {

        JM106Printer printer = new JM106Printer(50, true);
        System.out.println("initial page count " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPagers(5);
        System.out.printf("Current job Pages %d, Printer total %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPagers(5);
        System.out.printf("Current job Pages %d, Printer total %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPagers(1);
        System.out.printf("Current job Pages %d, Printer total %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}