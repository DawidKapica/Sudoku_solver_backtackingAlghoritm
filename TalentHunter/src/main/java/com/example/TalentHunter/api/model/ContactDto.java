package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto extends BaseDto<Long> {

    @Size(min = 1, max = 255)
    private String email;

    @Size(min = 1, max = 255)
    private String phoneNumber;
}
