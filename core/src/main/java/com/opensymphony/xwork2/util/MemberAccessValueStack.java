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
     * Sets a set of {@link Pattern}s that represent the properties to be excluded.
     * Any attempt to get or set a property that matches any of the patterns will
     * result in an {@link UnsupportedOperationException}.
     *
     * @param excludeProperties the set of {@link Pattern}s that represent the properties to be excluded
     * @throws NullPointerException if the given set is <code>null</code>
     * @throws UnsupportedOperationException if an attempt to get or set a property that matches any
     * of the patterns is made
     * @see Pattern
     * @see Set
     */
    void useExcludeProperties(Set<Pattern> excludeProperties);

    /**
     * Sets a set of {@link Pattern}s that represent the properties to be accepted.
     * Only properties that match any of the patterns will be accessible.
     *
     * @param acceptedProperties the set of {@link Pattern}s that represent the properties to be accepted
     * @throws NullPointerException if the given set is <code>null</code>
     * @see Pattern
     * @see Set
     */
    void useAcceptProperties(Set<Pattern> acceptedProperties);

}
