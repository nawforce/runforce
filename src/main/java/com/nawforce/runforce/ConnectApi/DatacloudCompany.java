/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DatacloudCompany {
	public Integer activeContacts;
	public Address address;
	public Double annualRevenue;
	public String companyId;
	public String description;
	public String dunsNumber;
	public String industry;
	public Boolean isInactive;
	public Boolean isOwned;
	public String naicsCode;
	public String naicsDescription;
	public String name;
	public Integer numberOfEmployees;
	public String ownership;
	public PhoneNumber phoneNumbers;
	public String sic;
	public String sicDescription;
	public String site;
	public String tickerSymbol;
	public String tradeStyle;
	public Datetime updatedDate;
	public String website;
	public String yearStarted;

	public DatacloudCompany() {throw new java.lang.UnsupportedOperationException();}

	public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
	public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
	public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
	public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
