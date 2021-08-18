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
public class ProcessException extends SObject {
	public static SObjectType$<ProcessException> SObjectType;
	public static SObjectFields$<ProcessException> Fields;

	public Id AttachedToId;
	public Name AttachedTo;
	public Id CaseId;
	public Case Case;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Message;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public String ProcessExceptionNumber;
	public String Severity;
	public String SeverityCategory;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public EmailMessage[] Emails;
	public Event[] Events;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProcessExceptionShare[] Shares;
	public Task[] Tasks;

	public ProcessException clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessException clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessException clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessException clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessException clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
