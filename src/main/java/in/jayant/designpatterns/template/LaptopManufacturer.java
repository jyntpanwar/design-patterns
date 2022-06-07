package in.jayant.designpatterns.template;

public class LaptopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("Added SSD for Laptop");
    }

    @Override
    public void addRAM() {
        System.out.println("Added DDR4 RAM for Laptop");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Added laptop Keyboard");
    }
}
