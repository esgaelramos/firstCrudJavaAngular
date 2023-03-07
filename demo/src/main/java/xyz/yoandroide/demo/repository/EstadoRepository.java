package xyz.yoandroide.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoandroide.demo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}
