

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Parte1Test {

    @Test
    public void testForNumerosEstandar() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.forValue(1), "El método debe devolver el número utilizado como argumento, pero como String");
        assertEquals("4", fizzBuzz.forValue(4), "El método debe devolver el número utilizado como argumento, pero como String");
        assertEquals("7", fizzBuzz.forValue(7), "El método debe devolver el número utilizado como argumento, pero como String");
    }
}