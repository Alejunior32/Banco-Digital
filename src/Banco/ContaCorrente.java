package Banco;

import java.lang.ref.Cleaner;

public class ContaCorrente extends BancoDigital{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(Cliente cliente) {
        System.out.println("Extrato CONTA CORRENTE:");
        System.out.println(cliente);
        for (int i=0;i<extrato.size();i++){
            System.out.println("R$ "+extrato.get(i));
            System.out.println();
        }
        System.out.println("R$"+saldo);
        System.out.println();

    }
}
