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

package com.google.api.services.translate.v3.model;

/**
 * A document translation request output config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentOutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Google Cloud Storage destination for the translation output, e.g.,
   * `gs://my_bucket/my_directory/`. The destination directory provided does not have to be empty,
   * but the bucket must exist. If a file with the same name as the output file already exists in
   * the destination an error will be returned. For a DocumentInputConfig.contents provided
   * document, the output file will have the name "output_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. For a DocumentInputConfig.gcs_uri provided
   * document, the output file will have a name according to its URI. For example: an input file
   * with URI: "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name "my_bucket"
   * will have an output URI: "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. If the document was directly provided through the
   * request, then the output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where - [trg] corresponds to the
   * translated file's language code, - [ext] corresponds to the translated file's extension
   * according to its mime type. If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have `glossary_translations` instead of
   * `translations`. For the previous example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]". Thus the max number of output files
   * will be 2 (Translated document, Glossary translated document). Callers should expect no partial
   * outputs. If there is any error during document translation, no output will be stored in the
   * Cloud Storage bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsDestination gcsDestination;

  /**
   * Optional. Specifies the translated document's mime_type. If not specified, the translated
   * file's mime type will be the same as the input file's mime type. Currently only support the
   * output mime type to be the same as input mime type. - application/pdf - application/vnd
   * .openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-
   * officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Optional. Google Cloud Storage destination for the translation output, e.g.,
   * `gs://my_bucket/my_directory/`. The destination directory provided does not have to be empty,
   * but the bucket must exist. If a file with the same name as the output file already exists in
   * the destination an error will be returned. For a DocumentInputConfig.contents provided
   * document, the output file will have the name "output_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. For a DocumentInputConfig.gcs_uri provided
   * document, the output file will have a name according to its URI. For example: an input file
   * with URI: "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name "my_bucket"
   * will have an output URI: "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. If the document was directly provided through the
   * request, then the output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where - [trg] corresponds to the
   * translated file's language code, - [ext] corresponds to the translated file's extension
   * according to its mime type. If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have `glossary_translations` instead of
   * `translations`. For the previous example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]". Thus the max number of output files
   * will be 2 (Translated document, Glossary translated document). Callers should expect no partial
   * outputs. If there is any error during document translation, no output will be stored in the
   * Cloud Storage bucket.
   * @return value or {@code null} for none
   */
  public GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * Optional. Google Cloud Storage destination for the translation output, e.g.,
   * `gs://my_bucket/my_directory/`. The destination directory provided does not have to be empty,
   * but the bucket must exist. If a file with the same name as the output file already exists in
   * the destination an error will be returned. For a DocumentInputConfig.contents provided
   * document, the output file will have the name "output_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. For a DocumentInputConfig.gcs_uri provided
   * document, the output file will have a name according to its URI. For example: an input file
   * with URI: "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name "my_bucket"
   * will have an output URI: "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where - [trg]
   * corresponds to the translated file's language code, - [ext] corresponds to the translated
   * file's extension according to its mime type. If the document was directly provided through the
   * request, then the output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where - [trg] corresponds to the
   * translated file's language code, - [ext] corresponds to the translated file's extension
   * according to its mime type. If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have `glossary_translations` instead of
   * `translations`. For the previous example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]". Thus the max number of output files
   * will be 2 (Translated document, Glossary translated document). Callers should expect no partial
   * outputs. If there is any error during document translation, no output will be stored in the
   * Cloud Storage bucket.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public DocumentOutputConfig setGcsDestination(GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  /**
   * Optional. Specifies the translated document's mime_type. If not specified, the translated
   * file's mime type will be the same as the input file's mime type. Currently only support the
   * output mime type to be the same as input mime type. - application/pdf - application/vnd
   * .openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-
   * officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Optional. Specifies the translated document's mime_type. If not specified, the translated
   * file's mime type will be the same as the input file's mime type. Currently only support the
   * output mime type to be the same as input mime type. - application/pdf - application/vnd
   * .openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-
   * officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * @param mimeType mimeType or {@code null} for none
   */
  public DocumentOutputConfig setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public DocumentOutputConfig set(String fieldName, Object value) {
    return (DocumentOutputConfig) super.set(fieldName, value);
  }

  @Override
  public DocumentOutputConfig clone() {
    return (DocumentOutputConfig) super.clone();
  }

}
