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

package com.google.api.services.storagetransfer.v1.model;

/**
 * TransferOptions define the actions to be performed on objects in a transfer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferOptions extends com.google.api.client.json.GenericJson {

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.
   * **Note:** This option and delete_objects_unique_in_sink are mutually exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleteObjectsFromSourceAfterTransfer;

  /**
   * Whether objects that exist only in the sink should be deleted. **Note:** This option and
   * delete_objects_from_source_after_transfer are mutually exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleteObjectsUniqueInSink;

  /**
   * Represents the selected metadata options for a transfer job. This feature is in Preview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetadataOptions metadataOptions;

  /**
   * When to overwrite objects that already exist in the sink. The default is that only objects that
   * are different from the source are ovewritten. If true, all objects in the sink whose name
   * matches an object in the source are overwritten with the source object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean overwriteObjectsAlreadyExistingInSink;

  /**
   * When to overwrite objects that already exist in the sink. If not set, overwrite behavior is
   * determined by overwrite_objects_already_existing_in_sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overwriteWhen;

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.
   * **Note:** This option and delete_objects_unique_in_sink are mutually exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleteObjectsFromSourceAfterTransfer() {
    return deleteObjectsFromSourceAfterTransfer;
  }

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.
   * **Note:** This option and delete_objects_unique_in_sink are mutually exclusive.
   * @param deleteObjectsFromSourceAfterTransfer deleteObjectsFromSourceAfterTransfer or {@code null} for none
   */
  public TransferOptions setDeleteObjectsFromSourceAfterTransfer(java.lang.Boolean deleteObjectsFromSourceAfterTransfer) {
    this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
    return this;
  }

  /**
   * Whether objects that exist only in the sink should be deleted. **Note:** This option and
   * delete_objects_from_source_after_transfer are mutually exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleteObjectsUniqueInSink() {
    return deleteObjectsUniqueInSink;
  }

  /**
   * Whether objects that exist only in the sink should be deleted. **Note:** This option and
   * delete_objects_from_source_after_transfer are mutually exclusive.
   * @param deleteObjectsUniqueInSink deleteObjectsUniqueInSink or {@code null} for none
   */
  public TransferOptions setDeleteObjectsUniqueInSink(java.lang.Boolean deleteObjectsUniqueInSink) {
    this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
    return this;
  }

  /**
   * Represents the selected metadata options for a transfer job. This feature is in Preview.
   * @return value or {@code null} for none
   */
  public MetadataOptions getMetadataOptions() {
    return metadataOptions;
  }

  /**
   * Represents the selected metadata options for a transfer job. This feature is in Preview.
   * @param metadataOptions metadataOptions or {@code null} for none
   */
  public TransferOptions setMetadataOptions(MetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * When to overwrite objects that already exist in the sink. The default is that only objects that
   * are different from the source are ovewritten. If true, all objects in the sink whose name
   * matches an object in the source are overwritten with the source object.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOverwriteObjectsAlreadyExistingInSink() {
    return overwriteObjectsAlreadyExistingInSink;
  }

  /**
   * When to overwrite objects that already exist in the sink. The default is that only objects that
   * are different from the source are ovewritten. If true, all objects in the sink whose name
   * matches an object in the source are overwritten with the source object.
   * @param overwriteObjectsAlreadyExistingInSink overwriteObjectsAlreadyExistingInSink or {@code null} for none
   */
  public TransferOptions setOverwriteObjectsAlreadyExistingInSink(java.lang.Boolean overwriteObjectsAlreadyExistingInSink) {
    this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
    return this;
  }

  /**
   * When to overwrite objects that already exist in the sink. If not set, overwrite behavior is
   * determined by overwrite_objects_already_existing_in_sink.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverwriteWhen() {
    return overwriteWhen;
  }

  /**
   * When to overwrite objects that already exist in the sink. If not set, overwrite behavior is
   * determined by overwrite_objects_already_existing_in_sink.
   * @param overwriteWhen overwriteWhen or {@code null} for none
   */
  public TransferOptions setOverwriteWhen(java.lang.String overwriteWhen) {
    this.overwriteWhen = overwriteWhen;
    return this;
  }

  @Override
  public TransferOptions set(String fieldName, Object value) {
    return (TransferOptions) super.set(fieldName, value);
  }

  @Override
  public TransferOptions clone() {
    return (TransferOptions) super.clone();
  }

}
