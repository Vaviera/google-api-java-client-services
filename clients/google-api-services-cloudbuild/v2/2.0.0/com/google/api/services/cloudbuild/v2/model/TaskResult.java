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

package com.google.api.services.cloudbuild.v2.model;

/**
 * TaskResult is used to describe the results of a task.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TaskResult extends com.google.api.client.json.GenericJson {

  /**
   * Description of the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Name of the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * When type is OBJECT, this map holds the names of fields inside that object along with the type
   * of data each field holds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PropertySpec> properties;

  static {
    // hack to force ProGuard to consider PropertySpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PropertySpec.class);
  }

  /**
   * The type of data that the result holds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. Optionally used to initialize a Task's result with a Step's result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParamValue value;

  /**
   * Description of the result.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the result.
   * @param description description or {@code null} for none
   */
  public TaskResult setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Name of the result.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the result.
   * @param name name or {@code null} for none
   */
  public TaskResult setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * When type is OBJECT, this map holds the names of fields inside that object along with the type
   * of data each field holds.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PropertySpec> getProperties() {
    return properties;
  }

  /**
   * When type is OBJECT, this map holds the names of fields inside that object along with the type
   * of data each field holds.
   * @param properties properties or {@code null} for none
   */
  public TaskResult setProperties(java.util.Map<String, PropertySpec> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The type of data that the result holds.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of data that the result holds.
   * @param type type or {@code null} for none
   */
  public TaskResult setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Optional. Optionally used to initialize a Task's result with a Step's result.
   * @return value or {@code null} for none
   */
  public ParamValue getValue() {
    return value;
  }

  /**
   * Optional. Optionally used to initialize a Task's result with a Step's result.
   * @param value value or {@code null} for none
   */
  public TaskResult setValue(ParamValue value) {
    this.value = value;
    return this;
  }

  @Override
  public TaskResult set(String fieldName, Object value) {
    return (TaskResult) super.set(fieldName, value);
  }

  @Override
  public TaskResult clone() {
    return (TaskResult) super.clone();
  }

}
