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

package com.google.api.services.books.v1.model;

/**
 * Model definition for Usersettings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Usersettings extends com.google.api.client.json.GenericJson {

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * User settings in sub-objects, each for different purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotesExport notesExport;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Notification notification;

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Usersettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * User settings in sub-objects, each for different purposes.
   * @return value or {@code null} for none
   */
  public NotesExport getNotesExport() {
    return notesExport;
  }

  /**
   * User settings in sub-objects, each for different purposes.
   * @param notesExport notesExport or {@code null} for none
   */
  public Usersettings setNotesExport(NotesExport notesExport) {
    this.notesExport = notesExport;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Notification getNotification() {
    return notification;
  }

  /**
   * @param notification notification or {@code null} for none
   */
  public Usersettings setNotification(Notification notification) {
    this.notification = notification;
    return this;
  }

  @Override
  public Usersettings set(String fieldName, Object value) {
    return (Usersettings) super.set(fieldName, value);
  }

  @Override
  public Usersettings clone() {
    return (Usersettings) super.clone();
  }

  /**
   * User settings in sub-objects, each for different purposes.
   */
  public static final class NotesExport extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String folderName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean isEnabled;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFolderName() {
      return folderName;
    }

    /**
     * @param folderName folderName or {@code null} for none
     */
    public NotesExport setFolderName(java.lang.String folderName) {
      this.folderName = folderName;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getIsEnabled() {
      return isEnabled;
    }

    /**
     * @param isEnabled isEnabled or {@code null} for none
     */
    public NotesExport setIsEnabled(java.lang.Boolean isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    @Override
    public NotesExport set(String fieldName, Object value) {
      return (NotesExport) super.set(fieldName, value);
    }

    @Override
    public NotesExport clone() {
      return (NotesExport) super.clone();
    }

  }

  /**
   * Model definition for UsersettingsNotification.
   */
  public static final class Notification extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private MatchMyInterests matchMyInterests;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private MoreFromAuthors moreFromAuthors;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private MoreFromSeries moreFromSeries;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PriceDrop priceDrop;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private RewardExpirations rewardExpirations;

    /**
     * @return value or {@code null} for none
     */
    public MatchMyInterests getMatchMyInterests() {
      return matchMyInterests;
    }

    /**
     * @param matchMyInterests matchMyInterests or {@code null} for none
     */
    public Notification setMatchMyInterests(MatchMyInterests matchMyInterests) {
      this.matchMyInterests = matchMyInterests;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public MoreFromAuthors getMoreFromAuthors() {
      return moreFromAuthors;
    }

    /**
     * @param moreFromAuthors moreFromAuthors or {@code null} for none
     */
    public Notification setMoreFromAuthors(MoreFromAuthors moreFromAuthors) {
      this.moreFromAuthors = moreFromAuthors;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public MoreFromSeries getMoreFromSeries() {
      return moreFromSeries;
    }

    /**
     * @param moreFromSeries moreFromSeries or {@code null} for none
     */
    public Notification setMoreFromSeries(MoreFromSeries moreFromSeries) {
      this.moreFromSeries = moreFromSeries;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public PriceDrop getPriceDrop() {
      return priceDrop;
    }

    /**
     * @param priceDrop priceDrop or {@code null} for none
     */
    public Notification setPriceDrop(PriceDrop priceDrop) {
      this.priceDrop = priceDrop;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public RewardExpirations getRewardExpirations() {
      return rewardExpirations;
    }

    /**
     * @param rewardExpirations rewardExpirations or {@code null} for none
     */
    public Notification setRewardExpirations(RewardExpirations rewardExpirations) {
      this.rewardExpirations = rewardExpirations;
      return this;
    }

    @Override
    public Notification set(String fieldName, Object value) {
      return (Notification) super.set(fieldName, value);
    }

    @Override
    public Notification clone() {
      return (Notification) super.clone();
    }

    /**
     * Model definition for UsersettingsNotificationMatchMyInterests.
     */
    public static final class MatchMyInterests extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("opted_state")
      private java.lang.String optedState;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getOptedState() {
        return optedState;
      }

      /**
       * @param optedState optedState or {@code null} for none
       */
      public MatchMyInterests setOptedState(java.lang.String optedState) {
        this.optedState = optedState;
        return this;
      }

      @Override
      public MatchMyInterests set(String fieldName, Object value) {
        return (MatchMyInterests) super.set(fieldName, value);
      }

      @Override
      public MatchMyInterests clone() {
        return (MatchMyInterests) super.clone();
      }

    }
    /**
     * Model definition for UsersettingsNotificationMoreFromAuthors.
     */
    public static final class MoreFromAuthors extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("opted_state")
      private java.lang.String optedState;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getOptedState() {
        return optedState;
      }

      /**
       * @param optedState optedState or {@code null} for none
       */
      public MoreFromAuthors setOptedState(java.lang.String optedState) {
        this.optedState = optedState;
        return this;
      }

      @Override
      public MoreFromAuthors set(String fieldName, Object value) {
        return (MoreFromAuthors) super.set(fieldName, value);
      }

      @Override
      public MoreFromAuthors clone() {
        return (MoreFromAuthors) super.clone();
      }

    }
    /**
     * Model definition for UsersettingsNotificationMoreFromSeries.
     */
    public static final class MoreFromSeries extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("opted_state")
      private java.lang.String optedState;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getOptedState() {
        return optedState;
      }

      /**
       * @param optedState optedState or {@code null} for none
       */
      public MoreFromSeries setOptedState(java.lang.String optedState) {
        this.optedState = optedState;
        return this;
      }

      @Override
      public MoreFromSeries set(String fieldName, Object value) {
        return (MoreFromSeries) super.set(fieldName, value);
      }

      @Override
      public MoreFromSeries clone() {
        return (MoreFromSeries) super.clone();
      }

    }
    /**
     * Model definition for UsersettingsNotificationPriceDrop.
     */
    public static final class PriceDrop extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("opted_state")
      private java.lang.String optedState;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getOptedState() {
        return optedState;
      }

      /**
       * @param optedState optedState or {@code null} for none
       */
      public PriceDrop setOptedState(java.lang.String optedState) {
        this.optedState = optedState;
        return this;
      }

      @Override
      public PriceDrop set(String fieldName, Object value) {
        return (PriceDrop) super.set(fieldName, value);
      }

      @Override
      public PriceDrop clone() {
        return (PriceDrop) super.clone();
      }

    }
    /**
     * Model definition for UsersettingsNotificationRewardExpirations.
     */
    public static final class RewardExpirations extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("opted_state")
      private java.lang.String optedState;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getOptedState() {
        return optedState;
      }

      /**
       * @param optedState optedState or {@code null} for none
       */
      public RewardExpirations setOptedState(java.lang.String optedState) {
        this.optedState = optedState;
        return this;
      }

      @Override
      public RewardExpirations set(String fieldName, Object value) {
        return (RewardExpirations) super.set(fieldName, value);
      }

      @Override
      public RewardExpirations clone() {
        return (RewardExpirations) super.clone();
      }

    }
  }
}
