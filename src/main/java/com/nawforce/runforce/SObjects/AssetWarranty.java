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
public class AssetWarranty extends SObject {
	public static SObjectType$<AssetWarranty> SObjectType;
	public static SObjectFields$<AssetWarranty> Fields;

	public Id AssetId;
	public Asset Asset;
	public String AssetWarrantyNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public String ExchangeType;
	public String Exclusions;
	public Decimal ExpensesCovered;
	public Date ExpensesCoveredEndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsTransferable;
	public Decimal LaborCovered;
	public Date LaborCoveredEndDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal PartsCovered;
	public Date PartsCoveredEndDate;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Date StartDate;
	public Datetime SystemModstamp;
	public Id WarrantyTermId;
	public WarrantyTerm WarrantyTerm;
	public String WarrantyType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssetWarrantyFeed[] Feeds;
	public AssetWarrantyHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public AssetWarranty clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetWarranty clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarranty clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarranty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarranty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
