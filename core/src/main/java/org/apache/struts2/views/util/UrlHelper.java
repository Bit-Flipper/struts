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
     * <p>
     * Builds a URL from the given action, request, response and params.<br>
     * The scheme, context path, host and port are taken from the request.<br>
     * The params will be added with the '&' separator.<br>
     * The final URL will not include any querystring from the request.<br>
     * </p>
     *
     * @param action       The action to build the URL for.
     * @param request      The request to take the scheme, context path, host and port from.
     * @param response     The response.
     * @param params       The params to append to the URL.
     *
     * @return A string representing the built URL.
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params);

    /**
     * <p>
     * Builds a URL from the given action, request, response, params, scheme, includeContext, encodeResult.<br>
     * The scheme, context path, host and port are taken from the request or provided as parameters.<br>
     * The params will be added with the '&' separator.<br>
     * The final URL will not include any querystring from the request.<br>
     * </p>
     *
     * @param action       The action to build the URL for.
     * @param request      The request to take the scheme, context path, host and port from.
     * @param response     The response.
     * @param params       The params to append to the URL.
     * @param scheme       The scheme to use. If null then the scheme is taken from the request.
     * @param includeContext Whether to include the context path or not.
     * @param encodeResult Whether to encode the result or not.
     *
     * @return A string representing the built URL.
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult);

    /**
     * <p>
     * Builds a URL from the given action, request, response, params, scheme, includeContext, encodeResult, forceAddSchemeHostAndPort.<br>
     * The scheme, context path, host and port are taken from the request or provided as parameters.<br>
     * The params will be added with the '&' separator.<br>
     * If forceAddSchemeHostAndPort is true, the scheme, host and port will be added to the URL even if they are already present.<br>
     * The final URL will not include any querystring from the request.<br>
     * </p>
     *
     * @param action       The action to build the URL for.
     * @param request      The request to take the scheme, context path, host and port from.
     * @param response     The response.
     * @param params       The params to append to the URL.
     * @param scheme       The scheme to use. If null then the scheme is taken from the request.
     * @param includeContext Whether to include the context path or not.
     * @param encodeResult Whether to encode the result or not.
     * @param forceAddSchemeHostAndPort Whether to force add the scheme, host and port to the URL even if they are already present.
     *
     * @return A string representing the built URL.
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult, boolean forceAddSchemeHostAndPort);

    /**
     * <p>
     * Builds a URL from the given action, request, response, params, scheme, includeContext, encodeResult,
     * forceAddSchemeHostAndPort, escapeAmp.<br>
     * The scheme, context path, host and port are taken from the request or provided as parameters.<br>
     * The params will be added with the '&' separator.<br>
     * If forceAddSchemeHostAndPort is true, the scheme, host and port will be added to the URL even if they are already present.<br>
     * If escapeAmp is true, the '&' character will be escaped ('&amp;') in the final URL.<br>
     * The final URL will not include any querystring from the request.<br>
     * </p>
     *
     * @param action       The action to build the URL for.
     * @param request      The request to take the scheme, context path, host and port from.
     * @param response     The response.
     * @param params       The params to append to the URL.
     * @param scheme       The scheme to use. If null then the scheme is taken from the request.
     * @param includeContext Whether to include the context path or not.
     * @param encodeResult Whether to encode the result or not.
     * @param forceAddSchemeHostAndPort Whether to force add the scheme, host and port to the URL even if they are already present.
     * @param escapeAmp    Whether to escape the '&' character ('&amp;') in the final URL or not.
     *
     * @return A string representing the built URL.
     */
    String buildUrl(String action, HttpServletRequest request, HttpServletResponse response, Map<String, Object> params, String scheme,
                    boolean includeContext, boolean encodeResult, boolean forceAddSchemeHostAndPort, boolean escapeAmp);

}
