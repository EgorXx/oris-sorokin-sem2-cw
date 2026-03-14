package ru.kpfu.itis.sorokin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.sorokin.model.Role;
import ru.kpfu.itis.sorokin.model.User;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
