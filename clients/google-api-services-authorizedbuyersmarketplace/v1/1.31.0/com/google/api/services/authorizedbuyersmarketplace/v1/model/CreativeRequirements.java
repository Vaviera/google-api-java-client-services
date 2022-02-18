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

package com.google.api.services.authorizedbuyersmarketplace.v1.model;

/**
 * Message captures data about the creatives in the deal.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeRequirements extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The format of the creative, only applicable for programmatic guaranteed and
   * preferred deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeFormat;

  /**
   * Output only. Specifies the creative pre-approval policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativePreApprovalPolicy;

  /**
   * Output only. Specifies whether the creative is safeFrame compatible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeSafeFrameCompatibility;

  /**
   * Output only. The max duration of the video creative in milliseconds. only applicable for deals
   * with video creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxAdDurationMs;

  /**
   * Output only. Specifies the creative source for programmatic deals. PUBLISHER means creative is
   * provided by seller and ADVERTISER means creative is provided by the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String programmaticCreativeSource;

  /**
   * Output only. Skippable video ads allow viewers to skip ads after 5 seconds. Only applicable for
   * deals with video creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skippableAdType;

  /**
   * Output only. The format of the creative, only applicable for programmatic guaranteed and
   * preferred deals.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeFormat() {
    return creativeFormat;
  }

  /**
   * Output only. The format of the creative, only applicable for programmatic guaranteed and
   * preferred deals.
   * @param creativeFormat creativeFormat or {@code null} for none
   */
  public CreativeRequirements setCreativeFormat(java.lang.String creativeFormat) {
    this.creativeFormat = creativeFormat;
    return this;
  }

  /**
   * Output only. Specifies the creative pre-approval policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativePreApprovalPolicy() {
    return creativePreApprovalPolicy;
  }

  /**
   * Output only. Specifies the creative pre-approval policy.
   * @param creativePreApprovalPolicy creativePreApprovalPolicy or {@code null} for none
   */
  public CreativeRequirements setCreativePreApprovalPolicy(java.lang.String creativePreApprovalPolicy) {
    this.creativePreApprovalPolicy = creativePreApprovalPolicy;
    return this;
  }

  /**
   * Output only. Specifies whether the creative is safeFrame compatible.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeSafeFrameCompatibility() {
    return creativeSafeFrameCompatibility;
  }

  /**
   * Output only. Specifies whether the creative is safeFrame compatible.
   * @param creativeSafeFrameCompatibility creativeSafeFrameCompatibility or {@code null} for none
   */
  public CreativeRequirements setCreativeSafeFrameCompatibility(java.lang.String creativeSafeFrameCompatibility) {
    this.creativeSafeFrameCompatibility = creativeSafeFrameCompatibility;
    return this;
  }

  /**
   * Output only. The max duration of the video creative in milliseconds. only applicable for deals
   * with video creatives.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxAdDurationMs() {
    return maxAdDurationMs;
  }

  /**
   * Output only. The max duration of the video creative in milliseconds. only applicable for deals
   * with video creatives.
   * @param maxAdDurationMs maxAdDurationMs or {@code null} for none
   */
  public CreativeRequirements setMaxAdDurationMs(java.lang.Long maxAdDurationMs) {
    this.maxAdDurationMs = maxAdDurationMs;
    return this;
  }

  /**
   * Output only. Specifies the creative source for programmatic deals. PUBLISHER means creative is
   * provided by seller and ADVERTISER means creative is provided by the buyer.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgrammaticCreativeSource() {
    return programmaticCreativeSource;
  }

  /**
   * Output only. Specifies the creative source for programmatic deals. PUBLISHER means creative is
   * provided by seller and ADVERTISER means creative is provided by the buyer.
   * @param programmaticCreativeSource programmaticCreativeSource or {@code null} for none
   */
  public CreativeRequirements setProgrammaticCreativeSource(java.lang.String programmaticCreativeSource) {
    this.programmaticCreativeSource = programmaticCreativeSource;
    return this;
  }

  /**
   * Output only. Skippable video ads allow viewers to skip ads after 5 seconds. Only applicable for
   * deals with video creatives.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkippableAdType() {
    return skippableAdType;
  }

  /**
   * Output only. Skippable video ads allow viewers to skip ads after 5 seconds. Only applicable for
   * deals with video creatives.
   * @param skippableAdType skippableAdType or {@code null} for none
   */
  public CreativeRequirements setSkippableAdType(java.lang.String skippableAdType) {
    this.skippableAdType = skippableAdType;
    return this;
  }

  @Override
  public CreativeRequirements set(String fieldName, Object value) {
    return (CreativeRequirements) super.set(fieldName, value);
  }

  @Override
  public CreativeRequirements clone() {
    return (CreativeRequirements) super.clone();
  }

}
