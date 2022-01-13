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
 * Representation of a shared drive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Drive extends com.google.api.client.json.GenericJson {

  /**
   * An image file and cropping parameters from which a background image for this shared drive is
   * set. This is a write only field; it can only be set on drive.drives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackgroundImageFile backgroundImageFile;

  /**
   * A short-lived link to this shared drive's background image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backgroundImageLink;

  /**
   * Capabilities the current user has on this shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Capabilities capabilities;

  /**
   * The color of this shared drive as an RGB hex string. It can only be set on a
   * drive.drives.update request that does not set themeId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String colorRgb;

  /**
   * The time at which the shared drive was created (RFC 3339 date-time).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createdTime;

  /**
   * Whether the shared drive is hidden from default view.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hidden;

  /**
   * The ID of this shared drive which is also the ID of the top level folder of this shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#drive".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of this shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The organizational unit of this shared drive. This field is only populated on drives.list
   * responses when the useDomainAdminAccess parameter is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitId;

  /**
   * A set of restrictions that apply to this shared drive or items inside this shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Restrictions restrictions;

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * driveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.drives.create request, a random theme is chosen from which the background image and color
   * are set. This is a write-only field; it can only be set on requests that don't set colorRgb or
   * backgroundImageFile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String themeId;

  /**
   * An image file and cropping parameters from which a background image for this shared drive is
   * set. This is a write only field; it can only be set on drive.drives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * @return value or {@code null} for none
   */
  public BackgroundImageFile getBackgroundImageFile() {
    return backgroundImageFile;
  }

  /**
   * An image file and cropping parameters from which a background image for this shared drive is
   * set. This is a write only field; it can only be set on drive.drives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * @param backgroundImageFile backgroundImageFile or {@code null} for none
   */
  public Drive setBackgroundImageFile(BackgroundImageFile backgroundImageFile) {
    this.backgroundImageFile = backgroundImageFile;
    return this;
  }

  /**
   * A short-lived link to this shared drive's background image.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackgroundImageLink() {
    return backgroundImageLink;
  }

  /**
   * A short-lived link to this shared drive's background image.
   * @param backgroundImageLink backgroundImageLink or {@code null} for none
   */
  public Drive setBackgroundImageLink(java.lang.String backgroundImageLink) {
    this.backgroundImageLink = backgroundImageLink;
    return this;
  }

  /**
   * Capabilities the current user has on this shared drive.
   * @return value or {@code null} for none
   */
  public Capabilities getCapabilities() {
    return capabilities;
  }

  /**
   * Capabilities the current user has on this shared drive.
   * @param capabilities capabilities or {@code null} for none
   */
  public Drive setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * The color of this shared drive as an RGB hex string. It can only be set on a
   * drive.drives.update request that does not set themeId.
   * @return value or {@code null} for none
   */
  public java.lang.String getColorRgb() {
    return colorRgb;
  }

  /**
   * The color of this shared drive as an RGB hex string. It can only be set on a
   * drive.drives.update request that does not set themeId.
   * @param colorRgb colorRgb or {@code null} for none
   */
  public Drive setColorRgb(java.lang.String colorRgb) {
    this.colorRgb = colorRgb;
    return this;
  }

  /**
   * The time at which the shared drive was created (RFC 3339 date-time).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreatedTime() {
    return createdTime;
  }

  /**
   * The time at which the shared drive was created (RFC 3339 date-time).
   * @param createdTime createdTime or {@code null} for none
   */
  public Drive setCreatedTime(com.google.api.client.util.DateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Whether the shared drive is hidden from default view.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHidden() {
    return hidden;
  }

  /**
   * Whether the shared drive is hidden from default view.
   * @param hidden hidden or {@code null} for none
   */
  public Drive setHidden(java.lang.Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * The ID of this shared drive which is also the ID of the top level folder of this shared drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of this shared drive which is also the ID of the top level folder of this shared drive.
   * @param id id or {@code null} for none
   */
  public Drive setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#drive".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#drive".
   * @param kind kind or {@code null} for none
   */
  public Drive setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of this shared drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this shared drive.
   * @param name name or {@code null} for none
   */
  public Drive setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The organizational unit of this shared drive. This field is only populated on drives.list
   * responses when the useDomainAdminAccess parameter is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitId() {
    return orgUnitId;
  }

  /**
   * The organizational unit of this shared drive. This field is only populated on drives.list
   * responses when the useDomainAdminAccess parameter is set to true.
   * @param orgUnitId orgUnitId or {@code null} for none
   */
  public Drive setOrgUnitId(java.lang.String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

  /**
   * A set of restrictions that apply to this shared drive or items inside this shared drive.
   * @return value or {@code null} for none
   */
  public Restrictions getRestrictions() {
    return restrictions;
  }

  /**
   * A set of restrictions that apply to this shared drive or items inside this shared drive.
   * @param restrictions restrictions or {@code null} for none
   */
  public Drive setRestrictions(Restrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * driveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.drives.create request, a random theme is chosen from which the background image and color
   * are set. This is a write-only field; it can only be set on requests that don't set colorRgb or
   * backgroundImageFile.
   * @return value or {@code null} for none
   */
  public java.lang.String getThemeId() {
    return themeId;
  }

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * driveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.drives.create request, a random theme is chosen from which the background image and color
   * are set. This is a write-only field; it can only be set on requests that don't set colorRgb or
   * backgroundImageFile.
   * @param themeId themeId or {@code null} for none
   */
  public Drive setThemeId(java.lang.String themeId) {
    this.themeId = themeId;
    return this;
  }

  @Override
  public Drive set(String fieldName, Object value) {
    return (Drive) super.set(fieldName, value);
  }

  @Override
  public Drive clone() {
    return (Drive) super.clone();
  }

  /**
   * An image file and cropping parameters from which a background image for this shared drive is set.
   * This is a write only field; it can only be set on drive.drives.update requests that don't set
   * themeId. When specified, all fields of the backgroundImageFile must be set.
   */
  public static final class BackgroundImageFile extends com.google.api.client.json.GenericJson {

    /**
     * The ID of an image file in Google Drive to use for the background image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float width;

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float xCoordinate;

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float yCoordinate;

    /**
     * The ID of an image file in Google Drive to use for the background image.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The ID of an image file in Google Drive to use for the background image.
     * @param id id or {@code null} for none
     */
    public BackgroundImageFile setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * @return value or {@code null} for none
     */
    public java.lang.Float getWidth() {
      return width;
    }

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * @param width width or {@code null} for none
     */
    public BackgroundImageFile setWidth(java.lang.Float width) {
      this.width = width;
      return this;
    }

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * @return value or {@code null} for none
     */
    public java.lang.Float getXCoordinate() {
      return xCoordinate;
    }

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * @param xCoordinate xCoordinate or {@code null} for none
     */
    public BackgroundImageFile setXCoordinate(java.lang.Float xCoordinate) {
      this.xCoordinate = xCoordinate;
      return this;
    }

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * @return value or {@code null} for none
     */
    public java.lang.Float getYCoordinate() {
      return yCoordinate;
    }

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * @param yCoordinate yCoordinate or {@code null} for none
     */
    public BackgroundImageFile setYCoordinate(java.lang.Float yCoordinate) {
      this.yCoordinate = yCoordinate;
      return this;
    }

    @Override
    public BackgroundImageFile set(String fieldName, Object value) {
      return (BackgroundImageFile) super.set(fieldName, value);
    }

    @Override
    public BackgroundImageFile clone() {
      return (BackgroundImageFile) super.clone();
    }

  }

  /**
   * Capabilities the current user has on this shared drive.
   */
  public static final class Capabilities extends com.google.api.client.json.GenericJson {

    /**
     * Whether the current user can add children to folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canAddChildren;

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this shared
     * drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeCopyRequiresWriterPermissionRestriction;

    /**
     * Whether the current user can change the domainUsersOnly restriction of this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeDomainUsersOnlyRestriction;

    /**
     * Whether the current user can change the background of this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeDriveBackground;

    /**
     * Whether the current user can change the driveMembersOnly restriction of this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeDriveMembersOnlyRestriction;

    /**
     * Whether the current user can comment on files in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canComment;

    /**
     * Whether the current user can copy files in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canCopy;

    /**
     * Whether the current user can delete children from folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDeleteChildren;

    /**
     * Whether the current user can delete this shared drive. Attempting to delete the shared drive
     * may still fail if there are untrashed items inside the shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDeleteDrive;

    /**
     * Whether the current user can download files in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDownload;

    /**
     * Whether the current user can edit files in this shared drive
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canEdit;

    /**
     * Whether the current user can list the children of folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canListChildren;

    /**
     * Whether the current user can add members to this shared drive or remove them or change their
     * role.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canManageMembers;

    /**
     * Whether the current user can read the revisions resource of files in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canReadRevisions;

    /**
     * Whether the current user can rename files or folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canRename;

    /**
     * Whether the current user can rename this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canRenameDrive;

    /**
     * Whether the current user can share files or folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canShare;

    /**
     * Whether the current user can trash children from folders in this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canTrashChildren;

    /**
     * Whether the current user can add children to folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanAddChildren() {
      return canAddChildren;
    }

    /**
     * Whether the current user can add children to folders in this shared drive.
     * @param canAddChildren canAddChildren or {@code null} for none
     */
    public Capabilities setCanAddChildren(java.lang.Boolean canAddChildren) {
      this.canAddChildren = canAddChildren;
      return this;
    }

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this shared
     * drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeCopyRequiresWriterPermissionRestriction() {
      return canChangeCopyRequiresWriterPermissionRestriction;
    }

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this shared
     * drive.
     * @param canChangeCopyRequiresWriterPermissionRestriction canChangeCopyRequiresWriterPermissionRestriction or {@code null} for none
     */
    public Capabilities setCanChangeCopyRequiresWriterPermissionRestriction(java.lang.Boolean canChangeCopyRequiresWriterPermissionRestriction) {
      this.canChangeCopyRequiresWriterPermissionRestriction = canChangeCopyRequiresWriterPermissionRestriction;
      return this;
    }

    /**
     * Whether the current user can change the domainUsersOnly restriction of this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeDomainUsersOnlyRestriction() {
      return canChangeDomainUsersOnlyRestriction;
    }

    /**
     * Whether the current user can change the domainUsersOnly restriction of this shared drive.
     * @param canChangeDomainUsersOnlyRestriction canChangeDomainUsersOnlyRestriction or {@code null} for none
     */
    public Capabilities setCanChangeDomainUsersOnlyRestriction(java.lang.Boolean canChangeDomainUsersOnlyRestriction) {
      this.canChangeDomainUsersOnlyRestriction = canChangeDomainUsersOnlyRestriction;
      return this;
    }

    /**
     * Whether the current user can change the background of this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeDriveBackground() {
      return canChangeDriveBackground;
    }

    /**
     * Whether the current user can change the background of this shared drive.
     * @param canChangeDriveBackground canChangeDriveBackground or {@code null} for none
     */
    public Capabilities setCanChangeDriveBackground(java.lang.Boolean canChangeDriveBackground) {
      this.canChangeDriveBackground = canChangeDriveBackground;
      return this;
    }

    /**
     * Whether the current user can change the driveMembersOnly restriction of this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeDriveMembersOnlyRestriction() {
      return canChangeDriveMembersOnlyRestriction;
    }

    /**
     * Whether the current user can change the driveMembersOnly restriction of this shared drive.
     * @param canChangeDriveMembersOnlyRestriction canChangeDriveMembersOnlyRestriction or {@code null} for none
     */
    public Capabilities setCanChangeDriveMembersOnlyRestriction(java.lang.Boolean canChangeDriveMembersOnlyRestriction) {
      this.canChangeDriveMembersOnlyRestriction = canChangeDriveMembersOnlyRestriction;
      return this;
    }

    /**
     * Whether the current user can comment on files in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanComment() {
      return canComment;
    }

    /**
     * Whether the current user can comment on files in this shared drive.
     * @param canComment canComment or {@code null} for none
     */
    public Capabilities setCanComment(java.lang.Boolean canComment) {
      this.canComment = canComment;
      return this;
    }

    /**
     * Whether the current user can copy files in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanCopy() {
      return canCopy;
    }

    /**
     * Whether the current user can copy files in this shared drive.
     * @param canCopy canCopy or {@code null} for none
     */
    public Capabilities setCanCopy(java.lang.Boolean canCopy) {
      this.canCopy = canCopy;
      return this;
    }

    /**
     * Whether the current user can delete children from folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDeleteChildren() {
      return canDeleteChildren;
    }

    /**
     * Whether the current user can delete children from folders in this shared drive.
     * @param canDeleteChildren canDeleteChildren or {@code null} for none
     */
    public Capabilities setCanDeleteChildren(java.lang.Boolean canDeleteChildren) {
      this.canDeleteChildren = canDeleteChildren;
      return this;
    }

    /**
     * Whether the current user can delete this shared drive. Attempting to delete the shared drive
     * may still fail if there are untrashed items inside the shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDeleteDrive() {
      return canDeleteDrive;
    }

    /**
     * Whether the current user can delete this shared drive. Attempting to delete the shared drive
     * may still fail if there are untrashed items inside the shared drive.
     * @param canDeleteDrive canDeleteDrive or {@code null} for none
     */
    public Capabilities setCanDeleteDrive(java.lang.Boolean canDeleteDrive) {
      this.canDeleteDrive = canDeleteDrive;
      return this;
    }

    /**
     * Whether the current user can download files in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDownload() {
      return canDownload;
    }

    /**
     * Whether the current user can download files in this shared drive.
     * @param canDownload canDownload or {@code null} for none
     */
    public Capabilities setCanDownload(java.lang.Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    /**
     * Whether the current user can edit files in this shared drive
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanEdit() {
      return canEdit;
    }

    /**
     * Whether the current user can edit files in this shared drive
     * @param canEdit canEdit or {@code null} for none
     */
    public Capabilities setCanEdit(java.lang.Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    /**
     * Whether the current user can list the children of folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanListChildren() {
      return canListChildren;
    }

    /**
     * Whether the current user can list the children of folders in this shared drive.
     * @param canListChildren canListChildren or {@code null} for none
     */
    public Capabilities setCanListChildren(java.lang.Boolean canListChildren) {
      this.canListChildren = canListChildren;
      return this;
    }

    /**
     * Whether the current user can add members to this shared drive or remove them or change their
     * role.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanManageMembers() {
      return canManageMembers;
    }

    /**
     * Whether the current user can add members to this shared drive or remove them or change their
     * role.
     * @param canManageMembers canManageMembers or {@code null} for none
     */
    public Capabilities setCanManageMembers(java.lang.Boolean canManageMembers) {
      this.canManageMembers = canManageMembers;
      return this;
    }

    /**
     * Whether the current user can read the revisions resource of files in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanReadRevisions() {
      return canReadRevisions;
    }

    /**
     * Whether the current user can read the revisions resource of files in this shared drive.
     * @param canReadRevisions canReadRevisions or {@code null} for none
     */
    public Capabilities setCanReadRevisions(java.lang.Boolean canReadRevisions) {
      this.canReadRevisions = canReadRevisions;
      return this;
    }

    /**
     * Whether the current user can rename files or folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanRename() {
      return canRename;
    }

    /**
     * Whether the current user can rename files or folders in this shared drive.
     * @param canRename canRename or {@code null} for none
     */
    public Capabilities setCanRename(java.lang.Boolean canRename) {
      this.canRename = canRename;
      return this;
    }

    /**
     * Whether the current user can rename this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanRenameDrive() {
      return canRenameDrive;
    }

    /**
     * Whether the current user can rename this shared drive.
     * @param canRenameDrive canRenameDrive or {@code null} for none
     */
    public Capabilities setCanRenameDrive(java.lang.Boolean canRenameDrive) {
      this.canRenameDrive = canRenameDrive;
      return this;
    }

    /**
     * Whether the current user can share files or folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanShare() {
      return canShare;
    }

    /**
     * Whether the current user can share files or folders in this shared drive.
     * @param canShare canShare or {@code null} for none
     */
    public Capabilities setCanShare(java.lang.Boolean canShare) {
      this.canShare = canShare;
      return this;
    }

    /**
     * Whether the current user can trash children from folders in this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanTrashChildren() {
      return canTrashChildren;
    }

    /**
     * Whether the current user can trash children from folders in this shared drive.
     * @param canTrashChildren canTrashChildren or {@code null} for none
     */
    public Capabilities setCanTrashChildren(java.lang.Boolean canTrashChildren) {
      this.canTrashChildren = canTrashChildren;
      return this;
    }

    @Override
    public Capabilities set(String fieldName, Object value) {
      return (Capabilities) super.set(fieldName, value);
    }

    @Override
    public Capabilities clone() {
      return (Capabilities) super.clone();
    }

  }

  /**
   * A set of restrictions that apply to this shared drive or items inside this shared drive.
   */
  public static final class Restrictions extends com.google.api.client.json.GenericJson {

    /**
     * Whether administrative privileges on this shared drive are required to modify restrictions.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean adminManagedRestrictions;

    /**
     * Whether the options to copy, print, or download files inside this shared drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean copyRequiresWriterPermission;

    /**
     * Whether access to this shared drive and items inside this shared drive is restricted to users
     * of the domain to which this shared drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this shared drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean domainUsersOnly;

    /**
     * Whether access to items inside this shared drive is restricted to its members.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean driveMembersOnly;

    /**
     * Whether administrative privileges on this shared drive are required to modify restrictions.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAdminManagedRestrictions() {
      return adminManagedRestrictions;
    }

    /**
     * Whether administrative privileges on this shared drive are required to modify restrictions.
     * @param adminManagedRestrictions adminManagedRestrictions or {@code null} for none
     */
    public Restrictions setAdminManagedRestrictions(java.lang.Boolean adminManagedRestrictions) {
      this.adminManagedRestrictions = adminManagedRestrictions;
      return this;
    }

    /**
     * Whether the options to copy, print, or download files inside this shared drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCopyRequiresWriterPermission() {
      return copyRequiresWriterPermission;
    }

    /**
     * Whether the options to copy, print, or download files inside this shared drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this shared drive.
     * @param copyRequiresWriterPermission copyRequiresWriterPermission or {@code null} for none
     */
    public Restrictions setCopyRequiresWriterPermission(java.lang.Boolean copyRequiresWriterPermission) {
      this.copyRequiresWriterPermission = copyRequiresWriterPermission;
      return this;
    }

    /**
     * Whether access to this shared drive and items inside this shared drive is restricted to users
     * of the domain to which this shared drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this shared drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDomainUsersOnly() {
      return domainUsersOnly;
    }

    /**
     * Whether access to this shared drive and items inside this shared drive is restricted to users
     * of the domain to which this shared drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this shared drive.
     * @param domainUsersOnly domainUsersOnly or {@code null} for none
     */
    public Restrictions setDomainUsersOnly(java.lang.Boolean domainUsersOnly) {
      this.domainUsersOnly = domainUsersOnly;
      return this;
    }

    /**
     * Whether access to items inside this shared drive is restricted to its members.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDriveMembersOnly() {
      return driveMembersOnly;
    }

    /**
     * Whether access to items inside this shared drive is restricted to its members.
     * @param driveMembersOnly driveMembersOnly or {@code null} for none
     */
    public Restrictions setDriveMembersOnly(java.lang.Boolean driveMembersOnly) {
      this.driveMembersOnly = driveMembersOnly;
      return this;
    }

    @Override
    public Restrictions set(String fieldName, Object value) {
      return (Restrictions) super.set(fieldName, value);
    }

    @Override
    public Restrictions clone() {
      return (Restrictions) super.clone();
    }

  }

}
