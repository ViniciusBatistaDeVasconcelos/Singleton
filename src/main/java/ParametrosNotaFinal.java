public class ParametrosNotaFinal {
    private static ParametrosNotaFinal instance = new ParametrosNotaFinal();

    public static ParametrosNotaFinal getInstance() {
        return instance;
    }

    private double notaMinima;
    private double notaMinimaExameFinal;
    private double notaMinimaAprovacao;
    private double notaMaxima;
    private double frequenciaMinimaAprovacaoPercentual;

    public double getNotaMinima() {
        return notaMinima;
    }

    public double getFrequenciaMinimaAprovacaoPercentual() {
        return frequenciaMinimaAprovacaoPercentual;
    }

    public void setFrequenciaMinimaAprovacaoPercentual(double frequenciaMinimaAprovacaoPercentual) {
        this.frequenciaMinimaAprovacaoPercentual = frequenciaMinimaAprovacaoPercentual;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }

    public double getNotaMinimaExameFinal() {
        return notaMinimaExameFinal;
    }

    public void setNotaMinimaExameFinal(double notaMinimaExameFinal) {
        this.notaMinimaExameFinal = notaMinimaExameFinal;
    }

    public double getNotaMinimaAprovacao() {
        return notaMinimaAprovacao;
    }

    public void setNotaMinimaAprovacao(double notaMinimaAprovacao) {
        this.notaMinimaAprovacao = notaMinimaAprovacao;
    }

    public double getNotaMaxima() {
        return notaMaxima;
    }

    public void setNotaMaxima(double notaMaxima) {
        this.notaMaxima = notaMaxima;
    }
}
