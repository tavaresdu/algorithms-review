package br.com.tavaresdu.designPatterns.creational.abstractFactory;

public class FactoryX implements Factory {
    @Override
    public ProductA createProductA() {
        return new ProductAX();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBX();
    }
}
