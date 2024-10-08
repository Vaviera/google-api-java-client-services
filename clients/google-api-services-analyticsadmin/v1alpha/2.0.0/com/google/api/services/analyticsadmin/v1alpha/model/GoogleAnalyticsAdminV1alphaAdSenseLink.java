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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A link between a Google Analytics property and an AdSense for Content ad client.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaAdSenseLink extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The AdSense ad client code that the Google Analytics property is linked to. Example
   * format: "ca-pub-1234567890"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adClientCode;

  /**
   * Output only. The resource name for this AdSense Link resource. Format:
   * properties/{propertyId}/adSenseLinks/{linkId} Example: properties/1234/adSenseLinks/6789
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The AdSense ad client code that the Google Analytics property is linked to. Example
   * format: "ca-pub-1234567890"
   * @return value or {@code null} for none
   */
  public java.lang.String getAdClientCode() {
    return adClientCode;
  }

  /**
   * Immutable. The AdSense ad client code that the Google Analytics property is linked to. Example
   * format: "ca-pub-1234567890"
   * @param adClientCode adClientCode or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAdSenseLink setAdClientCode(java.lang.String adClientCode) {
    this.adClientCode = adClientCode;
    return this;
  }

  /**
   * Output only. The resource name for this AdSense Link resource. Format:
   * properties/{propertyId}/adSenseLinks/{linkId} Example: properties/1234/adSenseLinks/6789
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this AdSense Link resource. Format:
   * properties/{propertyId}/adSenseLinks/{linkId} Example: properties/1234/adSenseLinks/6789
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAdSenseLink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAdSenseLink set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaAdSenseLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAdSenseLink clone() {
    return (GoogleAnalyticsAdminV1alphaAdSenseLink) super.clone();
  }

}
