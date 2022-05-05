package Banco;

public class Main {
    public static void main(String[] args) {

        Cliente Alexandre = new Cliente("Alexandre","5256416");
        BancoDigital contaC = new ContaCorrente(Alexandre);
        BancoDigital contaP = new ContaPoupança(Alexandre);

        contaC.dados();
        contaP.dados();

        contaC.depositar(1000);
        contaC.transferir(200,contaP);
        contaC.depositar(2000);
        contaC.depositar(350.50);

        contaC.imprimirExtrato(Alexandre);
        contaP.imprimirExtrato(Alexandre);


    }
}
