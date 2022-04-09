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

package com.google.api.services.gkebackup.v1.model;

/**
 * The configuration of a potential series of Restore operations to be performed against Backups
 * belong to a particular BackupPlan. Next id: 11
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestorePlan extends com.google.api.client.json.GenericJson {

  /**
   * Required. Immutable. The BackupPlan from which Backups may be used as the source for Restores
   * created via this RestorePlan. Format: projects/locations/backupPlans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPlan;

  /**
   * Required. Immutable. The target cluster into which Restores created via this RestorePlan will
   * restore data. NOTE: the cluster's region must be the same as the RestorePlan. Possible formats:
   * 1. projects/locations/clusters 2. projects/zones/clusters
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * User specified descriptive string for this RestorePlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a restore from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform restore updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and
   * systems are expected to put that etag in the request to `UpdateRestorePlan` to ensure that
   * their change will be applied to the same version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * A set of custom labels supplied by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. [Output Only] The full name of the RestorePlan resource. Format:
   * projects/locations/restorePlans
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Configuration of Restores created via this RestorePlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestoreConfig restoreConfig;

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. Immutable. The BackupPlan from which Backups may be used as the source for Restores
   * created via this RestorePlan. Format: projects/locations/backupPlans.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPlan() {
    return backupPlan;
  }

  /**
   * Required. Immutable. The BackupPlan from which Backups may be used as the source for Restores
   * created via this RestorePlan. Format: projects/locations/backupPlans.
   * @param backupPlan backupPlan or {@code null} for none
   */
  public RestorePlan setBackupPlan(java.lang.String backupPlan) {
    this.backupPlan = backupPlan;
    return this;
  }

  /**
   * Required. Immutable. The target cluster into which Restores created via this RestorePlan will
   * restore data. NOTE: the cluster's region must be the same as the RestorePlan. Possible formats:
   * 1. projects/locations/clusters 2. projects/zones/clusters
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * Required. Immutable. The target cluster into which Restores created via this RestorePlan will
   * restore data. NOTE: the cluster's region must be the same as the RestorePlan. Possible formats:
   * 1. projects/locations/clusters 2. projects/zones/clusters
   * @param cluster cluster or {@code null} for none
   */
  public RestorePlan setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @param createTime createTime or {@code null} for none
   */
  public RestorePlan setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * User specified descriptive string for this RestorePlan.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User specified descriptive string for this RestorePlan.
   * @param description description or {@code null} for none
   */
  public RestorePlan setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a restore from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform restore updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and
   * systems are expected to put that etag in the request to `UpdateRestorePlan` to ensure that
   * their change will be applied to the same version.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a restore from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform restore updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and
   * systems are expected to put that etag in the request to `UpdateRestorePlan` to ensure that
   * their change will be applied to the same version.
   * @param etag etag or {@code null} for none
   */
  public RestorePlan setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A set of custom labels supplied by user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A set of custom labels supplied by user.
   * @param labels labels or {@code null} for none
   */
  public RestorePlan setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. [Output Only] The full name of the RestorePlan resource. Format:
   * projects/locations/restorePlans
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Output Only] The full name of the RestorePlan resource. Format:
   * projects/locations/restorePlans
   * @param name name or {@code null} for none
   */
  public RestorePlan setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Configuration of Restores created via this RestorePlan.
   * @return value or {@code null} for none
   */
  public RestoreConfig getRestoreConfig() {
    return restoreConfig;
  }

  /**
   * Required. Configuration of Restores created via this RestorePlan.
   * @param restoreConfig restoreConfig or {@code null} for none
   */
  public RestorePlan setRestoreConfig(RestoreConfig restoreConfig) {
    this.restoreConfig = restoreConfig;
    return this;
  }

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @param uid uid or {@code null} for none
   */
  public RestorePlan setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. [Output Only] The timestamp when this RestorePlan resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @param updateTime updateTime or {@code null} for none
   */
  public RestorePlan setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public RestorePlan set(String fieldName, Object value) {
    return (RestorePlan) super.set(fieldName, value);
  }

  @Override
  public RestorePlan clone() {
    return (RestorePlan) super.clone();
  }

}
