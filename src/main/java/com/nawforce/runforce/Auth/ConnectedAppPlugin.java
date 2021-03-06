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

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.dom.XmlNode;

@SuppressWarnings("unused")
public class ConnectedAppPlugin {
  public Boolean authorize(Id userId, Id connectedAppId, Boolean isAdminApproved, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public Map<String,String> customAttributes(Id userId, Id connectedAppId, Map<String,String> formulaDefinedAttributes) {throw new java.lang.UnsupportedOperationException();}
  public Map<String,String> customAttributes(Id userId, Id connectedAppId, Map<String,String> formulaDefinedAttributes, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public XmlNode modifySAMLResponse(Map<String,String> authSession, Id connectedAppId, XmlNode samlResponse) {throw new java.lang.UnsupportedOperationException();}
  public void refresh(Id userId, Id connectedAppId, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
}
