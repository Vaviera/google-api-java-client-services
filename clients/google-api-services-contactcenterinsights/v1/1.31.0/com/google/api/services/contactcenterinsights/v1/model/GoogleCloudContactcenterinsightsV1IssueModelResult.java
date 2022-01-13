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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Issue Modeling result on a conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1IssueModelResult extends com.google.api.client.json.GenericJson {

  /**
   * Issue model that generates the result. Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issueModel;

  /**
   * All the matched issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudContactcenterinsightsV1IssueAssignment> issues;

  static {
    // hack to force ProGuard to consider GoogleCloudContactcenterinsightsV1IssueAssignment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudContactcenterinsightsV1IssueAssignment.class);
  }

  /**
   * Issue model that generates the result. Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}
   * @return value or {@code null} for none
   */
  public java.lang.String getIssueModel() {
    return issueModel;
  }

  /**
   * Issue model that generates the result. Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}
   * @param issueModel issueModel or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IssueModelResult setIssueModel(java.lang.String issueModel) {
    this.issueModel = issueModel;
    return this;
  }

  /**
   * All the matched issues.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudContactcenterinsightsV1IssueAssignment> getIssues() {
    return issues;
  }

  /**
   * All the matched issues.
   * @param issues issues or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IssueModelResult setIssues(java.util.List<GoogleCloudContactcenterinsightsV1IssueAssignment> issues) {
    this.issues = issues;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IssueModelResult set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1IssueModelResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IssueModelResult clone() {
    return (GoogleCloudContactcenterinsightsV1IssueModelResult) super.clone();
  }

}
