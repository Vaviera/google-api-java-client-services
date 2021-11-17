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

package com.google.api.services.compute.model;

/**
 * In contrast to a single BackendService in HttpRouteAction to which all matching traffic is
 * directed to, WeightedBackendService allows traffic to be split across multiple BackendServices.
 * The volume of traffic for each BackendService is proportional to the weight specified in each
 * WeightedBackendService
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WeightedBackendService extends com.google.api.client.json.GenericJson {

  /**
   * The full or partial URL to the default BackendService resource. Before forwarding the request
   * to backendService, the loadbalancer applies any relevant headerActions specified as part of
   * this backendServiceWeight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backendService;

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. headerAction specified here take effect before headerAction in the enclosing
   * HttpRouteRule, PathMatcher and UrlMap. Note that headerAction is not supported for
   * Loadbalancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL
   * map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpHeaderAction headerAction;

  /**
   * Specifies the fraction of traffic sent to backendService, computed as weight / (sum of all
   * weightedBackendService weights in routeAction) . The selection of a backend service is
   * determined only for new traffic. Once a user's request has been directed to a backendService,
   * subsequent requests will be sent to the same backendService as determined by the
   * BackendService's session affinity policy. The value must be between 0 and 1000
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long weight;

  /**
   * The full or partial URL to the default BackendService resource. Before forwarding the request
   * to backendService, the loadbalancer applies any relevant headerActions specified as part of
   * this backendServiceWeight.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackendService() {
    return backendService;
  }

  /**
   * The full or partial URL to the default BackendService resource. Before forwarding the request
   * to backendService, the loadbalancer applies any relevant headerActions specified as part of
   * this backendServiceWeight.
   * @param backendService backendService or {@code null} for none
   */
  public WeightedBackendService setBackendService(java.lang.String backendService) {
    this.backendService = backendService;
    return this;
  }

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. headerAction specified here take effect before headerAction in the enclosing
   * HttpRouteRule, PathMatcher and UrlMap. Note that headerAction is not supported for
   * Loadbalancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL
   * map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * @return value or {@code null} for none
   */
  public HttpHeaderAction getHeaderAction() {
    return headerAction;
  }

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. headerAction specified here take effect before headerAction in the enclosing
   * HttpRouteRule, PathMatcher and UrlMap. Note that headerAction is not supported for
   * Loadbalancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL
   * map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * @param headerAction headerAction or {@code null} for none
   */
  public WeightedBackendService setHeaderAction(HttpHeaderAction headerAction) {
    this.headerAction = headerAction;
    return this;
  }

  /**
   * Specifies the fraction of traffic sent to backendService, computed as weight / (sum of all
   * weightedBackendService weights in routeAction) . The selection of a backend service is
   * determined only for new traffic. Once a user's request has been directed to a backendService,
   * subsequent requests will be sent to the same backendService as determined by the
   * BackendService's session affinity policy. The value must be between 0 and 1000
   * @return value or {@code null} for none
   */
  public java.lang.Long getWeight() {
    return weight;
  }

  /**
   * Specifies the fraction of traffic sent to backendService, computed as weight / (sum of all
   * weightedBackendService weights in routeAction) . The selection of a backend service is
   * determined only for new traffic. Once a user's request has been directed to a backendService,
   * subsequent requests will be sent to the same backendService as determined by the
   * BackendService's session affinity policy. The value must be between 0 and 1000
   * @param weight weight or {@code null} for none
   */
  public WeightedBackendService setWeight(java.lang.Long weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public WeightedBackendService set(String fieldName, Object value) {
    return (WeightedBackendService) super.set(fieldName, value);
  }

  @Override
  public WeightedBackendService clone() {
    return (WeightedBackendService) super.clone();
  }

}
