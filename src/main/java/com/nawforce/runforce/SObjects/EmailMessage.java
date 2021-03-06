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
public class EmailMessage extends SObject {
	public static SObjectType$<EmailMessage> SObjectType;
	public static SObjectFields$<EmailMessage> Fields;

	public Id ActivityId;
	public Task Activity;
	public String BccAddress;
	public String CcAddress;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public Datetime FirstOpenedDate;
	public String FromAddress;
	public String FromName;
	public Boolean HasAttachment;
	public String Headers;
	public String HtmlBody;
	public Id Id;
	public Boolean Incoming;
	public Boolean IsBounced;
	public Boolean IsClientManaged;
	public Boolean IsDeleted;
	public Boolean IsExternallyVisible;
	public Boolean IsOpened;
	public Boolean IsTracked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOpenedDate;
	public Datetime MessageDate;
	public String MessageIdentifier;
	public Id ParentId;
	public Case Parent;
	public Id RelatedToId;
	public Name RelatedTo;
	public Id ReplyToEmailMessageId;
	public EmailMessage ReplyToEmailMessage;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;
	public String TextBody;
	public String ThreadIdentifier;
	public String ToAddress;
	public String ValidatedFromAddress;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessageRelation[] EmailMessageRelations;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public EmailMessage clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailMessage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
