package com.ch.anyway.domain.member.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
