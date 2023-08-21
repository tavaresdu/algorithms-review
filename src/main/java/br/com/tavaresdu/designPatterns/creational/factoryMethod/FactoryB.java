package br.com.tavaresdu.designPatterns.creational.factoryMethod;

public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
