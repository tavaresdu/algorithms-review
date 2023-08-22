package br.com.tavaresdu.designPatterns.structural.decorator;

public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public String execute() {
        return super.execute() + " + Type B Execution";
    }
}
