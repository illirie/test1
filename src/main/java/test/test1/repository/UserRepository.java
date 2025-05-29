package test.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.test1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
