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

package com.google.api.services.apigee.v1.model;

/**
 * Response for certain delete operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeleteResponse extends com.google.api.client.json.GenericJson {

  /**
   * Unique error code for the request, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * Google Cloud name of deleted resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpResource;

  /**
   * Description of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Unique ID of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Status of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Unique error code for the request, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * Unique error code for the request, if any.
   * @param errorCode errorCode or {@code null} for none
   */
  public GoogleCloudApigeeV1DeleteResponse setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Google Cloud name of deleted resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpResource() {
    return gcpResource;
  }

  /**
   * Google Cloud name of deleted resource.
   * @param gcpResource gcpResource or {@code null} for none
   */
  public GoogleCloudApigeeV1DeleteResponse setGcpResource(java.lang.String gcpResource) {
    this.gcpResource = gcpResource;
    return this;
  }

  /**
   * Description of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Description of the operation.
   * @param message message or {@code null} for none
   */
  public GoogleCloudApigeeV1DeleteResponse setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Unique ID of the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Unique ID of the request.
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudApigeeV1DeleteResponse setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Status of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the operation.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1DeleteResponse setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeleteResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeleteResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeleteResponse clone() {
    return (GoogleCloudApigeeV1DeleteResponse) super.clone();
  }

}
