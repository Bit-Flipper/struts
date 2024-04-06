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
package org.apache.struts2.dispatcher.multipart;

import java.io.Serializable;

/**
 * Virtual representation of a uploaded file used by {@link MultiPartRequest}
 */
public interface UploadedFile extends Serializable {

    /**
     * Returns the length of this uploaded file, measured in bytes.
     *
     * @return length of this uploaded file
     * @see #length()
     */
    Long length();

    /**
     * Returns the name of this file which will be used on the server, only if it's a file.
     * If it's not a file, returns an empty string.
     *
     * @return name of this file which will be used on the server
     * @see #getAbsolutePath()
     */
    String getName();

    /**
     * Returns the name of this file on the client machine which sent this file.
     * It can be different from the name specified by the {@code filename} parameter of the HTML form.
     *
     * @return name of this file on the client machine which sent this file
     * @see #getName()
     */
    String getOriginalName();

    /**
     * Returns {@code true} if, and only if, this uploaded file is a file.
     * Returns {@code false} otherwise.
     *
     * @return {@code true} if, and only if, this uploaded file is a file
     * @see #isFile()
     */
    boolean isFile();

    /**
     * Deletes this uploaded file from the server.
     * After invoking this method, you won't be able to invoke {@code #getContent()} or any other method of
     * this interface.
     *
     * @return {@code true} if, and only if, the file was deleted successfully
     * @see #delete()
     */
    boolean delete();

    /**
     * Returns the absolute path of this uploaded file.
     * Returns an empty string if, and only if, this uploaded file is not a file.
     *
     * @return  absolute path of this uploaded file
     * @see #getName()
     */
    String getAbsolutePath();

    /**
     * Returns the content of this uploaded file.
     * Returns {@code null} if, and only if, this uploaded file is not a file.
     *
     * @return content of this uploaded file
     * @see #getContent()
     */
    Object getContent();

    /**
     * Returns the content type of this uploaded file.
     * Returns {@code null} if, and only if, the type of the file couldn't be determined.
     *
     * @return content type of this uploaded file
     * @see #getContentType()
     */
    String getContentType();

}
