package br.com.dio.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Banco {

    private static final int CODIGO = 33;
    private static final String NOME = "Banco Santander (Brasil) S.A.";
    private static final String CNPJ = "90.400.888/0001-42";

    private int codigo;
    private String nome;
    private String cnpj;
    private List<Cliente> clientes = new ArrayList<>();

    public Banco() {
        this.codigo = CODIGO;
        this.nome = NOME;
        this.cnpj = CNPJ;
    }

    private void imprimirDadosBanco() {
        System.out.println("*** Detalhes do banco ***");
        System.out.println(String.format("Cédigo: 0%d", this.codigo));
        System.out.println(String.format("CNPJ: %s", this.cnpj));
        System.out.println(String.format("Nome: %s", this.nome));
    }

    public void imprimirClientes() {
        this.imprimirDadosBanco();
        System.out.println("*** Clientes do banco ***");
        for (Cliente cliente : this.clientes) {
            cliente.imprimirCliente();
        }
    }
}