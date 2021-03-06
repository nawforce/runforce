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

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Content {
	public String checksum;
	public String contentUrl;
	public String description;
	public String downloadUrl;
	public String fileExtension;
	public String fileSize;
	public String fileType;
	public Boolean hasPdfPreview;
	public String id;
	public Boolean isContextUserSubscribedToDocument;
	public Boolean isInMyFileSync;
	public Boolean isRenditionProcessing;
	public Boolean isSyncAvailable;
	public Datetime lastModifiedDate;
	public String mimeType;
	public String renditionUrl;
	public String renditionUrl240By180;
	public String renditionUrl720By480;
	public FileSharingOption sharingOption;
	public String textPreview;
	public String thumb120By90RenditionStatus;
	public String thumb240By180RenditionStatus;
	public String thumb720By480RenditionStatus;
	public String title;
	public String versionId;

	public Content() {throw new java.lang.UnsupportedOperationException();}

	public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
	public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
	public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
	public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
