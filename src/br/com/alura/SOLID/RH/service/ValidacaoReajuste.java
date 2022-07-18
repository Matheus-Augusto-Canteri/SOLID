package SOLID.src.br.com.alura.SOLID.RH.service;

import java.math.BigDecimal;

import SOLID.src.br.com.alura.SOLID.RH.model.Funcionario;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
