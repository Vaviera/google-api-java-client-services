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

package com.google.api.services.retail.v2.model;

/**
 * The input config source for products.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2ProductInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * BigQuery input source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2BigQuerySource bigQuerySource;

  /**
   * Google Cloud Storage location for the input content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2GcsSource gcsSource;

  /**
   * The Inline source for the input content for products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2ProductInlineSource productInlineSource;

  /**
   * BigQuery input source.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2BigQuerySource getBigQuerySource() {
    return bigQuerySource;
  }

  /**
   * BigQuery input source.
   * @param bigQuerySource bigQuerySource or {@code null} for none
   */
  public GoogleCloudRetailV2ProductInputConfig setBigQuerySource(GoogleCloudRetailV2BigQuerySource bigQuerySource) {
    this.bigQuerySource = bigQuerySource;
    return this;
  }

  /**
   * Google Cloud Storage location for the input content.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Google Cloud Storage location for the input content.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public GoogleCloudRetailV2ProductInputConfig setGcsSource(GoogleCloudRetailV2GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * The Inline source for the input content for products.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2ProductInlineSource getProductInlineSource() {
    return productInlineSource;
  }

  /**
   * The Inline source for the input content for products.
   * @param productInlineSource productInlineSource or {@code null} for none
   */
  public GoogleCloudRetailV2ProductInputConfig setProductInlineSource(GoogleCloudRetailV2ProductInlineSource productInlineSource) {
    this.productInlineSource = productInlineSource;
    return this;
  }

  @Override
  public GoogleCloudRetailV2ProductInputConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2ProductInputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2ProductInputConfig clone() {
    return (GoogleCloudRetailV2ProductInputConfig) super.clone();
  }

}
