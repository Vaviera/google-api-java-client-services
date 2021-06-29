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

package com.google.api.services.cloudbuild.v1alpha2.model;

/**
 * Location of the source in a supported storage service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Source extends com.google.api.client.json.GenericJson {

  /**
   * If provided, get the source from this location in a Cloud Source Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepoSource repoSource;

  /**
   * If provided, get the source from this location in Google Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageSource storageSource;

  /**
   * If provided, get the source from this manifest in Google Cloud Storage. This feature is in
   * Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-
   * builders/tree/master/gcs-fetcher).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageSourceManifest storageSourceManifest;

  /**
   * If provided, get the source from this location in a Cloud Source Repository.
   * @return value or {@code null} for none
   */
  public RepoSource getRepoSource() {
    return repoSource;
  }

  /**
   * If provided, get the source from this location in a Cloud Source Repository.
   * @param repoSource repoSource or {@code null} for none
   */
  public Source setRepoSource(RepoSource repoSource) {
    this.repoSource = repoSource;
    return this;
  }

  /**
   * If provided, get the source from this location in Google Cloud Storage.
   * @return value or {@code null} for none
   */
  public StorageSource getStorageSource() {
    return storageSource;
  }

  /**
   * If provided, get the source from this location in Google Cloud Storage.
   * @param storageSource storageSource or {@code null} for none
   */
  public Source setStorageSource(StorageSource storageSource) {
    this.storageSource = storageSource;
    return this;
  }

  /**
   * If provided, get the source from this manifest in Google Cloud Storage. This feature is in
   * Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-
   * builders/tree/master/gcs-fetcher).
   * @return value or {@code null} for none
   */
  public StorageSourceManifest getStorageSourceManifest() {
    return storageSourceManifest;
  }

  /**
   * If provided, get the source from this manifest in Google Cloud Storage. This feature is in
   * Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-
   * builders/tree/master/gcs-fetcher).
   * @param storageSourceManifest storageSourceManifest or {@code null} for none
   */
  public Source setStorageSourceManifest(StorageSourceManifest storageSourceManifest) {
    this.storageSourceManifest = storageSourceManifest;
    return this;
  }

  @Override
  public Source set(String fieldName, Object value) {
    return (Source) super.set(fieldName, value);
  }

  @Override
  public Source clone() {
    return (Source) super.clone();
  }

}
