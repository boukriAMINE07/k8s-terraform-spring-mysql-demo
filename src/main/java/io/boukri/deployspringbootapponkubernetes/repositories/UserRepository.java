package io.boukri.deployspringbootapponkubernetes.repositories;

import io.boukri.deployspringbootapponkubernetes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
