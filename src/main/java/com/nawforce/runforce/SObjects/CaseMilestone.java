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
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CaseMilestone extends SObject {
	public static SObjectType$<CaseMilestone> SObjectType;
	public static SObjectFields$<CaseMilestone> Fields;

	public Decimal ActualElapsedTimeInDays;
	public Decimal ActualElapsedTimeInHrs;
	public Integer ActualElapsedTimeInMins;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Id CaseId;
	public Case Case;
	public Datetime CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHrs;
	public Integer ElapsedTimeInMins;
	public Id Id;
	public Boolean IsCompleted;
	public Boolean IsDeleted;
	public Boolean IsViolated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MilestoneTypeId;
	public MilestoneType MilestoneType;
	public Datetime StartDate;
	public Decimal StoppedTimeInDays;
	public Decimal StoppedTimeInHrs;
	public Integer StoppedTimeInMins;
	public Datetime SystemModstamp;
	public Datetime TargetDate;
	public Decimal TargetResponseInDays;
	public Decimal TargetResponseInHrs;
	public Integer TargetResponseInMins;
	public Decimal TimeRemainingInDays;
	public String TimeRemainingInHrs;
	public String TimeRemainingInMins;
	public Decimal TimeSinceTargetInDays;
	public String TimeSinceTargetInHrs;
	public String TimeSinceTargetInMins;

	public CaseMilestone clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
