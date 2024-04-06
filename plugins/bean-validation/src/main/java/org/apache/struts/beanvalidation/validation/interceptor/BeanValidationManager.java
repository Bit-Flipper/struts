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
package org.apache.struts.beanvalidation.validation.interceptor;

import javax.validation.Validator;

/**
 * <p>
 * Validation manager which is responsible for providing instance of {@link Validator} based on the underlying validation provider.
 * For any JSR303 complaint implementation, {@link Validator} should be implemented in thread safe way.
 * </p>
 */
public interface BeanValidationManager {

    /**
     * <p>
     * Method to return Validator instance.This will take in to account the provider class will try to create a validation factory from given Validator. Validator will be returned based on the user preference.Validator will be created based on the following cases.
     * </p>
     * <p>
     * In case user has specify explicitly and in a type safe fashion the expected provider, it will be used to create validation factory from given Validator and an instance of javax.validation.Validator will be returned.
     * </p>
     * <p>
     * In this case, the default validation provider resolver will be used to locate available providers. The chosen provider is defined as followed:
     * </p>
     * <ul>
     * <li>if the XML configuration defines a provider, this provider is used</li>
     * <li>if the XML configuration does not define a provider or if no XML configuration is present the first provider returned by the ValidationProviderResolver instance is used.</li>
     * </ul>
     *
     * @return validator instance
     * @see Validation
     * @see ValidationProviderResolver
     */
    Validator getValidator();
}
