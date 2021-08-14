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
public class FieldServiceMobileSettings extends SObject {
	public static SObjectType$<FieldServiceMobileSettings> SObjectType;
	public static SObjectFields$<FieldServiceMobileSettings> Fields;

	public String AscAutomaticMode;
	public Integer AscCancellationTimerInSec;
	public String AscCompletedStatus;
	public String AscOnSiteStatus;
	public Integer AscRadiusInMeters;
	public Integer AscTimeLimitationInMin;
	public String AscTravelStatus;
	public String BgGeoLocationAccuracy;
	public Integer BgGeoLocationMinUpdateFreqMins;
	public String BrandInvertedColor;
	public String ContrastInvertedColor;
	public String ContrastPrimaryColor;
	public String ContrastQuaternaryColor;
	public String ContrastQuinaryColor;
	public String ContrastSecondaryColor;
	public String ContrastTertiaryColor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultListViewDeveloperName;
	public String DeveloperName;
	public String FeedbackPrimaryColor;
	public String FeedbackSecondaryColor;
	public String FeedbackSelectedColor;
	public Integer FutureDaysInDatePicker;
	public String GeoLocationAccuracy;
	public Integer GeoLocationMinUpdateFreqMins;
	public Id Id;
	public Boolean IsAssignmentNotification;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Boolean IsDispatchNotification;
	public Boolean IsSendLocationHistory;
	public Boolean IsShowEditFullRecord;
	public Boolean IsTimeSheetEnabled;
	public Boolean IsTimeZoneEnabled;
	public Boolean IsUseSalesforceMobileActions;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer MetadataCacheTimeDays;
	public String NavbarBackgroundColor;
	public String NavbarInvertedColor;
	public Integer PastDaysInDatePicker;
	public String PrimaryBrandColor;
	public String QuickStatusChangeFlowName;
	public Integer RecordDataCacheTimeMins;
	public String SecondaryBrandColor;
	public Datetime SystemModstamp;
	public String TimeIntervalSetupMins;
	public Integer UpdateScheduleTimeMins;

	public AppExtension[] AppExtensions;
	public MobileSettingsAssignment[] MobileSettingsAssignments;

	public FieldServiceMobileSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
