package ru.rookonroad.service.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ru.rookonroad.service.model.Link;

@Repository
public interface LinkRepo extends ReactiveMongoRepository<Link, String> {

    Mono<Link> findByCode(String code);
}
