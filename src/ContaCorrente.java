public class ContaCorrente extends Conta{

        public ContaCorrente(Agencia agencoa, Cliente cliente) {
            super(agencoa, cliente);
        }

    @Override
    public void setLimite(double limite) {
        super.setLimite(limite);
    }

    @Override
        public void imprimirExtrato() {
            System.out.println("=== Extrato Conta Corrente ===");
            super.imprimirInfosComuns();
        }

}
