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

package com.google.api.services.apigateway.v1beta.model;

/**
 * An API Configuration is a combination of settings for both the Managed Service and Gateways
 * serving this API Config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Gateway API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApigatewayApiConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Immutable. Gateway specific configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApigatewayGatewayConfig gatewayConfig;

  /**
   * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to
   * authenticate to other services. This may either be the Service Account's email
   * (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name
   * (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP
   * resource such as a Cloud Run Service or an IAP-secured service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatewayServiceAccount;

  /**
   * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApigatewayApiConfigGrpcServiceDefinition> grpcServices;

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Service Configuration files. At least one must be included when using gRPC service
   * definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-
   * config#service_configuration_overview for the expected file contents. If multiple files are
   * specified, the files are merged with the following rules: * All singular scalar fields are
   * merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields
   * are concatenated. * Singular embedded messages are merged using these rules for nested fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApigatewayApiConfigFile> managedServiceConfigs;

  /**
   * Output only. Resource name of the API Config. Format:
   * projects/{project}/locations/global/apis/{api}/configs/{api_config}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApigatewayApiConfigOpenApiDocument> openapiDocuments;

  /**
   * Output only. The ID of the associated Service Config ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#config).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceConfigId;

  /**
   * Output only. State of the API Config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public ApigatewayApiConfig setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Display name.
   * @param displayName displayName or {@code null} for none
   */
  public ApigatewayApiConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Immutable. Gateway specific configuration.
   * @return value or {@code null} for none
   */
  public ApigatewayGatewayConfig getGatewayConfig() {
    return gatewayConfig;
  }

  /**
   * Immutable. Gateway specific configuration.
   * @param gatewayConfig gatewayConfig or {@code null} for none
   */
  public ApigatewayApiConfig setGatewayConfig(ApigatewayGatewayConfig gatewayConfig) {
    this.gatewayConfig = gatewayConfig;
    return this;
  }

  /**
   * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to
   * authenticate to other services. This may either be the Service Account's email
   * (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name
   * (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP
   * resource such as a Cloud Run Service or an IAP-secured service.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatewayServiceAccount() {
    return gatewayServiceAccount;
  }

  /**
   * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to
   * authenticate to other services. This may either be the Service Account's email
   * (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name
   * (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP
   * resource such as a Cloud Run Service or an IAP-secured service.
   * @param gatewayServiceAccount gatewayServiceAccount or {@code null} for none
   */
  public ApigatewayApiConfig setGatewayServiceAccount(java.lang.String gatewayServiceAccount) {
    this.gatewayServiceAccount = gatewayServiceAccount;
    return this;
  }

  /**
   * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
   * @return value or {@code null} for none
   */
  public java.util.List<ApigatewayApiConfigGrpcServiceDefinition> getGrpcServices() {
    return grpcServices;
  }

  /**
   * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
   * @param grpcServices grpcServices or {@code null} for none
   */
  public ApigatewayApiConfig setGrpcServices(java.util.List<ApigatewayApiConfigGrpcServiceDefinition> grpcServices) {
    this.grpcServices = grpcServices;
    return this;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public ApigatewayApiConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Service Configuration files. At least one must be included when using gRPC service
   * definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-
   * config#service_configuration_overview for the expected file contents. If multiple files are
   * specified, the files are merged with the following rules: * All singular scalar fields are
   * merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields
   * are concatenated. * Singular embedded messages are merged using these rules for nested fields.
   * @return value or {@code null} for none
   */
  public java.util.List<ApigatewayApiConfigFile> getManagedServiceConfigs() {
    return managedServiceConfigs;
  }

  /**
   * Optional. Service Configuration files. At least one must be included when using gRPC service
   * definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-
   * config#service_configuration_overview for the expected file contents. If multiple files are
   * specified, the files are merged with the following rules: * All singular scalar fields are
   * merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields
   * are concatenated. * Singular embedded messages are merged using these rules for nested fields.
   * @param managedServiceConfigs managedServiceConfigs or {@code null} for none
   */
  public ApigatewayApiConfig setManagedServiceConfigs(java.util.List<ApigatewayApiConfigFile> managedServiceConfigs) {
    this.managedServiceConfigs = managedServiceConfigs;
    return this;
  }

  /**
   * Output only. Resource name of the API Config. Format:
   * projects/{project}/locations/global/apis/{api}/configs/{api_config}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the API Config. Format:
   * projects/{project}/locations/global/apis/{api}/configs/{api_config}
   * @param name name or {@code null} for none
   */
  public ApigatewayApiConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * @return value or {@code null} for none
   */
  public java.util.List<ApigatewayApiConfigOpenApiDocument> getOpenapiDocuments() {
    return openapiDocuments;
  }

  /**
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * @param openapiDocuments openapiDocuments or {@code null} for none
   */
  public ApigatewayApiConfig setOpenapiDocuments(java.util.List<ApigatewayApiConfigOpenApiDocument> openapiDocuments) {
    this.openapiDocuments = openapiDocuments;
    return this;
  }

  /**
   * Output only. The ID of the associated Service Config ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#config).
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * Output only. The ID of the associated Service Config ( https://cloud.google.com/service-
   * infrastructure/docs/glossary#config).
   * @param serviceConfigId serviceConfigId or {@code null} for none
   */
  public ApigatewayApiConfig setServiceConfigId(java.lang.String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  /**
   * Output only. State of the API Config.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the API Config.
   * @param state state or {@code null} for none
   */
  public ApigatewayApiConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public ApigatewayApiConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ApigatewayApiConfig set(String fieldName, Object value) {
    return (ApigatewayApiConfig) super.set(fieldName, value);
  }

  @Override
  public ApigatewayApiConfig clone() {
    return (ApigatewayApiConfig) super.clone();
  }

}
