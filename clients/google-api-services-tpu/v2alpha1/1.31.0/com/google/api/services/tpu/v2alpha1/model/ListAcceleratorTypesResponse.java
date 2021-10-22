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

package com.google.api.services.tpu.v2alpha1.model;

/**
 * Response for ListAcceleratorTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAcceleratorTypesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The listed nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorType> acceleratorTypes;

  static {
    // hack to force ProGuard to consider AcceleratorType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AcceleratorType.class);
  }

  /**
   * The next page token or empty if none.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The listed nodes.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorType> getAcceleratorTypes() {
    return acceleratorTypes;
  }

  /**
   * The listed nodes.
   * @param acceleratorTypes acceleratorTypes or {@code null} for none
   */
  public ListAcceleratorTypesResponse setAcceleratorTypes(java.util.List<AcceleratorType> acceleratorTypes) {
    this.acceleratorTypes = acceleratorTypes;
    return this;
  }

  /**
   * The next page token or empty if none.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The next page token or empty if none.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAcceleratorTypesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListAcceleratorTypesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListAcceleratorTypesResponse set(String fieldName, Object value) {
    return (ListAcceleratorTypesResponse) super.set(fieldName, value);
  }

  @Override
  public ListAcceleratorTypesResponse clone() {
    return (ListAcceleratorTypesResponse) super.clone();
  }

}
