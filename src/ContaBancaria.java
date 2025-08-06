public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;


    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void depositar(Double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Deposito de R$ "+ valor + " Realizado com sucesso.");
        }else {
            System.out.println("Valor inválido para deposito.");
        }
    }

    public void sacar(Double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque De "+valor + " Realizado Com Sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Dados Da Conta");
        System.out.println("Nome Titular: "+this.titular);
        System.out.println("Numero Da Conta: " + this.numeroConta);
        System.out.println("Saldo: "+ this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }
}
