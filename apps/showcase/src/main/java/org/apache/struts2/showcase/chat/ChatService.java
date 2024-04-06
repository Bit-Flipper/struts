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
package org.apache.struts2.showcase.chat;

import java.util.List;

public interface ChatService {
	/**
	 * <p>
	 * Returns a list of all available users.
	 * </p>
	 *
	 * @return a list of all available users.
	 */
	List<User> getAvailableUsers();

	/**
	 * <p>
	 * Logs a user into the chat application.
	 * </p>
	 *
	 * @param user the user to be logged in.
	 */
	void login(User user);

	/**
	 * <p>
	 * Logs a user out of the chat application.
	 * </p>
	 *
	 * @param name the name of the user to be logged out.
	 */
	void logout(String name);

	/**
	 * <p>
	 * Returns a list of all available rooms.
	 * </p>
	 *
	 * @return a list of all available rooms.
	 */
	List<Room> getAvailableRooms();

	/**
	 * <p>
	 * Adds a new room to the chat application.
	 * </p>
	 *
	 * @param room the new room to be added.
	 */
	void addRoom(Room room);

	/**
	 * <p>
	 * Allows a user to enter a room.
	 * </p>
	 *
	 * @param user the user who wants to enter the room.
	 * @param roomName the name of the room to be entered.
	 */
	void enterRoom(User user, String roomName);

	/**
	 * <p>
	 * Allows a user to exit a room.
	 * </p>
	 *
	 * @param userName the name of the user who wants to exit the room.
	 * @param roomName the name of the room to be exited.
	 */
	void exitRoom(String userName, String roomName);

	/**
	 * <p>
	 * Returns a list of all messages in a room.
	 * </p>
	 *
	 * @param roomName the name of the room to get the messages from.
	 * @return a list of all messages in the specified room.
	 */
	List<ChatMessage> getMessagesInRoom(String roomName);

	/**
	 * <p>
	 * Sends a message to a room.
	 * </p>
	 *
	 * @param roomName the name of the room to send the message to.
	 * @param user the user who sent the message.
	 * @param message the message to be sent.
	 */
	void sendMessageToRoom(String roomName, User user, String message);

	/**
	 * <p>
	 * Returns a list of all users in a room.
	 * </p>
	 *
	 * @param roomName the name of the room to get the users from.
	 * @return a list of all users in the specified room.
	 */
	List<User> getUsersAvailableInRoom(String roomName);
}
