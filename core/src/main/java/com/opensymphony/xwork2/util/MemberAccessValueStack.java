/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.opensymphony.xwork2.util;

import java.util.Set;
import java.util.regex.Pattern;

/**
 * ValueStacks implementing this interface provide a way to remove block or allow access
 * to properties using regular expressions
 */
public interface MemberAccessValueStack {

    /**
     * Sets the set of regular expression patterns to exclude.
     * Properties matching any of the provided {@link Pattern patterns} will be blocked from access.
     *
     * @param excludeProperties the Set of {@link Pattern} objects to exclude
     * @since 2.3.22
     */
    void useExcludeProperties(Set<Pattern> excludeProperties);

    /**
     * Sets the set of regular expression patterns to accept.
     * Only properties matching any of the provided {@link Pattern patterns} will be accessible.
     *
     * @param acceptedProperties the Set of {@link Pattern} objects to accept
     * @since 2.3.22
     */
    void useAcceptProperties(Set<Pattern> acceptedProperties);

}
