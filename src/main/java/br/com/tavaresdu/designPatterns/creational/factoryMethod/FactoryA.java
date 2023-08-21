package br.com.tavaresdu.designPatterns.creational.factoryMethod;

public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
