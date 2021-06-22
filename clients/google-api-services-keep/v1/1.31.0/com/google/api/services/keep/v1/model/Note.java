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

package com.google.api.services.keep.v1.model;

/**
 * A single note.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Keep API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Note extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The attachments attached to this note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Attachment> attachments;

  static {
    // hack to force ProGuard to consider Attachment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Attachment.class);
  }

  /**
   * The body of the note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Section body;

  /**
   * Output only. When this note was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The resource name of this note. See general note on identifiers in KeepService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The list of permissions set on the note. Contains at least one entry for the note
   * owner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Permission> permissions;

  /**
   * The title of the note. Length must be less than 1,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. When this note was trashed. If `trashed`, the note is eventually deleted. If the
   * note is not trashed, this field is not set (and the trashed field is `false`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String trashTime;

  /**
   * Output only. `true` if this note has been trashed. If trashed, the note is eventually deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean trashed;

  /**
   * Output only. When this note was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The attachments attached to this note.
   * @return value or {@code null} for none
   */
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * Output only. The attachments attached to this note.
   * @param attachments attachments or {@code null} for none
   */
  public Note setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * The body of the note.
   * @return value or {@code null} for none
   */
  public Section getBody() {
    return body;
  }

  /**
   * The body of the note.
   * @param body body or {@code null} for none
   */
  public Note setBody(Section body) {
    this.body = body;
    return this;
  }

  /**
   * Output only. When this note was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. When this note was created.
   * @param createTime createTime or {@code null} for none
   */
  public Note setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The resource name of this note. See general note on identifiers in KeepService.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of this note. See general note on identifiers in KeepService.
   * @param name name or {@code null} for none
   */
  public Note setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The list of permissions set on the note. Contains at least one entry for the note
   * owner.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getPermissions() {
    return permissions;
  }

  /**
   * Output only. The list of permissions set on the note. Contains at least one entry for the note
   * owner.
   * @param permissions permissions or {@code null} for none
   */
  public Note setPermissions(java.util.List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * The title of the note. Length must be less than 1,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the note. Length must be less than 1,000 characters.
   * @param title title or {@code null} for none
   */
  public Note setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. When this note was trashed. If `trashed`, the note is eventually deleted. If the
   * note is not trashed, this field is not set (and the trashed field is `false`).
   * @return value or {@code null} for none
   */
  public String getTrashTime() {
    return trashTime;
  }

  /**
   * Output only. When this note was trashed. If `trashed`, the note is eventually deleted. If the
   * note is not trashed, this field is not set (and the trashed field is `false`).
   * @param trashTime trashTime or {@code null} for none
   */
  public Note setTrashTime(String trashTime) {
    this.trashTime = trashTime;
    return this;
  }

  /**
   * Output only. `true` if this note has been trashed. If trashed, the note is eventually deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTrashed() {
    return trashed;
  }

  /**
   * Output only. `true` if this note has been trashed. If trashed, the note is eventually deleted.
   * @param trashed trashed or {@code null} for none
   */
  public Note setTrashed(java.lang.Boolean trashed) {
    this.trashed = trashed;
    return this;
  }

  /**
   * Output only. When this note was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. When this note was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Note setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Note set(String fieldName, Object value) {
    return (Note) super.set(fieldName, value);
  }

  @Override
  public Note clone() {
    return (Note) super.clone();
  }

}
