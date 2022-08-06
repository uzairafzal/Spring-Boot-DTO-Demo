package net.javaDto.springdto.dto;

import lombok.*;

@Data
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
