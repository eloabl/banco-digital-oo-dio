package br.com.dio.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ContaPoupanca extends Conta {

    private static final String CABECALHO_EXTRATO = "*** Extrato Conta Poupança ***";

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        super.montaExtrato(CABECALHO_EXTRATO);
    }

}