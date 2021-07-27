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

package com.google.api.services.cloudbuild.v1.model;

/**
 * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a
 * GitHub event is received.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GitHubEventsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The resource name of the github enterprise config that should be applied to this
   * installation. For example: "projects/{$project_id}/githubEnterpriseConfig/{$config_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enterpriseConfigResourceName;

  /**
   * The installationID that emits the GitHub event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long installationId;

  /**
   * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-
   * builders is "cloud-builders".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform
   * /cloud-builders is "googlecloudplatform".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String owner;

  /**
   * filter to match changes in pull requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PullRequestFilter pullRequest;

  /**
   * filter to match changes in refs like branches, tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushFilter push;

  /**
   * Optional. The resource name of the github enterprise config that should be applied to this
   * installation. For example: "projects/{$project_id}/githubEnterpriseConfig/{$config_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getEnterpriseConfigResourceName() {
    return enterpriseConfigResourceName;
  }

  /**
   * Optional. The resource name of the github enterprise config that should be applied to this
   * installation. For example: "projects/{$project_id}/githubEnterpriseConfig/{$config_id}"
   * @param enterpriseConfigResourceName enterpriseConfigResourceName or {@code null} for none
   */
  public GitHubEventsConfig setEnterpriseConfigResourceName(java.lang.String enterpriseConfigResourceName) {
    this.enterpriseConfigResourceName = enterpriseConfigResourceName;
    return this;
  }

  /**
   * The installationID that emits the GitHub event.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInstallationId() {
    return installationId;
  }

  /**
   * The installationID that emits the GitHub event.
   * @param installationId installationId or {@code null} for none
   */
  public GitHubEventsConfig setInstallationId(java.lang.Long installationId) {
    this.installationId = installationId;
    return this;
  }

  /**
   * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-
   * builders is "cloud-builders".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-
   * builders is "cloud-builders".
   * @param name name or {@code null} for none
   */
  public GitHubEventsConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform
   * /cloud-builders is "googlecloudplatform".
   * @return value or {@code null} for none
   */
  public java.lang.String getOwner() {
    return owner;
  }

  /**
   * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform
   * /cloud-builders is "googlecloudplatform".
   * @param owner owner or {@code null} for none
   */
  public GitHubEventsConfig setOwner(java.lang.String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * filter to match changes in pull requests.
   * @return value or {@code null} for none
   */
  public PullRequestFilter getPullRequest() {
    return pullRequest;
  }

  /**
   * filter to match changes in pull requests.
   * @param pullRequest pullRequest or {@code null} for none
   */
  public GitHubEventsConfig setPullRequest(PullRequestFilter pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

  /**
   * filter to match changes in refs like branches, tags.
   * @return value or {@code null} for none
   */
  public PushFilter getPush() {
    return push;
  }

  /**
   * filter to match changes in refs like branches, tags.
   * @param push push or {@code null} for none
   */
  public GitHubEventsConfig setPush(PushFilter push) {
    this.push = push;
    return this;
  }

  @Override
  public GitHubEventsConfig set(String fieldName, Object value) {
    return (GitHubEventsConfig) super.set(fieldName, value);
  }

  @Override
  public GitHubEventsConfig clone() {
    return (GitHubEventsConfig) super.clone();
  }

}
