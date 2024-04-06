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
package com.opensymphony.xwork2.interceptor.annotations;

public interface InterfaceAnnotatedAction {
    /**
       * Method annotated with {@link Before} annotation with default priority.
       * This method will be executed before any action is executed.
       *
       * @return {@code null}
       */
      @Before
    String interfaceBefore();

    /**
       * Method annotated with {@link BeforeResult} annotation with a priority of 3.
       * This method will be executed before the result of the action is executed.
       */
      @BeforeResult(priority=3)
    void interfaceBeforeResult();

    /**
       * Method annotated with {@link After} annotation with a priority of 3.
       * This method will be executed after the action is executed and before the
       * result of the action is executed.
       */
      @After(priority=3)
    void interfaceAfter();
}
