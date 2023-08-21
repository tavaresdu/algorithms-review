package br.com.tavaresdu.designPatterns.creational.factoryMethod;

public abstract class Factory {
    public abstract Product createProduct();

    public String action() {
        Product p = this.createProduct();
        return p.action();
    }
}
