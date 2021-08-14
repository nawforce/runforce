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
public class CredentialStuffingEventStore extends SObject {
	public static SObjectType$<CredentialStuffingEventStore> SObjectType;
	public static SObjectFields$<CredentialStuffingEventStore> Fields;

	public String AcceptLanguage;
	public Datetime CreatedDate;
	public String CredentialStuffingEventNumber;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginKey;
	public String LoginType;
	public String LoginUrl;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Decimal Score;
	public String SessionKey;
	public String SourceIp;
	public String Summary;
	public Datetime SystemModstamp;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public CredentialStuffingEventStoreFeed[] Feeds;

	public CredentialStuffingEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public CredentialStuffingEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CredentialStuffingEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CredentialStuffingEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CredentialStuffingEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
