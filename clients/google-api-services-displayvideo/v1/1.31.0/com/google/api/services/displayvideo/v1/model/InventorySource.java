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
 * An inventory source.
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
public final class InventorySource extends com.google.api.client.json.GenericJson {

  /**
   * Whether the inventory source has a guaranteed or non-guaranteed delivery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commitment;

  /**
   * The creative requirements of the inventory source. Not applicable for auction packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CreativeConfig> creativeConfigs;

  static {
    // hack to force ProGuard to consider CreativeConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CreativeConfig.class);
  }

  /**
   * The ID in the exchange space that uniquely identifies the inventory source. Must be unique
   * across buyers within each exchange but not necessarily unique across exchanges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealId;

  /**
   * The delivery method of the inventory source. * For non-guaranteed inventory sources, the only
   * acceptable value is `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`. * For guaranteed inventory
   * sources, acceptable values are `INVENTORY_SOURCE_DELIVERY_METHOD_TAG` and
   * `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliveryMethod;

  /**
   * The display name of the inventory source. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The exchange to which the inventory source belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exchange;

  /**
   * Immutable. The ID of the guaranteed order that this inventory source belongs to. Only
   * applicable when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String guaranteedOrderId;

  /**
   * Output only. The unique ID of the inventory source. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inventorySourceId;

  /**
   * Output only. The product type of the inventory source, denoting the way through which it sells
   * inventory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventorySourceProductType;

  /**
   * Denotes the type of the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventorySourceType;

  /**
   * Output only. The resource name of the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The publisher/seller name of the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherName;

  /**
   * Required. The rate details of the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RateDetails rateDetails;

  /**
   * Output only. The IDs of advertisers with read-only access to the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> readAdvertiserIds;

  /**
   * Output only. The IDs of partners with read-only access to the inventory source. All advertisers
   * of partners in this field inherit read-only access to the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> readPartnerIds;

  /**
   * The partner or advertisers that have read/write access to the inventory source. Output only
   * when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`, in which case the read/write
   * accessors are inherited from the parent guaranteed order. Required when commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED`. If commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED` and a partner is set in this field, all
   * advertisers under this partner will automatically have read-only access to the inventory
   * source. These advertisers will not be included in read_advertiser_ids.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySourceAccessors readWriteAccessors;

  /**
   * The status settings of the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySourceStatus status;

  /**
   * Immutable. The unique ID of the sub-site property assigned to this inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subSitePropertyId;

  /**
   * The time range when this inventory source starts and stops serving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeRange timeRange;

  /**
   * Output only. The timestamp when the inventory source was last updated. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Whether the inventory source has a guaranteed or non-guaranteed delivery.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommitment() {
    return commitment;
  }

  /**
   * Whether the inventory source has a guaranteed or non-guaranteed delivery.
   * @param commitment commitment or {@code null} for none
   */
  public InventorySource setCommitment(java.lang.String commitment) {
    this.commitment = commitment;
    return this;
  }

  /**
   * The creative requirements of the inventory source. Not applicable for auction packages.
   * @return value or {@code null} for none
   */
  public java.util.List<CreativeConfig> getCreativeConfigs() {
    return creativeConfigs;
  }

  /**
   * The creative requirements of the inventory source. Not applicable for auction packages.
   * @param creativeConfigs creativeConfigs or {@code null} for none
   */
  public InventorySource setCreativeConfigs(java.util.List<CreativeConfig> creativeConfigs) {
    this.creativeConfigs = creativeConfigs;
    return this;
  }

