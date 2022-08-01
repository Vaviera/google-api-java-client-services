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

package com.google.api.services.pubsub.model;

/**
 * A schema resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Schema extends com.google.api.client.json.GenericJson {

  /**
   * The definition of the schema. This should contain a string representing the full definition of
   * the schema that is a valid schema definition of the type specified in `type`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String definition;

  /**
   * Required. Name of the schema. Format is `projects/{project}/schemas/{schema}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp that the revision was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Output only. Immutable. The revision ID of the schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * The type of the schema definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The definition of the schema. This should contain a string representing the full definition of
   * the schema that is a valid schema definition of the type specified in `type`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefinition() {
    return definition;
  }

  /**
   * The definition of the schema. This should contain a string representing the full definition of
   * the schema that is a valid schema definition of the type specified in `type`.
   * @param definition definition or {@code null} for none
   */
  public Schema setDefinition(java.lang.String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Required. Name of the schema. Format is `projects/{project}/schemas/{schema}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the schema. Format is `projects/{project}/schemas/{schema}`.
   * @param name name or {@code null} for none
   */
  public Schema setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp that the revision was created.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * Output only. The timestamp that the revision was created.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public Schema setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Output only. Immutable. The revision ID of the schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. Immutable. The revision ID of the schema.
   * @param revisionId revisionId or {@code null} for none
   */
  public Schema setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * The type of the schema definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the schema definition.
   * @param type type or {@code null} for none
   */
  public Schema setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Schema set(String fieldName, Object value) {
    return (Schema) super.set(fieldName, value);
  }

  @Override
  public Schema clone() {
    return (Schema) super.clone();
  }

}
