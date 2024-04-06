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
     * Evaluates the given {@code expression} within the context of the given
     * {@link TextParseUtil.ParsedValueEvaluator}.
     * <p>
     * This implementation specifically supports expressions that are opened with a
     * character from the {@code openChars} array, and contain sub-expressions
     * enclosed in curly braces (i.e. {@code {...}}).
     * </p>
     *
     * @param openChars    the set of characters that can open an expression
     * @param expression  the expression to evaluate
     * @param evaluator    the evaluator to use for resolving variables in the expression
     * @param maxLoopCount the maximum number of loops to allow when evaluating the expression
     * @return the result of evaluating the expression
     */
    Object evaluate(char[] openChars, String expression, TextParseUtil.ParsedValueEvaluator evaluator, int maxLoopCount);

}
