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
public class PromptAction extends SObject {
	public static SObjectType$<PromptAction> SObjectType;
	public static SObjectFields$<PromptAction> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastDisplayDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastResult;
	public Datetime LastResultDate;
	public String Name;
	public Id OwnerId;
	public SObject Owner;
	public Id PromptVersionId;
	public PromptVersion PromptVersion;
	public Datetime SnoozeUntil;
	public Integer StepCount;
	public Integer StepNumber;
	public Datetime SystemModstamp;
	public Integer TimesActionTaken;
	public Integer TimesDismissed;
	public Integer TimesDisplayed;
	public Integer TimesSnoozed;
	public Id UserId;
	public User User;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromptActionShare[] Shares;

	public PromptAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
