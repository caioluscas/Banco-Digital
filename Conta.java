public abstract class Conta{
    //classe abstrata garante q ninguem vai dar um new ao nao ser os filhos
    private static final int AGENCIA_PADRAO = 0001;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public void sacar(double valor){

    }
    void depositar(double valor){

    }
    void transferir(double valor, Conta contaDestino){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }







}
