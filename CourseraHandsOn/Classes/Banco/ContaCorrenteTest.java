package CourseraHandsOn.Classes.Banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void sacar() {
        ContaCorrente cc = new ContaCorrente();
        assertEquals(0, cc.sacar(200));
        cc.depositar(250);
        assertEquals(50, cc.sacar(200));
    }

    @Test
    void depositar() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        assertEquals(200, cc.getSaldo());
    }
}