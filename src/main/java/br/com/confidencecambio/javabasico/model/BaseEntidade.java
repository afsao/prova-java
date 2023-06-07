package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BaseEntidade {
    @NotNull
    @NotBlank
    private String nome;

    public String getNome() {
        return this.nome.trim();
    }

    public String getPrimeiroNome() {
        var nomes = this.nome.split(" ");
        if (nomes.length > 0) {
            return nomes[0];
        } else {
            return "";
        }
    }

    public String getUltimoNome() {
        var nomes = this.nome.split(" ");

        if (nomes.length > 0) {
            return nome.substring(nomes[0].length() + 1);
        } else {
            return "";
        }
    }

    public String getNomeAbreviado() {

        var nomes = this.nome.split(" ");
        StringBuilder nomeAbreviado = new StringBuilder(nomes[0]);

        if (nomes.length > 2) {
            for (int i = 1; i < (nomes.length - 1); i++) {
                nomeAbreviado.append(" ").append(nomes[i].toCharArray()[0]).append(".");
            }
        }

        nomeAbreviado.append(" ").append(nomes[nomes.length - 1]);

        return nomeAbreviado.toString();
    }

    public String getNomeMaiusculo() {
        return this.nome.toUpperCase();
    }
}
