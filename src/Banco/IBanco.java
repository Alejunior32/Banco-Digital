package Banco;

public interface IBanco {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor,BancoDigital contaDestino);
    public void imprimirExtrato(Cliente cliente);
}
