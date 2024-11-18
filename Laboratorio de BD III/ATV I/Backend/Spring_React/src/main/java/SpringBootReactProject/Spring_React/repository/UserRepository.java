package SpringBootReactProject.Spring_React.repository;

import SpringBootReactProject.Spring_React.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
