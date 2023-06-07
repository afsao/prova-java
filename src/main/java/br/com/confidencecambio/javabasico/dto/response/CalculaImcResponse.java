package br.com.confidencecambio.javabasico.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculaImcResponse {
    private Double altura;
    private Double peso;
    private Double imc;
}
