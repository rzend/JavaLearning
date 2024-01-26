package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidaCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
