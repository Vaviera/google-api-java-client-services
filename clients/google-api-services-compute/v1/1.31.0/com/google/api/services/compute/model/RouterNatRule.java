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
 * Model definition for RouterNatRule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterNatRule extends com.google.api.client.json.GenericJson {

  /**
   * The action to be enforced for traffic that matches this rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RouterNatRuleAction action;

  /**
   * An optional description of this rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * CEL expression that specifies the match condition that egress traffic from a VM is evaluated
   * against. If it evaluates to true, the corresponding `action` is enforced. The following
   * examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16')
   * || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip ==
   * '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub ==
   * 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String match;

  /**
   * An integer uniquely identifying a rule in the list. The rule number must be a positive value
   * between 0 and 65000, and must be unique among rules within a NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long ruleNumber;

  /**
   * The action to be enforced for traffic that matches this rule.
   * @return value or {@code null} for none
   */
  public RouterNatRuleAction getAction() {
    return action;
  }

  /**
   * The action to be enforced for traffic that matches this rule.
   * @param action action or {@code null} for none
   */
  public RouterNatRule setAction(RouterNatRuleAction action) {
    this.action = action;
    return this;
  }

  /**
   * An optional description of this rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this rule.
   * @param description description or {@code null} for none
   */
  public RouterNatRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * CEL expression that specifies the match condition that egress traffic from a VM is evaluated
   * against. If it evaluates to true, the corresponding `action` is enforced. The following
   * examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16')
   * || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip ==
   * '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub ==
   * 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
   * @return value or {@code null} for none
   */
  public java.lang.String getMatch() {
    return match;
  }

  /**
   * CEL expression that specifies the match condition that egress traffic from a VM is evaluated
   * against. If it evaluates to true, the corresponding `action` is enforced. The following
   * examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16')
   * || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip ==
   * '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub ==
   * 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
   * @param match match or {@code null} for none
   */
  public RouterNatRule setMatch(java.lang.String match) {
    this.match = match;
    return this;
  }

  /**
   * An integer uniquely identifying a rule in the list. The rule number must be a positive value
   * between 0 and 65000, and must be unique among rules within a NAT.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRuleNumber() {
    return ruleNumber;
  }

  /**
   * An integer uniquely identifying a rule in the list. The rule number must be a positive value
   * between 0 and 65000, and must be unique among rules within a NAT.
   * @param ruleNumber ruleNumber or {@code null} for none
   */
  public RouterNatRule setRuleNumber(java.lang.Long ruleNumber) {
    this.ruleNumber = ruleNumber;
    return this;
  }

  @Override
  public RouterNatRule set(String fieldName, Object value) {
    return (RouterNatRule) super.set(fieldName, value);
  }

  @Override
  public RouterNatRule clone() {
    return (RouterNatRule) super.clone();
  }

}
