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

package com.google.api.services.content.model;

/**
 * Model definition for ProductDimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductDimension extends com.google.api.client.json.GenericJson {

  /**
   * Required. The length units. Acceptable values are: - "`in`" - "`cm`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Required. The length value represented as a number. The value can have a maximum precision of
   * four decimal places.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double value;

  /**
   * Required. The length units. Acceptable values are: - "`in`" - "`cm`"
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Required. The length units. Acceptable values are: - "`in`" - "`cm`"
   * @param unit unit or {@code null} for none
   */
  public ProductDimension setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Required. The length value represented as a number. The value can have a maximum precision of
   * four decimal places.
   * @return value or {@code null} for none
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Required. The length value represented as a number. The value can have a maximum precision of
   * four decimal places.
   * @param value value or {@code null} for none
   */
  public ProductDimension setValue(java.lang.Double value) {
    this.value = value;
    return this;
  }

  @Override
  public ProductDimension set(String fieldName, Object value) {
    return (ProductDimension) super.set(fieldName, value);
  }

  @Override
  public ProductDimension clone() {
    return (ProductDimension) super.clone();
  }

}
