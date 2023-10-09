package com.poly.springboot.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String avatar;

    private String numberPhone;

    private String email;

    private Boolean gender;

    private Date birthOfDay;

    private String password;

}
