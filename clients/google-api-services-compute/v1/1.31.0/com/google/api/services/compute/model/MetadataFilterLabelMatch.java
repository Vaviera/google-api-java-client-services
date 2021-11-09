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

package com.google.api.services.compute.model;

/**
 * MetadataFilter label name value pairs that are expected to match corresponding labels presented
 * as metadata to the load balancer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetadataFilterLabelMatch extends com.google.api.client.json.GenericJson {

  /**
   * Name of metadata label. The name can have a maximum length of 1024 characters and must be at
   * least 1 character long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value of the label must match the specified value. value can have a maximum length of 1024
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Name of metadata label. The name can have a maximum length of 1024 characters and must be at
   * least 1 character long.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of metadata label. The name can have a maximum length of 1024 characters and must be at
   * least 1 character long.
   * @param name name or {@code null} for none
   */
  public MetadataFilterLabelMatch setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the label must match the specified value. value can have a maximum length of 1024
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value of the label must match the specified value. value can have a maximum length of 1024
   * characters.
   * @param value value or {@code null} for none
   */
  public MetadataFilterLabelMatch setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public MetadataFilterLabelMatch set(String fieldName, Object value) {
    return (MetadataFilterLabelMatch) super.set(fieldName, value);
  }

  @Override
  public MetadataFilterLabelMatch clone() {
    return (MetadataFilterLabelMatch) super.clone();
  }

}
