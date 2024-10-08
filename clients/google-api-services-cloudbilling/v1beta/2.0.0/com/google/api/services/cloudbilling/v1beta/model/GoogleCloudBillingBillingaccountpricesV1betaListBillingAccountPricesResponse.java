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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Response message for ListBillingAccountPrices.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The returned billing account prices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice> billingAccountPrices;

  static {
    // hack to force ProGuard to consider GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice.class);
  }

  /**
   * Token that can be sent as `page_token` in the subsequent request to retrieve the next page. If
   * this field is empty, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The returned billing account prices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice> getBillingAccountPrices() {
    return billingAccountPrices;
  }

  /**
   * The returned billing account prices.
   * @param billingAccountPrices billingAccountPrices or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse setBillingAccountPrices(java.util.List<GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice> billingAccountPrices) {
    this.billingAccountPrices = billingAccountPrices;
    return this;
  }

  /**
   * Token that can be sent as `page_token` in the subsequent request to retrieve the next page. If
   * this field is empty, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token that can be sent as `page_token` in the subsequent request to retrieve the next page. If
   * this field is empty, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse set(String fieldName, Object value) {
    return (GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse clone() {
    return (GoogleCloudBillingBillingaccountpricesV1betaListBillingAccountPricesResponse) super.clone();
  }

}
