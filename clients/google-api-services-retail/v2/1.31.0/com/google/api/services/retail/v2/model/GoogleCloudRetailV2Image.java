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
 * Product thumbnail/detail image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2Image extends com.google.api.client.json.GenericJson {

  /**
   * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Required. URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of
   * 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @param height height or {@code null} for none
   */
  public GoogleCloudRetailV2Image setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Required. URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of
   * 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of
   * 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center
   * property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudRetailV2Image setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @param width width or {@code null} for none
   */
  public GoogleCloudRetailV2Image setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public GoogleCloudRetailV2Image set(String fieldName, Object value) {
    return (GoogleCloudRetailV2Image) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2Image clone() {
    return (GoogleCloudRetailV2Image) super.clone();
  }

}
