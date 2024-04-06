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
package org.apache.struts2.json.bridge;

/**
 * User: maurizio.cucchiara
 * Date: Oct 28, 2010
 * Time: 12:06:13 AM
 */
public interface FieldBridge {
    /**
     * <p>Converts the given Object to a String.</p>
     *
     * @param object the Object to convert
     * @return the String representation of the Object
     */
    String objectToString(Object object);
}
