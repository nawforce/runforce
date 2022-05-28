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
public class WorkOrder extends SObject {
	public static SObjectType$<WorkOrder> SObjectType;
	public static SObjectFields$<WorkOrder> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Id CaseId;
	public Case Case;
	public String City;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EndDate;
	public String GeocodeAccuracy;
	public Decimal GrandTotal;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsGeneratedFromMaintenancePlan;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Integer LineItemCount;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Id MaintenanceWorkRuleId;
	public MaintenanceWorkRule MaintenanceWorkRule;
	public Integer MinimumCrewSize;
	public Id OwnerId;
	public Name Owner;
	public Id ParentWorkOrderId;
	public WorkOrder ParentWorkOrder;
	public String PostalCode;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public String Priority;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public Id ProductServiceCampaignItemId;
	public ProductServiceCampaignItem ProductServiceCampaignItem;
	public Integer RecommendedCrewSize;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Id RootWorkOrderId;
	public WorkOrder RootWorkOrder;
	public Integer ServiceAppointmentCount;
	public String ServiceReportLanguage;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Datetime StartDate;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public Decimal Subtotal;
	public Date SuggestedMaintenanceDate;
	public Datetime SystemModstamp;
	public Decimal Tax;
	public Decimal TotalPrice;
	public String WorkOrderNumber;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public WorkOrder[] ChildWorkOrders;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public WorkOrder[] DescendantWorkOrders;
	public DigitalSignature[] DigitalSignatures;
	public EmailMessage[] Emails;
	public Event[] Events;
	public Expense[] Expenses;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkOrderFeed[] Feeds;
	public WorkOrderHistory[] Histories;
	public LinkedArticle[] LinkedArticles;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public ProductConsumed[] ProductsConsumed;
	public ProductRequired[] ProductsRequired;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ResourcePreference[] ResourcePreferences;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceReport[] ServiceReports;
	public WorkOrderShare[] Shares;
	public SkillRequirement[] SkillRequirements;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TimeSheetEntry[] TimeSheetEntries;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkPlan[] WorkPlans;
	public WorkStep[] WorkSteps;

	public WorkOrder clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkOrder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
