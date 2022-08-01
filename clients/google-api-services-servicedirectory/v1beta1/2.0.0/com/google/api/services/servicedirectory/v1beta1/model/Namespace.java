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

package com.google.api.services.servicedirectory.v1beta1.model;

/**
 * A container for services. Namespaces allow administrators to group services together and define
 * permissions for a collection of services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Directory API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Namespace extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the namespace was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Resource labels associated with this namespace. No more than 64 user labels can be
   * associated with a given resource. Label keys and values can be no longer than 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Immutable. The resource name for the namespace in the format `projects/locations/namespaces`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp when the namespace was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the namespace was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the namespace was created.
   * @param createTime createTime or {@code null} for none
   */
  public Namespace setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Resource labels associated with this namespace. No more than 64 user labels can be
   * associated with a given resource. Label keys and values can be no longer than 63 characters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels associated with this namespace. No more than 64 user labels can be
   * associated with a given resource. Label keys and values can be no longer than 63 characters.
   * @param labels labels or {@code null} for none
   */
  public Namespace setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Immutable. The resource name for the namespace in the format `projects/locations/namespaces`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name for the namespace in the format `projects/locations/namespaces`.
   * @param name name or {@code null} for none
   */
  public Namespace setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp when the namespace was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the namespace was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Namespace setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Namespace set(String fieldName, Object value) {
    return (Namespace) super.set(fieldName, value);
  }

  @Override
  public Namespace clone() {
    return (Namespace) super.clone();
  }

}
