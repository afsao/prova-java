package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.dto.response.CalculaImcResponse;
import br.com.confidencecambio.javabasico.model.ImcModel;

public interface ImcService {
    CalculaImcResponse calculaIMC(ImcModel model);
}
