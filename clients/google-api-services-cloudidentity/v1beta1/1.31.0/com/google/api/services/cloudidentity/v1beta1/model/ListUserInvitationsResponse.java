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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Response message for UserInvitation listing request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListUserInvitationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The token for the next page. If not empty, indicates that there may be more `UserInvitation`
   * resources that match the listing request; this value can be used in a subsequent
   * ListUserInvitationsRequest to get continued results with the current list call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of UserInvitation resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserInvitation> userInvitations;

  /**
   * The token for the next page. If not empty, indicates that there may be more `UserInvitation`
   * resources that match the listing request; this value can be used in a subsequent
   * ListUserInvitationsRequest to get continued results with the current list call.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token for the next page. If not empty, indicates that there may be more `UserInvitation`
   * resources that match the listing request; this value can be used in a subsequent
   * ListUserInvitationsRequest to get continued results with the current list call.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListUserInvitationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of UserInvitation resources.
   * @return value or {@code null} for none
   */
  public java.util.List<UserInvitation> getUserInvitations() {
    return userInvitations;
  }

  /**
   * The list of UserInvitation resources.
   * @param userInvitations userInvitations or {@code null} for none
   */
  public ListUserInvitationsResponse setUserInvitations(java.util.List<UserInvitation> userInvitations) {
    this.userInvitations = userInvitations;
    return this;
  }

  @Override
  public ListUserInvitationsResponse set(String fieldName, Object value) {
    return (ListUserInvitationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListUserInvitationsResponse clone() {
    return (ListUserInvitationsResponse) super.clone();
  }

}
