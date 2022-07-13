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

package com.google.api.services.compute.model;

/**
 * Specifies the mapping between the response code that will be returned along with the custom error
 * content and the response code returned by the backend service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomErrorResponsePolicyCustomErrorResponseRule extends com.google.api.client.json.GenericJson {

  /**
   * Valid values include: - A number between 400 and 599: For example 401 or 503, in which case the
   * load balancer applies the policy if the error code exactly matches this value. - 5xx: Load
   * Balancer will apply the policy if the backend service responds with any response code in the
   * range of 500 to 599. - 4xx: Load Balancer will apply the policy if the backend service responds
   * with any response code in the range of 400 to 499. Values must be unique within
   * matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> matchResponseCodes;

  /**
   * The HTTP status code returned with the response containing the custom error content. If
   * overrideResponseCode is not supplied, the same response code returned by the original backend
   * bucket or backend service is returned to the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer overrideResponseCode;

  /**
   * The full path to a file within backendBucket . For example: /errors/defaultError.html path must
   * start with a leading slash. path cannot have trailing slashes. If the file is not available in
   * backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is
   * returned to the client. The value must be from 1 to 1024 characters
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Valid values include: - A number between 400 and 599: For example 401 or 503, in which case the
   * load balancer applies the policy if the error code exactly matches this value. - 5xx: Load
   * Balancer will apply the policy if the backend service responds with any response code in the
   * range of 500 to 599. - 4xx: Load Balancer will apply the policy if the backend service responds
   * with any response code in the range of 400 to 499. Values must be unique within
   * matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMatchResponseCodes() {
    return matchResponseCodes;
  }

  /**
   * Valid values include: - A number between 400 and 599: For example 401 or 503, in which case the
   * load balancer applies the policy if the error code exactly matches this value. - 5xx: Load
   * Balancer will apply the policy if the backend service responds with any response code in the
   * range of 500 to 599. - 4xx: Load Balancer will apply the policy if the backend service responds
   * with any response code in the range of 400 to 499. Values must be unique within
   * matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
   * @param matchResponseCodes matchResponseCodes or {@code null} for none
   */
  public CustomErrorResponsePolicyCustomErrorResponseRule setMatchResponseCodes(java.util.List<java.lang.String> matchResponseCodes) {
    this.matchResponseCodes = matchResponseCodes;
    return this;
  }

  /**
   * The HTTP status code returned with the response containing the custom error content. If
   * overrideResponseCode is not supplied, the same response code returned by the original backend
   * bucket or backend service is returned to the client.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOverrideResponseCode() {
    return overrideResponseCode;
  }

  /**
   * The HTTP status code returned with the response containing the custom error content. If
   * overrideResponseCode is not supplied, the same response code returned by the original backend
   * bucket or backend service is returned to the client.
   * @param overrideResponseCode overrideResponseCode or {@code null} for none
   */
  public CustomErrorResponsePolicyCustomErrorResponseRule setOverrideResponseCode(java.lang.Integer overrideResponseCode) {
    this.overrideResponseCode = overrideResponseCode;
    return this;
  }

  /**
   * The full path to a file within backendBucket . For example: /errors/defaultError.html path must
   * start with a leading slash. path cannot have trailing slashes. If the file is not available in
   * backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is
   * returned to the client. The value must be from 1 to 1024 characters
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The full path to a file within backendBucket . For example: /errors/defaultError.html path must
   * start with a leading slash. path cannot have trailing slashes. If the file is not available in
   * backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is
   * returned to the client. The value must be from 1 to 1024 characters
   * @param path path or {@code null} for none
   */
  public CustomErrorResponsePolicyCustomErrorResponseRule setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public CustomErrorResponsePolicyCustomErrorResponseRule set(String fieldName, Object value) {
    return (CustomErrorResponsePolicyCustomErrorResponseRule) super.set(fieldName, value);
  }

  @Override
  public CustomErrorResponsePolicyCustomErrorResponseRule clone() {
    return (CustomErrorResponsePolicyCustomErrorResponseRule) super.clone();
  }

}
