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
 * A single advertiser in Display & Video 360 (DV360).
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
public final class Advertiser extends com.google.api.client.json.GenericJson {

  /**
   * Required. Immutable. Ad server related settings of the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserAdServerConfig adServerConfig;

  /**
   * Output only. The unique ID of the advertiser. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Required. Creative related settings of the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserCreativeConfig creativeConfig;

  /**
   * Settings that control how advertiser data may be accessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserDataAccessConfig dataAccessConfig;

  /**
   * Required. The display name of the advertiser. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. Controls whether or not insertion orders and line items of the advertiser can spend
   * their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`,
   * `ENTITY_STATUS_PAUSED` and `ENTITY_STATUS_SCHEDULED_FOR_DELETION`. * If set to
   * `ENTITY_STATUS_SCHEDULED_FOR_DELETION`, the advertiser will be deleted 30 days from when it was
   * first scheduled for deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityStatus;

  /**
   * Required. General settings of the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserGeneralConfig generalConfig;

  /**
   * Integration details of the advertiser. Only integrationCode is currently applicable to
   * advertiser. Other fields of IntegrationDetails are not supported and will be ignored if
   * provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegrationDetails integrationDetails;

  /**
   * Output only. The resource name of the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The unique ID of the partner that the advertiser belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partnerId;

  /**
   * Whether integration with Mediaocean (Prisma) is enabled. By enabling this: On behalf of my
   * company, I authorize Mediaocean (Prisma) to send budget segment plans to Google, and I
   * authorize Google to send corresponding reporting and invoices from DV360 to Mediaocean for the
   * purposes of budget planning, billing, and reconciliation for this advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean prismaEnabled;

  /**
   * Targeting settings related to ad serving of the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertiserTargetingConfig servingConfig;

  /**
   * Output only. The timestamp when the advertiser was last updated. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. Immutable. Ad server related settings of the advertiser.
   * @return value or {@code null} for none
   */
  public AdvertiserAdServerConfig getAdServerConfig() {
    return adServerConfig;
  }

  /**
   * Required. Immutable. Ad server related settings of the advertiser.
   * @param adServerConfig adServerConfig or {@code null} for none
   */
  public Advertiser setAdServerConfig(AdvertiserAdServerConfig adServerConfig) {
    this.adServerConfig = adServerConfig;
    return this;
  }

  /**
   * Output only. The unique ID of the advertiser. Assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Output only. The unique ID of the advertiser. Assigned by the system.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Advertiser setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Required. Creative related settings of the advertiser.
   * @return value or {@code null} for none
   */
  public AdvertiserCreativeConfig getCreativeConfig() {
    return creativeConfig;
  }

  /**
   * Required. Creative related settings of the advertiser.
   * @param creativeConfig creativeConfig or {@code null} for none
   */
  public Advertiser setCreativeConfig(AdvertiserCreativeConfig creativeConfig) {
    this.creativeConfig = creativeConfig;
    return this;
  }

  /**
   * Settings that control how advertiser data may be accessed.
   * @return value or {@code null} for none
   */
  public AdvertiserDataAccessConfig getDataAccessConfig() {
    return dataAccessConfig;
  }

  /**
   * Settings that control how advertiser data may be accessed.
   * @param dataAccessConfig dataAccessConfig or {@code null} for none
   */
  public Advertiser setDataAccessConfig(AdvertiserDataAccessConfig dataAccessConfig) {
    this.dataAccessConfig = dataAccessConfig;
    return this;
  }

