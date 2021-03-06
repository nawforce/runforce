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

package com.nawforce.runforce.QuickAction;

import com.nawforce.runforce.Database.Error;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;


@SuppressWarnings("unused")
public class QuickActionTemplateResult {
	public String ContextId;
	public SObject DefaultValueFormulas;
	public SObject DefaultValues;
	public List<Error> Errors;
	public Boolean Success;

	public String getContextId() {throw new java.lang.UnsupportedOperationException();}
	public SObject getDefaultValueFormulas() {throw new java.lang.UnsupportedOperationException();}
	public SObject getDefaultValues() {throw new java.lang.UnsupportedOperationException();}
	public List<Error> getErrors() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isSuccess() {throw new java.lang.UnsupportedOperationException();}
}
