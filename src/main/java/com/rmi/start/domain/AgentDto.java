package com.rmi.start.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgentDto {

    private Long id;
    private String name;
    private String phoneNumber;
    private Integer age;

}
