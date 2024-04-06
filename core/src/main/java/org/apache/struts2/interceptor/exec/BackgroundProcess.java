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
     * <p>
     * Prepares the background process for execution. This method is called by
     * {@link ExecuteAndWaitInterceptor} before starting the background process.
     * </p>
     * 
     * @return a new instance of the {@link BackgroundProcess}
     */
    BackgroundProcess prepare();

    /**
     * <p>
     * Returns the action being executed in the background.
     * </p>
     * 
     * @return the action being executed in the background
     */
    Object getAction();

    /**
     * <p>
     * Returns the {@link ActionInvocation} for the action being executed in the
     * background.
     * </p>
     * 
     * @return the {@link ActionInvocation} for the action being executed in
     * the background
     */
    ActionInvocation getInvocation();

    /**
     * <p>
     * Returns the result of the action executed in the background.
     * </p>
     * 
     * @return the result of the action executed in the background
     */
    String getResult();

    /**
     * <p>
     * Returns the {@link Exception} thrown, if any, by the action executed in
     * the background.
     * </p>
     * 
     * @return the {@link Exception} thrown, if any, by the action executed in
     * the background
     */
    Exception getException();

    /**
     * <p>
     * Returns whether or not the background process has completed execution.
     * </p>
     * 
     * @return <code>true</code> if the background process has completed
     * execution, <code>false</code> otherwise
     */
    boolean isDone();
}
