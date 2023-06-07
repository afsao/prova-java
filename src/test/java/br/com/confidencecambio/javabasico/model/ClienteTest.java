package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClienteTest {

    private Cliente clienteUnderTest;

    @BeforeEach
    void setUp() {
        clienteUnderTest = Cliente.builder().nome("João Soares Silva").build();
    }

    @Test
    void testGetNome() {
        // Setup
        // Run the test
        final String result = clienteUnderTest.getNome();

        // Verify the results
        assertThat(result).isEqualTo("João Soares Silva");
    }

    @Test
    void testGetPrimeiroNome() {
        // Setup
        // Run the test
        final String result = clienteUnderTest.getPrimeiroNome();

        // Verify the results
        assertThat(result).isEqualTo("João");
    }

    @Test
    void testGetUltimoNome() {
        // Setup
        // Run the test
        final String result = clienteUnderTest.getUltimoNome();

        // Verify the results
        assertThat(result).isEqualTo("Soares Silva");
    }

    @Test
    void testGetNomeAbreviado() {
        // Setup
        // Run the test
        final String result = clienteUnderTest.getNomeAbreviado();

        // Verify the results
        assertThat(result).isEqualTo("João S. Silva");
    }

    @Test
    void testGetNomeMaiusculo() {
        // Setup
        // Run the test
        final String result = clienteUnderTest.getNomeMaiusculo();

        // Verify the results
        assertThat(result).isEqualTo("JOÃO SOARES SILVA");
    }

    @Test
    void testCanEqual() {
        assertThat(clienteUnderTest.canEqual("other")).isFalse();
    }

}
