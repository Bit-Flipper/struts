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
     * Returns a list of {@link BeanConfig} objects that define the beans used in the Struts application.
     *
     * @return a list of {@link BeanConfig} objects
     * @see BeanConfig
     */
    List<BeanConfig> beans();

    /**
     * Returns a list of {@link ConstantConfig} objects that define the constants used in the Struts application.
     *
     * @return a list of {@link ConstantConfig} objects
     * @see ConstantConfig
     */
    List<ConstantConfig> constants();

    /**
     * Returns an {@link Optional} containing a {@link BeanSelectionConfig} object that defines the strategy for selecting
     * a bean based on a specified name.
     *
     * <p>
     * If no bean selection strategy is defined, this method returns an empty {@link Optional}.
     * </p>
     *
     * @return an {@link Optional} containing a {@link BeanSelectionConfig} object
     * @see BeanSelectionConfig
     */
    default Optional<BeanSelectionConfig> beanSelection() { return Optional.empty();}

    /**
     * Returns a list of strings that define the unknown handler stacks used in the Struts application.
     *
     * <p>
     * An unknown handler stack is used to handle any actions that are not explicitly defined in the Struts configuration.
     * </p>
     *
     * @return a list of strings defining the unknown handler stacks
     */
    List<String> unknownHandlerStack();
}
