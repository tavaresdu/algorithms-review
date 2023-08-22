package br.com.tavaresdu.designPatterns.structural.decorator;

public class Decorator implements Component {

    private final Component wrapee;

    public Decorator(Component component) {
        this.wrapee = component;
    }
    @Override
    public String execute() {
        return wrapee.execute();
    }
}
