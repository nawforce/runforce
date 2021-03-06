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

package com.nawforce.runforce.TxnSecurity;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Event {
	public String action;
	public Map<String,String> data;
	public String entityId;
	public String entityName;
	public String organizationId;
	public String resourceType;
	public Datetime timeStamp;
	public String userId;

	public Event(String organizationId, String userId, String entityName, String action, String resourceType, String entityId, Datetime timeStamp, Map<String,String> data) {throw new java.lang.UnsupportedOperationException();}
}
