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
 * A summary of import result. The UserEventImportSummary summarizes the import status for user
 * events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2UserEventImportSummary extends com.google.api.client.json.GenericJson {

  /**
   * Count of user events imported with complete existing catalog information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long joinedEventsCount;

  /**
   * Count of user events imported, but with catalog information not found in the imported catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long unjoinedEventsCount;

  /**
   * Count of user events imported with complete existing catalog information.
   * @return value or {@code null} for none
   */
  public java.lang.Long getJoinedEventsCount() {
    return joinedEventsCount;
  }

  /**
   * Count of user events imported with complete existing catalog information.
   * @param joinedEventsCount joinedEventsCount or {@code null} for none
   */
  public GoogleCloudRetailV2UserEventImportSummary setJoinedEventsCount(java.lang.Long joinedEventsCount) {
    this.joinedEventsCount = joinedEventsCount;
    return this;
  }

  /**
   * Count of user events imported, but with catalog information not found in the imported catalog.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnjoinedEventsCount() {
    return unjoinedEventsCount;
  }

  /**
   * Count of user events imported, but with catalog information not found in the imported catalog.
   * @param unjoinedEventsCount unjoinedEventsCount or {@code null} for none
   */
  public GoogleCloudRetailV2UserEventImportSummary setUnjoinedEventsCount(java.lang.Long unjoinedEventsCount) {
    this.unjoinedEventsCount = unjoinedEventsCount;
    return this;
  }

  @Override
  public GoogleCloudRetailV2UserEventImportSummary set(String fieldName, Object value) {
    return (GoogleCloudRetailV2UserEventImportSummary) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2UserEventImportSummary clone() {
    return (GoogleCloudRetailV2UserEventImportSummary) super.clone();
  }

}
