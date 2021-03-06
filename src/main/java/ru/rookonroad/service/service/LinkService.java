package ru.rookonroad.service.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.rookonroad.service.model.Link;
import ru.rookonroad.service.repository.LinkRepo;

import java.util.UUID;

@Service
public class LinkService {

    private final LinkRepo linkRepo;

    public LinkService(LinkRepo linkRepo) {
        this.linkRepo = linkRepo;
    }

    public Mono<String> addUrl(String url) {
        String code = DigestUtils.md5Hex(url);
        return linkRepo.findById(url).switchIfEmpty(
            linkRepo.save(new Link( url, code))
        ).map(Link::getCode);
    }

    public Mono<String> getUrl(String code) {
        return linkRepo.findByCode(code).map(Link::getUrl);
    }
}
