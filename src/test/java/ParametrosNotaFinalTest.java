import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosNotaFinalTest {

    @BeforeEach
    public void beforeEach() {
        ParametrosNotaFinal.getInstance().setNotaMinima(0.0);
        ParametrosNotaFinal.getInstance().setNotaMinimaExameFinal(4.0);
        ParametrosNotaFinal.getInstance().setNotaMinimaAprovacao(6.0);
        ParametrosNotaFinal.getInstance().setNotaMaxima(10.0);
        ParametrosNotaFinal.getInstance().setFrequenciaMinimaAprovacaoPercentual(75.0);
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNotaMinima() {
        assertEquals(0.0, ParametrosNotaFinal.getInstance().getNotaMinima());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNotaMinimaExameFinal() {
        assertEquals(4.0, ParametrosNotaFinal.getInstance().getNotaMinimaExameFinal());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNotaMinimaAprovacao() {
        assertEquals(6.0, ParametrosNotaFinal.getInstance().getNotaMinimaAprovacao());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNotaMaxima() {
        assertEquals(10.0, ParametrosNotaFinal.getInstance().getNotaMaxima());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarFrequenciaMinimaAprovacaoPercentual() {
        assertEquals(75.0, ParametrosNotaFinal.getInstance().getFrequenciaMinimaAprovacaoPercentual());
    }
}