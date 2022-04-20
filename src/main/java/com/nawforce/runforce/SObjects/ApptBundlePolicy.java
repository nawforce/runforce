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
public class ApptBundlePolicy extends SObject {
	public static SObjectType$<ApptBundlePolicy> SObjectType;
	public static SObjectFields$<ApptBundlePolicy> Fields;

	public String BundleEndTimeFieldName;
	public String BundleStartTimeFieldName;
	public Boolean CanAllowSchleDepndInBundle;
	public Integer ConstantTimeValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FilterCriteriaId;
	public RecordsetFilterCriteria FilterCriteria;
	public Id Id;
	public Boolean IsAutomaticBundling;
	public Boolean IsDeleted;
	public Boolean IsManualBundling;
	public Boolean IsTimeCalcByBundleDurationFld;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LimitAmountOfBundleMembers;
	public Integer LimitDurationOfBundle;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer Priority;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApptBundleAggrPolicy[] ApptBundleAggrPolicies;
	public ApptBundlePolicySvcTerr[] ApptBundlePolicySvcTerrs;
	public ApptBundlePropagatePolicy[] ApptBundlePropagatePolicies;
	public ApptBundleRestrictPolicy[] ApptBundleRestrictPolicies;
	public ApptBundleSortPolicy[] ApptBundleSortPolicies;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApptBundlePolicyFeed[] Feeds;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ApptBundlePolicyShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ApptBundlePolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
