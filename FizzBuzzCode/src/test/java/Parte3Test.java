

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Parte3Test {

    @Test
    public void testNumerosEstandar() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.forValue(1), "El método debe devolver el número utilizado como argumento, pero como String");
        assertEquals("4", fizzBuzz.forValue(4), "El método debe devolver el número utilizado como argumento, pero como String");
        assertEquals("7", fizzBuzz.forValue(7), "El método debe devolver el número utilizado como argumento, pero como String");
    }

    @Test
    public void testMultiplosDe3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.forValue(3), "El método debe devolver Fizz si el argumento es múltiplo de 3");
        assertEquals("Fizz", fizzBuzz.forValue(6), "El método debe devolver Fizz si el argumento es múltiplo de 3");
        assertEquals("Fizz", fizzBuzz.forValue(9), "El método debe devolver Fizz si el argumento es múltiplo de 3");
    }

    @Test
    public void testMultiplosDe5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.forValue(5), "El método debe devolver Buzz si el argumento es múltiplo de 5");
        assertEquals("Buzz", fizzBuzz.forValue(10), "El método debe devolver Buzz si el argumento es múltiplo de 5");
        assertEquals("Buzz", fizzBuzz.forValue(20), "El método debe devolver Buzz si el argumento es múltiplo de 5");
    }
}