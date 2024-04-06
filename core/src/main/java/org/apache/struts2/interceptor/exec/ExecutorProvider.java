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

import java.util.concurrent.ExecutorService;

/**
 * Interface mimics {@link ExecutorService} to be used with
 * {@link org.apache.struts2.interceptor.ExecuteAndWaitInterceptor}
 * to execute {@link BackgroundProcess}
 *
 * @since 6.1.0
 */
public interface ExecutorProvider {

    /**
     * <p>
     * Executes the given {@link Runnable} task.</p>
     * 
     * @param task {@link Runnable} task to be executed
     * @since 6.1.0
     */
    void execute(Runnable task);

    /**
     * <p>
     * Checks if the {@link ExecutorProvider} has been shutdown.</p>
     * 
     * @return true if the provider has been shutdown, false otherwise
     * @since 6.1.0
     */
    boolean isShutdown();

    /**
     * <p>
     * Initiates an orderly shutdown in progress of executing tasks.</p>
     * 
     * @since 6.1.0
     */
    void shutdown();

}
