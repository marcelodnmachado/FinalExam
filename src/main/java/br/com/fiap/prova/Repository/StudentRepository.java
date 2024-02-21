package br.com.fiap.prova.Repository;

import br.com.fiap.prova.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcelo do Nascimento Machado
 */

public interface StudentRepository extends JpaRepository<Student, Long> {


}
