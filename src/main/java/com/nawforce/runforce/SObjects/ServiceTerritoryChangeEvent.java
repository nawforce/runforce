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
public class ServiceTerritoryChangeEvent extends SObject {
	public static SObjectType$<ServiceTerritoryChangeEvent> SObjectType;
	public static SObjectFields$<ServiceTerritoryChangeEvent> Fields;

	public Address Address;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public Id ParentTerritoryId;
	public ServiceTerritory ParentTerritory;
	public String PostalCode;
	public String ReplayId;
	public Id SchedulingConstraintId;
	public SchedulingConstraint SchedulingConstraint;
	public String State;
	public String StateCode;
	public String Street;
	public Id TopLevelTerritoryId;
	public ServiceTerritory TopLevelTerritory;
	public Decimal TypicalInTerritoryTravelTime;

	public ServiceTerritoryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceTerritoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
