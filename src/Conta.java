public abstract class Conta implements IConta {

    private Agencia agencia;

    private static int SEQUENCIAL = 1;
    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public Conta(Agencia agencia, Cliente cliente) {
        this.agencia = agencia;
        this.saldo = 0;
        this.cliente = cliente;
        this.numeroConta = SEQUENCIAL++;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }


    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }


    @Override
    public void sacar(double valorDeSaque) {
        double limiteSaque = saldo + limite;

        if (valorDeSaque < limiteSaque) {
            saldo -= valorDeSaque;
            System.out.println("Operação realizada com sucesso.\n" +
                    "Realizado saque no valor de: " + valorDeSaque +
                    "\nSaldo remanecente de :" + saldo);
        } else {
            System.out.println("Operação não realizada, valor de saque superior ao disponível em conta");
        }

    }

    @Override
    public void depositar(double valorDeDeposito) {
        if (valorDeDeposito > 0) {
            saldo += valorDeDeposito;
            System.out.println("Operação realizada com sucesso.\n" +
                    "Realizado deposito no valor de: " + valorDeDeposito +
                    "\nSaldo atualizado de :" + saldo);
        } else {
            System.out.println("Operação não realizada, valor de deposito precisar ser positivo.");
        }
    }

    @Override
    public void transferir(double valorDeTransferencia, IConta contaDestino) {
        this.sacar(valorDeTransferencia);
        contaDestino.depositar(valorDeTransferencia);
        System.out.println();

    }

    @Override
    public void imprimirSaldo() {
        System.out.println("SALDO ATUAL: " + this.getSaldo());

    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %S", this.agencia));
        System.out.println(String.format("Numero: %S", this.getNumeroConta()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public abstract void imprimirExtrato();
}