package br.com.dio;

import br.com.dio.dto.*;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente fulano = new Cliente("Fulano Santos Pereira", "123.45.789-01");
        Conta cc = new ContaCorrente(fulano);
        banco.getClientes().add(fulano);
        cc.depositar(500);
        cc.imprimirExtrato();
        Cliente ciclano = new Cliente("Ciclano Santos Pereira", "987.654.321-09");
        Conta cp = new ContaPoupanca(ciclano);
        banco.getClientes().add(ciclano);
        cp.imprimirExtrato();
        cc.transferir(150, cp);
        cc.imprimirExtrato();
        cp.sacar(100);
        cp.imprimirExtrato();
        banco.imprimirClientes();
    }

}