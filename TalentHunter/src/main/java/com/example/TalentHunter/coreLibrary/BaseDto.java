package com.example.TalentHunter.coreLibrary;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonPropertyOrder({"id"})
public abstract class BaseDto <ID extends Serializable> implements Serializable{

    private ID id;

}
