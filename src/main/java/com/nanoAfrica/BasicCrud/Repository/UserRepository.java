package com.nanoAfrica.BasicCrud.Repository;


import com.nanoAfrica.BasicCrud.Model.Users;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface UserRepository extends CrudRepository<Users, Integer> {

  boolean existsByUsername(String username);

  Users findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
