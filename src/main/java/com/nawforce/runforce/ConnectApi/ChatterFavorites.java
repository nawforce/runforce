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
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ChatterFavorites {
	public static FeedFavorite addFavorite(String communityId, String subjectId, String searchText) {throw new java.lang.UnsupportedOperationException();}
	public static FeedFavorite addRecordFavorite(String communityId, String subjectId, String targetId) {throw new java.lang.UnsupportedOperationException();}
	public static void deleteFavorite(String communityId, String subjectId, String favoriteId) {throw new java.lang.UnsupportedOperationException();}
	public static FeedFavorite getFavorite(String communityId, String subjectId, String favoriteId) {throw new java.lang.UnsupportedOperationException();}
	public static FeedFavorites getFavorites(String communityId, String subjectId) {throw new java.lang.UnsupportedOperationException();}
	public static FeedElementPage getFeedElements(String communityId, String subjectId, String favoriteId) {throw new java.lang.UnsupportedOperationException();}
	public static FeedElementPage getFeedElements(String communityId, String subjectId, String favoriteId, Integer recentCommentCount, Integer elementsPerBundle, String pageParam, Integer pageSize, FeedSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
	public static FeedElementPage getFeedElements(String communityId, String subjectId, String favoriteId, String pageParam, Integer pageSize, FeedSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
	public static FeedItemPage getFeedItems(String communityId, String subjectId, String favoriteId) {throw new java.lang.UnsupportedOperationException();}
	public static FeedItemPage getFeedItems(String communityId, String subjectId, String favoriteId, Integer recentCommentCount, String pageParam, Integer pageSize, FeedSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
	public static FeedItemPage getFeedItems(String communityId, String subjectId, String favoriteId, String pageParam, Integer pageSize, FeedSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedElements(String communityId, String subjectId, String favoriteId, FeedElementPage result) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedElements(String communityId, String subjectId, String favoriteId, Integer recentCommentCount, Integer elementsPerBundle, String pageParam, Integer pageSize, FeedSortOrder sortParam, FeedElementPage result) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedElements(String communityId, String subjectId, String favoriteId, String pageParam, Integer pageSize, FeedSortOrder sortParam, FeedElementPage result) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedItems(String communityId, String subjectId, String favoriteId, FeedItemPage result) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedItems(String communityId, String subjectId, String favoriteId, Integer recentCommentCount, String pageParam, Integer pageSize, FeedSortOrder sortParam, FeedItemPage result) {throw new java.lang.UnsupportedOperationException();}
	public static void setTestGetFeedItems(String communityId, String subjectId, String favoriteId, String pageParam, Integer pageSize, FeedSortOrder sortParam, FeedItemPage result) {throw new java.lang.UnsupportedOperationException();}
	public static FeedFavorite updateFavorite(String communityId, String subjectId, String favoriteId, Boolean updateLastViewDate) {throw new java.lang.UnsupportedOperationException();}
}
