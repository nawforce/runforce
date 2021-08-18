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
public class Shift extends SObject {
	public static SObjectType$<Shift> SObjectType;
	public static SObjectFields$<Shift> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id JobProfileId;
	public JobProfile JobProfile;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String ShiftNumber;
	public Datetime StartTime;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;
	public String TimeSlotType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ShiftFeed[] Feeds;
	public ShiftHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ShiftShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Shift clone$() {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
