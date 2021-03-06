package com.github.chibyhq.store.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.chibyhq.playar.model.User;

public interface UserRepository extends CrudRepository<User, String> {

	User findOneByNickname(String nickname);
}
