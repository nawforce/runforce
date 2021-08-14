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
public class ServiceAppointmentChangeEvent extends SObject {
	public static SObjectType$<ServiceAppointmentChangeEvent> SObjectType;
	public static SObjectFields$<ServiceAppointmentChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualDuration;
	public Datetime ActualEndTime;
	public Datetime ActualStartTime;
	public Address Address;
	public String AppointmentNumber;
	public String ApptBookingInfoUrl;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public Object ChangeEventHeader;
	public String City;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DueDate;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EarliestStartTime;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsOffsiteAppointment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String PostalCode;
	public String ReplayId;
	public Datetime SchedEndTime;
	public Datetime SchedStartTime;
	public String ServiceNote;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ServiceAppointmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
