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

package com.nawforce.runforce.Database;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class LeadConvert {
	public Id AccountId;
	public SObject AccountRecord;
	public Boolean BypassAccountDedupeCheck;
	public Boolean BypassContactDedupeCheck;
	public Id ContactId;
	public SObject ContactRecord;
	public String ConvertedStatus;
	public Boolean DoNotCreateOpportunity;
	public Id LeadId;
	public Id OpportunityId;
	public String OpportunityName;
	public SObject OpportunityRecord;
	public Boolean OverwriteLeadSource;
	public Id OwnerId;
	public Boolean SendNotificationEmail;

	public LeadConvert() {throw new java.lang.UnsupportedOperationException();}

	public Id getAccountId() {throw new java.lang.UnsupportedOperationException();}
	public SObject getAccountRecord() {throw new java.lang.UnsupportedOperationException();}
	public Boolean getBypassAccountDedupeCheck() {throw new java.lang.UnsupportedOperationException();}
	public Boolean getBypassContactDedupeCheck() {throw new java.lang.UnsupportedOperationException();}
	public Id getContactId() {throw new java.lang.UnsupportedOperationException();}
	public SObject getContactRecord() {throw new java.lang.UnsupportedOperationException();}
	public String getConvertedStatus() {throw new java.lang.UnsupportedOperationException();}
	public Id getLeadId() {throw new java.lang.UnsupportedOperationException();}
	public Id getOpportunityId() {throw new java.lang.UnsupportedOperationException();}
	public String getOpportunityName() {throw new java.lang.UnsupportedOperationException();}
	public SObject getOpportunityRecord() {throw new java.lang.UnsupportedOperationException();}
	public Id getOwnerId() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isDoNotCreateOpportunity() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isOverwriteLeadSource() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isSendNotificationEmail() {throw new java.lang.UnsupportedOperationException();}
	public void setAccountId(Id param1) {throw new java.lang.UnsupportedOperationException();}
	public void setAccountRecord(SObject param1) {throw new java.lang.UnsupportedOperationException();}
	public void setBypassAccountDedupeCheck(Boolean param1) {throw new java.lang.UnsupportedOperationException();}
	public void setBypassContactDedupeCheck(Boolean param1) {throw new java.lang.UnsupportedOperationException();}
	public void setContactId(Id param1) {throw new java.lang.UnsupportedOperationException();}
	public void setContactRecord(SObject param1) {throw new java.lang.UnsupportedOperationException();}
	public void setConvertedStatus(String param1) {throw new java.lang.UnsupportedOperationException();}
	public void setDoNotCreateOpportunity(Boolean param1) {throw new java.lang.UnsupportedOperationException();}
	public void setLeadId(Id param1) {throw new java.lang.UnsupportedOperationException();}
	public void setOpportunityId(Id param1) {throw new java.lang.UnsupportedOperationException();}
	public void setOpportunityName(String param1) {throw new java.lang.UnsupportedOperationException();}
	public void setOpportunityRecord(SObject param1) {throw new java.lang.UnsupportedOperationException();}
	public void setOverwriteLeadSource(Boolean param1) {throw new java.lang.UnsupportedOperationException();}
	public void setOwnerId(Id param1) {throw new java.lang.UnsupportedOperationException();}
	public void setSendNotificationEmail(Boolean param1) {throw new java.lang.UnsupportedOperationException();}
}
