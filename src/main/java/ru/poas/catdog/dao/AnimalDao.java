package ru.poas.catdog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.poas.catdog.model.Animal;

/**
 * Created by vlusslus on 26.05.2018.
 */
public interface AnimalDao extends JpaRepository<Animal,Long> {
}
