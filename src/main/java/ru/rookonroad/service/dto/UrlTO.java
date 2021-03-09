package ru.rookonroad.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class UrlTO implements Serializable {

    private static final long serialVersionUID = -1416585140043420058L;

    @Getter
    @Setter
    private String url;
}
