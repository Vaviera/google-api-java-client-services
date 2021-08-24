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

package com.google.api.services.slides.v1.model;

/**
 * A PageElement kind representing an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * An URL to an image with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the image as the original requester.
   * Access to the image may be lost if the presentation's sharing settings change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentUrl;

  /**
   * The properties of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageProperties imageProperties;

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the image is a placeholder image and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Placeholder placeholder;

  /**
   * The source URL is the URL used to insert the image. The source URL can be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUrl;

  /**
   * An URL to an image with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the image as the original requester.
   * Access to the image may be lost if the presentation's sharing settings change.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentUrl() {
    return contentUrl;
  }

  /**
   * An URL to an image with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the image as the original requester.
   * Access to the image may be lost if the presentation's sharing settings change.
   * @param contentUrl contentUrl or {@code null} for none
   */
  public Image setContentUrl(java.lang.String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The properties of the image.
   * @return value or {@code null} for none
   */
  public ImageProperties getImageProperties() {
    return imageProperties;
  }

  /**
   * The properties of the image.
   * @param imageProperties imageProperties or {@code null} for none
   */
  public Image setImageProperties(ImageProperties imageProperties) {
    this.imageProperties = imageProperties;
    return this;
  }

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the image is a placeholder image and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * @return value or {@code null} for none
   */
  public Placeholder getPlaceholder() {
    return placeholder;
  }

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the image is a placeholder image and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * @param placeholder placeholder or {@code null} for none
   */
  public Image setPlaceholder(Placeholder placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * The source URL is the URL used to insert the image. The source URL can be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUrl() {
    return sourceUrl;
  }

  /**
   * The source URL is the URL used to insert the image. The source URL can be empty.
   * @param sourceUrl sourceUrl or {@code null} for none
   */
  public Image setSourceUrl(java.lang.String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

}
