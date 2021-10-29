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
public class LocationGroupAssignment extends SObject {
	public static SObjectType$<LocationGroupAssignment> SObjectType;
	public static SObjectFields$<LocationGroupAssignment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LocationExternalReference;
	public String LocationGroupAssignment;
	public String LocationGroupExternalReference;
	public Id LocationGroupId;
	public LocationGroup LocationGroup;
	public String LocationGroupName;
	public Id LocationId;
	public Location Location;
	public String LocationName;
	public Datetime SystemModstamp;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LocationGroupAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroupAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
