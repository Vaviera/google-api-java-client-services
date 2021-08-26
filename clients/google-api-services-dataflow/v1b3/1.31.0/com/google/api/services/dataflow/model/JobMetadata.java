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

package com.google.api.services.dataflow.model;

/**
 * Metadata available primarily for filtering jobs. Will be included in the ListJob response and Job
 * SUMMARY view.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Identification of a Cloud Bigtable source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BigTableIODetails> bigTableDetails;

  static {
    // hack to force ProGuard to consider BigTableIODetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BigTableIODetails.class);
  }

  /**
   * Identification of a BigQuery source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BigQueryIODetails> bigqueryDetails;

  static {
    // hack to force ProGuard to consider BigQueryIODetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BigQueryIODetails.class);
  }

  /**
   * Identification of a Datastore source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatastoreIODetails> datastoreDetails;

  static {
    // hack to force ProGuard to consider DatastoreIODetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DatastoreIODetails.class);
  }

  /**
   * Identification of a File source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FileIODetails> fileDetails;

  static {
    // hack to force ProGuard to consider FileIODetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileIODetails.class);
  }

  /**
   * Identification of a Pub/Sub source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PubSubIODetails> pubsubDetails;

  /**
   * The SDK version used to run the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SdkVersion sdkVersion;

  /**
   * Identification of a Spanner source used in the Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SpannerIODetails> spannerDetails;

  /**
   * Identification of a Cloud Bigtable source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<BigTableIODetails> getBigTableDetails() {
    return bigTableDetails;
  }

  /**
   * Identification of a Cloud Bigtable source used in the Dataflow job.
   * @param bigTableDetails bigTableDetails or {@code null} for none
   */
  public JobMetadata setBigTableDetails(java.util.List<BigTableIODetails> bigTableDetails) {
    this.bigTableDetails = bigTableDetails;
    return this;
  }

  /**
   * Identification of a BigQuery source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<BigQueryIODetails> getBigqueryDetails() {
    return bigqueryDetails;
  }

  /**
   * Identification of a BigQuery source used in the Dataflow job.
   * @param bigqueryDetails bigqueryDetails or {@code null} for none
   */
  public JobMetadata setBigqueryDetails(java.util.List<BigQueryIODetails> bigqueryDetails) {
    this.bigqueryDetails = bigqueryDetails;
    return this;
  }

  /**
   * Identification of a Datastore source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<DatastoreIODetails> getDatastoreDetails() {
    return datastoreDetails;
  }

  /**
   * Identification of a Datastore source used in the Dataflow job.
   * @param datastoreDetails datastoreDetails or {@code null} for none
   */
  public JobMetadata setDatastoreDetails(java.util.List<DatastoreIODetails> datastoreDetails) {
    this.datastoreDetails = datastoreDetails;
    return this;
  }

  /**
   * Identification of a File source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<FileIODetails> getFileDetails() {
    return fileDetails;
  }

  /**
   * Identification of a File source used in the Dataflow job.
   * @param fileDetails fileDetails or {@code null} for none
   */
  public JobMetadata setFileDetails(java.util.List<FileIODetails> fileDetails) {
    this.fileDetails = fileDetails;
    return this;
  }

  /**
   * Identification of a Pub/Sub source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<PubSubIODetails> getPubsubDetails() {
    return pubsubDetails;
  }

  /**
   * Identification of a Pub/Sub source used in the Dataflow job.
   * @param pubsubDetails pubsubDetails or {@code null} for none
   */
  public JobMetadata setPubsubDetails(java.util.List<PubSubIODetails> pubsubDetails) {
    this.pubsubDetails = pubsubDetails;
    return this;
  }

  /**
   * The SDK version used to run the job.
   * @return value or {@code null} for none
   */
  public SdkVersion getSdkVersion() {
    return sdkVersion;
  }

  /**
   * The SDK version used to run the job.
   * @param sdkVersion sdkVersion or {@code null} for none
   */
  public JobMetadata setSdkVersion(SdkVersion sdkVersion) {
    this.sdkVersion = sdkVersion;
    return this;
  }

  /**
   * Identification of a Spanner source used in the Dataflow job.
   * @return value or {@code null} for none
   */
  public java.util.List<SpannerIODetails> getSpannerDetails() {
    return spannerDetails;
  }

  /**
   * Identification of a Spanner source used in the Dataflow job.
   * @param spannerDetails spannerDetails or {@code null} for none
   */
  public JobMetadata setSpannerDetails(java.util.List<SpannerIODetails> spannerDetails) {
    this.spannerDetails = spannerDetails;
    return this;
  }

  @Override
  public JobMetadata set(String fieldName, Object value) {
    return (JobMetadata) super.set(fieldName, value);
  }

  @Override
  public JobMetadata clone() {
    return (JobMetadata) super.clone();
  }

}
