package CourseraTarefas.ImcCoursera.Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTest {

    @Test
    void diagnostico() {
        Paciente paciente1 = new Paciente(65, 1.70);

        assertEquals(18.50 - 24.99, paciente1.diagnostico());


    }
}