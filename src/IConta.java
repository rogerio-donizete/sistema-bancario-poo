public interface IConta {

    void sacar(double valorDeSaque);
    void depositar(double valorDeDeposito);
    void transferir(double valorDeTransferencia, IConta contaDestino);
    void imprimirSaldo();

}
