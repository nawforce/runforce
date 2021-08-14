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
public class FinanceBalanceSnapshot extends SObject {
	public static SObjectType$<FinanceBalanceSnapshot> SObjectType;
	public static SObjectFields$<FinanceBalanceSnapshot> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AdjustmentAmount;
	public Decimal Balance;
	public Decimal BaseCurrencyAmount;
	public Decimal BaseCurrencyBalance;
	public Date BaseCurrencyFxDate;
	public Decimal BaseCurrencyFxRate;
	public String BaseCurrencyIsoCode;
	public Decimal ChargeAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DueDate;
	public Datetime EffectiveDate;
	public String EventType;
	public String FinanceBalanceSnapshotNumber;
	public String FinanceSystemIntegrationMode;
	public String FinanceSystemIntegrationStatus;
	public String FinanceSystemName;
	public String FinanceSystemTransactionNumber;
	public Id FinanceTransactionId;
	public FinanceTransaction FinanceTransaction;
	public Id Id;
	public Decimal ImpactAmount;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalEntityId;
	public SObject LegalEntity;
	public String OriginalEventType;
	public String OriginalReferenceEntityType;
	public Id OwnerId;
	public SObject Owner;
	public Id ReferenceEntityId;
	public SObject ReferenceEntity;
	public String ReferenceEntityType;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public Decimal TotalAmountWithTax;
	public Datetime TransactionDate;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceBalanceSnapshotShare[] Shares;

	public FinanceBalanceSnapshot clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshot clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshot clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
