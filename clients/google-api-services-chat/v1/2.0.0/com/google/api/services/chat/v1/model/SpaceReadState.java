/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chat.v1.model;

/**
 * A user's read state within a space, used to identify read and unread messages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpaceReadState extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The time when the user's space read state was updated. Usually this corresponds with
   * either the timestamp of the last read message, or a timestamp specified by the user to mark the
   * last read position in a space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastReadTime;

  /**
   * Resource name of the space read state. Format: `users/{user}/spaces/{space}/spaceReadState`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The time when the user's space read state was updated. Usually this corresponds with
   * either the timestamp of the last read message, or a timestamp specified by the user to mark the
   * last read position in a space.
   * @return value or {@code null} for none
   */
  public String getLastReadTime() {
    return lastReadTime;
  }

  /**
   * Optional. The time when the user's space read state was updated. Usually this corresponds with
   * either the timestamp of the last read message, or a timestamp specified by the user to mark the
   * last read position in a space.
   * @param lastReadTime lastReadTime or {@code null} for none
   */
  public SpaceReadState setLastReadTime(String lastReadTime) {
    this.lastReadTime = lastReadTime;
    return this;
  }

  /**
   * Resource name of the space read state. Format: `users/{user}/spaces/{space}/spaceReadState`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the space read state. Format: `users/{user}/spaces/{space}/spaceReadState`
   * @param name name or {@code null} for none
   */
  public SpaceReadState setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public SpaceReadState set(String fieldName, Object value) {
    return (SpaceReadState) super.set(fieldName, value);
  }

  @Override
  public SpaceReadState clone() {
    return (SpaceReadState) super.clone();
  }

}
