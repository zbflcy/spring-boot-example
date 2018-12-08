package springboot.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.example.entity.User;

/**
 * Created by curry on 18-12-8.
 */
public interface UserRepository extends JpaRepository<User, Integer> {


}