  /**
   * Required. The display name of the advertiser. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the advertiser. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @param displayName displayName or {@code null} for none
   */
  public Advertiser setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. Controls whether or not insertion orders and line items of the advertiser can spend
   * their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`,
   * `ENTITY_STATUS_PAUSED` and `ENTITY_STATUS_SCHEDULED_FOR_DELETION`. * If set to
   * `ENTITY_STATUS_SCHEDULED_FOR_DELETION`, the advertiser will be deleted 30 days from when it was
   * first scheduled for deletion.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityStatus() {
    return entityStatus;
  }

  /**
   * Required. Controls whether or not insertion orders and line items of the advertiser can spend
   * their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`,
   * `ENTITY_STATUS_PAUSED` and `ENTITY_STATUS_SCHEDULED_FOR_DELETION`. * If set to
   * `ENTITY_STATUS_SCHEDULED_FOR_DELETION`, the advertiser will be deleted 30 days from when it was
   * first scheduled for deletion.
   * @param entityStatus entityStatus or {@code null} for none
   */
  public Advertiser setEntityStatus(java.lang.String entityStatus) {
    this.entityStatus = entityStatus;
    return this;
  }

  /**
   * Required. General settings of the advertiser.
   * @return value or {@code null} for none
   */
  public AdvertiserGeneralConfig getGeneralConfig() {
    return generalConfig;
  }

  /**
   * Required. General settings of the advertiser.
   * @param generalConfig generalConfig or {@code null} for none
   */
  public Advertiser setGeneralConfig(AdvertiserGeneralConfig generalConfig) {
    this.generalConfig = generalConfig;
    return this;
  }

  /**
   * Integration details of the advertiser. Only integrationCode is currently applicable to
   * advertiser. Other fields of IntegrationDetails are not supported and will be ignored if
   * provided.
   * @return value or {@code null} for none
   */
  public IntegrationDetails getIntegrationDetails() {
    return integrationDetails;
  }

  /**
   * Integration details of the advertiser. Only integrationCode is currently applicable to
   * advertiser. Other fields of IntegrationDetails are not supported and will be ignored if
   * provided.
   * @param integrationDetails integrationDetails or {@code null} for none
   */
  public Advertiser setIntegrationDetails(IntegrationDetails integrationDetails) {
    this.integrationDetails = integrationDetails;
    return this;
  }

  /**
   * Output only. The resource name of the advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the advertiser.
   * @param name name or {@code null} for none
   */
  public Advertiser setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The unique ID of the partner that the advertiser belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartnerId() {
    return partnerId;
  }

  /**
   * Required. Immutable. The unique ID of the partner that the advertiser belongs to.
   * @param partnerId partnerId or {@code null} for none
   */
  public Advertiser setPartnerId(java.lang.Long partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Whether integration with Mediaocean (Prisma) is enabled. By enabling this: On behalf of my
   * company, I authorize Mediaocean (Prisma) to send budget segment plans to Google, and I
   * authorize Google to send corresponding reporting and invoices from DV360 to Mediaocean for the
   * purposes of budget planning, billing, and reconciliation for this advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrismaEnabled() {
    return prismaEnabled;
  }

  /**
   * Whether integration with Mediaocean (Prisma) is enabled. By enabling this: On behalf of my
   * company, I authorize Mediaocean (Prisma) to send budget segment plans to Google, and I
   * authorize Google to send corresponding reporting and invoices from DV360 to Mediaocean for the
   * purposes of budget planning, billing, and reconciliation for this advertiser.
   * @param prismaEnabled prismaEnabled or {@code null} for none
   */
  public Advertiser setPrismaEnabled(java.lang.Boolean prismaEnabled) {
    this.prismaEnabled = prismaEnabled;
    return this;
  }

  /**
   * Targeting settings related to ad serving of the advertiser.
   * @return value or {@code null} for none
   */
  public AdvertiserTargetingConfig getServingConfig() {
    return servingConfig;
  }

  /**
   * Targeting settings related to ad serving of the advertiser.
   * @param servingConfig servingConfig or {@code null} for none
   */
  public Advertiser setServingConfig(AdvertiserTargetingConfig servingConfig) {
    this.servingConfig = servingConfig;
    return this;
  }

  /**
   * Output only. The timestamp when the advertiser was last updated. Assigned by the system.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the advertiser was last updated. Assigned by the system.
   * @param updateTime updateTime or {@code null} for none
   */
  public Advertiser setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Advertiser set(String fieldName, Object value) {
    return (Advertiser) super.set(fieldName, value);
  }

  @Override
  public Advertiser clone() {
    return (Advertiser) super.clone();
  }

}
