package br.com.aula.empresa.services;

import br.com.aula.empresa.classes.Cliente;
import br.com.aula.empresa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
    }

    public Cliente criarCliente(Cliente cliente) {
        if (clienteRepository.existsByCpf(cliente.getCpf())) {
            throw new RuntimeException("Cliente com este CPF já existe.");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        Cliente cliente = buscarClientePorId(id);
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setEndereco(clienteAtualizado.getEndereco());
        // Atualize outros campos conforme necessário
        return clienteRepository.save(cliente);
    }

    public void excluirCliente(Long id) {
        if (temFretesAssociados(id)) {
            throw new RuntimeException("Não é possível excluir o cliente com fretes associados.");
        }
        clienteRepository.deleteById(id);
    }

    private boolean temFretesAssociados(Long clienteId) {
        // Simulação de validação
        return false; // Substitua pela lógica real de verificação de fretes associados
    }
}
