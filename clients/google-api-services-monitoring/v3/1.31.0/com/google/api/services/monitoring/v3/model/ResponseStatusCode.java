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

package com.google.api.services.monitoring.v3.model;

/**
 * A status to accept. Either a status code class like "2xx", or an integer status code like "200".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResponseStatusCode extends com.google.api.client.json.GenericJson {

  /**
   * A class of status codes to accept.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusClass;

  /**
   * A status code to accept.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer statusValue;

  /**
   * A class of status codes to accept.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusClass() {
    return statusClass;
  }

  /**
   * A class of status codes to accept.
   * @param statusClass statusClass or {@code null} for none
   */
  public ResponseStatusCode setStatusClass(java.lang.String statusClass) {
    this.statusClass = statusClass;
    return this;
  }

  /**
   * A status code to accept.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatusValue() {
    return statusValue;
  }

  /**
   * A status code to accept.
   * @param statusValue statusValue or {@code null} for none
   */
  public ResponseStatusCode setStatusValue(java.lang.Integer statusValue) {
    this.statusValue = statusValue;
    return this;
  }

  @Override
  public ResponseStatusCode set(String fieldName, Object value) {
    return (ResponseStatusCode) super.set(fieldName, value);
  }

  @Override
  public ResponseStatusCode clone() {
    return (ResponseStatusCode) super.clone();
  }

}
