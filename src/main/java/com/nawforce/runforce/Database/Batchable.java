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

package com.nawforce.runforce.Database;

import com.nawforce.runforce.System.List;

@SuppressWarnings("unused")
public interface Batchable<T> {
	void execute(BatchableContext param1, List<T> param2);
	void finish(BatchableContext param1);
	// The Iterable<T> version is allowed to override this via special exception
	QueryLocator start(BatchableContext param1);
}
