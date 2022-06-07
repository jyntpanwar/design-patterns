package in.jayant.designpatterns.template;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("Added SATA hard disk for desktop");
    }

    @Override
    public void addRAM() {
        System.out.println("Added DDR4 Ram for desktop");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Added generic keyboard for desktop");
    }
}
