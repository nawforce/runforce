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
public class Site extends SObject {
	public static SObjectType$<Site> SObjectType;
	public static SObjectFields$<Site> Fields;

	public Id AdminId;
	public User Admin;
	public String AnalyticsTrackingCode;
	public String ClickjackProtectionLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DailyBandwidthLimit;
	public Integer DailyBandwidthUsed;
	public Integer DailyRequestTimeLimit;
	public Integer DailyRequestTimeUsed;
	public String Description;
	public Id GuestRecordDefaultOwnerId;
	public User GuestRecordDefaultOwner;
	public Id GuestUserId;
	public User GuestUser;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer MonthlyPageViewsEntitlement;
	public String Name;
	public Boolean OptionsAllowGuestPaymentsApi;
	public Boolean OptionsAllowGuestSupportApi;
	public Boolean OptionsAllowHomePage;
	public Boolean OptionsAllowStandardAnswersPages;
	public Boolean OptionsAllowStandardIdeasPages;
	public Boolean OptionsAllowStandardLookups;
	public Boolean OptionsAllowStandardPortalPages;
	public Boolean OptionsAllowStandardSearch;
	public Boolean OptionsBrowserXssProtection;
	public Boolean OptionsCachePublicVfPagesInProxies;
	public Boolean OptionsContentSniffingProtection;
	public Boolean OptionsCookieConsent;
	public Boolean OptionsEnableFeeds;
	public Boolean OptionsHasStoredPathPrefix;
	public Boolean OptionsRedirectToCustomDomain;
	public Boolean OptionsReferrerPolicyOriginWhenCrossOrigin;
	public String SiteType;
	public String Status;
	public String Subdomain;
	public Datetime SystemModstamp;
	public String UrlPathPrefix;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public SiteFeed[] Feeds;
	public SiteHistory[] Histories;
	public DomainSite[] SiteDomainPaths;
	public SiteIframeWhiteListUrl[] SiteIframeWhiteListUrls;

	public Site clone$() {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
