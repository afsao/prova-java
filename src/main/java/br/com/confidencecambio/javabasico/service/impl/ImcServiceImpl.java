package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.dto.response.CalculaImcResponse;
import br.com.confidencecambio.javabasico.model.ImcModel;
import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class ImcServiceImpl implements ImcService {

    @Override
    public CalculaImcResponse calculaIMC(final ImcModel model) {

        return CalculaImcResponse.builder()
                .peso(model.getPeso())
                .altura(model.getAltura())
                .imc(calculaImc(model))
                .build();
    }

    private Double calculaImc(ImcModel model) {
        return BigDecimal.valueOf(model.getPeso() / Math.pow(model.getAltura(), 2.0))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
