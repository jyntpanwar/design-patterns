package in.jayant.designpatterns.command;

/**
 * The Concrete implementation of command
 */
public class OnCommand implements Command {

    private Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
