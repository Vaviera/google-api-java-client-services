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

package com.google.api.services.area120tables.v1alpha1.model;

/**
 * A single table. NextId: 8
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Area120 Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * List of columns in this table. Order of columns matches the display order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ColumnDescription> columns;

  static {
    // hack to force ProGuard to consider ColumnDescription used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ColumnDescription.class);
  }

  /**
   * Time when the table was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The human readable title of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the table. Table names have the form `tables/{table}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Saved views for this table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SavedView> savedViews;

  static {
    // hack to force ProGuard to consider SavedView used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SavedView.class);
  }

  /**
   * The time zone of the table. IANA Time Zone Database time zone, e.g. "America/New_York".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Time when the table was last updated excluding updates to individual rows
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * List of columns in this table. Order of columns matches the display order.
   * @return value or {@code null} for none
   */
  public java.util.List<ColumnDescription> getColumns() {
    return columns;
  }

  /**
   * List of columns in this table. Order of columns matches the display order.
   * @param columns columns or {@code null} for none
   */
  public Table setColumns(java.util.List<ColumnDescription> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Time when the table was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time when the table was created.
   * @param createTime createTime or {@code null} for none
   */
  public Table setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The human readable title of the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human readable title of the table.
   * @param displayName displayName or {@code null} for none
   */
  public Table setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the table. Table names have the form `tables/{table}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the table. Table names have the form `tables/{table}`.
   * @param name name or {@code null} for none
   */
  public Table setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Saved views for this table.
   * @return value or {@code null} for none
   */
  public java.util.List<SavedView> getSavedViews() {
    return savedViews;
  }

  /**
   * Saved views for this table.
   * @param savedViews savedViews or {@code null} for none
   */
  public Table setSavedViews(java.util.List<SavedView> savedViews) {
    this.savedViews = savedViews;
    return this;
  }

  /**
   * The time zone of the table. IANA Time Zone Database time zone, e.g. "America/New_York".
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone of the table. IANA Time Zone Database time zone, e.g. "America/New_York".
   * @param timeZone timeZone or {@code null} for none
   */
  public Table setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Time when the table was last updated excluding updates to individual rows
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Time when the table was last updated excluding updates to individual rows
   * @param updateTime updateTime or {@code null} for none
   */
  public Table setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}
