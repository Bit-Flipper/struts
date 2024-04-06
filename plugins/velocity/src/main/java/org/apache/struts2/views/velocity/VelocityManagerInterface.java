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
package org.apache.struts2.views.velocity;

import com.opensymphony.xwork2.util.ValueStack;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.Context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @since 6.4.0
 */
public interface VelocityManagerInterface {

    /**
     * Creates a Velocity context with the given parameters.
     *
     * @param stack the ValueStack instance containing the data
     * @param req the HttpServletRequest instance
     * @param res the HttpServletResponse instance
     * @return a Context instance
     */
    Context createContext(ValueStack stack, HttpServletRequest req, HttpServletResponse res);

    /**
     * Returns the VelocityEngine instance.
     *
     * @return the VelocityEngine instance
     */
    VelocityEngine getVelocityEngine();

    /**
     * Initializes the Velocity manager.
     *
     * @param context the ServletContext instance
     */
    void init(ServletContext context);
}
