package br.com.diego.springsecurityoauth2.dao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.diego.springsecurityoauth2.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}