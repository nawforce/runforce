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
public class FinanceTransactionChangeEvent extends SObject {
	public static SObjectType$<FinanceTransactionChangeEvent> SObjectType;
	public static SObjectFields$<FinanceTransactionChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AdjustmentAmount;
	public Decimal BaseCurrencyAmount;
	public Decimal BaseCurrencyBalance;
	public Date BaseCurrencyFxDate;
	public Decimal BaseCurrencyFxRate;
	public String BaseCurrencyIsoCode;
	public Object ChangeEventHeader;
	public Decimal ChargeAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreationMode;
	public String CurrencyIsoCode;
	public Id DestinationEntityId;
	public SObject DestinationEntity;
	public Datetime DueDate;
	public Datetime EffectiveDate;
	public String EventAction;
	public String EventType;
	public String FinanceSystemIntegrationMode;
	public String FinanceSystemIntegrationStatus;
	public String FinanceSystemName;
	public String FinanceSystemTransactionNumber;
	public String FinanceTransactionNumber;
	public Id Id;
	public Decimal ImpactAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LegalEntityId;
	public SObject LegalEntity;
	public String OriginalCreditGlAccountName;
	public String OriginalCreditGlAccountNumber;
	public String OriginalDebitGlAccountName;
	public String OriginalDebitGlAccountNumber;
	public String OriginalEventAction;
	public String OriginalEventType;
	public String OriginalFinanceBookName;
	public String OriginalFinancePeriodEndDate;
	public String OriginalFinancePeriodName;
	public String OriginalFinancePeriodStartDate;
	public String OriginalFinancePeriodStatus;
	public String OriginalGlRuleName;
	public String OriginalGlTreatmentName;
	public String OriginalReferenceEntityType;
	public Id OwnerId;
	public User Owner;
	public Id ParentReferenceEntityId;
	public SObject ParentReferenceEntity;
	public Id ReferenceEntityId;
	public SObject ReferenceEntity;
	public String ReferenceEntityType;
	public String ReplayId;
	public Decimal ResultingBalance;
	public Id SourceEntityId;
	public SObject SourceEntity;
	public Decimal Subtotal;
	public Decimal TaxAmount;
	public Decimal TotalAmountWithTax;
	public Datetime TransactionDate;

	public FinanceTransactionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransactionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
