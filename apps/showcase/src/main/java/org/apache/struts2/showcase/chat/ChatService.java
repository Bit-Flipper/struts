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
	 * <p>Returns the list of users available for chat.</p>
	 *
	 * @return the list of users available for chat
	 */
	List<User> getAvailableUsers();

	/**
	 * <p>Logs in the user.</p>
	 *
	 * @param user the user to be logged in
	 */
	void login(User user);

	/**
	 * <p>Logs out the user.</p>
	 *
	 * @param name the name of the user to be logged out
	 */
	void logout(String name);

	/**
	 * <p>Returns the list of available rooms for chat.</p>
	 *
	 * @return the list of available rooms for chat
	 */
	List<Room> getAvailableRooms();

	/**
	 * <p>Adds a new room for chat.</p>
	 *
	 * @param room the new room to be added
	 */
	void addRoom(Room room);

	/**
	 * <p>Enters the user into the room specified by the given room name.</p>
	 *
	 * @param user the user to be entered into the room
	 * @param roomName the name of the room for the user to enter
	 */
	void enterRoom(User user, String roomName);

	/**
	 * <p>Exits the user from the room specified by the given room name.</p>
	 *
	 * @param userName the name of the user to be exited from the room
	 * @param roomName the name of the room from which the user is to be exited
	 */
	void exitRoom(String userName, String roomName);

	/**
	 * <p>Returns the list of chat messages in the room specified by the given room name.</p>
	 *
	 * @param roomName the name of the room for which the chat messages are to be retrieved
	 * @return the list of chat messages in the given room
	 */
	List<ChatMessage> getMessagesInRoom(String roomName);

	/**
	 * <p>Sends the given message from the user to the room specified by the given room name.</p>
	 *
	 * @param roomName the name of the room for which the message is to be sent
	 * @param user the user sending the message
	 * @param message the message to be sent
	 */
	void sendMessageToRoom(String roomName, User user, String message);

	/**
	 * <p>Returns the list of users available in the room specified by the given room name.</p>
	 *
	 * @param roomName the name of the room for which the users are to be retrieved
	 * @return the list of users in the given room
	 */
	List<User> getUsersAvailableInRoom(String roomName);
}
