package com.javainuse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import java.io.Serializable;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id", scope = Employee.class)
@Data
public class Employee implements Serializable {

	private String name;
	private String identity;

}
