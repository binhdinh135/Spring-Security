package com.example.springsecuritysession4.payload;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CustomerRequest {
    private String email;
    private String pwd;
    private String role;

}
