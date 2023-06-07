package br.com.confidencecambio.javabasico.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculaImcRequest {
    private Double altura;
    private Double peso;
}
