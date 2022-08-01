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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of an alert.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Alert extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The localized alert message. This may contain HTML markup, such as phrase elements
   * or links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Output only. Resource name of the alert. Format: accounts/{account}/alerts/{alert}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Severity of this alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Output only. Type of alert. This identifies the broad type of this alert, and provides a stable
   * machine-readable identifier that will not be translated. For example, "payment-hold".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The localized alert message. This may contain HTML markup, such as phrase elements
   * or links.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Output only. The localized alert message. This may contain HTML markup, such as phrase elements
   * or links.
   * @param message message or {@code null} for none
   */
  public Alert setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Output only. Resource name of the alert. Format: accounts/{account}/alerts/{alert}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the alert. Format: accounts/{account}/alerts/{alert}
   * @param name name or {@code null} for none
   */
  public Alert setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Severity of this alert.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Output only. Severity of this alert.
   * @param severity severity or {@code null} for none
   */
  public Alert setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Output only. Type of alert. This identifies the broad type of this alert, and provides a stable
   * machine-readable identifier that will not be translated. For example, "payment-hold".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. Type of alert. This identifies the broad type of this alert, and provides a stable
   * machine-readable identifier that will not be translated. For example, "payment-hold".
   * @param type type or {@code null} for none
   */
  public Alert setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Alert set(String fieldName, Object value) {
    return (Alert) super.set(fieldName, value);
  }

  @Override
  public Alert clone() {
    return (Alert) super.clone();
  }

}
