package br.com.tavaresdu.designPatterns.creational.abstractFactory;

public class FactoryY implements Factory {
    @Override
    public ProductA createProductA() {
        return new ProductAY();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBY();
    }
}
