package Banco;

public class ContaPoupança extends BancoDigital{


    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(Cliente cliente) {
        System.out.println("Extrato CONTA POUPANÇA:");
        System.out.println(cliente);
        for (int i=0;i<extrato.size();i++){
            System.out.println("R$ "+extrato.get(i));
            System.out.println();
        }
        System.out.println("R$ "+saldo);
    }
}
