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
package org.apache.struts2.portlet.action;

import javax.portlet.PortletRequest;

/**
 * @since 6.0.0
 */
public interface PortletRequestAware {

    /**
     * <p>
     * Updates the internal state with the given {@link PortletRequest}.
     * </p>
     *
     * <p>
     * Implementations must store the portlet request <strong>only</strong> for use during the current request.
     * Implementors <strong>must not</strong> store the portlet request for use in a subsequent request
     * or store it in a long-lived object or cache.
     * </p>
     *
     * @param request the {@link PortletRequest} to update the internal state
     */
    void withPortletRequest(PortletRequest request);

}
