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

package com.google.api.services.config.v1.model;

/**
 * The response message for the `ListTerraformVersions` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Infrastructure Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTerraformVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token to be supplied to the next ListTerraformVersions request via `page_token` to obtain the
   * next set of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of TerraformVersions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TerraformVersion> terraformVersions;

  /**
   * Unreachable resources, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * Token to be supplied to the next ListTerraformVersions request via `page_token` to obtain the
   * next set of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to be supplied to the next ListTerraformVersions request via `page_token` to obtain the
   * next set of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTerraformVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of TerraformVersions.
   * @return value or {@code null} for none
   */
  public java.util.List<TerraformVersion> getTerraformVersions() {
    return terraformVersions;
  }

  /**
   * List of TerraformVersions.
   * @param terraformVersions terraformVersions or {@code null} for none
   */
  public ListTerraformVersionsResponse setTerraformVersions(java.util.List<TerraformVersion> terraformVersions) {
    this.terraformVersions = terraformVersions;
    return this;
  }

  /**
   * Unreachable resources, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unreachable resources, if any.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListTerraformVersionsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListTerraformVersionsResponse set(String fieldName, Object value) {
    return (ListTerraformVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListTerraformVersionsResponse clone() {
    return (ListTerraformVersionsResponse) super.clone();
  }

}
