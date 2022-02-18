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

package com.google.api.services.cloudfunctions.v2alpha.model;

/**
 * Describes the Service being deployed. Currently Supported : Cloud Run (fully managed).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction,
   * when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic
   * split settings, if any. On GetFunction, true will be returned if the latest revision is serving
   * 100% of traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allTrafficOnLatestRevision;

  /**
   * The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G,
   * Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubern
   * etes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full
   * description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availableMemory;

  /**
   * Environment variables that shall be available during function execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> environmentVariables;

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ingressSettings;

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstanceCount;

  /**
   * The limit on the minimum number of function instances that may coexist at a given time.
   * Function instances are kept in idle state for a short period after they finished executing the
   * request to reduce cold start time for subsequent requests. Setting a minimum instance count
   * will ensure that the given number of instances are kept running in idle state always. This can
   * help with cold start times when jump in incoming request count occurs after the idle instance
   * would have been stopped in the default case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minInstanceCount;

  /**
   * Output only. Name of the service associated with a Function. The format of this field is
   * `projects/{project}/locations/{region}/services/{service}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The email of the service's service account. If empty, defaults to
   * `{project_number}-compute@developer.gserviceaccount.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * Output only. URI of the Service deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The Serverless VPC Access connector that this cloud function can connect to. The format of this
   * field is `projects/locations/connectors`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpcConnector;

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpcConnectorEgressSettings;

  /**
   * Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction,
   * when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic
   * split settings, if any. On GetFunction, true will be returned if the latest revision is serving
   * 100% of traffic.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllTrafficOnLatestRevision() {
    return allTrafficOnLatestRevision;
  }

  /**
   * Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction,
   * when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic
   * split settings, if any. On GetFunction, true will be returned if the latest revision is serving
   * 100% of traffic.
   * @param allTrafficOnLatestRevision allTrafficOnLatestRevision or {@code null} for none
   */
  public ServiceConfig setAllTrafficOnLatestRevision(java.lang.Boolean allTrafficOnLatestRevision) {
    this.allTrafficOnLatestRevision = allTrafficOnLatestRevision;
    return this;
  }

  /**
   * The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G,
   * Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubern
   * etes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full
   * description.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailableMemory() {
    return availableMemory;
  }

  /**
   * The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G,
   * Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubern
   * etes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full
   * description.
   * @param availableMemory availableMemory or {@code null} for none
   */
  public ServiceConfig setAvailableMemory(java.lang.String availableMemory) {
    this.availableMemory = availableMemory;
    return this;
  }

  /**
   * Environment variables that shall be available during function execution.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvironmentVariables() {
    return environmentVariables;
  }

  /**
   * Environment variables that shall be available during function execution.
   * @param environmentVariables environmentVariables or {@code null} for none
   */
  public ServiceConfig setEnvironmentVariables(java.util.Map<String, java.lang.String> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * @return value or {@code null} for none
   */
  public java.lang.String getIngressSettings() {
    return ingressSettings;
  }

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * @param ingressSettings ingressSettings or {@code null} for none
   */
  public ServiceConfig setIngressSettings(java.lang.String ingressSettings) {
    this.ingressSettings = ingressSettings;
    return this;
  }

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstanceCount() {
    return maxInstanceCount;
  }

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * @param maxInstanceCount maxInstanceCount or {@code null} for none
   */
  public ServiceConfig setMaxInstanceCount(java.lang.Integer maxInstanceCount) {
    this.maxInstanceCount = maxInstanceCount;
    return this;
  }

  /**
   * The limit on the minimum number of function instances that may coexist at a given time.
   * Function instances are kept in idle state for a short period after they finished executing the
   * request to reduce cold start time for subsequent requests. Setting a minimum instance count
   * will ensure that the given number of instances are kept running in idle state always. This can
   * help with cold start times when jump in incoming request count occurs after the idle instance
   * would have been stopped in the default case.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinInstanceCount() {
    return minInstanceCount;
  }

  /**
   * The limit on the minimum number of function instances that may coexist at a given time.
   * Function instances are kept in idle state for a short period after they finished executing the
   * request to reduce cold start time for subsequent requests. Setting a minimum instance count
   * will ensure that the given number of instances are kept running in idle state always. This can
   * help with cold start times when jump in incoming request count occurs after the idle instance
   * would have been stopped in the default case.
   * @param minInstanceCount minInstanceCount or {@code null} for none
   */
  public ServiceConfig setMinInstanceCount(java.lang.Integer minInstanceCount) {
    this.minInstanceCount = minInstanceCount;
    return this;
  }

  /**
   * Output only. Name of the service associated with a Function. The format of this field is
   * `projects/{project}/locations/{region}/services/{service}`
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Output only. Name of the service associated with a Function. The format of this field is
   * `projects/{project}/locations/{region}/services/{service}`
   * @param service service or {@code null} for none
   */
  public ServiceConfig setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * The email of the service's service account. If empty, defaults to
   * `{project_number}-compute@developer.gserviceaccount.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * The email of the service's service account. If empty, defaults to
   * `{project_number}-compute@developer.gserviceaccount.com`.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public ServiceConfig setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public ServiceConfig setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * Output only. URI of the Service deployed.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Output only. URI of the Service deployed.
   * @param uri uri or {@code null} for none
   */
  public ServiceConfig setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The Serverless VPC Access connector that this cloud function can connect to. The format of this
   * field is `projects/locations/connectors`.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpcConnector() {
    return vpcConnector;
  }

  /**
   * The Serverless VPC Access connector that this cloud function can connect to. The format of this
   * field is `projects/locations/connectors`.
   * @param vpcConnector vpcConnector or {@code null} for none
   */
  public ServiceConfig setVpcConnector(java.lang.String vpcConnector) {
    this.vpcConnector = vpcConnector;
    return this;
  }

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpcConnectorEgressSettings() {
    return vpcConnectorEgressSettings;
  }

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * @param vpcConnectorEgressSettings vpcConnectorEgressSettings or {@code null} for none
   */
  public ServiceConfig setVpcConnectorEgressSettings(java.lang.String vpcConnectorEgressSettings) {
    this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    return this;
  }

  @Override
  public ServiceConfig set(String fieldName, Object value) {
    return (ServiceConfig) super.set(fieldName, value);
  }

  @Override
  public ServiceConfig clone() {
    return (ServiceConfig) super.clone();
  }

}
