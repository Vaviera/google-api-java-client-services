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
 * Google Chat events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeprecatedEvent extends com.google.api.client.json.GenericJson {

  /**
   * The form action data associated with an interactive card that was clicked. Only populated for
   * CARD_CLICKED events. See the [Interactive Cards guide](/chat/how-tos/cards-onclick) for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FormAction action;

  /**
   * The URL the bot should redirect the user to after they have completed an authorization or
   * configuration flow outside of Google Chat. See the [Authorizing access to 3p services
   * guide](/chat/how-tos/auth-3p) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configCompleteRedirectUrl;

  /**
   * The timestamp indicating when the event was dispatched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * The message that triggered the event, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Message message;

  /**
   * The room or DM in which the event occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Space space;

  /**
   * The bot-defined key for the thread related to the event. See the thread_key field of the
   * `spaces.message.create` request for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threadKey;

  /**
   * A secret value that bots can use to verify if a request is from Google. The token is randomly
   * generated by Google, remains static, and can be obtained from the Google Chat API configuration
   * page in the Cloud Console. Developers can revoke/regenerate it if needed from the same page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * The type of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The user that triggered the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * The form action data associated with an interactive card that was clicked. Only populated for
   * CARD_CLICKED events. See the [Interactive Cards guide](/chat/how-tos/cards-onclick) for more
   * information.
   * @return value or {@code null} for none
   */
  public FormAction getAction() {
    return action;
  }

  /**
   * The form action data associated with an interactive card that was clicked. Only populated for
   * CARD_CLICKED events. See the [Interactive Cards guide](/chat/how-tos/cards-onclick) for more
   * information.
   * @param action action or {@code null} for none
   */
  public DeprecatedEvent setAction(FormAction action) {
    this.action = action;
    return this;
  }

  /**
   * The URL the bot should redirect the user to after they have completed an authorization or
   * configuration flow outside of Google Chat. See the [Authorizing access to 3p services
   * guide](/chat/how-tos/auth-3p) for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigCompleteRedirectUrl() {
    return configCompleteRedirectUrl;
  }

  /**
   * The URL the bot should redirect the user to after they have completed an authorization or
   * configuration flow outside of Google Chat. See the [Authorizing access to 3p services
   * guide](/chat/how-tos/auth-3p) for more information.
   * @param configCompleteRedirectUrl configCompleteRedirectUrl or {@code null} for none
   */
  public DeprecatedEvent setConfigCompleteRedirectUrl(java.lang.String configCompleteRedirectUrl) {
    this.configCompleteRedirectUrl = configCompleteRedirectUrl;
    return this;
  }

  /**
   * The timestamp indicating when the event was dispatched.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The timestamp indicating when the event was dispatched.
   * @param eventTime eventTime or {@code null} for none
   */
  public DeprecatedEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The message that triggered the event, if applicable.
   * @return value or {@code null} for none
   */
  public Message getMessage() {
    return message;
  }

  /**
   * The message that triggered the event, if applicable.
   * @param message message or {@code null} for none
   */
  public DeprecatedEvent setMessage(Message message) {
    this.message = message;
    return this;
  }

  /**
   * The room or DM in which the event occurred.
   * @return value or {@code null} for none
   */
  public Space getSpace() {
    return space;
  }

  /**
   * The room or DM in which the event occurred.
   * @param space space or {@code null} for none
   */
  public DeprecatedEvent setSpace(Space space) {
    this.space = space;
    return this;
  }

  /**
   * The bot-defined key for the thread related to the event. See the thread_key field of the
   * `spaces.message.create` request for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreadKey() {
    return threadKey;
  }

  /**
   * The bot-defined key for the thread related to the event. See the thread_key field of the
   * `spaces.message.create` request for more information.
   * @param threadKey threadKey or {@code null} for none
   */
  public DeprecatedEvent setThreadKey(java.lang.String threadKey) {
    this.threadKey = threadKey;
    return this;
  }

  /**
   * A secret value that bots can use to verify if a request is from Google. The token is randomly
   * generated by Google, remains static, and can be obtained from the Google Chat API configuration
   * page in the Cloud Console. Developers can revoke/regenerate it if needed from the same page.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * A secret value that bots can use to verify if a request is from Google. The token is randomly
   * generated by Google, remains static, and can be obtained from the Google Chat API configuration
   * page in the Cloud Console. Developers can revoke/regenerate it if needed from the same page.
   * @param token token or {@code null} for none
   */
  public DeprecatedEvent setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  /**
   * The type of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the event.
   * @param type type or {@code null} for none
   */
  public DeprecatedEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The user that triggered the event.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * The user that triggered the event.
   * @param user user or {@code null} for none
   */
  public DeprecatedEvent setUser(User user) {
    this.user = user;
    return this;
  }

  @Override
  public DeprecatedEvent set(String fieldName, Object value) {
    return (DeprecatedEvent) super.set(fieldName, value);
  }

  @Override
  public DeprecatedEvent clone() {
    return (DeprecatedEvent) super.clone();
  }

}
