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
public class WorkOrderLineItem extends SObject {
	public static SObjectType$<WorkOrderLineItem> SObjectType;
	public static SObjectFields$<WorkOrderLineItem> Fields;

	public Address Address;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public String City;
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
	public String LineItemNumber;
	public Decimal ListPrice;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Id MaintenanceWorkRuleId;
	public MaintenanceWorkRule MaintenanceWorkRule;
	public Integer MinimumCrewSize;
	public Id OrderId;
	public Order Order;
	public Id ParentWorkOrderLineItemId;
	public WorkOrderLineItem ParentWorkOrderLineItem;
	public String PostalCode;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public String Priority;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public Id ProductServiceCampaignItemId;
	public ProductServiceCampaignItem ProductServiceCampaignItem;
	public Decimal Quantity;
	public Integer RecommendedCrewSize;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Id RootWorkOrderLineItemId;
	public WorkOrderLineItem RootWorkOrderLineItem;
	public Integer ServiceAppointmentCount;
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
	public Decimal TotalPrice;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AssetActionSource[] AssetActionSourceReferences;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public WorkOrderLineItem[] ChildWorkOrderLineItems;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public WorkOrderLineItem[] DescendantWorkOrderLineItems;
	public DigitalSignature[] DigitalSignatures;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkOrderLineItemFeed[] Feeds;
	public WorkOrderLineItemHistory[] Histories;
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
	public ServiceAppointment[] ServiceAppointments;
	public ServiceReport[] ServiceReports;
	public SkillRequirement[] SkillRequirements;
	public Task[] Tasks;
	public TimeSheetEntry[] TimeSheetEntries;
	public TopicAssignment[] TopicAssignments;
	public WorkPlan[] WorkPlans;
	public WorkStep[] WorkSteps;

	public WorkOrderLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkOrderLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
