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
public class Invoice extends SObject {
	public static SObjectType$<Invoice> SObjectType;
	public static SObjectFields$<Invoice> Fields;

	public Id BillToContactId;
	public Contact BillToContact;
	public Id BillingAccountId;
	public Account BillingAccount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DocumentNumber;
	public Date DueDate;
	public Id Id;
	public Date InvoiceDate;
	public String InvoiceNumber;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public SObject Owner;
	public Id ReferenceEntityId;
	public Order ReferenceEntity;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmountWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalAmountWithTax;
	public Decimal TotalChargeAmount;
	public Decimal TotalChargeAmountWithTax;
	public Decimal TotalChargeTaxAmount;
	public Decimal TotalTaxAmount;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemoInvApplication[] CreditMemoInvsApplication;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InvoiceFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public InvoiceHistory[] Histories;
	public InvoiceLine[] InvoiceLines;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public FinanceTransaction[] ParentFinanceTransactions;
	public PaymentLineInvoice[] PaymentLinesInvoice;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InvoiceShare[] Shares;
	public FinanceTransaction[] SourceFinanceTransactions;
	public Task[] Tasks;

	public Invoice clone$() {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Invoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
