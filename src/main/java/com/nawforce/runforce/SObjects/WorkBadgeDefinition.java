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
public class WorkBadgeDefinition extends SObject {
	public static SObjectType$<WorkBadgeDefinition> SObjectType;
	public static SObjectFields$<WorkBadgeDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer GivenBadgeCount;
	public Id Id;
	public String ImageUrl;
	public Boolean IsActive;
	public Boolean IsCompanyWide;
	public Boolean IsDeleted;
	public Boolean IsLimitPerUser;
	public Boolean IsRewardBadge;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LimitNumber;
	public Date LimitStartDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RewardFundId;
	public WorkRewardFund RewardFund;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public WorkBadge[] Badges;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkBadgeDefinitionFeed[] Feeds;
	public WorkBadgeDefinitionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkBadgeDefinitionShare[] Shares;
	public WorkAccess[] WorkAccesses;

	public WorkBadgeDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
