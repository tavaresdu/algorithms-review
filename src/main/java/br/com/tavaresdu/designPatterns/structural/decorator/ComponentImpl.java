package br.com.tavaresdu.designPatterns.structural.decorator;

public class ComponentImpl implements Component {
    @Override
    public String execute() {
        return "Basic Execution";
    }
}
