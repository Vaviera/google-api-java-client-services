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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * Alerts from Google Workspace Security Center rules service configured by an admin.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsAlertcenterTypeActivityRule extends com.google.api.client.json.GenericJson {

  /**
   * List of action names associated with the rule threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> actionNames;

  /**
   * Rule create timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Alert display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Rule name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Query that is used to get the data from the associated source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * List of alert IDs superseded by this alert. It is used to indicate that this alert is
   * essentially extension of superseded alerts and we found the relationship after creating these
   * alerts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supersededAlerts;

  /**
   * Alert ID superseding this alert. It is used to indicate that superseding alert is essentially
   * extension of this alert and we found the relationship after creating both alerts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String supersedingAlert;

  /**
   * Alert threshold is for example “COUNT > 5”.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threshold;

  /**
   * The trigger sources for this rule. * GMAIL_EVENTS * DEVICE_EVENTS * USER_EVENTS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerSource;

  /**
   * The timestamp of the last update to the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Rule window size. Possible values are 1 hour or 24 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String windowSize;

  /**
   * List of action names associated with the rule threshold.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getActionNames() {
    return actionNames;
  }

  /**
   * List of action names associated with the rule threshold.
   * @param actionNames actionNames or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setActionNames(java.util.List<java.lang.String> actionNames) {
    this.actionNames = actionNames;
    return this;
  }

  /**
   * Rule create timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Rule create timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the rule.
   * @param description description or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Alert display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Alert display name.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Rule name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Rule name.
   * @param name name or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Query that is used to get the data from the associated source.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Query that is used to get the data from the associated source.
   * @param query query or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * List of alert IDs superseded by this alert. It is used to indicate that this alert is
   * essentially extension of superseded alerts and we found the relationship after creating these
   * alerts.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupersededAlerts() {
    return supersededAlerts;
  }

  /**
   * List of alert IDs superseded by this alert. It is used to indicate that this alert is
   * essentially extension of superseded alerts and we found the relationship after creating these
   * alerts.
   * @param supersededAlerts supersededAlerts or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setSupersededAlerts(java.util.List<java.lang.String> supersededAlerts) {
    this.supersededAlerts = supersededAlerts;
    return this;
  }

  /**
   * Alert ID superseding this alert. It is used to indicate that superseding alert is essentially
   * extension of this alert and we found the relationship after creating both alerts.
   * @return value or {@code null} for none
   */
  public java.lang.String getSupersedingAlert() {
    return supersedingAlert;
  }

  /**
   * Alert ID superseding this alert. It is used to indicate that superseding alert is essentially
   * extension of this alert and we found the relationship after creating both alerts.
   * @param supersedingAlert supersedingAlert or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setSupersedingAlert(java.lang.String supersedingAlert) {
    this.supersedingAlert = supersedingAlert;
    return this;
  }

  /**
   * Alert threshold is for example “COUNT > 5”.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreshold() {
    return threshold;
  }

  /**
   * Alert threshold is for example “COUNT > 5”.
   * @param threshold threshold or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setThreshold(java.lang.String threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * The trigger sources for this rule. * GMAIL_EVENTS * DEVICE_EVENTS * USER_EVENTS
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerSource() {
    return triggerSource;
  }

  /**
   * The trigger sources for this rule. * GMAIL_EVENTS * DEVICE_EVENTS * USER_EVENTS
   * @param triggerSource triggerSource or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setTriggerSource(java.lang.String triggerSource) {
    this.triggerSource = triggerSource;
    return this;
  }

  /**
   * The timestamp of the last update to the rule.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The timestamp of the last update to the rule.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Rule window size. Possible values are 1 hour or 24 hours.
   * @return value or {@code null} for none
   */
  public String getWindowSize() {
    return windowSize;
  }

  /**
   * Rule window size. Possible values are 1 hour or 24 hours.
   * @param windowSize windowSize or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeActivityRule setWindowSize(String windowSize) {
    this.windowSize = windowSize;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeActivityRule set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeActivityRule) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeActivityRule clone() {
    return (GoogleAppsAlertcenterTypeActivityRule) super.clone();
  }

}
