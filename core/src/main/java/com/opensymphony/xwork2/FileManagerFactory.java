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
package com.opensymphony.xwork2;

/**
 * Factory that creates FileManager, default to {@link com.opensymphony.xwork2.util.fs.DefaultFileManager}
 */
public interface FileManagerFactory {

    /**
     * <p>
     * Sets the comma-separated list of configuration files/directories to be reloaded.
     * </p>
     *
     * <p>
     * Reloading is done by passing a comma-separated list of resources which will be periodically scanned for changes.
     * If any of the resources has changed (e.g. a new file was added, or an existing file was modified), all
     * configuration will be reloaded from the start.
     * </p>
     *
     * @param reloadingConfigs a comma-separated list of configuration files/directories to be reloaded
     * @see #getFileManager()
     */
    void setReloadingConfigs(String reloadingConfigs);

    /**
     * <p>
     * Returns the {@code FileManager} instance managed by this {@code FileManagerFactory}.
     * </p>
     *
     * @return the {@code FileManager} instance managed by this {@code FileManagerFactory}
     * @see #setReloadingConfigs(String)
     */
    FileManager getFileManager();

}
