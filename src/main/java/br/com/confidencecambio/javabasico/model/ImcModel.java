package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImcModel {
    private Double altura;
    private Double peso;
}