  /**
   * The ID in the exchange space that uniquely identifies the inventory source. Must be unique
   * across buyers within each exchange but not necessarily unique across exchanges.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealId() {
    return dealId;
  }

  /**
   * The ID in the exchange space that uniquely identifies the inventory source. Must be unique
   * across buyers within each exchange but not necessarily unique across exchanges.
   * @param dealId dealId or {@code null} for none
   */
  public InventorySource setDealId(java.lang.String dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * The delivery method of the inventory source. * For non-guaranteed inventory sources, the only
   * acceptable value is `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`. * For guaranteed inventory
   * sources, acceptable values are `INVENTORY_SOURCE_DELIVERY_METHOD_TAG` and
   * `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliveryMethod() {
    return deliveryMethod;
  }

  /**
   * The delivery method of the inventory source. * For non-guaranteed inventory sources, the only
   * acceptable value is `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`. * For guaranteed inventory
   * sources, acceptable values are `INVENTORY_SOURCE_DELIVERY_METHOD_TAG` and
   * `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`.
   * @param deliveryMethod deliveryMethod or {@code null} for none
   */
  public InventorySource setDeliveryMethod(java.lang.String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * The display name of the inventory source. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the inventory source. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @param displayName displayName or {@code null} for none
   */
  public InventorySource setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The exchange to which the inventory source belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getExchange() {
    return exchange;
  }

  /**
   * The exchange to which the inventory source belongs.
   * @param exchange exchange or {@code null} for none
   */
  public InventorySource setExchange(java.lang.String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Immutable. The ID of the guaranteed order that this inventory source belongs to. Only
   * applicable when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGuaranteedOrderId() {
    return guaranteedOrderId;
  }

  /**
   * Immutable. The ID of the guaranteed order that this inventory source belongs to. Only
   * applicable when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`.
   * @param guaranteedOrderId guaranteedOrderId or {@code null} for none
   */
  public InventorySource setGuaranteedOrderId(java.lang.String guaranteedOrderId) {
    this.guaranteedOrderId = guaranteedOrderId;
    return this;
  }

  /**
   * Output only. The unique ID of the inventory source. Assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInventorySourceId() {
    return inventorySourceId;
  }

  /**
   * Output only. The unique ID of the inventory source. Assigned by the system.
   * @param inventorySourceId inventorySourceId or {@code null} for none
   */
  public InventorySource setInventorySourceId(java.lang.Long inventorySourceId) {
    this.inventorySourceId = inventorySourceId;
    return this;
  }

  /**
   * Output only. The product type of the inventory source, denoting the way through which it sells
   * inventory.
   * @return value or {@code null} for none
   */
  public java.lang.String getInventorySourceProductType() {
    return inventorySourceProductType;
  }

  /**
   * Output only. The product type of the inventory source, denoting the way through which it sells
   * inventory.
   * @param inventorySourceProductType inventorySourceProductType or {@code null} for none
   */
  public InventorySource setInventorySourceProductType(java.lang.String inventorySourceProductType) {
    this.inventorySourceProductType = inventorySourceProductType;
    return this;
  }

  /**
   * Denotes the type of the inventory source.
   * @return value or {@code null} for none
   */
  public java.lang.String getInventorySourceType() {
    return inventorySourceType;
  }

  /**
   * Denotes the type of the inventory source.
   * @param inventorySourceType inventorySourceType or {@code null} for none
   */
  public InventorySource setInventorySourceType(java.lang.String inventorySourceType) {
    this.inventorySourceType = inventorySourceType;
    return this;
  }

  /**
   * Output only. The resource name of the inventory source.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the inventory source.
   * @param name name or {@code null} for none
   */
  public InventorySource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The publisher/seller name of the inventory source.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherName() {
    return publisherName;
  }

  /**
   * The publisher/seller name of the inventory source.
   * @param publisherName publisherName or {@code null} for none
   */
  public InventorySource setPublisherName(java.lang.String publisherName) {
    this.publisherName = publisherName;
    return this;
  }

  /**
   * Required. The rate details of the inventory source.
   * @return value or {@code null} for none
   */
  public RateDetails getRateDetails() {
    return rateDetails;
  }

  /**
   * Required. The rate details of the inventory source.
   * @param rateDetails rateDetails or {@code null} for none
   */
  public InventorySource setRateDetails(RateDetails rateDetails) {
    this.rateDetails = rateDetails;
    return this;
  }

  /**
   * Output only. The IDs of advertisers with read-only access to the inventory source.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getReadAdvertiserIds() {
    return readAdvertiserIds;
  }

  /**
   * Output only. The IDs of advertisers with read-only access to the inventory source.
   * @param readAdvertiserIds readAdvertiserIds or {@code null} for none
   */
  public InventorySource setReadAdvertiserIds(java.util.List<java.lang.Long> readAdvertiserIds) {
    this.readAdvertiserIds = readAdvertiserIds;
    return this;
  }

  /**
   * Output only. The IDs of partners with read-only access to the inventory source. All advertisers
   * of partners in this field inherit read-only access to the inventory source.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getReadPartnerIds() {
    return readPartnerIds;
  }

  /**
   * Output only. The IDs of partners with read-only access to the inventory source. All advertisers
   * of partners in this field inherit read-only access to the inventory source.
   * @param readPartnerIds readPartnerIds or {@code null} for none
   */
  public InventorySource setReadPartnerIds(java.util.List<java.lang.Long> readPartnerIds) {
    this.readPartnerIds = readPartnerIds;
    return this;
  }

  /**
   * The partner or advertisers that have read/write access to the inventory source. Output only
   * when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`, in which case the read/write
   * accessors are inherited from the parent guaranteed order. Required when commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED`. If commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED` and a partner is set in this field, all
   * advertisers under this partner will automatically have read-only access to the inventory
   * source. These advertisers will not be included in read_advertiser_ids.
   * @return value or {@code null} for none
   */
  public InventorySourceAccessors getReadWriteAccessors() {
    return readWriteAccessors;
  }

  /**
   * The partner or advertisers that have read/write access to the inventory source. Output only
   * when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`, in which case the read/write
   * accessors are inherited from the parent guaranteed order. Required when commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED`. If commitment is
   * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED` and a partner is set in this field, all
   * advertisers under this partner will automatically have read-only access to the inventory
   * source. These advertisers will not be included in read_advertiser_ids.
   * @param readWriteAccessors readWriteAccessors or {@code null} for none
   */
  public InventorySource setReadWriteAccessors(InventorySourceAccessors readWriteAccessors) {
    this.readWriteAccessors = readWriteAccessors;
    return this;
  }

  /**
   * The status settings of the inventory source.
   * @return value or {@code null} for none
   */
  public InventorySourceStatus getStatus() {
    return status;
  }

  /**
   * The status settings of the inventory source.
   * @param status status or {@code null} for none
   */
  public InventorySource setStatus(InventorySourceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Immutable. The unique ID of the sub-site property assigned to this inventory source.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubSitePropertyId() {
    return subSitePropertyId;
  }

  /**
   * Immutable. The unique ID of the sub-site property assigned to this inventory source.
   * @param subSitePropertyId subSitePropertyId or {@code null} for none
   */
  public InventorySource setSubSitePropertyId(java.lang.Long subSitePropertyId) {
    this.subSitePropertyId = subSitePropertyId;
    return this;
  }

  /**
   * The time range when this inventory source starts and stops serving.
   * @return value or {@code null} for none
   */
  public TimeRange getTimeRange() {
    return timeRange;
  }

  /**
   * The time range when this inventory source starts and stops serving.
   * @param timeRange timeRange or {@code null} for none
   */
  public InventorySource setTimeRange(TimeRange timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * Output only. The timestamp when the inventory source was last updated. Assigned by the system.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the inventory source was last updated. Assigned by the system.
   * @param updateTime updateTime or {@code null} for none
   */
  public InventorySource setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public InventorySource set(String fieldName, Object value) {
    return (InventorySource) super.set(fieldName, value);
  }

  @Override
  public InventorySource clone() {
    return (InventorySource) super.clone();
  }

}
