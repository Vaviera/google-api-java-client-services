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

package com.google.api.services.retail.v2.model;

/**
 * Request message for Import methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2ImportProductsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The desired location of errors incurred during the Import.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2ImportErrorsConfig errorsConfig;

  /**
   * Required. The desired input location of the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2ProductInputConfig inputConfig;

  /**
   * Indicates which fields in the provided imported 'products' to update. If not set, will by
   * default update all fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * The desired location of errors incurred during the Import.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2ImportErrorsConfig getErrorsConfig() {
    return errorsConfig;
  }

  /**
   * The desired location of errors incurred during the Import.
   * @param errorsConfig errorsConfig or {@code null} for none
   */
  public GoogleCloudRetailV2ImportProductsRequest setErrorsConfig(GoogleCloudRetailV2ImportErrorsConfig errorsConfig) {
    this.errorsConfig = errorsConfig;
    return this;
  }

  /**
   * Required. The desired input location of the data.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2ProductInputConfig getInputConfig() {
    return inputConfig;
  }

  /**
   * Required. The desired input location of the data.
   * @param inputConfig inputConfig or {@code null} for none
   */
  public GoogleCloudRetailV2ImportProductsRequest setInputConfig(GoogleCloudRetailV2ProductInputConfig inputConfig) {
    this.inputConfig = inputConfig;
    return this;
  }

  /**
   * Indicates which fields in the provided imported 'products' to update. If not set, will by
   * default update all fields.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Indicates which fields in the provided imported 'products' to update. If not set, will by
   * default update all fields.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudRetailV2ImportProductsRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleCloudRetailV2ImportProductsRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2ImportProductsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2ImportProductsRequest clone() {
    return (GoogleCloudRetailV2ImportProductsRequest) super.clone();
  }

}
