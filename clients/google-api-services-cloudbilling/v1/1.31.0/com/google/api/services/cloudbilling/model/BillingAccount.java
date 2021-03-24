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

package com.google.api.services.cloudbilling.model;

/**
 * A billing account in the [Google Cloud Console](https://console.cloud.google.com/). You can
 * assign a billing account to one or more projects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BillingAccount extends com.google.api.client.json.GenericJson {

  /**
   * The display name given to the billing account, such as `My Billing Account`. This name is
   * displayed in the Google Cloud Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * If this account is a [subaccount](https://cloud.google.com/billing/docs/concepts), then this
   * will be the resource name of the parent billing account that it is being resold through.
   * Otherwise this will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterBillingAccount;

  /**
   * Output only. The resource name of the billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`
   * would be the resource name for billing account `012345-567890-ABCDEF`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. True if the billing account is open, and will therefore be charged for any usage
   * on associated projects. False if the billing account is closed, and therefore projects
   * associated with it will be unable to use paid services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean open;

  /**
   * The display name given to the billing account, such as `My Billing Account`. This name is
   * displayed in the Google Cloud Console.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name given to the billing account, such as `My Billing Account`. This name is
   * displayed in the Google Cloud Console.
   * @param displayName displayName or {@code null} for none
   */
  public BillingAccount setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * If this account is a [subaccount](https://cloud.google.com/billing/docs/concepts), then this
   * will be the resource name of the parent billing account that it is being resold through.
   * Otherwise this will be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterBillingAccount() {
    return masterBillingAccount;
  }

  /**
   * If this account is a [subaccount](https://cloud.google.com/billing/docs/concepts), then this
   * will be the resource name of the parent billing account that it is being resold through.
   * Otherwise this will be empty.
   * @param masterBillingAccount masterBillingAccount or {@code null} for none
   */
  public BillingAccount setMasterBillingAccount(java.lang.String masterBillingAccount) {
    this.masterBillingAccount = masterBillingAccount;
    return this;
  }

  /**
   * Output only. The resource name of the billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`
   * would be the resource name for billing account `012345-567890-ABCDEF`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the billing account. The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`
   * would be the resource name for billing account `012345-567890-ABCDEF`.
   * @param name name or {@code null} for none
   */
  public BillingAccount setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. True if the billing account is open, and will therefore be charged for any usage
   * on associated projects. False if the billing account is closed, and therefore projects
   * associated with it will be unable to use paid services.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOpen() {
    return open;
  }

  /**
   * Output only. True if the billing account is open, and will therefore be charged for any usage
   * on associated projects. False if the billing account is closed, and therefore projects
   * associated with it will be unable to use paid services.
   * @param open open or {@code null} for none
   */
  public BillingAccount setOpen(java.lang.Boolean open) {
    this.open = open;
    return this;
  }

  @Override
  public BillingAccount set(String fieldName, Object value) {
    return (BillingAccount) super.set(fieldName, value);
  }

  @Override
  public BillingAccount clone() {
    return (BillingAccount) super.clone();
  }

}
