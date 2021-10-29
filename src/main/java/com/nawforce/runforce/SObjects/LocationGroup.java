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
public class LocationGroup extends SObject {
	public static SObjectType$<LocationGroup> SObjectType;
	public static SObjectFields$<LocationGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LocationGroupName;
	public Id OwnerId;
	public Name Owner;
	public Boolean ShouldSyncWithOci;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LocationGroupFeed[] Feeds;
	public LocationGroupHistory[] Histories;
	public LocationGroupAssignment[] LocationGroups;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LocationGroupShare[] Shares;

	public LocationGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
