package br.com.aula.empresa.repository;

import br.com.aula.empresa.classes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Irá verificar se já tem o CPF
    boolean existsByCpf(String cpf);
}
