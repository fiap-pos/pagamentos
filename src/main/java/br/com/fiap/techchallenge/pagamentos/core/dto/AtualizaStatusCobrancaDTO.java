package br.com.fiap.techchallenge.pagamentos.core.dto;

import br.com.fiap.techchallenge.pagamentos.core.domain.models.enums.StatusCobrancaEnum;

public record AtualizaStatusCobrancaDTO (StatusCobrancaEnum status) {

}