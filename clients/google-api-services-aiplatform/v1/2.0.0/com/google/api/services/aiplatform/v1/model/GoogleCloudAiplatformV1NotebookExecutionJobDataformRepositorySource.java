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

package com.google.api.services.aiplatform.v1.model;

/**
 * The Dataform Repository containing the input notebook.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource extends com.google.api.client.json.GenericJson {

  /**
   * The commit SHA to read repository with. If unset, the file will be read at HEAD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commitSha;

  /**
   * The resource name of the Dataform Repository. Format:
   * `projects/{project_id}/locations/{location}/repositories/{repository_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataformRepositoryResourceName;

  /**
   * The commit SHA to read repository with. If unset, the file will be read at HEAD.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommitSha() {
    return commitSha;
  }

  /**
   * The commit SHA to read repository with. If unset, the file will be read at HEAD.
   * @param commitSha commitSha or {@code null} for none
   */
  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource setCommitSha(java.lang.String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The resource name of the Dataform Repository. Format:
   * `projects/{project_id}/locations/{location}/repositories/{repository_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getDataformRepositoryResourceName() {
    return dataformRepositoryResourceName;
  }

  /**
   * The resource name of the Dataform Repository. Format:
   * `projects/{project_id}/locations/{location}/repositories/{repository_id}`
   * @param dataformRepositoryResourceName dataformRepositoryResourceName or {@code null} for none
   */
  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource setDataformRepositoryResourceName(java.lang.String dataformRepositoryResourceName) {
    this.dataformRepositoryResourceName = dataformRepositoryResourceName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource clone() {
    return (GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource) super.clone();
  }

}
