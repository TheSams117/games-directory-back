package com.games.directory.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateGameBodyDto extends CreateGameBodyDto {
    private long id;
    public UpdateGameBodyDto(String name, String console, String genre, String img) {
        super(name,console,genre,img);
        this.id = id;
    }

}
