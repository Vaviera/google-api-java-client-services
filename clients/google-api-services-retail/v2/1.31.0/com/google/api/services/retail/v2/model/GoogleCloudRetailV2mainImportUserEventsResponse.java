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
 * Response of the ImportUserEventsRequest. If the long running operation was successful, then this
 * message is returned by the google.longrunning.Operations.response field if the operation was
 * successful.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2mainImportUserEventsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A sample of errors encountered while processing the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> errorSamples;

  /**
   * Echoes the destination for the complete errors if this field was set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2mainImportErrorsConfig errorsConfig;

  /**
   * Aggregated statistics of user event import status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2mainUserEventImportSummary importSummary;

  /**
   * A sample of errors encountered while processing the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getErrorSamples() {
    return errorSamples;
  }

  /**
   * A sample of errors encountered while processing the request.
   * @param errorSamples errorSamples or {@code null} for none
   */
  public GoogleCloudRetailV2mainImportUserEventsResponse setErrorSamples(java.util.List<GoogleRpcStatus> errorSamples) {
    this.errorSamples = errorSamples;
    return this;
  }

  /**
   * Echoes the destination for the complete errors if this field was set in the request.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2mainImportErrorsConfig getErrorsConfig() {
    return errorsConfig;
  }

  /**
   * Echoes the destination for the complete errors if this field was set in the request.
   * @param errorsConfig errorsConfig or {@code null} for none
   */
  public GoogleCloudRetailV2mainImportUserEventsResponse setErrorsConfig(GoogleCloudRetailV2mainImportErrorsConfig errorsConfig) {
    this.errorsConfig = errorsConfig;
    return this;
  }

  /**
   * Aggregated statistics of user event import status.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2mainUserEventImportSummary getImportSummary() {
    return importSummary;
  }

  /**
   * Aggregated statistics of user event import status.
   * @param importSummary importSummary or {@code null} for none
   */
  public GoogleCloudRetailV2mainImportUserEventsResponse setImportSummary(GoogleCloudRetailV2mainUserEventImportSummary importSummary) {
    this.importSummary = importSummary;
    return this;
  }

  @Override
  public GoogleCloudRetailV2mainImportUserEventsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2mainImportUserEventsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2mainImportUserEventsResponse clone() {
    return (GoogleCloudRetailV2mainImportUserEventsResponse) super.clone();
  }

}
