package in.jayant.designpatterns.command;

/**
 * The Receiver
 */
public class Television {

    public void on() {
        System.out.println("Television switched on !");
    }

    public void off() {
        System.out.println("Television switched off !");
    }
}
