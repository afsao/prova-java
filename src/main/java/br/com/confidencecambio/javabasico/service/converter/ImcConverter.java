package br.com.confidencecambio.javabasico.service.converter;

import br.com.confidencecambio.javabasico.dto.CalculaImcRequest;
import br.com.confidencecambio.javabasico.model.ImcModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImcConverter {
    ImcModel toModel(CalculaImcRequest dto);
    CalculaImcRequest fromModel(ImcModel model);
}
