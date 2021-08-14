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
public class AssetChangeEvent extends SObject {
	public static SObjectType$<AssetChangeEvent> SObjectType;
	public static SObjectFields$<AssetChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetProvidedById;
	public Account AssetProvidedBy;
	public Id AssetServicedById;
	public Account AssetServicedBy;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentAmount;
	public Datetime CurrentLifecycleEndDate;
	public Decimal CurrentMrr;
	public Decimal CurrentQuantity;
	public String Description;
	public Boolean HasLifecycleManagement;
	public Id Id;
	public Date InstallDate;
	public Boolean IsCompetitorProduct;
	public Boolean IsInternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LifecycleEndDate;
	public Datetime LifecycleStartDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Asset Parent;
	public Decimal Price;
	public Id Product2Id;
	public Product2 Product2;
	public Date PurchaseDate;
	public Decimal Quantity;
	public String ReplayId;
	public Id RootAssetId;
	public Asset RootAsset;
	public String SerialNumber;
	public String Status;
	public Decimal TotalLifecycleAmount;
	public Date UsageEndDate;

	public AssetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
