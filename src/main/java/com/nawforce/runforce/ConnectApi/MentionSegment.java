/*
 Copyright (c) 2021 Kevin Jones, All rights reserved.
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

import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Boolean;

@SuppressWarnings("unused")
public class MentionSegment extends MessageSegment {
  public Boolean accessible;
  public String name;
  public ActorWithId record;
  public UserSummary user;
}
