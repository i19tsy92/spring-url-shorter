package ru.rookonroad.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("link")
@NoArgsConstructor
@AllArgsConstructor
public class Link {

    @Id
    private String url;

    private String code;
}
