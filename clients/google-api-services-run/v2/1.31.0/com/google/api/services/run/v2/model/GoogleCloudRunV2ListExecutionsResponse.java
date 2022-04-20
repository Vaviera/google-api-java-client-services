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

package com.google.api.services.run.v2.model;

/**
 * Response message containing a list of Executions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2ListExecutionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The resulting list of Executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Execution> executions;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2Execution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2Execution.class);
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListExecutions
   * request to continue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The resulting list of Executions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Execution> getExecutions() {
    return executions;
  }

  /**
   * The resulting list of Executions.
   * @param executions executions or {@code null} for none
   */
  public GoogleCloudRunV2ListExecutionsResponse setExecutions(java.util.List<GoogleCloudRunV2Execution> executions) {
    this.executions = executions;
    return this;
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListExecutions
   * request to continue.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListExecutions
   * request to continue.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRunV2ListExecutionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudRunV2ListExecutionsResponse set(String fieldName, Object value) {
    return (GoogleCloudRunV2ListExecutionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2ListExecutionsResponse clone() {
    return (GoogleCloudRunV2ListExecutionsResponse) super.clone();
  }

}
