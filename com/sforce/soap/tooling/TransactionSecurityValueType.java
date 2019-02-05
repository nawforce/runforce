package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum TransactionSecurityValueType {


  
	/**
	 * Enumeration  : String
	 */
	String("String"),

  
	/**
	 * Enumeration  : Integer
	 */
	Integer("Integer"),

  
	/**
	 * Enumeration  : DateTime
	 */
	DateTime("DateTime"),

  
	/**
	 * Enumeration  : Boolean
	 */
	Boolean("Boolean"),

  
	/**
	 * Enumeration  : Double
	 */
	Double("Double"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (TransactionSecurityValueType e : EnumSet.allOf(TransactionSecurityValueType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private TransactionSecurityValueType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}