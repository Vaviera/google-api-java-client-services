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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Note: this resource requires whitelisting for access. Please contact your account manager for
 * access to Marketplace resources. Represents a proposal in the Marketplace. A proposal is the unit
 * of negotiation between a seller and a buyer and contains deals which are served. Note: you can
 * not update, create, or otherwise modify Private Auction or Preferred Deals deals through the API.
 * Fields are updatable unless noted otherwise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Proposal extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Reference to the buyer that will get billed for this proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer billedBuyer;

  /**
   * Reference to the buyer on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer buyer;

  /**
   * Contact information for the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> buyerContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * Private data for buyer. (hidden from seller).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateData buyerPrivateData;

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Deal> deals;

  static {
    // hack to force ProGuard to consider Deal used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Deal.class);
  }

  /**
   * The name for the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. True if the proposal is being renegotiated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRenegotiating;

  /**
   * Output only. True, if the buyside inventory setup is complete for this proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSetupComplete;

  /**
   * Output only. The role of the last user that either updated the proposal or left a comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUpdaterOrCommentorRole;

  /**
   * Output only. The notes associated with this proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Note> notes;

  static {
    // hack to force ProGuard to consider Note used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Note.class);
  }

  /**
   * Output only. Indicates whether the buyer/seller created the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originatorRole;

  /**
   * Output only. Private auction ID if this proposal is a private auction proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateAuctionId;

  /**
   * Output only. The unique ID of the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalId;

  /**
   * Output only. The revision number for the proposal. Each update to the proposal or the deal
   * causes the proposal revision number to auto-increment. The buyer keeps track of the last
   * revision number they know of and pass it in when making an update. If the head revision number
   * on the server has since incremented, then an ABORTED error is returned during the update
   * operation to let the buyer know that a subsequent update was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevision;

  /**
   * Output only. The current state of the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalState;

  /**
   * Reference to the seller on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seller seller;

  /**
   * Output only. Contact information for the seller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> sellerContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * Output only. The terms and conditions set by the publisher for this proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String termsAndConditions;

  /**
   * Output only. The time when the proposal was last revised.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Reference to the buyer that will get billed for this proposal.
   * @return value or {@code null} for none
   */
  public Buyer getBilledBuyer() {
    return billedBuyer;
  }

  /**
   * Output only. Reference to the buyer that will get billed for this proposal.
   * @param billedBuyer billedBuyer or {@code null} for none
   */
  public Proposal setBilledBuyer(Buyer billedBuyer) {
    this.billedBuyer = billedBuyer;
    return this;
  }

  /**
   * Reference to the buyer on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * @return value or {@code null} for none
   */
  public Buyer getBuyer() {
    return buyer;
  }

  /**
   * Reference to the buyer on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * @param buyer buyer or {@code null} for none
   */
  public Proposal setBuyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Contact information for the buyer.
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getBuyerContacts() {
    return buyerContacts;
  }

  /**
   * Contact information for the buyer.
   * @param buyerContacts buyerContacts or {@code null} for none
   */
  public Proposal setBuyerContacts(java.util.List<ContactInformation> buyerContacts) {
    this.buyerContacts = buyerContacts;
    return this;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @return value or {@code null} for none
   */
  public PrivateData getBuyerPrivateData() {
    return buyerPrivateData;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @param buyerPrivateData buyerPrivateData or {@code null} for none
   */
  public Proposal setBuyerPrivateData(PrivateData buyerPrivateData) {
    this.buyerPrivateData = buyerPrivateData;
    return this;
  }

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * @return value or {@code null} for none
   */
  public java.util.List<Deal> getDeals() {
    return deals;
  }

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * @param deals deals or {@code null} for none
   */
  public Proposal setDeals(java.util.List<Deal> deals) {
    this.deals = deals;
    return this;
  }

  /**
   * The name for the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name for the proposal.
   * @param displayName displayName or {@code null} for none
   */
  public Proposal setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. True if the proposal is being renegotiated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRenegotiating() {
    return isRenegotiating;
  }

  /**
   * Output only. True if the proposal is being renegotiated.
   * @param isRenegotiating isRenegotiating or {@code null} for none
   */
  public Proposal setIsRenegotiating(java.lang.Boolean isRenegotiating) {
    this.isRenegotiating = isRenegotiating;
    return this;
  }

  /**
   * Output only. True, if the buyside inventory setup is complete for this proposal.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSetupComplete() {
    return isSetupComplete;
  }

  /**
   * Output only. True, if the buyside inventory setup is complete for this proposal.
   * @param isSetupComplete isSetupComplete or {@code null} for none
   */
  public Proposal setIsSetupComplete(java.lang.Boolean isSetupComplete) {
    this.isSetupComplete = isSetupComplete;
    return this;
  }

  /**
   * Output only. The role of the last user that either updated the proposal or left a comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUpdaterOrCommentorRole() {
    return lastUpdaterOrCommentorRole;
  }

  /**
   * Output only. The role of the last user that either updated the proposal or left a comment.
   * @param lastUpdaterOrCommentorRole lastUpdaterOrCommentorRole or {@code null} for none
   */
  public Proposal setLastUpdaterOrCommentorRole(java.lang.String lastUpdaterOrCommentorRole) {
    this.lastUpdaterOrCommentorRole = lastUpdaterOrCommentorRole;
    return this;
  }

  /**
   * Output only. The notes associated with this proposal.
   * @return value or {@code null} for none
   */
  public java.util.List<Note> getNotes() {
    return notes;
  }

  /**
   * Output only. The notes associated with this proposal.
   * @param notes notes or {@code null} for none
   */
  public Proposal setNotes(java.util.List<Note> notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Output only. Indicates whether the buyer/seller created the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginatorRole() {
    return originatorRole;
  }

  /**
   * Output only. Indicates whether the buyer/seller created the proposal.
   * @param originatorRole originatorRole or {@code null} for none
   */
  public Proposal setOriginatorRole(java.lang.String originatorRole) {
    this.originatorRole = originatorRole;
    return this;
  }

  /**
   * Output only. Private auction ID if this proposal is a private auction proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateAuctionId() {
    return privateAuctionId;
  }

  /**
   * Output only. Private auction ID if this proposal is a private auction proposal.
   * @param privateAuctionId privateAuctionId or {@code null} for none
   */
  public Proposal setPrivateAuctionId(java.lang.String privateAuctionId) {
    this.privateAuctionId = privateAuctionId;
    return this;
  }

  /**
   * Output only. The unique ID of the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalId() {
    return proposalId;
  }

  /**
   * Output only. The unique ID of the proposal.
   * @param proposalId proposalId or {@code null} for none
   */
  public Proposal setProposalId(java.lang.String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * Output only. The revision number for the proposal. Each update to the proposal or the deal
   * causes the proposal revision number to auto-increment. The buyer keeps track of the last
   * revision number they know of and pass it in when making an update. If the head revision number
   * on the server has since incremented, then an ABORTED error is returned during the update
   * operation to let the buyer know that a subsequent update was made.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevision() {
    return proposalRevision;
  }

  /**
   * Output only. The revision number for the proposal. Each update to the proposal or the deal
   * causes the proposal revision number to auto-increment. The buyer keeps track of the last
   * revision number they know of and pass it in when making an update. If the head revision number
   * on the server has since incremented, then an ABORTED error is returned during the update
   * operation to let the buyer know that a subsequent update was made.
   * @param proposalRevision proposalRevision or {@code null} for none
   */
  public Proposal setProposalRevision(java.lang.Long proposalRevision) {
    this.proposalRevision = proposalRevision;
    return this;
  }

  /**
   * Output only. The current state of the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalState() {
    return proposalState;
  }

  /**
   * Output only. The current state of the proposal.
   * @param proposalState proposalState or {@code null} for none
   */
  public Proposal setProposalState(java.lang.String proposalState) {
    this.proposalState = proposalState;
    return this;
  }

  /**
   * Reference to the seller on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * @return value or {@code null} for none
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * Reference to the seller on the proposal. Note: This field may be set only when creating the
   * resource. Modifying this field while updating the resource will result in an error.
   * @param seller seller or {@code null} for none
   */
  public Proposal setSeller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Output only. Contact information for the seller.
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getSellerContacts() {
    return sellerContacts;
  }

  /**
   * Output only. Contact information for the seller.
   * @param sellerContacts sellerContacts or {@code null} for none
   */
  public Proposal setSellerContacts(java.util.List<ContactInformation> sellerContacts) {
    this.sellerContacts = sellerContacts;
    return this;
  }

  /**
   * Output only. The terms and conditions set by the publisher for this proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getTermsAndConditions() {
    return termsAndConditions;
  }

  /**
   * Output only. The terms and conditions set by the publisher for this proposal.
   * @param termsAndConditions termsAndConditions or {@code null} for none
   */
  public Proposal setTermsAndConditions(java.lang.String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Output only. The time when the proposal was last revised.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the proposal was last revised.
   * @param updateTime updateTime or {@code null} for none
   */
  public Proposal setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Proposal set(String fieldName, Object value) {
    return (Proposal) super.set(fieldName, value);
  }

  @Override
  public Proposal clone() {
    return (Proposal) super.clone();
  }

}
