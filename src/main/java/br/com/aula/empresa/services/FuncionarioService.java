package br.com.aula.empresa.services;

import br.com.aula.empresa.classes.Funcionario;
import br.com.aula.empresa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario criarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
