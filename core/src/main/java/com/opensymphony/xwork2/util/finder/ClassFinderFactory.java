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
package com.opensymphony.xwork2.util.finder;

import java.net.URL;
import java.util.Collection;
import java.util.Set;

/**
 * Allows create different ClassFinders which should help support different Java versions
 */
public interface ClassFinderFactory {

    /**
     * Creates a new {@link ClassFinder} instance using a specified {@link ClassLoaderInterface}, a collection of URLs, a flag indicating
     * whether or not to extract base interfaces, a set of protocols to include in the search, and a test for filtering class names.
     *
     * @param classLoaderInterface A {@link ClassLoaderInterface} that will be used to load classes that are found by the {@link ClassFinder}.
     * @param urls A collection of URLs representing the classpath.
     * @param extractBaseInterfaces A flag indicating whether or not to extract base interfaces from the classes that are found.
     * @param protocols A set of protocols to include in the search. Only classes with the specified protocols will be considered.
     * @param classNameFilter A test for filtering class names. Only classes with names that pass the test will be considered.
     * @return A new {@link ClassFinder} instance.
     */
    ClassFinder buildClassFinder(ClassLoaderInterface classLoaderInterface, Collection<URL> urls, boolean extractBaseInterfaces, Set<String> protocols, Test<String> classNameFilter);

}
