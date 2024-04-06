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
package org.apache.struts2.interceptor.exec;

import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.interceptor.ExecuteAndWaitInterceptor;

/**
 * Interface used to create a background process which will be executed by
 * {@link ExecuteAndWaitInterceptor}
 */
public interface BackgroundProcess extends Runnable {

    /**
     * Prepares the background process for execution. This method may be called
     * multiple times on the same instance.
     *
     * @return this instance, allowing for fluent method chaining.
     */
    BackgroundProcess prepare();

    /**
     * Retrieves the action associated with this background process.
     *
     * @return the action.
     */
    Object getAction();

    /**
     * Retrieves the action invocation.
     *
     * @return the action invocation
     */
    ActionInvocation getInvocation();

    /**
     * Gets the result of the background process.
     *
     * @return the result; <tt>null</tt> if not done.
     */
    String getResult();

    /**
     * Gets the exception if any was thrown during the execution of the background
     * process.
     *
     * @return the exception or <tt>null</tt> if no exception was thrown.
     */
    Exception getException();

    /**
     * Returns the status of the background process.
     *
     * @return <tt>true</tt> if finished, <tt>false</tt> otherwise
     */
    boolean isDone();
}
