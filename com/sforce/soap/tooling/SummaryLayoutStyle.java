package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum SummaryLayoutStyle {


  
	/**
	 * Enumeration  : Default
	 */
	Default("Default"),

  
	/**
	 * Enumeration  : QuoteTemplate
	 */
	QuoteTemplate("QuoteTemplate"),

  
	/**
	 * Enumeration  : DefaultQuoteTemplate
	 */
	DefaultQuoteTemplate("DefaultQuoteTemplate"),

  
	/**
	 * Enumeration  : ServiceReportTemplate
	 */
	ServiceReportTemplate("ServiceReportTemplate"),

  
	/**
	 * Enumeration  : ChildServiceReportTemplateStyle
	 */
	ChildServiceReportTemplateStyle("ChildServiceReportTemplateStyle"),

  
	/**
	 * Enumeration  : DefaultServiceReportTemplate
	 */
	DefaultServiceReportTemplate("DefaultServiceReportTemplate"),

  
	/**
	 * Enumeration  : CaseInteraction
	 */
	CaseInteraction("CaseInteraction"),

  
	/**
	 * Enumeration  : QuickActionLayoutLeftRight
	 */
	QuickActionLayoutLeftRight("QuickActionLayoutLeftRight"),

  
	/**
	 * Enumeration  : QuickActionLayoutTopDown
	 */
	QuickActionLayoutTopDown("QuickActionLayoutTopDown"),

  
	/**
	 * Enumeration  : PathAssistant
	 */
	PathAssistant("PathAssistant"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SummaryLayoutStyle e : EnumSet.allOf(SummaryLayoutStyle.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SummaryLayoutStyle(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}