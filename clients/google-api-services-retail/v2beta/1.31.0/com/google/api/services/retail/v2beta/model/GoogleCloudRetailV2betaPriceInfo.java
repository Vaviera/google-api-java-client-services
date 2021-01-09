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

package com.google.api.services.retail.v2beta.model;

/**
 * The price information of a Product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaPriceInfo extends com.google.api.client.json.GenericJson {

  /**
   * The costs associated with the sale of a particular product. Used for gross profit reporting. *
   * Profit = price - cost Google Merchant Center property
   * [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float cost;

  /**
   * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-
   * codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Price of the product without any discount. If zero, by default set to be the price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float originalPrice;

  /**
   * Price of the product. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371). Schema.org property
   * [Offer.priceSpecification](https://schema.org/priceSpecification).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float price;

  /**
   * The costs associated with the sale of a particular product. Used for gross profit reporting. *
   * Profit = price - cost Google Merchant Center property
   * [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
   * @return value or {@code null} for none
   */
  public java.lang.Float getCost() {
    return cost;
  }

  /**
   * The costs associated with the sale of a particular product. Used for gross profit reporting. *
   * Profit = price - cost Google Merchant Center property
   * [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
   * @param cost cost or {@code null} for none
   */
  public GoogleCloudRetailV2betaPriceInfo setCost(java.lang.Float cost) {
    this.cost = cost;
    return this;
  }

  /**
   * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-
   * codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is
   * returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-
   * codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is
   * returned.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public GoogleCloudRetailV2betaPriceInfo setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Price of the product without any discount. If zero, by default set to be the price.
   * @return value or {@code null} for none
   */
  public java.lang.Float getOriginalPrice() {
    return originalPrice;
  }

  /**
   * Price of the product without any discount. If zero, by default set to be the price.
   * @param originalPrice originalPrice or {@code null} for none
   */
  public GoogleCloudRetailV2betaPriceInfo setOriginalPrice(java.lang.Float originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

  /**
   * Price of the product. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371). Schema.org property
   * [Offer.priceSpecification](https://schema.org/priceSpecification).
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrice() {
    return price;
  }

  /**
   * Price of the product. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371). Schema.org property
   * [Offer.priceSpecification](https://schema.org/priceSpecification).
   * @param price price or {@code null} for none
   */
  public GoogleCloudRetailV2betaPriceInfo setPrice(java.lang.Float price) {
    this.price = price;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaPriceInfo set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaPriceInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaPriceInfo clone() {
    return (GoogleCloudRetailV2betaPriceInfo) super.clone();
  }

}
