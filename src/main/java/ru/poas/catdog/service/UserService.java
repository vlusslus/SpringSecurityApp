package ru.poas.catdog.service;

import ru.poas.catdog.model.ExhibitionOrg;
import ru.poas.catdog.model.User;

import java.util.List;

/**
 * Service class for {@link User}
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);

    List<ExhibitionOrg> getAll();
}
