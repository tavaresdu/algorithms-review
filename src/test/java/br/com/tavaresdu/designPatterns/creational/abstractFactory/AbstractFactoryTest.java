package br.com.tavaresdu.designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AbstractFactoryTest {

    @Test
    void testFactoryX() {
        Factory factory = new FactoryX();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        assertInstanceOf(ProductAX.class, productA);
        assertInstanceOf(ProductBX.class, productB);
    }

    @Test
    void testFactoryY() {
        Factory factory = new FactoryY();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        assertInstanceOf(ProductAY.class, productA);
        assertInstanceOf(ProductBY.class, productB);
    }
}
