/*
 * $Id$
 *
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
package org.apache.struts2.showcase.application;

import org.apache.struts2.showcase.exception.CreateException;
import org.apache.struts2.showcase.exception.StorageException;
import org.apache.struts2.showcase.exception.UpdateException;
import org.apache.struts2.showcase.model.IdEntity;

import java.io.Serializable;
import java.util.Collection;

/**
 * Storage. Interface.
 */

public interface Storage extends Serializable {
	/**
	 * Retrieves a single entity from the storage system by its class and id.
	 *
	 * @param entityClass The class of the entity to retrieve.
	 * @param id The id of the entity to retrieve.
	 * @return The entity with the given class and id, or null if no such entity exists.
	 * @throws CreateException if there was an error retrieving the entity.
	 */
	IdEntity get(Class entityClass, Serializable id);

	/**
	 * Creates a new entity in the storage system and returns its id.
	 *
	 * @param object The entity to create.
	 * @return The id of the created entity.
	 * @throws CreateException if there was an error creating the entity.
	 */
	Serializable create(IdEntity object) throws CreateException;

	/**
	 * Updates an existing entity in the storage system.
	 *
	 * @param object The entity to update.
	 * @throws UpdateException if there was an error updating the entity.
	 */
	IdEntity update(IdEntity object) throws UpdateException;

	/**
	 * Merges an entity with the storage system.
	 *
	 * @param object The entity to merge.
	 * @throws StorageException if there was an error merging the entity.
	 */
	Serializable merge(IdEntity object) throws StorageException;

	/**
	 * Deletes an entity from the storage system by its class and id.
	 *
	 * @param entityClass The class of the entity to delete.
	 * @param id The id of the entity to delete.
	 * @return The number of entities deleted.
	 * @throws CreateException if there was an error deleting the entity.
	 */
	int delete(Class entityClass, Serializable id) throws CreateException;

	/**
	 * Deletes an entity from the storage system by its id entity.
	 *
	 * @param object The entity to delete.
	 * @return The number of entities deleted.
	 * @throws CreateException if there was an error deleting the entity.
	 */
	int delete(IdEntity object) throws CreateException;

	/**
	 * Retrieves all entities of a given class from the storage system.
	 *
	 * @param entityClass The class of the entities to retrieve.
	 * @return A collection of all entities of the given class.
	 */
	Collection findAll(Class entityClass);
}
