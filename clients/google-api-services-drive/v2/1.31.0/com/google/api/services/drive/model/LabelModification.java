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

package com.google.api.services.drive.model;

/**
 * A modification to a label on a file. A LabelModification can be used to apply a label to a file,
 * update an existing label on a file, or remove a label from a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LabelModification extends com.google.api.client.json.GenericJson {

  /**
   * The list of modifications to this label's fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelFieldModification> fieldModifications;

  static {
    // hack to force ProGuard to consider LabelFieldModification used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelFieldModification.class);
  }

  /**
   * This is always drive#labelModification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID of the label to modify.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelId;

  /**
   * If true, the label will be removed from the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean removeLabel;

  /**
   * The list of modifications to this label's fields.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelFieldModification> getFieldModifications() {
    return fieldModifications;
  }

  /**
   * The list of modifications to this label's fields.
   * @param fieldModifications fieldModifications or {@code null} for none
   */
  public LabelModification setFieldModifications(java.util.List<LabelFieldModification> fieldModifications) {
    this.fieldModifications = fieldModifications;
    return this;
  }

  /**
   * This is always drive#labelModification.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#labelModification.
   * @param kind kind or {@code null} for none
   */
  public LabelModification setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID of the label to modify.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelId() {
    return labelId;
  }

  /**
   * The ID of the label to modify.
   * @param labelId labelId or {@code null} for none
   */
  public LabelModification setLabelId(java.lang.String labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * If true, the label will be removed from the file.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRemoveLabel() {
    return removeLabel;
  }

  /**
   * If true, the label will be removed from the file.
   * @param removeLabel removeLabel or {@code null} for none
   */
  public LabelModification setRemoveLabel(java.lang.Boolean removeLabel) {
    this.removeLabel = removeLabel;
    return this;
  }

  @Override
  public LabelModification set(String fieldName, Object value) {
    return (LabelModification) super.set(fieldName, value);
  }

  @Override
  public LabelModification clone() {
    return (LabelModification) super.clone();
  }

}
