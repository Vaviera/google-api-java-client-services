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

package com.google.api.services.texttospeech.v1.model;

/**
 * Description of which voice to use for a synthesis request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Text-to-Speech API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VoiceSelectionParams extends com.google.api.client.json.GenericJson {

  /**
   * The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will
   * choose the custom voice matching the specified configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomVoiceParams customVoice;

  /**
   * Required. The language (and potentially also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should
   * not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will
   * be inferred from the input provided in the SynthesisInput. The TTS service will use this
   * parameter to help choose an appropriate voice. Note that the TTS service may choose a voice
   * with a slightly different language code than the one selected; it may substitute a different
   * region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even
   * a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no" (Norwegian)".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The preferred gender of the voice. If not set, the service will choose a voice based on the
   * other parameters such as language_code and name. Note that this is only a preference, not
   * requirement; if a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ssmlGender;

  /**
   * The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will
   * choose the custom voice matching the specified configuration.
   * @return value or {@code null} for none
   */
  public CustomVoiceParams getCustomVoice() {
    return customVoice;
  }

  /**
   * The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will
   * choose the custom voice matching the specified configuration.
   * @param customVoice customVoice or {@code null} for none
   */
  public VoiceSelectionParams setCustomVoice(CustomVoiceParams customVoice) {
    this.customVoice = customVoice;
    return this;
  }

  /**
   * Required. The language (and potentially also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should
   * not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will
   * be inferred from the input provided in the SynthesisInput. The TTS service will use this
   * parameter to help choose an appropriate voice. Note that the TTS service may choose a voice
   * with a slightly different language code than the one selected; it may substitute a different
   * region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even
   * a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no" (Norwegian)".
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. The language (and potentially also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should
   * not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will
   * be inferred from the input provided in the SynthesisInput. The TTS service will use this
   * parameter to help choose an appropriate voice. Note that the TTS service may choose a voice
   * with a slightly different language code than the one selected; it may substitute a different
   * region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even
   * a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no" (Norwegian)".
   * @param languageCode languageCode or {@code null} for none
   */
  public VoiceSelectionParams setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * @param name name or {@code null} for none
   */
  public VoiceSelectionParams setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The preferred gender of the voice. If not set, the service will choose a voice based on the
   * other parameters such as language_code and name. Note that this is only a preference, not
   * requirement; if a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getSsmlGender() {
    return ssmlGender;
  }

  /**
   * The preferred gender of the voice. If not set, the service will choose a voice based on the
   * other parameters such as language_code and name. Note that this is only a preference, not
   * requirement; if a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * @param ssmlGender ssmlGender or {@code null} for none
   */
  public VoiceSelectionParams setSsmlGender(java.lang.String ssmlGender) {
    this.ssmlGender = ssmlGender;
    return this;
  }

  @Override
  public VoiceSelectionParams set(String fieldName, Object value) {
    return (VoiceSelectionParams) super.set(fieldName, value);
  }

  @Override
  public VoiceSelectionParams clone() {
    return (VoiceSelectionParams) super.clone();
  }

}
