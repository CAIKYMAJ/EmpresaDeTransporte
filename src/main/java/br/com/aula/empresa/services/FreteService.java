package br.com.aula.empresa.services;

import br.com.aula.empresa.classes.Frete;
import br.com.aula.empresa.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {

    @Autowired
    private FreteRepository freteRepository;

    public List<Frete> listarFretes() {
        return freteRepository.findAll();
    }

    public Frete criarFrete(Frete frete) {
        return freteRepository.save(frete);
    }

    public Frete buscarFretePorId(Long id) {
        return freteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Frete não encontrado."));
    }

    public Frete atualizarFrete(Long id, Frete freteAtualizado) {
        Frete frete = buscarFretePorId(id);
        frete.setValor(freteAtualizado.getValor());
        // Atualize outros campos conforme necessário
        return freteRepository.save(frete);
    }

    public void excluirFrete(Long id) {
        freteRepository.deleteById(id);
    }
}
