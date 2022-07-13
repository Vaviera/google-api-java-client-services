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
 * The HttpRouteRule setting specifies how to match an HTTP request and the corresponding routing
 * action that load balancing proxies perform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteRule extends com.google.api.client.json.GenericJson {

  /**
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when
   * BackendServiceor BackendBucket responds with an error. If a policy for an error code is not
   * configured for the RouteRule, a policy for the error code configured in
   * pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in
   * pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the
   * following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies
   * for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If
   * the request is for www.myotherdomain.com and a 404 is encountered, the policy under
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the
   * request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the
   * request for www.example.com/coming_soon/ encounters a 404, the policy in
   * RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example
   * encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
   * When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only
   * once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a
   * retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is
   * ignored and the response from the service is returned to the client. customErrorResponsePolicy
   * is supported only for Global External HTTP(S) load balancing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomErrorResponsePolicy customErrorResponsePolicy;

  /**
   * The short description conveying the intent of this routeRule. The description can have a
   * maximum length of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. The headerAction value specified here is applied before the matching
   * pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendSe
   * rvice.backendServiceWeightAction[].headerAction HeaderAction is not supported for load
   * balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map
   * is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpHeaderAction headerAction;

  /**
   * Outbound route specific configuration for networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL
   * map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpFilterConfig> httpFilterConfigs;

  static {
    // hack to force ProGuard to consider HttpFilterConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpFilterConfig.class);
  }

  /**
   * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl
   * supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound
   * to a target gRPC proxy that has validateForProxyless field set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpFilterConfig> httpFilterMetadata;

  static {
    // hack to force ProGuard to consider HttpFilterConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpFilterConfig.class);
  }

  /**
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR
   * semantics: the request matches this routeRule when any of the matchRules are satisfied. However
   * predicates within a given matchRule have AND semantics. All predicates within a matchRule must
   * match for the request to match the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpRouteRuleMatch> matchRules;

  /**
   * For routeRules within a given pathMatcher, priority determines the order in which a load
   * balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest
   * to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The
   * first rule that matches the request is applied. You cannot configure two or more routeRules
   * with the same priority. Priority for each rule must be set to a number from 0 to 2147483647
   * inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the
   * future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a
   * valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11,
   * and 13 to 15 in the future without any impact on existing rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such
   * as URL rewrites and header transformations, before forwarding the request to the selected
   * backend. If routeAction specifies any weightedBackendServices, service must not be set.
   * Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one
   * of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external
   * HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteAction routeAction;

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is also specified, advanced routing actions, such as URL
   * rewrites, take effect before sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction
   * specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If
   * urlRedirect is specified, service or routeAction must not be set. Not supported when the URL
   * map is bound to a target gRPC proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRedirectAction urlRedirect;

  /**
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when
   * BackendServiceor BackendBucket responds with an error. If a policy for an error code is not
   * configured for the RouteRule, a policy for the error code configured in
   * pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in
   * pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the
   * following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies
   * for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If
   * the request is for www.myotherdomain.com and a 404 is encountered, the policy under
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the
   * request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the
   * request for www.example.com/coming_soon/ encounters a 404, the policy in
   * RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example
   * encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
   * When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only
   * once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a
   * retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is
   * ignored and the response from the service is returned to the client. customErrorResponsePolicy
   * is supported only for Global External HTTP(S) load balancing.
   * @return value or {@code null} for none
   */
  public CustomErrorResponsePolicy getCustomErrorResponsePolicy() {
    return customErrorResponsePolicy;
  }

  /**
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when
   * BackendServiceor BackendBucket responds with an error. If a policy for an error code is not
   * configured for the RouteRule, a policy for the error code configured in
   * pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in
   * pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the
   * following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies
   * for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If
   * the request is for www.myotherdomain.com and a 404 is encountered, the policy under
   * UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the
   * request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the
   * request for www.example.com/coming_soon/ encounters a 404, the policy in
   * RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example
   * encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
   * When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only
   * once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a
   * retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is
   * ignored and the response from the service is returned to the client. customErrorResponsePolicy
   * is supported only for Global External HTTP(S) load balancing.
   * @param customErrorResponsePolicy customErrorResponsePolicy or {@code null} for none
   */
  public HttpRouteRule setCustomErrorResponsePolicy(CustomErrorResponsePolicy customErrorResponsePolicy) {
    this.customErrorResponsePolicy = customErrorResponsePolicy;
    return this;
  }

  /**
   * The short description conveying the intent of this routeRule. The description can have a
   * maximum length of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The short description conveying the intent of this routeRule. The description can have a
   * maximum length of 1024 characters.
   * @param description description or {@code null} for none
   */
  public HttpRouteRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. The headerAction value specified here is applied before the matching
   * pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendSe
   * rvice.backendServiceWeightAction[].headerAction HeaderAction is not supported for load
   * balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map
   * is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * @return value or {@code null} for none
   */
  public HttpHeaderAction getHeaderAction() {
    return headerAction;
  }

  /**
   * Specifies changes to request and response headers that need to take effect for the selected
   * backendService. The headerAction value specified here is applied before the matching
   * pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendSe
   * rvice.backendServiceWeightAction[].headerAction HeaderAction is not supported for load
   * balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map
   * is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * @param headerAction headerAction or {@code null} for none
   */
  public HttpRouteRule setHeaderAction(HttpHeaderAction headerAction) {
    this.headerAction = headerAction;
    return this;
  }

  /**
   * Outbound route specific configuration for networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL
   * map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpFilterConfig> getHttpFilterConfigs() {
    return httpFilterConfigs;
  }

  /**
   * Outbound route specific configuration for networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL
   * map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * @param httpFilterConfigs httpFilterConfigs or {@code null} for none
   */
  public HttpRouteRule setHttpFilterConfigs(java.util.List<HttpFilterConfig> httpFilterConfigs) {
    this.httpFilterConfigs = httpFilterConfigs;
    return this;
  }

  /**
   * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl
   * supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound
   * to a target gRPC proxy that has validateForProxyless field set to true.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpFilterConfig> getHttpFilterMetadata() {
    return httpFilterMetadata;
  }

  /**
   * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by
   * Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme
   * set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl
   * supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound
   * to a target gRPC proxy that has validateForProxyless field set to true.
   * @param httpFilterMetadata httpFilterMetadata or {@code null} for none
   */
  public HttpRouteRule setHttpFilterMetadata(java.util.List<HttpFilterConfig> httpFilterMetadata) {
    this.httpFilterMetadata = httpFilterMetadata;
    return this;
  }

  /**
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR
   * semantics: the request matches this routeRule when any of the matchRules are satisfied. However
   * predicates within a given matchRule have AND semantics. All predicates within a matchRule must
   * match for the request to match the rule.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpRouteRuleMatch> getMatchRules() {
    return matchRules;
  }

  /**
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR
   * semantics: the request matches this routeRule when any of the matchRules are satisfied. However
   * predicates within a given matchRule have AND semantics. All predicates within a matchRule must
   * match for the request to match the rule.
   * @param matchRules matchRules or {@code null} for none
   */
  public HttpRouteRule setMatchRules(java.util.List<HttpRouteRuleMatch> matchRules) {
    this.matchRules = matchRules;
    return this;
  }

  /**
   * For routeRules within a given pathMatcher, priority determines the order in which a load
   * balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest
   * to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The
   * first rule that matches the request is applied. You cannot configure two or more routeRules
   * with the same priority. Priority for each rule must be set to a number from 0 to 2147483647
   * inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the
   * future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a
   * valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11,
   * and 13 to 15 in the future without any impact on existing rules.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * For routeRules within a given pathMatcher, priority determines the order in which a load
   * balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest
   * to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The
   * first rule that matches the request is applied. You cannot configure two or more routeRules
   * with the same priority. Priority for each rule must be set to a number from 0 to 2147483647
   * inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the
   * future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a
   * valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11,
   * and 13 to 15 in the future without any impact on existing rules.
   * @param priority priority or {@code null} for none
   */
  public HttpRouteRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such
   * as URL rewrites and header transformations, before forwarding the request to the selected
   * backend. If routeAction specifies any weightedBackendServices, service must not be set.
   * Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one
   * of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external
   * HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
   * @return value or {@code null} for none
   */
  public HttpRouteAction getRouteAction() {
    return routeAction;
  }

  /**
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such
   * as URL rewrites and header transformations, before forwarding the request to the selected
   * backend. If routeAction specifies any weightedBackendServices, service must not be set.
   * Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one
   * of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external
   * HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
   * @param routeAction routeAction or {@code null} for none
   */
  public HttpRouteRule setRouteAction(HttpRouteAction routeAction) {
    this.routeAction = routeAction;
    return this;
  }

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is also specified, advanced routing actions, such as URL
   * rewrites, take effect before sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction
   * specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is also specified, advanced routing actions, such as URL
   * rewrites, take effect before sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction
   * specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * @param service service or {@code null} for none
   */
  public HttpRouteRule setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If
   * urlRedirect is specified, service or routeAction must not be set. Not supported when the URL
   * map is bound to a target gRPC proxy.
   * @return value or {@code null} for none
   */
  public HttpRedirectAction getUrlRedirect() {
    return urlRedirect;
  }

  /**
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If
   * urlRedirect is specified, service or routeAction must not be set. Not supported when the URL
   * map is bound to a target gRPC proxy.
   * @param urlRedirect urlRedirect or {@code null} for none
   */
  public HttpRouteRule setUrlRedirect(HttpRedirectAction urlRedirect) {
    this.urlRedirect = urlRedirect;
    return this;
  }

  @Override
  public HttpRouteRule set(String fieldName, Object value) {
    return (HttpRouteRule) super.set(fieldName, value);
  }

  @Override
  public HttpRouteRule clone() {
    return (HttpRouteRule) super.clone();
  }

}
