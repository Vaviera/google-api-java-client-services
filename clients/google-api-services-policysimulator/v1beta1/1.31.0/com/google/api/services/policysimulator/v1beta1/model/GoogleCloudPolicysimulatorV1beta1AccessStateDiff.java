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

package com.google.api.services.policysimulator.v1beta1.model;

/**
 * The difference in AccessState between baseline and simulated policies. If either AccessState
 * cannot be fully evaluated, i.e. the AccessState is one of the UNKNOWN_* values, the explanation
 * why full evaluation was not possible is in the ExplainedAccess message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1beta1AccessStateDiff extends com.google.api.client.json.GenericJson {

  /**
   * A single value interpretation of the difference between baseline and simulated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessChange;

  /**
   * The explained access when replayed against the baseline policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1beta1ExplainedAccess baseline;

  /**
   * The explained access when replayed against the simulated policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1beta1ExplainedAccess simulated;

  /**
   * A single value interpretation of the difference between baseline and simulated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessChange() {
    return accessChange;
  }

  /**
   * A single value interpretation of the difference between baseline and simulated.
   * @param accessChange accessChange or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1AccessStateDiff setAccessChange(java.lang.String accessChange) {
    this.accessChange = accessChange;
    return this;
  }

  /**
   * The explained access when replayed against the baseline policies.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1ExplainedAccess getBaseline() {
    return baseline;
  }

  /**
   * The explained access when replayed against the baseline policies.
   * @param baseline baseline or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1AccessStateDiff setBaseline(GoogleCloudPolicysimulatorV1beta1ExplainedAccess baseline) {
    this.baseline = baseline;
    return this;
  }

  /**
   * The explained access when replayed against the simulated policies.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1ExplainedAccess getSimulated() {
    return simulated;
  }

  /**
   * The explained access when replayed against the simulated policies.
   * @param simulated simulated or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1AccessStateDiff setSimulated(GoogleCloudPolicysimulatorV1beta1ExplainedAccess simulated) {
    this.simulated = simulated;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1beta1AccessStateDiff set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1beta1AccessStateDiff) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1beta1AccessStateDiff clone() {
    return (GoogleCloudPolicysimulatorV1beta1AccessStateDiff) super.clone();
  }

}
