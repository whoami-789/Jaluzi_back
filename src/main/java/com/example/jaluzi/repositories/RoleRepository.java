package com.example.jaluzi.repositories;

import com.example.jaluzi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Ваши собственные методы
}
