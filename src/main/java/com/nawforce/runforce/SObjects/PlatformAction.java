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
public class PlatformAction extends SObject {
	public static SObjectType$<PlatformAction> SObjectType;
	public static SObjectFields$<PlatformAction> Fields;

	public String ActionListContext;
	public String ActionTarget;
	public String ActionTargetType;
	public String ApiName;
	public String Category;
	public String ConfirmationMessage;
	public String DeviceFormat;
	public String ExternalId;
	public Id GroupId;
	public SObject Group;
	public String IconContentType;
	public Integer IconHeight;
	public String IconUrl;
	public Integer IconWidth;
	public Id Id;
	public String InvocationStatus;
	public Id InvokedByUserId;
	public User InvokedByUser;
	public Boolean IsGroupDefault;
	public Boolean IsMassAction;
	public String Label;
	public Datetime LastModifiedDate;
	public String OpenType;
	public String PrimaryColor;
	public String RelatedListRecordId;
	public String RelatedSourceEntity;
	public String RetrievalMode;
	public String Section;
	public String SourceEntity;
	public String Subtype;
	public String TargetObject;
	public String TargetUrl;
	public String Type;

	public PlatformAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
