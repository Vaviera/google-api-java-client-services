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

package com.google.api.services.analyticshub.v1.model;

/**
 * Data Clean Room (DCR), used for privacy-safe and secured data sharing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DcrExchangeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If True, when subscribing to this DCR, it will create only one linked dataset
   * containing all resources shared within the cleanroom. If False, when subscribing to this DCR,
   * it will create 1 linked dataset per listing. This is not configurable, and by default, all new
   * DCRs will have the restriction set to True.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleLinkedDatasetPerCleanroom;

  /**
   * Output only. If True, this DCR restricts the contributors to sharing only a single resource in
   * a Listing. And no two resources should have the same IDs. So if a contributor adds a view with
   * a conflicting name, the CreateListing API will reject the request. if False, the data
   * contributor can publish an entire dataset (as before). This is not configurable, and by
   * default, all new DCRs will have the restriction set to True.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleSelectedResourceSharingRestriction;

  /**
   * Output only. If True, when subscribing to this DCR, it will create only one linked dataset
   * containing all resources shared within the cleanroom. If False, when subscribing to this DCR,
   * it will create 1 linked dataset per listing. This is not configurable, and by default, all new
   * DCRs will have the restriction set to True.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleLinkedDatasetPerCleanroom() {
    return singleLinkedDatasetPerCleanroom;
  }

  /**
   * Output only. If True, when subscribing to this DCR, it will create only one linked dataset
   * containing all resources shared within the cleanroom. If False, when subscribing to this DCR,
   * it will create 1 linked dataset per listing. This is not configurable, and by default, all new
   * DCRs will have the restriction set to True.
   * @param singleLinkedDatasetPerCleanroom singleLinkedDatasetPerCleanroom or {@code null} for none
   */
  public DcrExchangeConfig setSingleLinkedDatasetPerCleanroom(java.lang.Boolean singleLinkedDatasetPerCleanroom) {
    this.singleLinkedDatasetPerCleanroom = singleLinkedDatasetPerCleanroom;
    return this;
  }

  /**
   * Output only. If True, this DCR restricts the contributors to sharing only a single resource in
   * a Listing. And no two resources should have the same IDs. So if a contributor adds a view with
   * a conflicting name, the CreateListing API will reject the request. if False, the data
   * contributor can publish an entire dataset (as before). This is not configurable, and by
   * default, all new DCRs will have the restriction set to True.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleSelectedResourceSharingRestriction() {
    return singleSelectedResourceSharingRestriction;
  }

  /**
   * Output only. If True, this DCR restricts the contributors to sharing only a single resource in
   * a Listing. And no two resources should have the same IDs. So if a contributor adds a view with
   * a conflicting name, the CreateListing API will reject the request. if False, the data
   * contributor can publish an entire dataset (as before). This is not configurable, and by
   * default, all new DCRs will have the restriction set to True.
   * @param singleSelectedResourceSharingRestriction singleSelectedResourceSharingRestriction or {@code null} for none
   */
  public DcrExchangeConfig setSingleSelectedResourceSharingRestriction(java.lang.Boolean singleSelectedResourceSharingRestriction) {
    this.singleSelectedResourceSharingRestriction = singleSelectedResourceSharingRestriction;
    return this;
  }

  @Override
  public DcrExchangeConfig set(String fieldName, Object value) {
    return (DcrExchangeConfig) super.set(fieldName, value);
  }

  @Override
  public DcrExchangeConfig clone() {
    return (DcrExchangeConfig) super.clone();
  }

}
