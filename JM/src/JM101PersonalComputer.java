public class JM101PersonalComputer extends JM101Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public JM101PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.presPowerButton();
        drawLogo();
    }
}
