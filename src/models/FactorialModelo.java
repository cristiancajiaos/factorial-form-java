package models;

public class FactorialModelo {

    private int valor;
    private int resultado;

    public FactorialModelo() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int calcularFactorial(int numero) {
        int producto;
        producto = (numero > 1) ? numero * this.calcularFactorial(numero - 1) : 1;
        this.setResultado(producto);
        return producto;
    }

    public int iniciarFactorial() {
        return this.calcularFactorial(this.getValor());
    }

}
