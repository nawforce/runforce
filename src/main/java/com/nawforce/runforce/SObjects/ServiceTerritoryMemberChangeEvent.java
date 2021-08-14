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

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceTerritoryMemberChangeEvent extends SObject {
	public static SObjectType$<ServiceTerritoryMemberChangeEvent> SObjectType;
	public static SObjectFields$<ServiceTerritoryMemberChangeEvent> Fields;

	public Address Address;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public String GeocodeAccuracy;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String MemberNumber;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public String PostalCode;
	public String ReplayId;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String State;
	public String StateCode;
	public String Street;
	public String TerritoryType;

	public ServiceTerritoryMemberChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryMemberChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
