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
 * The color information of a Product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2ColorInfo extends com.google.api.client.json.GenericJson {

  /**
   * The standard color families. Strongly recommended to use the following standard color groups:
   * "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray",
   * "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using
   * single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must
   * be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> colorFamilies;

  /**
   * The color display names, which may be different from standard color family names, such as the
   * color aliases used in the website frontend. Normally it is expected to have only 1 color. May
   * consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed.
   * Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> colors;

  /**
   * The standard color families. Strongly recommended to use the following standard color groups:
   * "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray",
   * "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using
   * single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must
   * be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getColorFamilies() {
    return colorFamilies;
  }

  /**
   * The standard color families. Strongly recommended to use the following standard color groups:
   * "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray",
   * "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using
   * single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must
   * be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * @param colorFamilies colorFamilies or {@code null} for none
   */
  public GoogleCloudRetailV2ColorInfo setColorFamilies(java.util.List<java.lang.String> colorFamilies) {
    this.colorFamilies = colorFamilies;
    return this;
  }

  /**
   * The color display names, which may be different from standard color family names, such as the
   * color aliases used in the website frontend. Normally it is expected to have only 1 color. May
   * consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed.
   * Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getColors() {
    return colors;
  }

  /**
   * The color display names, which may be different from standard color family names, such as the
   * color aliases used in the website frontend. Normally it is expected to have only 1 color. May
   * consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed.
   * Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org property
   * [Product.color](https://schema.org/color).
   * @param colors colors or {@code null} for none
   */
  public GoogleCloudRetailV2ColorInfo setColors(java.util.List<java.lang.String> colors) {
    this.colors = colors;
    return this;
  }

  @Override
  public GoogleCloudRetailV2ColorInfo set(String fieldName, Object value) {
    return (GoogleCloudRetailV2ColorInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2ColorInfo clone() {
    return (GoogleCloudRetailV2ColorInfo) super.clone();
  }

}
