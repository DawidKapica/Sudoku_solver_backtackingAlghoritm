package com.example.TalentHunter.coreLibrary;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonPropertyOrder({"id"})
public class BaseDto <ID extends Serializable> implements Serializable{

    private ID id;

}
