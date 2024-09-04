public class JM106Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public JM106Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempTonerLevel = tonerLevel + tonerAmount;
        if (tempTonerLevel > 100 || tempTonerLevel < 0) {
            return -1;
        }

        return this.tonerLevel += tonerAmount;
    }

    public int printPagers(int numPagesToPrint){
        int sheetsPrinted;
        if (duplex){
            System.out.println("This is a duplex printer");
            sheetsPrinted = (numPagesToPrint / 2) + (numPagesToPrint % 2);
        } else {
            System.out.println("This is NOT a duplex printer");
            sheetsPrinted = numPagesToPrint;
        }

        pagesPrinted += sheetsPrinted;
        return sheetsPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
