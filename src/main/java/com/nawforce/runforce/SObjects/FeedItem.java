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
public class FeedItem extends SObject {
	public static SObjectType$<FeedItem> SObjectType;
	public static SObjectFields$<FeedItem> Fields;

	public Id BestCommentId;
	public FeedComment BestComment;
	public String Body;
	public Integer CommentCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean HasContent;
	public Boolean HasFeedEntity;
	public Boolean HasLink;
	public Boolean HasVerifiedComment;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsRichText;
	public Id LastEditById;
	public User LastEditBy;
	public Datetime LastEditDate;
	public Datetime LastModifiedDate;
	public Integer LikeCount;
	public String LinkUrl;
	public Id ParentId;
	public Name Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Integer Revision;
	public String Status;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;

	public FeedAttachment[] FeedAttachments;
	public FeedComment[] FeedComments;
	public WorkThanks[] FeedItemThanks;
	public FeedLike[] FeedLikes;
	public FeedRevision[] FeedRevisions;
	public FeedSignal[] FeedSignals;
	public FeedTrackedChange[] FeedTrackedChanges;
	public TopicAssignment[] TopicAssignments;

	public FeedItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
