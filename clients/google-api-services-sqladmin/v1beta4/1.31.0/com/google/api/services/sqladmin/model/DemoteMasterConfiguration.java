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

package com.google.api.services.sqladmin.model;

/**
 * Read-replica configuration for connecting to the on-premises primary instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DemoteMasterConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * This is always **sql#demoteMasterConfiguration**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named **master.info** in the data
   * directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DemoteMasterMySqlReplicaConfiguration mysqlReplicaConfiguration;

  /**
   * This is always **sql#demoteMasterConfiguration**.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always **sql#demoteMasterConfiguration**.
   * @param kind kind or {@code null} for none
   */
  public DemoteMasterConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named **master.info** in the data
   * directory.
   * @return value or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration getMysqlReplicaConfiguration() {
    return mysqlReplicaConfiguration;
  }

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named **master.info** in the data
   * directory.
   * @param mysqlReplicaConfiguration mysqlReplicaConfiguration or {@code null} for none
   */
  public DemoteMasterConfiguration setMysqlReplicaConfiguration(DemoteMasterMySqlReplicaConfiguration mysqlReplicaConfiguration) {
    this.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
    return this;
  }

  @Override
  public DemoteMasterConfiguration set(String fieldName, Object value) {
    return (DemoteMasterConfiguration) super.set(fieldName, value);
  }

  @Override
  public DemoteMasterConfiguration clone() {
    return (DemoteMasterConfiguration) super.clone();
  }

}
