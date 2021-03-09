package ru.rookonroad.service.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ru.rookonroad.service.model.Link;

import java.util.UUID;

@Repository
public interface LinkRepo extends ReactiveMongoRepository<Link, UUID> {

    Mono<Link> findByUrl(String url);
    Mono<Link> findByCode(String code);
}
