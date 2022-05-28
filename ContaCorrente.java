public class ContaCorrente extends Conta {
    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

}
