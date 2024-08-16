package com.example.securitysession8.payload;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CustomerRequest {
    private String email;
    private String pwd;
    private String role;

}
