package persistence.database.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.database.postgres.model.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {
}
