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

@SuppressWarnings("unused")
public enum JSONToken {
	END_ARRAY,
	END_OBJECT,
	FIELD_NAME,
	NOT_AVAILABLE,
	START_ARRAY,
	START_OBJECT,
	VALUE_EMBEDDED_OBJECT,
	VALUE_FALSE,
	VALUE_NULL,
	VALUE_NUMBER_FLOAT,
	VALUE_NUMBER_INT,
	VALUE_STRING,
	VALUE_TRUE
}
