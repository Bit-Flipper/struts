/*
 * Copyright 2022 Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opensymphony.xwork2.ognl;

/**
 * A basic cache interface for use with OGNL processing (such as Expression, BeanInfo).
 * All OGNL caches will have an eviction limit, but setting an extremely high value can
 * simulate an "effectively unlimited" cache.
 *
 * @param <Key> The type for the cache key entries
 * @param <Value> The type for the cache value entries
 */
public interface OgnlCache<Key, Value> {

    /**
     * Returns the value associated with the key, or {@code null} if there is no such key.
     *
     * @param key the key
     * @return the value associated with the key, or {@code null} if there is no such key
     */
    Value get(Key key);

    /**
     * Associates the key with the value in the cache.
     *
     * @param key   the key
     * @param value the value
     */
    void put(Key key, Value value);

    /**
     * If the specified key is not already associated with a value, associates it with the given value.
     * Returns {@code true} if the new key-value pair was added to the cache.
     *
     * @param key   the key
     * @param value the value
     * @return {@code true} if the new key-value pair was added to the cache
     */
    void putIfAbsent(Key key, Value value);

    /**
     * Returns the number of key-value mappings in the cache.
     *
     * @return the number of key-value mappings in the cache
     */
    int size();

    /**
     * Removes all mappings from this cache.
     */
    void clear();

    /**
     * Returns the eviction limit for this cache.
     *
     * @return the eviction limit for this cache
     */
    int getEvictionLimit();

    /**
     * Sets the eviction limit for this cache. An eviction limit of 0, or less than 0, implies no limit.
     *
     * @param cacheEvictionLimit the new eviction limit
     */
    void setEvictionLimit(int cacheEvictionLimit);
}
