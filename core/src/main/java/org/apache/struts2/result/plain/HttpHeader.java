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
package org.apache.struts2.result.plain;

public interface HttpHeader<T> {

    /**
     * <p>
     * Gets the name of the HTTP header.
     * </p>
     *
     * <p>
     * The name of the HTTP header is a case-insensitive token, consisting of printable
     * ASCII characters excluding control characters, SP (space), and DQUOTE (double quote).
     * </p>
     *
     * @return the name of the HTTP header
     */
    String getName();

    /**
     * <p>
     * Gets the value of the HTTP header.
     * </p>
     *
     * <p>
     * The value of the HTTP header is a sequence of characters, excluding NUL (U+0000) and CR (U+000D),
     * which MAY be empty; Line breaks within the value are represented as CRLF.
     * </p>
     *
     * @return the value of the HTTP header
     */
    T getValue();

}
