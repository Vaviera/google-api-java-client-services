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

package com.google.api.services.retail.v2alpha.model;

/**
 * Response message for RejoinUserEvents method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaRejoinUserEventsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Number of user events that were joined with latest product catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rejoinedUserEventsCount;

  /**
   * Number of user events that were joined with latest product catalog.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRejoinedUserEventsCount() {
    return rejoinedUserEventsCount;
  }

  /**
   * Number of user events that were joined with latest product catalog.
   * @param rejoinedUserEventsCount rejoinedUserEventsCount or {@code null} for none
   */
  public GoogleCloudRetailV2betaRejoinUserEventsResponse setRejoinedUserEventsCount(java.lang.Long rejoinedUserEventsCount) {
    this.rejoinedUserEventsCount = rejoinedUserEventsCount;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaRejoinUserEventsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaRejoinUserEventsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaRejoinUserEventsResponse clone() {
    return (GoogleCloudRetailV2betaRejoinUserEventsResponse) super.clone();
  }

}
