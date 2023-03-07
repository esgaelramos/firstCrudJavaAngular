package xyz.yoandroide.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoandroide.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
