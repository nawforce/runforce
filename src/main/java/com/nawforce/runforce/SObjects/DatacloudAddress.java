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
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DatacloudAddress extends SObject {
	public static SObjectType$<DatacloudAddress> SObjectType;
	public static SObjectFields$<DatacloudAddress> Fields;

	public String AddressLine1;
	public String AddressLine2;
	public String City;
	public String Country;
	public String CurrencyIsoCode;
	public String ExternalId;
	public String GeoAccuracyCode;
	public String GeoAccuracyNum;
	public Id Id;
	public String Latitude;
	public String Longitude;
	public String PostalCode;
	public String State;

	public DatacloudAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
