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

package com.google.api.services.dialogflow.v2.model;

/**
 * Configuration for webhooks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig extends com.google.api.client.json.GenericJson {

  /**
   * The list of webhooks to override for the agent environment. The webhook must exist in the
   * agent. You can override fields in `generic_web_service` and `service_directory`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1Webhook> webhookOverrides;

  /**
   * The list of webhooks to override for the agent environment. The webhook must exist in the
   * agent. You can override fields in `generic_web_service` and `service_directory`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1Webhook> getWebhookOverrides() {
    return webhookOverrides;
  }

  /**
   * The list of webhooks to override for the agent environment. The webhook must exist in the
   * agent. You can override fields in `generic_web_service` and `service_directory`.
   * @param webhookOverrides webhookOverrides or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig setWebhookOverrides(java.util.List<GoogleCloudDialogflowCxV3beta1Webhook> webhookOverrides) {
    this.webhookOverrides = webhookOverrides;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig clone() {
    return (GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig) super.clone();
  }

}
