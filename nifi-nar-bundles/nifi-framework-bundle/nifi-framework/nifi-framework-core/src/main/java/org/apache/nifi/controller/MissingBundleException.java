/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.controller;

import org.apache.nifi.cluster.ConnectionException;

/**
 * Represents the exceptional case when a node fails to join the cluster because a bundle being used by the cluster does not exist on the node.
 */
public class MissingBundleException extends ConnectionException {

    private static final long serialVersionUID = 198234798234794L;

    public MissingBundleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MissingBundleException(Throwable cause) {
        super(cause);
    }

    public MissingBundleException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingBundleException(String message) {
        super(message);
    }

    public MissingBundleException() {
    }

}
