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

import com.opensymphony.xwork2.config.entities.ActionConfig;

import java.util.List;

/**
 * An unknown handler manager contains a list of UnknownHandler and iterates on them by order
 *
 * @see com.opensymphony.xwork2.DefaultUnknownHandlerManager
 */
public interface UnknownHandlerManager {

    /**
     * Attempts to handle an unknown result for the given action, action name, action configuration, and result code.
     *
     * @param actionContext The current action context.
     * @param actionName    The name of the action being executed.
     * @param actionConfig  The action configuration associated with the action.
     * @param resultCode    The result code being executed.
     * @return A result representing the result of the unknown result handling.
     */
    Result handleUnknownResult(ActionContext actionContext, String actionName, ActionConfig actionConfig, String resultCode);

    /**
     * Tries to handle passed methodName if cannot find method should re
     *
     * @param action Action's instance
     * @param methodName method name to handle
     * @return Result representing result of given action method
     * @throws NoSuchMethodException if method can be handled by defined UnknownHandlers
     */
    Object handleUnknownMethod(Object action, String methodName) throws NoSuchMethodException;

    /**
     * Attempts to handle an unknown action with the given namespace and name.
     *
     * @param namespace The namespace of the unknown action.
     * @param actionName The name of the unknown action.
     * @return The resulting action configuration if the action was successfully handled.
     */
    ActionConfig handleUnknownAction(String namespace, String actionName);

    /**
     * Checks whether there are any registered {@link UnknownHandler UnknownHandlers} configured.
     *
     * @return {@code true} if there are any unknown handlers, {@code false} otherwise.
     */
    boolean hasUnknownHandlers();

    /**
     * Gets a list of all {@link UnknownHandler UnknownHandlers} registered.
     *
     * @return An immutable list of registered unknown handlers.
     */
    List<UnknownHandler> getUnknownHandlers();

}
