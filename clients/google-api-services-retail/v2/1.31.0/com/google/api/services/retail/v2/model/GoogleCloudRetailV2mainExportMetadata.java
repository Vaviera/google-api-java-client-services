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
 * Metadata related to the progress of the Export operation. This will be returned by the
 * google.longrunning.Operation.metadata field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2mainExportMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Operation create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Operation create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Operation create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRetailV2mainExportMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRetailV2mainExportMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2mainExportMetadata set(String fieldName, Object value) {
    return (GoogleCloudRetailV2mainExportMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2mainExportMetadata clone() {
    return (GoogleCloudRetailV2mainExportMetadata) super.clone();
  }

}
