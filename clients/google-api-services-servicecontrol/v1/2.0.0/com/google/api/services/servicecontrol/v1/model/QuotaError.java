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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Represents error information for QuotaOperation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuotaError extends com.google.api.client.json.GenericJson {

  /**
   * Error code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Free-form text that provides details on the cause of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Contains additional information about the quota error. If available, `status.code` will be non
   * zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * Subject to whom this error applies. See the specific enum for more details on this field. For
   * example, "clientip:" or "project:".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subject;

  /**
   * Error code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Error code.
   * @param code code or {@code null} for none
   */
  public QuotaError setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Free-form text that provides details on the cause of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Free-form text that provides details on the cause of the error.
   * @param description description or {@code null} for none
   */
  public QuotaError setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Contains additional information about the quota error. If available, `status.code` will be non
   * zero.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Contains additional information about the quota error. If available, `status.code` will be non
   * zero.
   * @param status status or {@code null} for none
   */
  public QuotaError setStatus(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Subject to whom this error applies. See the specific enum for more details on this field. For
   * example, "clientip:" or "project:".
   * @return value or {@code null} for none
   */
  public java.lang.String getSubject() {
    return subject;
  }

  /**
   * Subject to whom this error applies. See the specific enum for more details on this field. For
   * example, "clientip:" or "project:".
   * @param subject subject or {@code null} for none
   */
  public QuotaError setSubject(java.lang.String subject) {
    this.subject = subject;
    return this;
  }

  @Override
  public QuotaError set(String fieldName, Object value) {
    return (QuotaError) super.set(fieldName, value);
  }

  @Override
  public QuotaError clone() {
    return (QuotaError) super.clone();
  }

}
