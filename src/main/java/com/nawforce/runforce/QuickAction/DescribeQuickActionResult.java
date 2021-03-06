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

package com.nawforce.runforce.QuickAction;

import com.nawforce.runforce.Schema.DescribeColorResult;
import com.nawforce.runforce.Schema.DescribeIconResult;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;


@SuppressWarnings("unused")
public class DescribeQuickActionResult {
	public String AccessLevelRequired;
	public String CanvasApplicationId;
	public String CanvasApplicationName;
	public List<DescribeColorResult> Colors;
	public String ContextSobjectType;
	public List<DescribeQuickActionDefaultValue> DefaultValues;
	public String FlowDevName;
	public String FlowRecordIdVar;
	public Integer Height;
	public String IconName;
	public List<DescribeIconResult> Icons;
	public String IconUrl;
	public DescribeLayoutSection Layout;
	public String LightningComponentBundleId;
	public String LightningComponentBundleName;
	public String LightningComponentQualifiedName;
	public String MiniIconUrl;
	public Boolean ShowQuickActionLcHeader;
	public Boolean ShowQuickActionVfHeader;
	public String TargetParentField;
	public String TargetRecordTypeId;
	public String TargetSobjectType;
	public String VisualforcePageName;
	public String VisualforcePageUrl;
	public Integer Width;

	public String getAccessLevelRequired() {throw new java.lang.UnsupportedOperationException();}
	public String getActionEnumOrId() {throw new java.lang.UnsupportedOperationException();}
	public String getCanvasApplicationId() {throw new java.lang.UnsupportedOperationException();}
	public String getCanvasApplicationName() {throw new java.lang.UnsupportedOperationException();}
	public List<DescribeColorResult> getColors() {throw new java.lang.UnsupportedOperationException();}
	public String getContextSobjectType() {throw new java.lang.UnsupportedOperationException();}
	public List<DescribeQuickActionDefaultValue> getDefaultValues() {throw new java.lang.UnsupportedOperationException();}
	public String getFlowDevName() {throw new java.lang.UnsupportedOperationException();}
	public String getFlowRecordIdVar() {throw new java.lang.UnsupportedOperationException();}
	public Integer getHeight() {throw new java.lang.UnsupportedOperationException();}
	public String getIconName() {throw new java.lang.UnsupportedOperationException();}
	public String getIconUrl() {throw new java.lang.UnsupportedOperationException();}
	public List<DescribeIconResult> getIcons() {throw new java.lang.UnsupportedOperationException();}
	public String getLabel() {throw new java.lang.UnsupportedOperationException();}
	public DescribeLayoutSection getLayout() {throw new java.lang.UnsupportedOperationException();}
	public String getLightningComponentBundleId() {throw new java.lang.UnsupportedOperationException();}
	public String getLightningComponentBundleName() {throw new java.lang.UnsupportedOperationException();}
	public String getLightningComponentQualifiedName() {throw new java.lang.UnsupportedOperationException();}
	public String getMiniIconUrl() {throw new java.lang.UnsupportedOperationException();}
	public String getName() {throw new java.lang.UnsupportedOperationException();}
	public Boolean getShowQuickActionLcHeader() {throw new java.lang.UnsupportedOperationException();}
	public Boolean getShowQuickActionVfHeader() {throw new java.lang.UnsupportedOperationException();}
	public String getTargetParentField() {throw new java.lang.UnsupportedOperationException();}
	public String getTargetRecordTypeId() {throw new java.lang.UnsupportedOperationException();}
	public String getTargetSobjectType() {throw new java.lang.UnsupportedOperationException();}
	public String getType() {throw new java.lang.UnsupportedOperationException();}
	public String getVisualforcePageName() {throw new java.lang.UnsupportedOperationException();}
	public String getVisualforcePageUrl() {throw new java.lang.UnsupportedOperationException();}
	public Integer getWidth() {throw new java.lang.UnsupportedOperationException();}
}
