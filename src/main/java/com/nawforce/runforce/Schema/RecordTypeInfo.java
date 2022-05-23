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

package com.nawforce.runforce.Schema;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class RecordTypeInfo {
	public Boolean Active;
	public Boolean Available;
	public Boolean DefaultRecordTypeMapping;
	public String DeveloperName;
	public Boolean Master;
	public String Name;
	public Id RecordTypeId;

    private RecordTypeInfo(){throw new java.lang.UnsupportedOperationException();}

	public String getDeveloperName() {throw new java.lang.UnsupportedOperationException();}
	public String getName() {throw new java.lang.UnsupportedOperationException();}
	public Id getRecordTypeId() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isActive() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isAvailable() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isDefaultRecordTypeMapping() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isMaster() {throw new java.lang.UnsupportedOperationException();}
}
