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

package com.google.api.services.connectors.v2.model;

/**
 * Action message contains metadata information about a single action present in the external
 * system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Action extends com.google.api.client.json.GenericJson {

  /**
   * Brief Description of action
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display Name of action to be shown on client side
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * JsonSchema representation of this actions's input schema
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonSchema inputJsonSchema;

  /**
   * List containing input parameter metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InputParameter> inputParameters;

  /**
   * Name of the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * JsonSchema representation of this actions's result schema
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonSchema resultJsonSchema;

  /**
   * List containing the metadata of result fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResultMetadata> resultMetadata;

  /**
   * Brief Description of action
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Brief Description of action
   * @param description description or {@code null} for none
   */
  public Action setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display Name of action to be shown on client side
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display Name of action to be shown on client side
   * @param displayName displayName or {@code null} for none
   */
  public Action setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * JsonSchema representation of this actions's input schema
   * @return value or {@code null} for none
   */
  public JsonSchema getInputJsonSchema() {
    return inputJsonSchema;
  }

  /**
   * JsonSchema representation of this actions's input schema
   * @param inputJsonSchema inputJsonSchema or {@code null} for none
   */
  public Action setInputJsonSchema(JsonSchema inputJsonSchema) {
    this.inputJsonSchema = inputJsonSchema;
    return this;
  }

  /**
   * List containing input parameter metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<InputParameter> getInputParameters() {
    return inputParameters;
  }

  /**
   * List containing input parameter metadata.
   * @param inputParameters inputParameters or {@code null} for none
   */
  public Action setInputParameters(java.util.List<InputParameter> inputParameters) {
    this.inputParameters = inputParameters;
    return this;
  }

  /**
   * Name of the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the action.
   * @param name name or {@code null} for none
   */
  public Action setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * JsonSchema representation of this actions's result schema
   * @return value or {@code null} for none
   */
  public JsonSchema getResultJsonSchema() {
    return resultJsonSchema;
  }

  /**
   * JsonSchema representation of this actions's result schema
   * @param resultJsonSchema resultJsonSchema or {@code null} for none
   */
  public Action setResultJsonSchema(JsonSchema resultJsonSchema) {
    this.resultJsonSchema = resultJsonSchema;
    return this;
  }

  /**
   * List containing the metadata of result fields.
   * @return value or {@code null} for none
   */
  public java.util.List<ResultMetadata> getResultMetadata() {
    return resultMetadata;
  }

  /**
   * List containing the metadata of result fields.
   * @param resultMetadata resultMetadata or {@code null} for none
   */
  public Action setResultMetadata(java.util.List<ResultMetadata> resultMetadata) {
    this.resultMetadata = resultMetadata;
    return this;
  }

  @Override
  public Action set(String fieldName, Object value) {
    return (Action) super.set(fieldName, value);
  }

  @Override
  public Action clone() {
    return (Action) super.clone();
  }

}
