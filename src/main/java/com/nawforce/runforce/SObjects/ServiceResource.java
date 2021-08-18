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
public class ServiceResource extends SObject {
	public static SObjectType$<ServiceResource> SObjectType;
	public static SObjectFields$<ServiceResource> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCapacityBased;
	public Boolean IsOptimizationCapable;
	public Decimal LastKnownLatitude;
	public Location LastKnownLocation;
	public Datetime LastKnownLocationDate;
	public Decimal LastKnownLongitude;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedRecordId;
	public User RelatedRecord;
	public String ResourceType;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceResourceFeed[] Feeds;
	public ServiceResourceHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ResourceAbsence[] ResourceAbsences;
	public ResourcePreference[] ResourcePreferences;
	public AssignedResource[] ServiceAppointments;
	public ServiceCrewMember[] ServiceCrewMembers;
	public ServiceResourceCapacity[] ServiceResourceCapacities;
	public ServiceResourceSkill[] ServiceResourceSkills;
	public ServiceTerritoryMember[] ServiceTerritories;
	public ServiceResourceShare[] Shares;
	public Shift[] ShiftServiceResources;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TimeSheet[] TimeSheets;
	public TopicAssignment[] TopicAssignments;

	public ServiceResource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
