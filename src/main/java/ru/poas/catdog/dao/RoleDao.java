package ru.poas.catdog.dao;

import ru.poas.catdog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
