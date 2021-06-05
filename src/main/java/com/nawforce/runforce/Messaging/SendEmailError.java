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

package com.nawforce.runforce.Messaging;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.StatusCode;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SendEmailError {
	public String Message;
	public com.nawforce.runforce.System.StatusCode StatusCode;
	public String TargetObjectId;

	public List<String> getFields() {throw new java.lang.UnsupportedOperationException();}
	public String getMessage() {throw new java.lang.UnsupportedOperationException();}
	public StatusCode getStatusCode() {throw new java.lang.UnsupportedOperationException();}
	public String getTargetObjectId() {throw new java.lang.UnsupportedOperationException();}
}
