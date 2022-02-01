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

package com.google.api.services.healthcare.v1.model;

/**
 * Creates a new DICOM store with sensitive information de-identified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeidentifyDicomStoreRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deidentify configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeidentifyConfig config;

  /**
   * The name of the DICOM store to create and write the redacted data to. For example, `projects/{p
   * roject_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination DICOM store must not exist. * The caller must have the necessary permissions to
   * create the destination DICOM store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationStore;

  /**
   * Filter configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DicomFilterConfig filterConfig;

  /**
   * Deidentify configuration.
   * @return value or {@code null} for none
   */
  public DeidentifyConfig getConfig() {
    return config;
  }

  /**
   * Deidentify configuration.
   * @param config config or {@code null} for none
   */
  public DeidentifyDicomStoreRequest setConfig(DeidentifyConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The name of the DICOM store to create and write the redacted data to. For example, `projects/{p
   * roject_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination DICOM store must not exist. * The caller must have the necessary permissions to
   * create the destination DICOM store.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationStore() {
    return destinationStore;
  }

  /**
   * The name of the DICOM store to create and write the redacted data to. For example, `projects/{p
   * roject_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination DICOM store must not exist. * The caller must have the necessary permissions to
   * create the destination DICOM store.
   * @param destinationStore destinationStore or {@code null} for none
   */
  public DeidentifyDicomStoreRequest setDestinationStore(java.lang.String destinationStore) {
    this.destinationStore = destinationStore;
    return this;
  }

  /**
   * Filter configuration.
   * @return value or {@code null} for none
   */
  public DicomFilterConfig getFilterConfig() {
    return filterConfig;
  }

  /**
   * Filter configuration.
   * @param filterConfig filterConfig or {@code null} for none
   */
  public DeidentifyDicomStoreRequest setFilterConfig(DicomFilterConfig filterConfig) {
    this.filterConfig = filterConfig;
    return this;
  }

  @Override
  public DeidentifyDicomStoreRequest set(String fieldName, Object value) {
    return (DeidentifyDicomStoreRequest) super.set(fieldName, value);
  }

  @Override
  public DeidentifyDicomStoreRequest clone() {
    return (DeidentifyDicomStoreRequest) super.clone();
  }

}
