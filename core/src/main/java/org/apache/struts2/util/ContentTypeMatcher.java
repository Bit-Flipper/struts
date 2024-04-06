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
package org.apache.struts2.util;

import java.util.Map;

/**
 * Matches content type of uploaded files, similar to {@link com.opensymphony.xwork2.util.PatternMatcher}
 *
 * @since 2.3.22
 */
public interface ContentTypeMatcher<E extends Object> {

    /**
     * Compiles a given pattern into an internal format for faster matching.
     *
     * @param data the pattern to compile
     * @return the compiled pattern
     * @throws NullPointerException if the given pattern is {@code null}
     */
    E compilePattern(String data);

    /**
     * Checks if a given data matches the given expression.
     *
     * @param map the metadata of the data to match, typically containing "content-type"
     * @param data the data to match
     * @param expr the compiled pattern to match
     * @return {@code true} if the data matches, {@code false} otherwise
     * @throws NullPointerException if the metadata, data or pattern is {@code null}
     */
    boolean match(Map<String,String> map, String data, E expr);

}
