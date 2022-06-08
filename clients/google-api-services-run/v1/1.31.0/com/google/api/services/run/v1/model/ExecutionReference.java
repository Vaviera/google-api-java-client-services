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

package com.google.api.services.run.v1.model;

/**
 * Reference to an Execution. Use /Executions.GetExecution with the given name to get full execution
 * including the latest status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionReference extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Completion timestamp of the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completionTimestamp;

  /**
   * Optional. Creation timestamp of the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTimestamp;

  /**
   * Optional. Name of the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Completion timestamp of the execution.
   * @return value or {@code null} for none
   */
  public String getCompletionTimestamp() {
    return completionTimestamp;
  }

  /**
   * Optional. Completion timestamp of the execution.
   * @param completionTimestamp completionTimestamp or {@code null} for none
   */
  public ExecutionReference setCompletionTimestamp(String completionTimestamp) {
    this.completionTimestamp = completionTimestamp;
    return this;
  }

  /**
   * Optional. Creation timestamp of the execution.
   * @return value or {@code null} for none
   */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Optional. Creation timestamp of the execution.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public ExecutionReference setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Optional. Name of the execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Name of the execution.
   * @param name name or {@code null} for none
   */
  public ExecutionReference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ExecutionReference set(String fieldName, Object value) {
    return (ExecutionReference) super.set(fieldName, value);
  }

  @Override
  public ExecutionReference clone() {
    return (ExecutionReference) super.clone();
  }

}
