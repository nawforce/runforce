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
public class EventBusSubscriber extends SObject {
	public static SObjectType$<EventBusSubscriber> SObjectType;
	public static SObjectFields$<EventBusSubscriber> Fields;

	public String CurrencyIsoCode;
	public String ExternalId;
	public Id Id;
	public String LastError;
	public String Name;
	public Integer Position;
	public Integer Retries;
	public String Status;
	public Integer Tip;
	public String Topic;
	public String Type;

	public EventBusSubscriber clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
