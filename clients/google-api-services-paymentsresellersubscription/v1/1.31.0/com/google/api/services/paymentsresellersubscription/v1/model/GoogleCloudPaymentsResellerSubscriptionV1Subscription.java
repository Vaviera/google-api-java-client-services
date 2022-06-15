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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * A Subscription resource managed by 3P Partners.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1Subscription extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Describes the details of a cancelled subscription. Only applicable to subscription
   * of state `STATE_CANCELLED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails cancellationDetails;

  /**
   * Output only. System generated timestamp when the subscription is created. UTC timezone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time at which the subscription is expected to be extended, in ISO 8061 format.
   * UTC timezone. For example: "2019-08-31T17:28:54.564Z"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cycleEndTime;

  /**
   * Output only. Indicates if the subscription is entitled to the end user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean endUserEntitled;

  /**
   * Output only. End of the free trial period, in ISO 8061 format. For example,
   * "2019-08-31T17:28:54.564Z". It will be set the same as createTime if no free trial promotion is
   * specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String freeTrialEndTime;

  /**
   * Required. The line items of the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem> lineItems;

  /**
   * Output only. Response only. Resource name of the subscription. It will have the format of
   * "partners/{partner_id}/subscriptions/{subscription_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Identifier of the end-user in partner’s system. The value is restricted to 63 ASCII
   * characters at the maximum.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerUserToken;

  /**
   * Output only. Describes the processing state of the subscription. See more details at [the
   * lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String processingState;

  /**
   * Required. Deprecated: consider using `line_items` as the input. Required. Resource name that
   * identifies the purchased products. The format will be
   * 'partners/{partner_id}/products/{product_id}'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> products;

  /**
   * Optional. Subscription-level promotions. Only free trial is supported on this level. It
   * determines the first renewal time of the subscription to be the end of the free trial period.
   * Specify the promotion resource name only when used as input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> promotionSpecs;

  /**
   * Optional. Deprecated: consider using the top-level `promotion_specs` as the input. Optional.
   * Resource name that identifies one or more promotions that can be applied on the product. A
   * typical promotion for a subscription is Free trial. The format will be
   * 'partners/{partner_id}/promotions/{promotion_id}'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> promotions;

  /**
   * Output only. The place where partners should redirect the end-user to after creation. This
   * field might also be populated when creation failed. However, Partners should always prepare a
   * default URL to redirect the user in case this field is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectUri;

  /**
   * Output only. The time at which the subscription is expected to be renewed by Google - a new
   * charge will be incurred and the service entitlement will be renewed. A non-immediate
   * cancellation will take place at this time too, before which, the service entitlement for the
   * end user will remain valid. UTC timezone in ISO 8061 format. For example:
   * "2019-08-31T17:28:54.564Z"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String renewalTime;

  /**
   * Required. The location that the service is provided as indicated by the partner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1Location serviceLocation;

  /**
   * Output only. Describes the state of the subscription. See more details at [the lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. System generated timestamp when the subscription is most recently updated. UTC
   * timezone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Details about the previous subscription that this new subscription
   * upgrades/downgrades from. Only populated if this subscription is an upgrade/downgrade from
   * another subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails upgradeDowngradeDetails;

  /**
   * Output only. Describes the details of a cancelled subscription. Only applicable to subscription
   * of state `STATE_CANCELLED`.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails getCancellationDetails() {
    return cancellationDetails;
  }

  /**
   * Output only. Describes the details of a cancelled subscription. Only applicable to subscription
   * of state `STATE_CANCELLED`.
   * @param cancellationDetails cancellationDetails or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setCancellationDetails(GoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails cancellationDetails) {
    this.cancellationDetails = cancellationDetails;
    return this;
  }

  /**
   * Output only. System generated timestamp when the subscription is created. UTC timezone.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. System generated timestamp when the subscription is created. UTC timezone.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time at which the subscription is expected to be extended, in ISO 8061 format.
   * UTC timezone. For example: "2019-08-31T17:28:54.564Z"
   * @return value or {@code null} for none
   */
  public String getCycleEndTime() {
    return cycleEndTime;
  }

  /**
   * Output only. The time at which the subscription is expected to be extended, in ISO 8061 format.
   * UTC timezone. For example: "2019-08-31T17:28:54.564Z"
   * @param cycleEndTime cycleEndTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setCycleEndTime(String cycleEndTime) {
    this.cycleEndTime = cycleEndTime;
    return this;
  }

  /**
   * Output only. Indicates if the subscription is entitled to the end user.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEndUserEntitled() {
    return endUserEntitled;
  }

  /**
   * Output only. Indicates if the subscription is entitled to the end user.
   * @param endUserEntitled endUserEntitled or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setEndUserEntitled(java.lang.Boolean endUserEntitled) {
    this.endUserEntitled = endUserEntitled;
    return this;
  }

  /**
   * Output only. End of the free trial period, in ISO 8061 format. For example,
   * "2019-08-31T17:28:54.564Z". It will be set the same as createTime if no free trial promotion is
   * specified.
   * @return value or {@code null} for none
   */
  public String getFreeTrialEndTime() {
    return freeTrialEndTime;
  }

  /**
   * Output only. End of the free trial period, in ISO 8061 format. For example,
   * "2019-08-31T17:28:54.564Z". It will be set the same as createTime if no free trial promotion is
   * specified.
   * @param freeTrialEndTime freeTrialEndTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setFreeTrialEndTime(String freeTrialEndTime) {
    this.freeTrialEndTime = freeTrialEndTime;
    return this;
  }

  /**
   * Required. The line items of the subscription.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Required. The line items of the subscription.
   * @param lineItems lineItems or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setLineItems(java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Output only. Response only. Resource name of the subscription. It will have the format of
   * "partners/{partner_id}/subscriptions/{subscription_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Response only. Resource name of the subscription. It will have the format of
   * "partners/{partner_id}/subscriptions/{subscription_id}"
   * @param name name or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Identifier of the end-user in partner’s system. The value is restricted to 63 ASCII
   * characters at the maximum.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerUserToken() {
    return partnerUserToken;
  }

  /**
   * Required. Identifier of the end-user in partner’s system. The value is restricted to 63 ASCII
   * characters at the maximum.
   * @param partnerUserToken partnerUserToken or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setPartnerUserToken(java.lang.String partnerUserToken) {
    this.partnerUserToken = partnerUserToken;
    return this;
  }

  /**
   * Output only. Describes the processing state of the subscription. See more details at [the
   * lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * @return value or {@code null} for none
   */
  public java.lang.String getProcessingState() {
    return processingState;
  }

  /**
   * Output only. Describes the processing state of the subscription. See more details at [the
   * lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * @param processingState processingState or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setProcessingState(java.lang.String processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Required. Deprecated: consider using `line_items` as the input. Required. Resource name that
   * identifies the purchased products. The format will be
   * 'partners/{partner_id}/products/{product_id}'.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProducts() {
    return products;
  }

  /**
   * Required. Deprecated: consider using `line_items` as the input. Required. Resource name that
   * identifies the purchased products. The format will be
   * 'partners/{partner_id}/products/{product_id}'.
   * @param products products or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setProducts(java.util.List<java.lang.String> products) {
    this.products = products;
    return this;
  }

  /**
   * Optional. Subscription-level promotions. Only free trial is supported on this level. It
   * determines the first renewal time of the subscription to be the end of the free trial period.
   * Specify the promotion resource name only when used as input.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> getPromotionSpecs() {
    return promotionSpecs;
  }

  /**
   * Optional. Subscription-level promotions. Only free trial is supported on this level. It
   * determines the first renewal time of the subscription to be the end of the free trial period.
   * Specify the promotion resource name only when used as input.
   * @param promotionSpecs promotionSpecs or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setPromotionSpecs(java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> promotionSpecs) {
    this.promotionSpecs = promotionSpecs;
    return this;
  }

  /**
   * Optional. Deprecated: consider using the top-level `promotion_specs` as the input. Optional.
   * Resource name that identifies one or more promotions that can be applied on the product. A
   * typical promotion for a subscription is Free trial. The format will be
   * 'partners/{partner_id}/promotions/{promotion_id}'.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPromotions() {
    return promotions;
  }

  /**
   * Optional. Deprecated: consider using the top-level `promotion_specs` as the input. Optional.
   * Resource name that identifies one or more promotions that can be applied on the product. A
   * typical promotion for a subscription is Free trial. The format will be
   * 'partners/{partner_id}/promotions/{promotion_id}'.
   * @param promotions promotions or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setPromotions(java.util.List<java.lang.String> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Output only. The place where partners should redirect the end-user to after creation. This
   * field might also be populated when creation failed. However, Partners should always prepare a
   * default URL to redirect the user in case this field is empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectUri() {
    return redirectUri;
  }

  /**
   * Output only. The place where partners should redirect the end-user to after creation. This
   * field might also be populated when creation failed. However, Partners should always prepare a
   * default URL to redirect the user in case this field is empty.
   * @param redirectUri redirectUri or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setRedirectUri(java.lang.String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Output only. The time at which the subscription is expected to be renewed by Google - a new
   * charge will be incurred and the service entitlement will be renewed. A non-immediate
   * cancellation will take place at this time too, before which, the service entitlement for the
   * end user will remain valid. UTC timezone in ISO 8061 format. For example:
   * "2019-08-31T17:28:54.564Z"
   * @return value or {@code null} for none
   */
  public String getRenewalTime() {
    return renewalTime;
  }

  /**
   * Output only. The time at which the subscription is expected to be renewed by Google - a new
   * charge will be incurred and the service entitlement will be renewed. A non-immediate
   * cancellation will take place at this time too, before which, the service entitlement for the
   * end user will remain valid. UTC timezone in ISO 8061 format. For example:
   * "2019-08-31T17:28:54.564Z"
   * @param renewalTime renewalTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setRenewalTime(String renewalTime) {
    this.renewalTime = renewalTime;
    return this;
  }

  /**
   * Required. The location that the service is provided as indicated by the partner.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Location getServiceLocation() {
    return serviceLocation;
  }

  /**
   * Required. The location that the service is provided as indicated by the partner.
   * @param serviceLocation serviceLocation or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setServiceLocation(GoogleCloudPaymentsResellerSubscriptionV1Location serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Output only. Describes the state of the subscription. See more details at [the lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Describes the state of the subscription. See more details at [the lifecycle of a
   * subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-
   * subscription-lifecycle).
   * @param state state or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. System generated timestamp when the subscription is most recently updated. UTC
   * timezone.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. System generated timestamp when the subscription is most recently updated. UTC
   * timezone.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. Details about the previous subscription that this new subscription
   * upgrades/downgrades from. Only populated if this subscription is an upgrade/downgrade from
   * another subscription.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails getUpgradeDowngradeDetails() {
    return upgradeDowngradeDetails;
  }

  /**
   * Optional. Details about the previous subscription that this new subscription
   * upgrades/downgrades from. Only populated if this subscription is an upgrade/downgrade from
   * another subscription.
   * @param upgradeDowngradeDetails upgradeDowngradeDetails or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription setUpgradeDowngradeDetails(GoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails upgradeDowngradeDetails) {
    this.upgradeDowngradeDetails = upgradeDowngradeDetails;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1Subscription) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1Subscription clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1Subscription) super.clone();
  }

}
