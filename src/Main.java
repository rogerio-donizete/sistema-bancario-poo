// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new ClientePessoaFisica("joao", 123456789);
        Cliente cliente2 = new ClientePessoaJuridica("Empresa Ltsa", 011166620001);

        Agencia agenciaTest = new Agencia(0001);

        Conta contaCorrente = new ContaCorrente(agenciaTest, cliente2);
        Conta poupanca = new ContaPoupanca(agenciaTest, cliente1);

        contaCorrente.setLimite(1000);
        contaCorrente.depositar(2500);
        contaCorrente.sacar(4000);
        contaCorrente.sacar(1500);
        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(100, poupanca);

        poupanca.imprimirSaldo();
        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
