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
package org.apache.struts2.config;

import java.util.List;
import java.util.Optional;

import org.apache.struts2.config.entities.BeanConfig;
import org.apache.struts2.config.entities.BeanSelectionConfig;
import org.apache.struts2.config.entities.ConstantConfig;

public interface StrutsJavaConfiguration {
    /**
     * <p>Gets the list of bean configurations.</p>
     * 
     * @return a list of {@link BeanConfig} instances.
     */
    List<BeanConfig> beans();

    /**
     * <p>Gets the list of constant configurations.</p>
     * 
     * @return a list of {@link ConstantConfig} instances.
     */
    List<ConstantConfig> constants();

    /**
     * <p>Gets the bean selection configuration.</p>
     * 
     * @return an {@link Optional} of {@link BeanSelectionConfig} instances.
     */
    default Optional<BeanSelectionConfig> beanSelection() { return Optional.empty();}

    /**
     * <p>Gets the unknown handler stack configurations.</p>
     * 
     * @return a list of strings representing unknown handler stack configurations.
     */
    List<String> unknownHandlerStack();
}
