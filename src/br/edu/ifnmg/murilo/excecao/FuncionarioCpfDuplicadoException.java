/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.murilo.excecao;

/**
 *
 * @author murilo
 */
public class FuncionarioCpfDuplicadoException extends SistemaControleProducaoException{

    public FuncionarioCpfDuplicadoException(String cpf) {
        super("Já existe um funcionário cadastrado com o cpf: "+cpf);
    }
    
}
