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

package com.google.api.services.documentai.v1beta2.model;

/**
 * A form field detected on the page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentPageFormField extends com.google.api.client.json.GenericJson {

  /**
   * Created for Labeling UI to export key text. If corrections were made to the text identified by
   * the `field_name.text_anchor`, this field will contain the correction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedKeyText;

  /**
   * Created for Labeling UI to export value text. If corrections were made to the text identified
   * by the `field_value.text_anchor`, this field will contain the correction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedValueText;

  /**
   * Layout for the FormField name. e.g. `Address`, `Email`, `Grand total`, `Phone number`, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentPageLayout fieldName;

  /**
   * Layout for the FormField value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentPageLayout fieldValue;

  /**
   * A list of detected languages for name together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> nameDetectedLanguages;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage.class);
  }

  /**
   * The history of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentProvenance provenance;

  /**
   * A list of detected languages for value together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> valueDetectedLanguages;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage.class);
  }

  /**
   * If the value is non-textual, this field represents the type. Current valid values are: - blank
   * (this indicates the field_value is normal text) - "unfilled_checkbox" - "filled_checkbox"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * Created for Labeling UI to export key text. If corrections were made to the text identified by
   * the `field_name.text_anchor`, this field will contain the correction.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedKeyText() {
    return correctedKeyText;
  }

  /**
   * Created for Labeling UI to export key text. If corrections were made to the text identified by
   * the `field_name.text_anchor`, this field will contain the correction.
   * @param correctedKeyText correctedKeyText or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setCorrectedKeyText(java.lang.String correctedKeyText) {
    this.correctedKeyText = correctedKeyText;
    return this;
  }

  /**
   * Created for Labeling UI to export value text. If corrections were made to the text identified
   * by the `field_value.text_anchor`, this field will contain the correction.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedValueText() {
    return correctedValueText;
  }

  /**
   * Created for Labeling UI to export value text. If corrections were made to the text identified
   * by the `field_value.text_anchor`, this field will contain the correction.
   * @param correctedValueText correctedValueText or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setCorrectedValueText(java.lang.String correctedValueText) {
    this.correctedValueText = correctedValueText;
    return this;
  }

  /**
   * Layout for the FormField name. e.g. `Address`, `Email`, `Grand total`, `Phone number`, etc.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLayout getFieldName() {
    return fieldName;
  }

  /**
   * Layout for the FormField name. e.g. `Address`, `Email`, `Grand total`, `Phone number`, etc.
   * @param fieldName fieldName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setFieldName(GoogleCloudDocumentaiV1beta2DocumentPageLayout fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Layout for the FormField value.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLayout getFieldValue() {
    return fieldValue;
  }

  /**
   * Layout for the FormField value.
   * @param fieldValue fieldValue or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setFieldValue(GoogleCloudDocumentaiV1beta2DocumentPageLayout fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * A list of detected languages for name together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> getNameDetectedLanguages() {
    return nameDetectedLanguages;
  }

  /**
   * A list of detected languages for name together with confidence.
   * @param nameDetectedLanguages nameDetectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setNameDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> nameDetectedLanguages) {
    this.nameDetectedLanguages = nameDetectedLanguages;
    return this;
  }

  /**
   * The history of this annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance getProvenance() {
    return provenance;
  }

  /**
   * The history of this annotation.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setProvenance(GoogleCloudDocumentaiV1beta2DocumentProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * A list of detected languages for value together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> getValueDetectedLanguages() {
    return valueDetectedLanguages;
  }

  /**
   * A list of detected languages for value together with confidence.
   * @param valueDetectedLanguages valueDetectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setValueDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> valueDetectedLanguages) {
    this.valueDetectedLanguages = valueDetectedLanguages;
    return this;
  }

  /**
   * If the value is non-textual, this field represents the type. Current valid values are: - blank
   * (this indicates the field_value is normal text) - "unfilled_checkbox" - "filled_checkbox"
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * If the value is non-textual, this field represents the type. Current valid values are: - blank
   * (this indicates the field_value is normal text) - "unfilled_checkbox" - "filled_checkbox"
   * @param valueType valueType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentPageFormField) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageFormField clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentPageFormField) super.clone();
  }

}
