package ru.maxima.firstspringbootapp.repo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ru.maxima.firstspringbootapp.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findUserByEmail(String email);
}
