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

package com.google.api.services.directory.model;

/**
 * Model definition for Customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Customer extends com.google.api.client.json.GenericJson {

  /**
   * The customer's secondary contact email address. This email address cannot be on the same domain
   * as the `customerDomain`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateEmail;

  /**
   * The customer's creation time (Readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime customerCreationTime;

  /**
   * The customer's primary domain name string. Do not include the `www` prefix when creating a new
   * customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerDomain;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The unique ID for the customer's Google Workspace account. (Readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies the resource as a customer. Value: `admin#directory#customer`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The customer's ISO 639-2 language code. See the [Language Codes](/admin-
   * sdk/directory/v1/languages) page for the list of supported codes. Valid language codes outside
   * the supported set will be accepted by the API but may lead to unexpected behavior. The default
   * value is `en`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The customer's contact phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The customer's postal address information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerPostalAddress postalAddress;

  /**
   * The customer's secondary contact email address. This email address cannot be on the same domain
   * as the `customerDomain`
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateEmail() {
    return alternateEmail;
  }

  /**
   * The customer's secondary contact email address. This email address cannot be on the same domain
   * as the `customerDomain`
   * @param alternateEmail alternateEmail or {@code null} for none
   */
  public Customer setAlternateEmail(java.lang.String alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  /**
   * The customer's creation time (Readonly)
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCustomerCreationTime() {
    return customerCreationTime;
  }

  /**
   * The customer's creation time (Readonly)
   * @param customerCreationTime customerCreationTime or {@code null} for none
   */
  public Customer setCustomerCreationTime(com.google.api.client.util.DateTime customerCreationTime) {
    this.customerCreationTime = customerCreationTime;
    return this;
  }

  /**
   * The customer's primary domain name string. Do not include the `www` prefix when creating a new
   * customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerDomain() {
    return customerDomain;
  }

  /**
   * The customer's primary domain name string. Do not include the `www` prefix when creating a new
   * customer.
   * @param customerDomain customerDomain or {@code null} for none
   */
  public Customer setCustomerDomain(java.lang.String customerDomain) {
    this.customerDomain = customerDomain;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Customer setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The unique ID for the customer's Google Workspace account. (Readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID for the customer's Google Workspace account. (Readonly)
   * @param id id or {@code null} for none
   */
  public Customer setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the resource as a customer. Value: `admin#directory#customer`
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a customer. Value: `admin#directory#customer`
   * @param kind kind or {@code null} for none
   */
  public Customer setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The customer's ISO 639-2 language code. See the [Language Codes](/admin-
   * sdk/directory/v1/languages) page for the list of supported codes. Valid language codes outside
   * the supported set will be accepted by the API but may lead to unexpected behavior. The default
   * value is `en`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The customer's ISO 639-2 language code. See the [Language Codes](/admin-
   * sdk/directory/v1/languages) page for the list of supported codes. Valid language codes outside
   * the supported set will be accepted by the API but may lead to unexpected behavior. The default
   * value is `en`.
   * @param language language or {@code null} for none
   */
  public Customer setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * The customer's contact phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The customer's contact phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public Customer setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The customer's postal address information.
   * @return value or {@code null} for none
   */
  public CustomerPostalAddress getPostalAddress() {
    return postalAddress;
  }

  /**
   * The customer's postal address information.
   * @param postalAddress postalAddress or {@code null} for none
   */
  public Customer setPostalAddress(CustomerPostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  @Override
  public Customer set(String fieldName, Object value) {
    return (Customer) super.set(fieldName, value);
  }

  @Override
  public Customer clone() {
    return (Customer) super.clone();
  }

}
