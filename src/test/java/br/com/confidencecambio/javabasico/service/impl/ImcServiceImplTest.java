package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.dto.response.CalculaImcResponse;
import br.com.confidencecambio.javabasico.model.ImcModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImcServiceImplTest {

    private ImcServiceImpl imcServiceImplUnderTest;

    @BeforeEach
    void setUp() {
        imcServiceImplUnderTest = new ImcServiceImpl();
    }

    @Test
    void testCalculaIMC() {
        // Setup
        final ImcModel model = ImcModel.builder()
                .altura(2.0)
                .peso(100.0)
                .build();

        final CalculaImcResponse expected = CalculaImcResponse.builder()
                .altura(2.0)
                .peso(100.0)
                .imc(25.0)
                .build();

        // Run the test
        final var result = imcServiceImplUnderTest.calculaIMC(model);

        // Verify the results
        assertThat(result).isEqualTo(expected);
    }
}
