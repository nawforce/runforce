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
import com.nawforce.runforce.System.Address;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Account extends SObject {
	public static SObjectType$<Account> SObjectType;
	public static SObjectFields$<Account> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public String AccountNumber;
	public String AccountSource;
	public Decimal AnnualRevenue;
	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingCountryCode;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStateCode;
	public String BillingStreet;
	public String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public String Description;
	public String DunsNumber;
	public String Fax;
	public Id Id;
	public String Industry;
	public Boolean IsDeleted;
	public String Jigsaw;
	public String JigsawCompanyId;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MasterRecordId;
	public Account MasterRecord;
	public String NaicsCode;
	public String NaicsDesc;
	public String Name;
	public Integer NumberOfEmployees;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public String Ownership;
	public Id ParentId;
	public Account Parent;
	public String Phone;
	public String PhotoUrl;
	public String Rating;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String Sic;
	public String SicDesc;
	public String Site;
	public Datetime SystemModstamp;
	public String TickerSymbol;
	public String Tradestyle;
	public String Type;
	public String Website;
	public String YearStarted;

	public AccountCleanInfo[] AccountCleanInfos;
	public AccountContactRole[] AccountContactRoles;
	public AccountPartner[] AccountPartnersFrom;
	public AccountPartner[] AccountPartnersTo;
	public AccountUserTerritory2View[] AccountUserTerritory2Views;
	public ActivityHistory[] ActivityHistories;
	public AlternativePaymentMethod[] AlternativePaymentMethods;
	public Asset[] Assets;
	public AssociatedLocation[] AssociatedLocations;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public CardPaymentMethod[] CardPaymentMethods;
	public Case[] Cases;
	public Account[] ChildAccounts;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointAddress[] ContactPointAddresses;
	public ContactPointEmail[] ContactPointEmails;
	public ContactPointPhone[] ContactPointPhones;
	public ContactRequest[] ContactRequests;
	public Contact[] Contacts;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Contract[] Contracts;
	public CreditMemo[] CreditMemos;
	public DigitalWallet[] DigitalWallets;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessage[] Emails;
	public Event[] Events;
	public Expense[] Expenses;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AccountFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public AccountHistory[] Histories;
	public Invoice[] Invoices;
	public MaintenancePlan[] MaintenancePlans;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ObjectTerritory2Association[] ObjectTerritory2Associations;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public OpportunityPartner[] OpportunityPartnersTo;
	public Order[] Orders;
	public Partner[] PartnersFrom;
	public Partner[] PartnersTo;
	public PaymentAuthAdjustment[] PaymentAuthAdjustments;
	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentLineInvoice[] PaymentLinesInvoice;
	public Payment[] Payments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public Asset[] ProvidedAssets;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public RefundLinePayment[] RefundLinePayments;
	public Refund[] Refunds;
	public AuthorizationFormConsent[] RelatedAuthorizationFormConsents;
	public WorkFeedbackRequest[] RelatedObjects;
	public ResourcePreference[] ResourcePreferences;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointmentAccount;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceResource[] ServiceResources;
	public Asset[] ServicedAssets;
	public AccountShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public User[] Users;
	public WorkOrder[] WorkOrders;

	public Account clone$() {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Account clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
