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
public class FlowInterview extends SObject {
	public static SObjectType$<FlowInterview> SObjectType;
	public static SObjectFields$<FlowInterview> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrentElement;
	public String FlowVersionViewId;
	public String Guid;
	public Id Id;
	public String InterviewLabel;
	public String InterviewStatus;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public SObject Owner;
	public String PauseLabel;
	public Datetime SystemModstamp;
	public Boolean WasPausedFromScreen;

	public RecordAction[] RecordActions;
	public FlowRecordRelation[] RecordRelations;
	public FlowInterviewShare[] Shares;
	public FlowStageRelation[] StageRelations;
	public WorkStep[] WorkSteps;

	public FlowInterview clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
