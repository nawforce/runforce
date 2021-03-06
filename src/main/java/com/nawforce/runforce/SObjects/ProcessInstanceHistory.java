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
public class ProcessInstanceHistory extends SObject {
	public static SObjectType$<ProcessInstanceHistory> SObjectType;
	public static SObjectFields$<ProcessInstanceHistory> Fields;

	public Id ActorId;
	public Name Actor;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHours;
	public Decimal ElapsedTimeInMinutes;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPending;
	public Id OriginalActorId;
	public Name OriginalActor;
	public Id ProcessInstanceId;
	public ProcessInstance ProcessInstance;
	public Id ProcessNodeId;
	public ProcessNode ProcessNode;
	public Integer RemindersSent;
	public String StepStatus;
	public Datetime SystemModstamp;
	public Id TargetObjectId;
	public Name TargetObject;

	public ProcessInstanceHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
