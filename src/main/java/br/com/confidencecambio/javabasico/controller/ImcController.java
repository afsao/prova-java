package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.dto.CalculaImcRequest;
import br.com.confidencecambio.javabasico.dto.response.CalculaImcResponse;
import br.com.confidencecambio.javabasico.service.ImcService;
import br.com.confidencecambio.javabasico.service.converter.ImcConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.DecimalMin;

import static org.springframework.http.HttpStatus.OK;

@Validated
@RequiredArgsConstructor
@RestController
public class ImcController {

    private final ImcService service;

    private final ImcConverter converter;

    @GetMapping("/imc")
    public ResponseEntity<CalculaImcResponse> calculaIMC(
            @RequestParam(value = "altura", required = true) @DecimalMin(value = "0.01") Double altura
            , @RequestParam("peso") @DecimalMin(value = "0.01")  Double peso) {

        var imcRequest = CalculaImcRequest.builder()
                .peso(peso)
                .altura(altura)
                .build();

        return new ResponseEntity<>(service.calculaIMC(converter.toModel(imcRequest)), OK);
    }
}
