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
public class CampaignChangeEvent extends SObject {
	public static SObjectType$<CampaignChangeEvent> SObjectType;
	public static SObjectFields$<CampaignChangeEvent> Fields;

	public Decimal ActualCost;
	public Decimal AmountAllOpportunities;
	public Decimal AmountWonOpportunities;
	public Decimal BudgetedCost;
	public Id CampaignMemberRecordTypeId;
	public RecordType CampaignMemberRecordType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Decimal ExpectedResponse;
	public Decimal ExpectedRevenue;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumberOfContacts;
	public Integer NumberOfConvertedLeads;
	public Integer NumberOfLeads;
	public Integer NumberOfOpportunities;
	public Integer NumberOfResponses;
	public Integer NumberOfWonOpportunities;
	public Decimal NumberSent;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Campaign Parent;
	public String ReplayId;
	public Date StartDate;
	public String Status;
	public String Type;

	public CampaignChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
