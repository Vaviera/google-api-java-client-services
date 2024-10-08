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
 * Request message for NotebookService.AssignNotebookRuntime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1AssignNotebookRuntimeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Provide runtime specific information (e.g. runtime owner, notebook id) used for
   * NotebookRuntime assignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1NotebookRuntime notebookRuntime;

  /**
   * Optional. User specified ID for the notebook runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notebookRuntimeId;

  /**
   * Required. The resource name of the NotebookRuntimeTemplate based on which a NotebookRuntime
   * will be assigned (reuse or create a new one).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notebookRuntimeTemplate;

  /**
   * Required. Provide runtime specific information (e.g. runtime owner, notebook id) used for
   * NotebookRuntime assignment.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1NotebookRuntime getNotebookRuntime() {
    return notebookRuntime;
  }

  /**
   * Required. Provide runtime specific information (e.g. runtime owner, notebook id) used for
   * NotebookRuntime assignment.
   * @param notebookRuntime notebookRuntime or {@code null} for none
   */
  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest setNotebookRuntime(GoogleCloudAiplatformV1NotebookRuntime notebookRuntime) {
    this.notebookRuntime = notebookRuntime;
    return this;
  }

  /**
   * Optional. User specified ID for the notebook runtime.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotebookRuntimeId() {
    return notebookRuntimeId;
  }

  /**
   * Optional. User specified ID for the notebook runtime.
   * @param notebookRuntimeId notebookRuntimeId or {@code null} for none
   */
  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest setNotebookRuntimeId(java.lang.String notebookRuntimeId) {
    this.notebookRuntimeId = notebookRuntimeId;
    return this;
  }

  /**
   * Required. The resource name of the NotebookRuntimeTemplate based on which a NotebookRuntime
   * will be assigned (reuse or create a new one).
   * @return value or {@code null} for none
   */
  public java.lang.String getNotebookRuntimeTemplate() {
    return notebookRuntimeTemplate;
  }

  /**
   * Required. The resource name of the NotebookRuntimeTemplate based on which a NotebookRuntime
   * will be assigned (reuse or create a new one).
   * @param notebookRuntimeTemplate notebookRuntimeTemplate or {@code null} for none
   */
  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest setNotebookRuntimeTemplate(java.lang.String notebookRuntimeTemplate) {
    this.notebookRuntimeTemplate = notebookRuntimeTemplate;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1AssignNotebookRuntimeRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest clone() {
    return (GoogleCloudAiplatformV1AssignNotebookRuntimeRequest) super.clone();
  }

}
