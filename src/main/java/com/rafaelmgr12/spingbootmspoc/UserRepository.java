package com.rafaelmgr12.spingbootmspoc;

import reactor.core.publisher.Mono;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    Mono<User> findByName(String name);
}