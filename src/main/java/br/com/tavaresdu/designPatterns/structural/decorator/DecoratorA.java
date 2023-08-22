package br.com.tavaresdu.designPatterns.structural.decorator;

public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public String execute() {
        return super.execute() + " + Type A Execution";
    }
}
