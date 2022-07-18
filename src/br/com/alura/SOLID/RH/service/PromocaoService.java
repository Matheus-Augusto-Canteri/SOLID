package SOLID.src.br.com.alura.SOLID.RH.service;

import SOLID.src.br.com.alura.SOLID.RH.model.Funcionario;
import SOLID.src.br.com.alura.SOLID.RH.ValidacaoException;
import SOLID.src.br.com.alura.SOLID.RH.model.Cargo;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == funcionario.getCargo()){
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo); 
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta");
        }
    }
    
}
