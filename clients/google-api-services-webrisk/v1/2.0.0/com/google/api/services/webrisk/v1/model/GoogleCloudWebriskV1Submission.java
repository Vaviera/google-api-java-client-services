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

package com.google.api.services.webrisk.v1.model;

/**
 * Wraps a URI that might be displaying malicious content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Risk API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudWebriskV1Submission extends com.google.api.client.json.GenericJson {

  /**
   * ThreatTypes found to be associated with the submitted URI after reviewing it. This may be empty
   * if the URI was not added to any list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> threatTypes;

  /**
   * Required. The URI that is being reported for malicious content to be analyzed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * ThreatTypes found to be associated with the submitted URI after reviewing it. This may be empty
   * if the URI was not added to any list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getThreatTypes() {
    return threatTypes;
  }

  /**
   * ThreatTypes found to be associated with the submitted URI after reviewing it. This may be empty
   * if the URI was not added to any list.
   * @param threatTypes threatTypes or {@code null} for none
   */
  public GoogleCloudWebriskV1Submission setThreatTypes(java.util.List<java.lang.String> threatTypes) {
    this.threatTypes = threatTypes;
    return this;
  }

  /**
   * Required. The URI that is being reported for malicious content to be analyzed.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The URI that is being reported for malicious content to be analyzed.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudWebriskV1Submission setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudWebriskV1Submission set(String fieldName, Object value) {
    return (GoogleCloudWebriskV1Submission) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudWebriskV1Submission clone() {
    return (GoogleCloudWebriskV1Submission) super.clone();
  }

}
