package in.jayant.designpatterns.template;

public abstract class ComputerManufacturer {
    public void buildComputer() {
        addHardDisk();
        addRAM();
        addKeyBoard();
        System.out.println("Computer built Successfully !");
    }

    protected abstract void addHardDisk();

    protected abstract void addRAM();

    protected abstract void addKeyBoard();

}
