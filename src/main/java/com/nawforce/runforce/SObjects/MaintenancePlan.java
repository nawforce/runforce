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
public class MaintenancePlan extends SObject {
	public static SObjectType$<MaintenancePlan> SObjectType;
	public static SObjectFields$<MaintenancePlan> Fields;

	public Id AccountId;
	public Account Account;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Boolean DoesAutoGenerateWorkOrders;
	public Boolean DoesGenerateUponCompletion;
	public Date EndDate;
	public Integer Frequency;
	public String FrequencyType;
	public Integer GenerationHorizon;
	public Integer GenerationTimeframe;
	public String GenerationTimeframeType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Location Location;
	public String MaintenancePlanNumber;
	public String MaintenancePlanTitle;
	public Integer MaintenanceWindowEndDays;
	public Integer MaintenanceWindowStartDays;
	public Date NextSuggestedMaintenanceDate;
	public Id OwnerId;
	public SObject Owner;
	public Date StartDate;
	public String SvcApptGenerationMethod;
	public Datetime SystemModstamp;
	public String WorkOrderGenerationMethod;
	public String WorkOrderGenerationStatus;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MaintenancePlanFeed[] Feeds;
	public MaintenancePlanHistory[] Histories;
	public MaintenanceAsset[] MaintenanceAssets;
	public MaintenanceWorkRule[] MaintenanceWorkRules;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public MaintenancePlanShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public MaintenancePlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
