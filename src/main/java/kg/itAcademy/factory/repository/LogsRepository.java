package kg.itAcademy.factory.repository;

import kg.itAcademy.factory.dto.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Long> {
}
