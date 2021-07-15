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

package com.nawforce.runforce.System;

import com.nawforce.runforce.Schema.*;

@SuppressWarnings("unused")
public class Schema {
	public static List<DescribeDataCategoryGroupStructureResult> describeDataCategoryGroupStructures(List<DataCategoryGroupSobjectTypePair> pairs, Boolean topCategoriesOnly) {throw new java.lang.UnsupportedOperationException();}
	public static List<DescribeDataCategoryGroupResult> describeDataCategoryGroups(List<String> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<DescribeSObjectResult> describeSObjects(List<String> types) {throw new java.lang.UnsupportedOperationException();}
	public static List<DescribeSObjectResult> describeSObjects(List<String> types, Object SObjectDescribeOptions) {throw new java.lang.UnsupportedOperationException();}
	public static List<DescribeTabSetResult> describeTabs() {throw new java.lang.UnsupportedOperationException();}
	public static Map<String, SObjectType> getAppDescribe(String appName) {throw new java.lang.UnsupportedOperationException();}
	public static Map<String,SObjectType> getGlobalDescribe() {throw new java.lang.UnsupportedOperationException();}
	public static Map<String,SObjectType> getModuleDescribe() {throw new java.lang.UnsupportedOperationException();}
	public static Map<String,SObjectType> getModuleDescribe(String moduleName) {throw new java.lang.UnsupportedOperationException();}
}
