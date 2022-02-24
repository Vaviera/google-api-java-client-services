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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Information related to the Google Cloud resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV1Resource extends com.google.api.client.json.GenericJson {

  /**
   * The human readable name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Contains a Folder message for each folder in the assets ancestry. The first folder
   * is the deepest nested folder, and the last folder is the folder directly under the
   * Organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Folder> folders;

  static {
    // hack to force ProGuard to consider Folder used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Folder.class);
  }

  /**
   * The full resource name of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The full resource name of resource's parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The human readable name of resource's parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentDisplayName;

  /**
   * The full resource name of project that the resource belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * The project id that the resource belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectDisplayName;

  /**
   * The full resource type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The human readable name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human readable name of the resource.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Contains a Folder message for each folder in the assets ancestry. The first folder
   * is the deepest nested folder, and the last folder is the folder directly under the
   * Organization.
   * @return value or {@code null} for none
   */
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  /**
   * Output only. Contains a Folder message for each folder in the assets ancestry. The first folder
   * is the deepest nested folder, and the last folder is the folder directly under the
   * Organization.
   * @param folders folders or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  /**
   * The full resource name of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full resource name of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The full resource name of resource's parent.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The full resource name of resource's parent.
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The human readable name of resource's parent.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentDisplayName() {
    return parentDisplayName;
  }

  /**
   * The human readable name of resource's parent.
   * @param parentDisplayName parentDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setParentDisplayName(java.lang.String parentDisplayName) {
    this.parentDisplayName = parentDisplayName;
    return this;
  }

  /**
   * The full resource name of project that the resource belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The full resource name of project that the resource belongs to.
   * @param project project or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * The project id that the resource belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectDisplayName() {
    return projectDisplayName;
  }

  /**
   * The project id that the resource belongs to.
   * @param projectDisplayName projectDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setProjectDisplayName(java.lang.String projectDisplayName) {
    this.projectDisplayName = projectDisplayName;
    return this;
  }

  /**
   * The full resource type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The full resource type of the resource.
   * @param type type or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1Resource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1Resource set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1Resource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1Resource clone() {
    return (GoogleCloudSecuritycenterV1Resource) super.clone();
  }

}
