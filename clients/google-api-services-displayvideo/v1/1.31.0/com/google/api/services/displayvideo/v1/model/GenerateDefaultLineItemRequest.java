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

package com.google.api.services.displayvideo.v1.model;

/**
 * Request message for LineItemService.GenerateDefaultLineItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateDefaultLineItemRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The display name of the line item. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The unique ID of the insertion order that the line item belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long insertionOrderId;

  /**
   * Required. The type of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemType;

  /**
   * The mobile app promoted by the line item. This is applicable only when line_item_type is either
   * `LINE_ITEM_TYPE_DISPLAY_MOBILE_APP_INSTALL` or `LINE_ITEM_TYPE_VIDEO_MOBILE_APP_INSTALL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MobileApp mobileApp;

  /**
   * Required. The display name of the line item. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the line item. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @param displayName displayName or {@code null} for none
   */
  public GenerateDefaultLineItemRequest setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The unique ID of the insertion order that the line item belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInsertionOrderId() {
    return insertionOrderId;
  }

  /**
   * Required. The unique ID of the insertion order that the line item belongs to.
   * @param insertionOrderId insertionOrderId or {@code null} for none
   */
  public GenerateDefaultLineItemRequest setInsertionOrderId(java.lang.Long insertionOrderId) {
    this.insertionOrderId = insertionOrderId;
    return this;
  }

  /**
   * Required. The type of the line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemType() {
    return lineItemType;
  }

  /**
   * Required. The type of the line item.
   * @param lineItemType lineItemType or {@code null} for none
   */
  public GenerateDefaultLineItemRequest setLineItemType(java.lang.String lineItemType) {
    this.lineItemType = lineItemType;
    return this;
  }

  /**
   * The mobile app promoted by the line item. This is applicable only when line_item_type is either
   * `LINE_ITEM_TYPE_DISPLAY_MOBILE_APP_INSTALL` or `LINE_ITEM_TYPE_VIDEO_MOBILE_APP_INSTALL`.
   * @return value or {@code null} for none
   */
  public MobileApp getMobileApp() {
    return mobileApp;
  }

  /**
   * The mobile app promoted by the line item. This is applicable only when line_item_type is either
   * `LINE_ITEM_TYPE_DISPLAY_MOBILE_APP_INSTALL` or `LINE_ITEM_TYPE_VIDEO_MOBILE_APP_INSTALL`.
   * @param mobileApp mobileApp or {@code null} for none
   */
  public GenerateDefaultLineItemRequest setMobileApp(MobileApp mobileApp) {
    this.mobileApp = mobileApp;
    return this;
  }

  @Override
  public GenerateDefaultLineItemRequest set(String fieldName, Object value) {
    return (GenerateDefaultLineItemRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateDefaultLineItemRequest clone() {
    return (GenerateDefaultLineItemRequest) super.clone();
  }

}
