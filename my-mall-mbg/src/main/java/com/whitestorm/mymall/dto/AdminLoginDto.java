package com.whitestorm.mymall.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminLoginDto {
    private String username;
    private String password;
}
