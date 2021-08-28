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

package com.google.api.services.managedidentities.v1.model;

/**
 * Maintenance policy applicable to instance updates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdatePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Relative scheduling channel applied to resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channel;

  /**
   * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden.
   * User can specify zero or more non-overlapping deny periods. Maximum number of
   * deny_maintenance_periods expected is one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DenyMaintenancePeriod> denyMaintenancePeriods;

  static {
    // hack to force ProGuard to consider DenyMaintenancePeriod used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DenyMaintenancePeriod.class);
  }

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceWindow window;

  /**
   * Optional. Relative scheduling channel applied to resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * Optional. Relative scheduling channel applied to resource.
   * @param channel channel or {@code null} for none
   */
  public UpdatePolicy setChannel(java.lang.String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden.
   * User can specify zero or more non-overlapping deny periods. Maximum number of
   * deny_maintenance_periods expected is one.
   * @return value or {@code null} for none
   */
  public java.util.List<DenyMaintenancePeriod> getDenyMaintenancePeriods() {
    return denyMaintenancePeriods;
  }

  /**
   * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden.
   * User can specify zero or more non-overlapping deny periods. Maximum number of
   * deny_maintenance_periods expected is one.
   * @param denyMaintenancePeriods denyMaintenancePeriods or {@code null} for none
   */
  public UpdatePolicy setDenyMaintenancePeriods(java.util.List<DenyMaintenancePeriod> denyMaintenancePeriods) {
    this.denyMaintenancePeriods = denyMaintenancePeriods;
    return this;
  }

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy.
   * @return value or {@code null} for none
   */
  public MaintenanceWindow getWindow() {
    return window;
  }

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy.
   * @param window window or {@code null} for none
   */
  public UpdatePolicy setWindow(MaintenanceWindow window) {
    this.window = window;
    return this;
  }

  @Override
  public UpdatePolicy set(String fieldName, Object value) {
    return (UpdatePolicy) super.set(fieldName, value);
  }

  @Override
  public UpdatePolicy clone() {
    return (UpdatePolicy) super.clone();
  }

}
