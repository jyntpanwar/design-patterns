package in.jayant.designpatterns.template;

public class TemplatePatternTest {
    public static void main(String[] args) {
        ComputerManufacturer desktopManufacturer = new DesktopManufacturer();
        desktopManufacturer.buildComputer();
        ComputerManufacturer laptopManufacturer = new LaptopManufacturer();
        laptopManufacturer.buildComputer();
    }
}
