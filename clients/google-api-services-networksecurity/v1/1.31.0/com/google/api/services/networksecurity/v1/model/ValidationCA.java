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

package com.google.api.services.networksecurity.v1.model;

/**
 * Specification of ValidationCA. Defines the mechanism to obtain the Certificate Authority
 * certificate to validate the peer certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidationCA extends com.google.api.client.json.GenericJson {

  /**
   * The certificate provider instance specification that will be passed to the data plane, which
   * will be used to load necessary credential information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertificateProviderInstance certificateProviderInstance;

  /**
   * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudNetworksecurityV1GrpcEndpoint grpcEndpoint;

  /**
   * The certificate provider instance specification that will be passed to the data plane, which
   * will be used to load necessary credential information.
   * @return value or {@code null} for none
   */
  public CertificateProviderInstance getCertificateProviderInstance() {
    return certificateProviderInstance;
  }

  /**
   * The certificate provider instance specification that will be passed to the data plane, which
   * will be used to load necessary credential information.
   * @param certificateProviderInstance certificateProviderInstance or {@code null} for none
   */
  public ValidationCA setCertificateProviderInstance(CertificateProviderInstance certificateProviderInstance) {
    this.certificateProviderInstance = certificateProviderInstance;
    return this;
  }

  /**
   * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
   * @return value or {@code null} for none
   */
  public GoogleCloudNetworksecurityV1GrpcEndpoint getGrpcEndpoint() {
    return grpcEndpoint;
  }

  /**
   * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
   * @param grpcEndpoint grpcEndpoint or {@code null} for none
   */
  public ValidationCA setGrpcEndpoint(GoogleCloudNetworksecurityV1GrpcEndpoint grpcEndpoint) {
    this.grpcEndpoint = grpcEndpoint;
    return this;
  }

  @Override
  public ValidationCA set(String fieldName, Object value) {
    return (ValidationCA) super.set(fieldName, value);
  }

  @Override
  public ValidationCA clone() {
    return (ValidationCA) super.clone();
  }

}
