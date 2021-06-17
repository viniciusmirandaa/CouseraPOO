package CourseraHandsOn.Classes.Carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroTest {

    @Test
    void testAcelerar() {
        Carro c = new Carro(10, 150, "Gol");
        assertEquals(80, c.getVelocidade());
    }
}