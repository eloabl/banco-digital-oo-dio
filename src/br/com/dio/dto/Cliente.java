package br.com.dio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String nome;
    private String cpf;

    public void imprimirCliente() {
        System.out.println(cpf + " - " + nome);
    }

}