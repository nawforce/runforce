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
public class RefundLinePayment extends SObject {
	public static SObjectType$<RefundLinePayment> SObjectType;
	public static SObjectFields$<RefundLinePayment> Fields;

	public Decimal Amount;
	public Datetime AppliedDate;
	public Id AssociatedAccountId;
	public Account AssociatedAccount;
	public Id AssociatedRefundLinePaymentId;
	public RefundLinePayment AssociatedRefundLinePayment;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime Date;
	public Datetime EffectiveDate;
	public Decimal EffectiveImpactAmount;
	public String HasBeenUnapplied;
	public Id Id;
	public Decimal ImpactAmount;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal PaymentBalance;
	public Id PaymentId;
	public Payment Payment;
	public Decimal RefundBalance;
	public Id RefundId;
	public Refund Refund;
	public String RefundLinePaymentNumber;
	public Datetime SystemModstamp;
	public String Type;
	public Datetime UnappliedDate;

	public FinanceTransaction[] DestinationFinanceTransactions;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FinanceTransaction[] ParentFinanceTransactions;
	public RefundLinePayment[] RefundLinePayments;
	public FinanceTransaction[] SourceFinanceTransactions;

	public RefundLinePayment clone$() {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
