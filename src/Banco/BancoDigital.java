package Banco;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public abstract class BancoDigital implements IBanco {

    private static double SALDO_INICIAL= 0.0;
    private static int SEQUENCIAL = 1;
    private static final String AGENCIA_PADRAO = "0201" ;

    protected String agencia;
    protected int numeroConta;
    protected double saldo;
    private Cliente cliente;

    List<Double> extrato = new ArrayList<Double>();

    public BancoDigital(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = SALDO_INICIAL;
        extrato.add(saldo);
        this.cliente=cliente;

    }

    public void dados (){
        JOptionPane.showMessageDialog(null, "Agencia: "+agencia+
                "\nConta: "+String.format("%08d", numeroConta)+
                "\nSaldo:R$ "+saldo
        );
    }
    @Override
    public void sacar(double valor) {
        extrato.add(saldo);
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        extrato.add(saldo);
        saldo += valor;

    }

    @Override
    public void transferir(double valor, BancoDigital contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        JOptionPane.showMessageDialog(null, "A transferencia foi um sucesso!\n " +
                "\nConta: "+contaDestino+
                "\nValor Transferido:R$ "+valor+
                "\nSaldo atual:R$ " +saldo
        );
    }
    

}
