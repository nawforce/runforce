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
public class ReturnOrder extends SObject {
	public static SObjectType$<ReturnOrder> SObjectType;
	public static SObjectFields$<ReturnOrder> Fields;

	public Id AccountId;
	public Account Account;
	public Id CaseId;
	public Case Case;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedArrivalDate;
	public Datetime ExpirationDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OrderId;
	public Order Order;
	public Id OwnerId;
	public Name Owner;
	public Id ProductRequestId;
	public ProductRequest ProductRequest;
	public Id ProductServiceCampaignId;
	public ProductServiceCampaign ProductServiceCampaign;
	public String ReturnOrderNumber;
	public Id ReturnedById;
	public User ReturnedBy;
	public Address ShipFromAddress;
	public String ShipFromCity;
	public String ShipFromCountry;
	public String ShipFromCountryCode;
	public String ShipFromGeocodeAccuracy;
	public Decimal ShipFromLatitude;
	public Decimal ShipFromLongitude;
	public String ShipFromPostalCode;
	public String ShipFromState;
	public String ShipFromStateCode;
	public String ShipFromStreet;
	public String ShipmentType;
	public Id SourceLocationId;
	public Location SourceLocation;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ReturnOrderFeed[] Feeds;
	public ReturnOrderHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductTransfer[] ProductTransfers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public ReturnOrderShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public ReturnOrder clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
