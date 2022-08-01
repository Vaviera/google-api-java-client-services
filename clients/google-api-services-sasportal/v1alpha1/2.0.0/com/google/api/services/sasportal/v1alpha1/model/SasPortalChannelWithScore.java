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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * The channel with score.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalChannelWithScore extends com.google.api.client.json.GenericJson {

  /**
   * The frequency range of the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalFrequencyRange frequencyRange;

  /**
   * The channel score, normalized to be in [0,100].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double score;

  /**
   * The frequency range of the channel.
   * @return value or {@code null} for none
   */
  public SasPortalFrequencyRange getFrequencyRange() {
    return frequencyRange;
  }

  /**
   * The frequency range of the channel.
   * @param frequencyRange frequencyRange or {@code null} for none
   */
  public SasPortalChannelWithScore setFrequencyRange(SasPortalFrequencyRange frequencyRange) {
    this.frequencyRange = frequencyRange;
    return this;
  }

  /**
   * The channel score, normalized to be in [0,100].
   * @return value or {@code null} for none
   */
  public java.lang.Double getScore() {
    return score;
  }

  /**
   * The channel score, normalized to be in [0,100].
   * @param score score or {@code null} for none
   */
  public SasPortalChannelWithScore setScore(java.lang.Double score) {
    this.score = score;
    return this;
  }

  @Override
  public SasPortalChannelWithScore set(String fieldName, Object value) {
    return (SasPortalChannelWithScore) super.set(fieldName, value);
  }

  @Override
  public SasPortalChannelWithScore clone() {
    return (SasPortalChannelWithScore) super.clone();
  }

}
