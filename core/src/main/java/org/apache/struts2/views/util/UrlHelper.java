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
package org.apache.struts2.views.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Helper class used to build Urls or parse request params
 */
public interface UrlHelper {

    /**
     * Default HTTP port (80).
     */
    int DEFAULT_HTTP_PORT = 80;

    /**
     * Default HTTPS port (443).
     */
    int DEFAULT_HTTPS_PORT = 443;

    String AMP = "&amp;";

    /**
     * {@inheritDoc}
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params);

    /**
     * {@inheritDoc}
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult);

    /**
     * {@inheritDoc}
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult, boolean forceAddSchemeHostAndPort);

    /**
     * Builds the URL with all available options
     *
     * @param action              the action to be executed
     * @param request              the current request
     * @param response             the current response
     * @param params              a mapping of parameters to be added to the URL
     * @param scheme              the URL scheme to be used. Can be http, https or null
     * @param includeContext       whether to include the context path or not
     * @param encodeResult         whether to URL encode the result or not
     * @param forceAddSchemeHostAndPort whether to force adding the scheme, host and port to result
     * @param escapeAmp           whether to replace & with &amp; in result
     * @return the URL with the included parameters
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult, boolean forceAddSchemeHostAndPort, boolean escapeAmp);

}
