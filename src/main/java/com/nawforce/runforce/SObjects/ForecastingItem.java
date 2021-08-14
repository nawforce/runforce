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
public class ForecastingItem extends SObject {
	public static SObjectType$<ForecastingItem> SObjectType;
	public static SObjectFields$<ForecastingItem> Fields;

	public Decimal AmountWithoutAdjustments;
	public Decimal AmountWithoutManagerAdjustment;
	public Decimal AmountWithoutOwnerAdjustment;
	public String CurrencyIsoCode;
	public Decimal ForecastAmount;
	public String ForecastCategoryName;
	public Decimal ForecastQuantity;
	public String ForecastingItemCategory;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Boolean HasAdjustment;
	public Boolean HasOwnerAdjustment;
	public Id Id;
	public Boolean IsAmount;
	public Boolean IsQuantity;
	public Boolean IsUpToDate;
	public Id OwnerId;
	public User Owner;
	public Decimal OwnerOnlyAmount;
	public Decimal OwnerOnlyQuantity;
	public Id ParentForecastingItemId;
	public ForecastingItem ParentForecastingItem;
	public Id PeriodId;
	public Period Period;
	public String ProductFamily;
	public Decimal QuantityWithoutAdjustments;
	public Decimal QuantityWithoutManagerAdjustment;
	public Decimal QuantityWithoutOwnerAdjustment;
	public Integer SubordinateOverrides;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingFact[] ForecastingFacts;

	public ForecastingItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
