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

package com.google.api.services.bigquery.model;

/**
 * Error details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorProto extends com.google.api.client.json.GenericJson {

  /**
   * Debugging information. This property is internal to Google and should not be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String debugInfo;

  /**
   * Specifies where the error occurred, if present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * A human-readable description of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * A short error code that summarizes the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Debugging information. This property is internal to Google and should not be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getDebugInfo() {
    return debugInfo;
  }

  /**
   * Debugging information. This property is internal to Google and should not be used.
   * @param debugInfo debugInfo or {@code null} for none
   */
  public ErrorProto setDebugInfo(java.lang.String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * Specifies where the error occurred, if present.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Specifies where the error occurred, if present.
   * @param location location or {@code null} for none
   */
  public ErrorProto setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * A human-readable description of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * A human-readable description of the error.
   * @param message message or {@code null} for none
   */
  public ErrorProto setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * A short error code that summarizes the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * A short error code that summarizes the error.
   * @param reason reason or {@code null} for none
   */
  public ErrorProto setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public ErrorProto set(String fieldName, Object value) {
    return (ErrorProto) super.set(fieldName, value);
  }

  @Override
  public ErrorProto clone() {
    return (ErrorProto) super.clone();
  }

}
