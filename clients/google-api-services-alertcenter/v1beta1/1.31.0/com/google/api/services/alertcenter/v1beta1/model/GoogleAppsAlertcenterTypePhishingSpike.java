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
 * Alert for a spike in user reported phishing. *Warning*: This type has been deprecated. Use
 * [MailPhishing](/admin-sdk/alertcenter/reference/rest/v1beta1/MailPhishing) instead.
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
public final class GoogleAppsAlertcenterTypePhishingSpike extends com.google.api.client.json.GenericJson {

  /**
   * The domain ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsAlertcenterTypeDomainId domainId;

  /**
   * If `true`, the email originated from within the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isInternal;

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsAlertcenterTypeMaliciousEntity maliciousEntity;

  /**
   * The list of messages contained by this alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> messages;

  static {
    // hack to force ProGuard to consider GoogleAppsAlertcenterTypeGmailMessageInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAppsAlertcenterTypeGmailMessageInfo.class);
  }

  /**
   * The domain ID.
   * @return value or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDomainId getDomainId() {
    return domainId;
  }

  /**
   * The domain ID.
   * @param domainId domainId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypePhishingSpike setDomainId(GoogleAppsAlertcenterTypeDomainId domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * If `true`, the email originated from within the organization.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsInternal() {
    return isInternal;
  }

  /**
   * If `true`, the email originated from within the organization.
   * @param isInternal isInternal or {@code null} for none
   */
  public GoogleAppsAlertcenterTypePhishingSpike setIsInternal(java.lang.Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * @return value or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeMaliciousEntity getMaliciousEntity() {
    return maliciousEntity;
  }

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * @param maliciousEntity maliciousEntity or {@code null} for none
   */
  public GoogleAppsAlertcenterTypePhishingSpike setMaliciousEntity(GoogleAppsAlertcenterTypeMaliciousEntity maliciousEntity) {
    this.maliciousEntity = maliciousEntity;
    return this;
  }

  /**
   * The list of messages contained by this alert.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> getMessages() {
    return messages;
  }

  /**
   * The list of messages contained by this alert.
   * @param messages messages or {@code null} for none
   */
  public GoogleAppsAlertcenterTypePhishingSpike setMessages(java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> messages) {
    this.messages = messages;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypePhishingSpike set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypePhishingSpike) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypePhishingSpike clone() {
    return (GoogleAppsAlertcenterTypePhishingSpike) super.clone();
  }

}
