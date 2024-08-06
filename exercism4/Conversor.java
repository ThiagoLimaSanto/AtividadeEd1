package exercism4;

public class Conversor  {

    private int numeroDecimal;

    public Conversor(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public String converterDecimalParaBinario() {
        return converterDecimalParaBinario(numeroDecimal);
    }

    public String converterDecimalParaBinario(int decimal) {
        if (decimal == 0) {
            return "0"; 
        } else if (decimal == 1) {
            return "1"; 
        } else {
            return converterDecimalParaBinario(decimal / 2) + (decimal % 2);
        }
    }
    public int getnumeroDecimal() {
        return numeroDecimal;
    }

    public void setnumeroDecimal(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }
}
