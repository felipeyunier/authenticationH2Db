package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class JwtResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jwttoken;
	
}
