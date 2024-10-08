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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * The latest time of day that an order can be accepted and begin processing. Later orders will be
 * processed in the next day. The time is based on the warehouse postal code.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WarehouseCutoffTime extends com.google.api.client.json.GenericJson {

  /**
   * Required. Hour of the cutoff time until which an order has to be placed to be processed in the
   * same day by the warehouse. Hour is based on the timezone of warehouse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hour;

  /**
   * Required. Minute of the cutoff time until which an order has to be placed to be processed in
   * the same day by the warehouse. Minute is based on the timezone of warehouse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minute;

  /**
   * Required. Hour of the cutoff time until which an order has to be placed to be processed in the
   * same day by the warehouse. Hour is based on the timezone of warehouse.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHour() {
    return hour;
  }

  /**
   * Required. Hour of the cutoff time until which an order has to be placed to be processed in the
   * same day by the warehouse. Hour is based on the timezone of warehouse.
   * @param hour hour or {@code null} for none
   */
  public WarehouseCutoffTime setHour(java.lang.Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Required. Minute of the cutoff time until which an order has to be placed to be processed in
   * the same day by the warehouse. Minute is based on the timezone of warehouse.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinute() {
    return minute;
  }

  /**
   * Required. Minute of the cutoff time until which an order has to be placed to be processed in
   * the same day by the warehouse. Minute is based on the timezone of warehouse.
   * @param minute minute or {@code null} for none
   */
  public WarehouseCutoffTime setMinute(java.lang.Integer minute) {
    this.minute = minute;
    return this;
  }

  @Override
  public WarehouseCutoffTime set(String fieldName, Object value) {
    return (WarehouseCutoffTime) super.set(fieldName, value);
  }

  @Override
  public WarehouseCutoffTime clone() {
    return (WarehouseCutoffTime) super.clone();
  }

}
