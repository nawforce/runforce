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
public class WarrantyTerm extends SObject {
	public static SObjectType$<WarrantyTerm> SObjectType;
	public static SObjectFields$<WarrantyTerm> Fields;

	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String EffectiveStartDate;
	public String ExchangeType;
	public String Exclusions;
	public Decimal ExpensesCovered;
	public Integer ExpensesCoveredDuration;
	public String ExpensesCoveredUnitOfTime;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsTransferable;
	public Decimal LaborCovered;
	public Integer LaborCoveredDuration;
	public String LaborCoveredUnitOfTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Decimal PartsCovered;
	public Integer PartsCoveredDuration;
	public String PartsCoveredUnitOfTime;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Datetime SystemModstamp;
	public Integer WarrantyDuration;
	public String WarrantyTermName;
	public String WarrantyType;
	public String WarrantyUnitOfTime;

	public ActivityHistory[] ActivityHistories;
	public AssetWarranty[] AssetWarrantyTerms;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WarrantyTermFeed[] Feeds;
	public WarrantyTermHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductWarrantyTerm[] ProductWarrantyTerms;
	public WarrantyTermShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public WarrantyTerm clone$() {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
