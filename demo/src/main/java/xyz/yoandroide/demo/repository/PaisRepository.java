package xyz.yoandroide.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoandroide.demo.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    
}
