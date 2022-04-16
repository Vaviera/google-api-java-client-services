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

package com.google.api.services.gkehub.v1.model;

/**
 * Status of control plane management.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceMeshControlPlaneManagement extends com.google.api.client.json.GenericJson {

  /**
   * Explanation of state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceMeshStatusDetails> details;

  /**
   * LifecycleState of control plane management.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Explanation of state.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceMeshStatusDetails> getDetails() {
    return details;
  }

  /**
   * Explanation of state.
   * @param details details or {@code null} for none
   */
  public ServiceMeshControlPlaneManagement setDetails(java.util.List<ServiceMeshStatusDetails> details) {
    this.details = details;
    return this;
  }

  /**
   * LifecycleState of control plane management.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * LifecycleState of control plane management.
   * @param state state or {@code null} for none
   */
  public ServiceMeshControlPlaneManagement setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ServiceMeshControlPlaneManagement set(String fieldName, Object value) {
    return (ServiceMeshControlPlaneManagement) super.set(fieldName, value);
  }

  @Override
  public ServiceMeshControlPlaneManagement clone() {
    return (ServiceMeshControlPlaneManagement) super.clone();
  }

}
