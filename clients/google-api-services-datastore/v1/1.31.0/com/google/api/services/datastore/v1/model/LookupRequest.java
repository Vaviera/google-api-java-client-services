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

package com.google.api.services.datastore.v1.model;

/**
 * The request for Datastore.Lookup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LookupRequest extends com.google.api.client.json.GenericJson {

  /**
   * If not empty, the ID of the database against which to make the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseId;

  /**
   * Required. Keys of entities to look up.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Key> keys;

  static {
    // hack to force ProGuard to consider Key used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Key.class);
  }

  /**
   * The options for this lookup request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReadOptions readOptions;

  /**
   * If not empty, the ID of the database against which to make the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseId() {
    return databaseId;
  }

  /**
   * If not empty, the ID of the database against which to make the request.
   * @param databaseId databaseId or {@code null} for none
   */
  public LookupRequest setDatabaseId(java.lang.String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Required. Keys of entities to look up.
   * @return value or {@code null} for none
   */
  public java.util.List<Key> getKeys() {
    return keys;
  }

  /**
   * Required. Keys of entities to look up.
   * @param keys keys or {@code null} for none
   */
  public LookupRequest setKeys(java.util.List<Key> keys) {
    this.keys = keys;
    return this;
  }

  /**
   * The options for this lookup request.
   * @return value or {@code null} for none
   */
  public ReadOptions getReadOptions() {
    return readOptions;
  }

  /**
   * The options for this lookup request.
   * @param readOptions readOptions or {@code null} for none
   */
  public LookupRequest setReadOptions(ReadOptions readOptions) {
    this.readOptions = readOptions;
    return this;
  }

  @Override
  public LookupRequest set(String fieldName, Object value) {
    return (LookupRequest) super.set(fieldName, value);
  }

  @Override
  public LookupRequest clone() {
    return (LookupRequest) super.clone();
  }

}
