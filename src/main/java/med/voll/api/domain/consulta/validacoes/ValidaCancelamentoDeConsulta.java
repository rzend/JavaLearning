package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidaCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
