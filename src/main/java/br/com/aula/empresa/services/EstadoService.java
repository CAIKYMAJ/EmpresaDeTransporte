package br.com.aula.empresa.services;

import br.com.aula.empresa.classes.Estado;
import br.com.aula.empresa.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado criarEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    public List<Estado> getAllEstados() {
        return estadoRepository.findAll();
    }

    public Estado getEstadoById(Long id) {
        return estadoRepository.findById(id).orElse(null);
    }

    public Estado atualizarEstado(Long id, Estado estadoAtualizado) {
        Estado estado = estadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estado não encontrado."));
        estado.setNome(estadoAtualizado.getNome());
        estado.setIcmsLocal(estadoAtualizado.getIcmsLocal());
        estado.setIcmsOutroUf(estadoAtualizado.getIcmsOutroUf());
        return estadoRepository.save(estado);
    }

    public void deleteEstado(Long id) {
        estadoRepository.deleteById(id);
    }
}
