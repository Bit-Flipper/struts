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
     * Compiles a pattern into a form that can be used for matching.
     *
     * @param data the pattern to compile
     * @return the compiled expression
     */
    E compilePattern(String data);

    /**
     * Matches a given data using the provided compiled expression.
     *
     * @param map request parameters
     * @param data the data to match
     * @param expr the compiled expression
     * @return true if the data matches the compiled expression
     */
    boolean match(Map<String,String> map, String data, E expr);

}
