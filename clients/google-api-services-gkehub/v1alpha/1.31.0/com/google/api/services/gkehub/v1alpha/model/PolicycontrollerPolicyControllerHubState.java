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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * State of the Policy Controller.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicycontrollerPolicyControllerHubState extends com.google.api.client.json.GenericJson {

  /**
   * Map from deployment name to deployment state. Example deployments are gatekeeper-controller-
   * manager, gatekeeper-audit deployment, and gatekeeper-mutation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> deploymentStates;

  /**
   * The version of Gatekeeper Policy Controller deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicycontrollerPolicyControllerHubVersion version;

  /**
   * Map from deployment name to deployment state. Example deployments are gatekeeper-controller-
   * manager, gatekeeper-audit deployment, and gatekeeper-mutation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDeploymentStates() {
    return deploymentStates;
  }

  /**
   * Map from deployment name to deployment state. Example deployments are gatekeeper-controller-
   * manager, gatekeeper-audit deployment, and gatekeeper-mutation.
   * @param deploymentStates deploymentStates or {@code null} for none
   */
  public PolicycontrollerPolicyControllerHubState setDeploymentStates(java.util.Map<String, java.lang.String> deploymentStates) {
    this.deploymentStates = deploymentStates;
    return this;
  }

  /**
   * The version of Gatekeeper Policy Controller deployed.
   * @return value or {@code null} for none
   */
  public PolicycontrollerPolicyControllerHubVersion getVersion() {
    return version;
  }

  /**
   * The version of Gatekeeper Policy Controller deployed.
   * @param version version or {@code null} for none
   */
  public PolicycontrollerPolicyControllerHubState setVersion(PolicycontrollerPolicyControllerHubVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public PolicycontrollerPolicyControllerHubState set(String fieldName, Object value) {
    return (PolicycontrollerPolicyControllerHubState) super.set(fieldName, value);
  }

  @Override
  public PolicycontrollerPolicyControllerHubState clone() {
    return (PolicycontrollerPolicyControllerHubState) super.clone();
  }

}
