package br.com.dio.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ContaCorrente extends Conta {

    private static final String CABECALHO_EXTRATO = "*** Extrato Conta Corrente ***";

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.montaExtrato(CABECALHO_EXTRATO);
    }
}