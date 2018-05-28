package ru.poas.catdog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.poas.catdog.model.ExhibitionOrg;

import java.util.List;

/**
 * Created by vlusslus on 28.05.2018.
 */
public interface ExhibitionOrgDao extends JpaRepository<ExhibitionOrg, Long>{

    @Override
    List<ExhibitionOrg> findAll();
}
