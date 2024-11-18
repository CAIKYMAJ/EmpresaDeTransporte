package br.com.aula.empresa.services;

import br.com.aula.empresa.classes.Cidade;
import br.com.aula.empresa.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade criarCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public void excluirCidade(Long id) {
        cidadeRepository.deleteById(id);
    }
}
