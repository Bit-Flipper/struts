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
package org.apache.struts2.osgi;

import org.apache.struts2.osgi.host.OsgiHost;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

public interface BundleAccessor {

    String CURRENT_BUNDLE_NAME = "__bundle_name__";

    /**
     * Loads a class by its name.
     * 
     * This method loads a class by its name, throwing a `ClassNotFoundException` if the class cannot be found.
     * 
     * @param name the name of the class to load
     * @return the class with the given name
     * @throws ClassNotFoundException if the class cannot be found
     */
    Class loadClass(String name) throws ClassNotFoundException;

    /**
     * Loads a resource as an input stream.
     * 
     * This method loads a resource with the given name as an input stream.
     * 
     * @param name the name of the resource to load
     * @return an input stream for the resource with the given name, or `null` if the resource cannot be found
     * @throws IOException if an I/O error occurs
     */
    InputStream loadResourceAsStream(String name) throws IOException;

    /**
     * Loads a resource from all bundles as an input stream.
     * 
     * This method loads a resource with the given name from all bundles as an input stream.
     * 
     * @param name the name of the resource to load
     * @return an input stream for the resource with the given name from all bundles, or `null` if the resource cannot be found
     * @throws IOException if an I/O error occurs
     */
    InputStream loadResourceFromAllBundlesAsStream(String name) throws IOException;

    /**
     * Loads a resource from all bundles.
     * 
     * This method loads a resource with the given name from all bundles.
     * 
     * @param name the name of the resource to load
     * @return a URL for the resource with the given name from all bundles, or `null` if the resource cannot be found
     * @throws IOException if an I/O error occurs
     */
    URL loadResourceFromAllBundles(String name) throws IOException;

    /**
     * Gets the packages by bundle.
     * 
     * This method gets the packages by the given bundle.
     * 
     * @param bundle the bundle to get the packages for
     * @return a set of package names for the given bundle
     */
    Set<String> getPackagesByBundle(Bundle bundle);

    /**
     * Gets the service for a service reference.
     * 
     * This method gets the service for the given service reference.
     * 
     * @param ref the service reference to get the service for
     * @return the service for the given service reference, or `null` if the service reference is `null` or the service cannot be found
     */
    Object getService(ServiceReference ref);

    /**
     * Gets the service reference for a class name.
     * 
     * This method gets the service reference for the given class name.
     * 
     * @param className the name of the class to get the service reference for
     * @return the service reference for the given class name, or `null` if the class name is `null` or the service reference cannot be found
     */
    ServiceReference getServiceReference(String className);

    /**
     * Gets the service references for a class name and parameters.
     * 
     * This method gets the service references for the given class name and parameters.
     * 
     * @param className the name of the class to get the service references for
     * @param params the parameters for the service references
     * @return an array of service references for the given class name and parameters, or `null` if the class name or parameters are `null` or no service references can be found
     * @throws InvalidSyntaxException if the syntax of the class name or parameters is invalid
     */
    ServiceReference[] getServiceReferences(String className, String params) throws InvalidSyntaxException;

    /**
     * Gets all service references for a class name.
     * 
     * This method gets all service references for the given class name.
     * 
     * @param className the name of the class to get the service references for
     * @return an array of service references for the given class name, or `null` if the class name is `null` or no service references can be found
     * @throws InvalidSyntaxException if the syntax of the class name is invalid
     */
    public ServiceReference[] getAllServiceReferences(String className);

    /**
     * Adds a package from a bundle.
     * 
     * This method adds a package from the given bundle.
     * 
     * @param bundle the bundle to add the package from
     * @param packageName the name of the package to add
     */
    void addPackageFromBundle(Bundle bundle, String packageName);

    /**
     * Sets the bundle context.
     * 
     * This method sets the bundle context.
     * 
     * @param bundleContext the bundle context to set
     */
    void setBundleContext(BundleContext bundleContext);

    /**
     * Sets the OSGi host.
     * 
     * This method sets the OSGi host.
     * 
     * @param osgiHost the OSGi host to set
     */
    void setOsgiHost(OsgiHost osgiHost);

}
