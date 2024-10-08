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
 * The idle shutdown configuration of NotebookRuntimeTemplate, which contains the idle_timeout as
 * required field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1NotebookIdleShutdownConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether Idle Shutdown is disabled in this NotebookRuntimeTemplate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean idleShutdownDisabled;

  /**
   * Required. Duration is accurate to the second. In Notebook, Idle Timeout is accurate to minute
   * so the range of idle_timeout (second) is: 10 * 60 ~ 1440 * 60.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String idleTimeout;

  /**
   * Whether Idle Shutdown is disabled in this NotebookRuntimeTemplate.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIdleShutdownDisabled() {
    return idleShutdownDisabled;
  }

  /**
   * Whether Idle Shutdown is disabled in this NotebookRuntimeTemplate.
   * @param idleShutdownDisabled idleShutdownDisabled or {@code null} for none
   */
  public GoogleCloudAiplatformV1NotebookIdleShutdownConfig setIdleShutdownDisabled(java.lang.Boolean idleShutdownDisabled) {
    this.idleShutdownDisabled = idleShutdownDisabled;
    return this;
  }

  /**
   * Required. Duration is accurate to the second. In Notebook, Idle Timeout is accurate to minute
   * so the range of idle_timeout (second) is: 10 * 60 ~ 1440 * 60.
   * @return value or {@code null} for none
   */
  public String getIdleTimeout() {
    return idleTimeout;
  }

  /**
   * Required. Duration is accurate to the second. In Notebook, Idle Timeout is accurate to minute
   * so the range of idle_timeout (second) is: 10 * 60 ~ 1440 * 60.
   * @param idleTimeout idleTimeout or {@code null} for none
   */
  public GoogleCloudAiplatformV1NotebookIdleShutdownConfig setIdleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1NotebookIdleShutdownConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1NotebookIdleShutdownConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1NotebookIdleShutdownConfig clone() {
    return (GoogleCloudAiplatformV1NotebookIdleShutdownConfig) super.clone();
  }

}
