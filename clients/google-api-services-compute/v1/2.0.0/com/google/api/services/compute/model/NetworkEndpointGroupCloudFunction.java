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
 * Configuration for a Cloud Function network endpoint group (NEG). The function must be provided
 * explicitly or in the URL mask. Note: Cloud Function must be in the same project and located in
 * the same region as the Serverless NEG.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpointGroupCloudFunction extends com.google.api.client.json.GenericJson {

  /**
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63
   * characters long. Example value: func1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * An URL mask is one of the main components of the Cloud Function. A template to parse function
   * field from a request URL. URL mask allows for routing to multiple Cloud Functions without
   * having to create multiple Network Endpoint Groups and backend services. For example, request
   * URLs mydomain.com/function1 and mydomain.com/function2 can be backed by the same Serverless NEG
   * with URL mask /. The URL mask will parse them to { function = "function1" } and { function =
   * "function2" } respectively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlMask;

  /**
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63
   * characters long. Example value: func1.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63
   * characters long. Example value: func1.
   * @param function function or {@code null} for none
   */
  public NetworkEndpointGroupCloudFunction setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * An URL mask is one of the main components of the Cloud Function. A template to parse function
   * field from a request URL. URL mask allows for routing to multiple Cloud Functions without
   * having to create multiple Network Endpoint Groups and backend services. For example, request
   * URLs mydomain.com/function1 and mydomain.com/function2 can be backed by the same Serverless NEG
   * with URL mask /. The URL mask will parse them to { function = "function1" } and { function =
   * "function2" } respectively.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlMask() {
    return urlMask;
  }

  /**
   * An URL mask is one of the main components of the Cloud Function. A template to parse function
   * field from a request URL. URL mask allows for routing to multiple Cloud Functions without
   * having to create multiple Network Endpoint Groups and backend services. For example, request
   * URLs mydomain.com/function1 and mydomain.com/function2 can be backed by the same Serverless NEG
   * with URL mask /. The URL mask will parse them to { function = "function1" } and { function =
   * "function2" } respectively.
   * @param urlMask urlMask or {@code null} for none
   */
  public NetworkEndpointGroupCloudFunction setUrlMask(java.lang.String urlMask) {
    this.urlMask = urlMask;
    return this;
  }

  @Override
  public NetworkEndpointGroupCloudFunction set(String fieldName, Object value) {
    return (NetworkEndpointGroupCloudFunction) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpointGroupCloudFunction clone() {
    return (NetworkEndpointGroupCloudFunction) super.clone();
  }

}
