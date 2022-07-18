package SOLID.src.br.com.alura.SOLID.RH.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import SOLID.src.br.com.alura.SOLID.RH.ValidacaoException;
import SOLID.src.br.com.alura.SOLID.RH.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
    
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajute = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajute < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser no mínimo entre 6 meses");
		}
    }

}
