package br.com.tavaresdu.designPatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    void testBasicExecution() {
        Component component = new ComponentImpl();
        String execution = component.execute();
        assertEquals("Basic Execution", execution);
    }

    @Test
    void testTypeAExecution() {
        Component component = new ComponentImpl();
        component = new DecoratorA(component);
        String execution = component.execute();
        assertEquals("Basic Execution + Type A Execution", execution);
    }

    @Test
    void testTypeBExecution() {
        Component component = new ComponentImpl();
        component = new DecoratorB(component);
        String execution = component.execute();
        assertEquals("Basic Execution + Type B Execution", execution);
    }

    @Test
    void testTypeAAndBExecution() {
        Component component = new ComponentImpl();
        component = new DecoratorA(component);
        component = new DecoratorB(component);
        String execution = component.execute();
        assertEquals("Basic Execution + Type A Execution + Type B Execution", execution);
    }

    @Test
    void testTypeBAndAExecution() {
        Component component = new ComponentImpl();
        component = new DecoratorB(component);
        component = new DecoratorA(component);
        String execution = component.execute();
        assertEquals("Basic Execution + Type B Execution + Type A Execution", execution);
    }
}
