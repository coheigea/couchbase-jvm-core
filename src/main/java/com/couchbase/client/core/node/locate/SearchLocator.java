/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.core.node.locate;

import com.couchbase.client.core.node.Node;
import com.couchbase.client.core.service.ServiceType;

/**
 * Round robin node locator for CBFT.
 *
 * @author Sergey Avseyev
 * @since 1.2.4
 */
public class SearchLocator extends QueryLocator {

    public SearchLocator() {
        super();
    }

    SearchLocator(long initialValue) {
        super(initialValue);
    }

    @Override
    protected boolean checkNode(Node node) {
        return node.serviceEnabled(ServiceType.SEARCH);
    }

}
