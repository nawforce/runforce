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
public class CreditMemoLine extends SObject {
	public static SObjectType$<CreditMemoLine> SObjectType;
	public static SObjectFields$<CreditMemoLine> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentAmountWithTax;
	public Decimal AdjustmentTaxAmount;
	public Decimal ChargeAmount;
	public Decimal ChargeAmountWithTax;
	public Decimal ChargeTaxAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CreditMemoId;
	public CreditMemo CreditMemo;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LineAmount;
	public String Name;
	public Id Product2Id;
	public Product2 Product2;
	public String ReferenceEntityItemType;
	public String ReferenceEntityItemTypeCode;
	public Id RelatedLineId;
	public CreditMemoLine RelatedLine;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public String TaxCode;
	public Date TaxEffectiveDate;
	public String TaxName;
	public Decimal TaxRate;
	public String Type;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoLine[] CreditMemoLines;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CreditMemoLineFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public CreditMemoLineHistory[] Histories;
	public FinanceTransaction[] ParentFinanceTransactions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceTransaction[] SourceFinanceTransactions;

	public CreditMemoLine clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoLine clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoLine clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoLine clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoLine clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
