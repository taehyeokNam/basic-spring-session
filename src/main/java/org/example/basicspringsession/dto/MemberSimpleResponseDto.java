package org.example.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponseDto {
    private String name;

    public MemberSimpleResponseDto(String name) { this.name = name;}
}
