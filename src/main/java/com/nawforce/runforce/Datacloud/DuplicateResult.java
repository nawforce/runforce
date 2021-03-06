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

package com.nawforce.runforce.Datacloud;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DuplicateResult {
	public Boolean AllowSave;
	public String DuplicateRule;
	public String DuplicateRuleEntityType;
	public String ErrorMessage;
	public List<MatchResult> MatchResults;

	public String getDuplicateRule() {throw new java.lang.UnsupportedOperationException();}
	public String getDuplicateRuleEntityType() {throw new java.lang.UnsupportedOperationException();}
	public String getErrorMessage() {throw new java.lang.UnsupportedOperationException();}
	public List<MatchResult> getMatchResults() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isAllowSave() {throw new java.lang.UnsupportedOperationException();}
}
