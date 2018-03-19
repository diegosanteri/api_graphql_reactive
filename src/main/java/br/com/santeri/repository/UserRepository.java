package br.com.santeri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.santeri.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.List;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    List<User> findAllById(List<String> iterable);
}
