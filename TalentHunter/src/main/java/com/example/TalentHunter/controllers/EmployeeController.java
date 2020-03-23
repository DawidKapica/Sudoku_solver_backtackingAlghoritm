package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.services.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EMPLOYEE)
public class EmployeeController extends BaseRestController<EmployeeDto, EmployeeEntity, Long> {
    public EmployeeController(EmployeeService service) {
        super(service);
    }

}
