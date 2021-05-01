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

package com.google.api.services.osconfig.v1beta.model;

/**
 * OS policy assignment operation metadata provided by OS policy assignment API methods that return
 * long running operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyAssignmentOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The OS policy assignment API method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiMethod;

  /**
   * Reference to the `OSPolicyAssignment` API resource. Format: `projects/{project_number}/location
   * s/{location}/osPolicyAssignments/{os_policy_assignment_id@revision_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osPolicyAssignment;

  /**
   * Rollout start time
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String rolloutStartTime;

  /**
   * State of the rollout
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutState;

  /**
   * Rollout update time
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String rolloutUpdateTime;

  /**
   * The OS policy assignment API method.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiMethod() {
    return apiMethod;
  }

  /**
   * The OS policy assignment API method.
   * @param apiMethod apiMethod or {@code null} for none
   */
  public OSPolicyAssignmentOperationMetadata setApiMethod(java.lang.String apiMethod) {
    this.apiMethod = apiMethod;
    return this;
  }

  /**
   * Reference to the `OSPolicyAssignment` API resource. Format: `projects/{project_number}/location
   * s/{location}/osPolicyAssignments/{os_policy_assignment_id@revision_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getOsPolicyAssignment() {
    return osPolicyAssignment;
  }

  /**
   * Reference to the `OSPolicyAssignment` API resource. Format: `projects/{project_number}/location
   * s/{location}/osPolicyAssignments/{os_policy_assignment_id@revision_id}`
   * @param osPolicyAssignment osPolicyAssignment or {@code null} for none
   */
  public OSPolicyAssignmentOperationMetadata setOsPolicyAssignment(java.lang.String osPolicyAssignment) {
    this.osPolicyAssignment = osPolicyAssignment;
    return this;
  }

  /**
   * Rollout start time
   * @return value or {@code null} for none
   */
  public String getRolloutStartTime() {
    return rolloutStartTime;
  }

  /**
   * Rollout start time
   * @param rolloutStartTime rolloutStartTime or {@code null} for none
   */
  public OSPolicyAssignmentOperationMetadata setRolloutStartTime(String rolloutStartTime) {
    this.rolloutStartTime = rolloutStartTime;
    return this;
  }

  /**
   * State of the rollout
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutState() {
    return rolloutState;
  }

  /**
   * State of the rollout
   * @param rolloutState rolloutState or {@code null} for none
   */
  public OSPolicyAssignmentOperationMetadata setRolloutState(java.lang.String rolloutState) {
    this.rolloutState = rolloutState;
    return this;
  }

  /**
   * Rollout update time
   * @return value or {@code null} for none
   */
  public String getRolloutUpdateTime() {
    return rolloutUpdateTime;
  }

  /**
   * Rollout update time
   * @param rolloutUpdateTime rolloutUpdateTime or {@code null} for none
   */
  public OSPolicyAssignmentOperationMetadata setRolloutUpdateTime(String rolloutUpdateTime) {
    this.rolloutUpdateTime = rolloutUpdateTime;
    return this;
  }

  @Override
  public OSPolicyAssignmentOperationMetadata set(String fieldName, Object value) {
    return (OSPolicyAssignmentOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public OSPolicyAssignmentOperationMetadata clone() {
    return (OSPolicyAssignmentOperationMetadata) super.clone();
  }

}
