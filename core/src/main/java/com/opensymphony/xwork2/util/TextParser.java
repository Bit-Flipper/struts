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
package com.opensymphony.xwork2.util;

/**
 * Used to parse expressions like ${foo.bar} or %{bar.foo} but it is up tp the TextParser's
 * implementation what kind of opening char to use (#, $, %, etc)
 */
public interface TextParser {

    int DEFAULT_LOOP_COUNT = 1;

    /**
     * <p>
     * Evaluates and parses the given expression using the specified opening character(s), {@link TextParseUtil.ParsedValueEvaluator},
     * and maximum loop count.
     * </p>
     * 
     * @param openChars the opening character(s) for the expression
     * @param expression the expression to parse and evaluate in the form of ${foo.bar} or %{bar.foo}
     * @param evaluator the {@link TextParseUtil.ParsedValueEvaluator} used to parse the expression
     * @param maxLoopCount the maximum number of times the expression can be looped
     * @return an {@link Object} containing the result of the parsed and evaluated expression
     * @since 2.3.30
     */
    Object evaluate(char[] openChars, String expression, TextParseUtil.ParsedValueEvaluator evaluator, int maxLoopCount);

}
