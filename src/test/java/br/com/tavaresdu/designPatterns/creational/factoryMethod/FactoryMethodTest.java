package br.com.tavaresdu.designPatterns.creational.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

    @Test
    void testFactoryMethodA() {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        String action = factory.action();
        assertInstanceOf(ProductA.class, product);
        assertEquals("Product A Action", action);
    }

    @Test
    void testFactoryMethodB() {
        Factory factory = new FactoryB();
        Product product = factory.createProduct();
        String action = factory.action();
        assertInstanceOf(ProductB.class, product);
        assertEquals("Product B Action", action);
    }
}
