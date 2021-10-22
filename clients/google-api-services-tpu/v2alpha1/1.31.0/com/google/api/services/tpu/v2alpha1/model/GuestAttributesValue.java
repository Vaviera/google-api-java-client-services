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
 * Array of guest attribute namespace/key/value tuples.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GuestAttributesValue extends com.google.api.client.json.GenericJson {

  /**
   * The list of guest attributes entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestAttributesEntry> items;

  static {
    // hack to force ProGuard to consider GuestAttributesEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GuestAttributesEntry.class);
  }

  /**
   * The list of guest attributes entries.
   * @return value or {@code null} for none
   */
  public java.util.List<GuestAttributesEntry> getItems() {
    return items;
  }

  /**
   * The list of guest attributes entries.
   * @param items items or {@code null} for none
   */
  public GuestAttributesValue setItems(java.util.List<GuestAttributesEntry> items) {
    this.items = items;
    return this;
  }

  @Override
  public GuestAttributesValue set(String fieldName, Object value) {
    return (GuestAttributesValue) super.set(fieldName, value);
  }

  @Override
  public GuestAttributesValue clone() {
    return (GuestAttributesValue) super.clone();
  }

}
