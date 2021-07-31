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

package com.google.api.services.sts.v1.model;

/**
 * Request message for ExchangeToken.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Token Service API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityStsV1ExchangeTokenRequest extends com.google.api.client.json.GenericJson {

  /**
   * The full resource name of the identity provider; for example:
   * `//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/`. Required
   * when exchanging an external credential for a Google access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audience;

  /**
   * Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which
   * indicates a token exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String grantType;

  /**
   * A set of features that Security Token Service supports, in addition to the standard OAuth 2.0
   * token exchange, formatted as a serialized JSON object of Options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String options;

  /**
   * Required. An identifier for the type of requested security token. Must be
   * `urn:ietf:params:oauth:token-type:access_token`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestedTokenType;

  /**
   * The OAuth 2.0 scopes to include on the resulting access token, formatted as a list of space-
   * delimited, case-sensitive strings. Required when exchanging an external credential for a Google
   * access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * Required. The input token. This token is either an external credential issued by a workload
   * identity pool provider, or a short-lived access token issued by Google. If the token is an OIDC
   * JWT, it must use the JWT format defined in [RFC 7523](https://tools.ietf.org/html/rfc7523), and
   * the `subject_token_type` must be either `urn:ietf:params:oauth:token-type:jwt` or
   * `urn:ietf:params:oauth:token-type:id_token`. The following headers are required: - `kid`: The
   * identifier of the signing key securing the JWT. - `alg`: The cryptographic algorithm securing
   * the JWT. Must be `RS256` or `ES256`. The following payload fields are required. For more
   * information, see [RFC 7523, Section 3](https://tools.ietf.org/html/rfc7523#section-3): - `iss`:
   * The issuer of the token. The issuer must provide a discovery document at the URL `/.well-known
   * /openid-configuration`, where `` is the value of this field. The document must be formatted
   * according to section 4.2 of the [OIDC 1.0 Discovery specification](https://openid.net/specs
   * /openid-connect-discovery-1_0.html#ProviderConfigurationResponse). - `iat`: The issue time, in
   * seconds, since the Unix epoch. Must be in the past. - `exp`: The expiration time, in seconds,
   * since the Unix epoch. Must be less than 48 hours after `iat`. Shorter expiration times are more
   * secure. If possible, we recommend setting an expiration time less than 6 hours. - `sub`: The
   * identity asserted in the JWT. - `aud`: For workload identity pools, this must be a value
   * specified in the allowed audiences for the workload identity pool provider, or one of the
   * audiences allowed by default if no audiences were specified. See https://cloud.google.com/iam/d
   * ocs/reference/rest/v1/projects.locations.workloadIdentityPools.providers#oidc Example header:
   * ``` { "alg": "RS256", "kid": "us-east-11" } ``` Example payload: ``` { "iss":
   * "https://accounts.google.com", "iat": 1517963104, "exp": 1517966704, "aud":
   * "//iam.googleapis.com/projects/1234567890123/locations/global/workloadIdentityPools/my-
   * pool/providers/my-provider", "sub": "113475438248934895348", "my_claims": { "additional_claim":
   * "value" } } ``` If `subject_token` is for AWS, it must be a serialized `GetCallerIdentity`
   * token. This token contains the same information as a request to the AWS [`GetCallerIdentity()`]
   * (https://docs.aws.amazon.com/STS/latest/APIReference/API_GetCallerIdentity) method, as well as
   * the AWS
   * [signature](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) for
   * the request information. Use Signature Version 4. Format the request as URL-encoded JSON, and
   * set the `subject_token_type` parameter to `urn:ietf:params:aws:token-type:aws4_request`. The
   * following parameters are required: - `url`: The URL of the AWS STS endpoint for
   * `GetCallerIdentity()`, such as `https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15`.
   * Regional endpoints are also supported. - `method`: The HTTP request method: `POST`. -
   * `headers`: The HTTP request headers, which must include: - `Authorization`: The request
   * signature. - `x-amz-date`: The time you will send the request, formatted as an [ISO8601
   * Basic](https://docs.aws.amazon.com/general/latest/gr/sigv4_elements.html#sigv4_elements_date)
   * string. This value is typically set to the current time and is used to help prevent replay
   * attacks. - `host`: The hostname of the `url` field; for example, `sts.amazonaws.com`. - `x
   * -goog-cloud-target-resource`: The full, canonical resource name of the workload identity pool
   * provider, with or without an `https:` prefix. To help ensure data integrity, we recommend
   * including this header in the `SignedHeaders` field of the signed request. For example:
   * //iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/
   * https://iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/ If you
   * are using temporary security credentials provided by AWS, you must also include the header `x
   * -amz-security-token`, with the value set to the session token. The following example shows a
   * `GetCallerIdentity` token: ``` { "headers": [ {"key": "x-amz-date", "value":
   * "20200815T015049Z"}, {"key": "Authorization", "value": "AWS4-HMAC-
   * SHA256+Credential=$credential,+SignedHeaders=host;x-amz-date;x-goog-cloud-target-
   * resource,+Signature=$signature"}, {"key": "x-goog-cloud-target-resource", "value":
   * "//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/"}, {"key":
   * "host", "value": "sts.amazonaws.com"} . ], "method": "POST", "url":
   * "https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15" } ``` You can also use a
   * Google-issued OAuth 2.0 access token with this field to obtain an access token with new
   * security attributes applied, such as a Credential Access Boundary. In this case, set
   * `subject_token_type` to `urn:ietf:params:oauth:token-type:access_token`. If an access token
   * already contains security attributes, you cannot apply additional security attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subjectToken;

  /**
   * Required. An identifier that indicates the type of the security token in the `subject_token`
   * parameter. Supported values are `urn:ietf:params:oauth:token-type:jwt`, `urn:ietf:params:oauth
   * :token-type:id_token`, `urn:ietf:params:aws:token-type:aws4_request`, and
   * `urn:ietf:params:oauth:token-type:access_token`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subjectTokenType;

  /**
   * The full resource name of the identity provider; for example:
   * `//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/`. Required
   * when exchanging an external credential for a Google access token.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudience() {
    return audience;
  }

  /**
   * The full resource name of the identity provider; for example:
   * `//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/`. Required
   * when exchanging an external credential for a Google access token.
   * @param audience audience or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setAudience(java.lang.String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which
   * indicates a token exchange.
   * @return value or {@code null} for none
   */
  public java.lang.String getGrantType() {
    return grantType;
  }

  /**
   * Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which
   * indicates a token exchange.
   * @param grantType grantType or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setGrantType(java.lang.String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * A set of features that Security Token Service supports, in addition to the standard OAuth 2.0
   * token exchange, formatted as a serialized JSON object of Options.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptions() {
    return options;
  }

  /**
   * A set of features that Security Token Service supports, in addition to the standard OAuth 2.0
   * token exchange, formatted as a serialized JSON object of Options.
   * @param options options or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setOptions(java.lang.String options) {
    this.options = options;
    return this;
  }

  /**
   * Required. An identifier for the type of requested security token. Must be
   * `urn:ietf:params:oauth:token-type:access_token`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestedTokenType() {
    return requestedTokenType;
  }

  /**
   * Required. An identifier for the type of requested security token. Must be
   * `urn:ietf:params:oauth:token-type:access_token`.
   * @param requestedTokenType requestedTokenType or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setRequestedTokenType(java.lang.String requestedTokenType) {
    this.requestedTokenType = requestedTokenType;
    return this;
  }

  /**
   * The OAuth 2.0 scopes to include on the resulting access token, formatted as a list of space-
   * delimited, case-sensitive strings. Required when exchanging an external credential for a Google
   * access token.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * The OAuth 2.0 scopes to include on the resulting access token, formatted as a list of space-
   * delimited, case-sensitive strings. Required when exchanging an external credential for a Google
   * access token.
   * @param scope scope or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Required. The input token. This token is either an external credential issued by a workload
   * identity pool provider, or a short-lived access token issued by Google. If the token is an OIDC
   * JWT, it must use the JWT format defined in [RFC 7523](https://tools.ietf.org/html/rfc7523), and
   * the `subject_token_type` must be either `urn:ietf:params:oauth:token-type:jwt` or
   * `urn:ietf:params:oauth:token-type:id_token`. The following headers are required: - `kid`: The
   * identifier of the signing key securing the JWT. - `alg`: The cryptographic algorithm securing
   * the JWT. Must be `RS256` or `ES256`. The following payload fields are required. For more
   * information, see [RFC 7523, Section 3](https://tools.ietf.org/html/rfc7523#section-3): - `iss`:
   * The issuer of the token. The issuer must provide a discovery document at the URL `/.well-known
   * /openid-configuration`, where `` is the value of this field. The document must be formatted
   * according to section 4.2 of the [OIDC 1.0 Discovery specification](https://openid.net/specs
   * /openid-connect-discovery-1_0.html#ProviderConfigurationResponse). - `iat`: The issue time, in
   * seconds, since the Unix epoch. Must be in the past. - `exp`: The expiration time, in seconds,
   * since the Unix epoch. Must be less than 48 hours after `iat`. Shorter expiration times are more
   * secure. If possible, we recommend setting an expiration time less than 6 hours. - `sub`: The
   * identity asserted in the JWT. - `aud`: For workload identity pools, this must be a value
   * specified in the allowed audiences for the workload identity pool provider, or one of the
   * audiences allowed by default if no audiences were specified. See https://cloud.google.com/iam/d
   * ocs/reference/rest/v1/projects.locations.workloadIdentityPools.providers#oidc Example header:
   * ``` { "alg": "RS256", "kid": "us-east-11" } ``` Example payload: ``` { "iss":
   * "https://accounts.google.com", "iat": 1517963104, "exp": 1517966704, "aud":
   * "//iam.googleapis.com/projects/1234567890123/locations/global/workloadIdentityPools/my-
   * pool/providers/my-provider", "sub": "113475438248934895348", "my_claims": { "additional_claim":
   * "value" } } ``` If `subject_token` is for AWS, it must be a serialized `GetCallerIdentity`
   * token. This token contains the same information as a request to the AWS [`GetCallerIdentity()`]
   * (https://docs.aws.amazon.com/STS/latest/APIReference/API_GetCallerIdentity) method, as well as
   * the AWS
   * [signature](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) for
   * the request information. Use Signature Version 4. Format the request as URL-encoded JSON, and
   * set the `subject_token_type` parameter to `urn:ietf:params:aws:token-type:aws4_request`. The
   * following parameters are required: - `url`: The URL of the AWS STS endpoint for
   * `GetCallerIdentity()`, such as `https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15`.
   * Regional endpoints are also supported. - `method`: The HTTP request method: `POST`. -
   * `headers`: The HTTP request headers, which must include: - `Authorization`: The request
   * signature. - `x-amz-date`: The time you will send the request, formatted as an [ISO8601
   * Basic](https://docs.aws.amazon.com/general/latest/gr/sigv4_elements.html#sigv4_elements_date)
   * string. This value is typically set to the current time and is used to help prevent replay
   * attacks. - `host`: The hostname of the `url` field; for example, `sts.amazonaws.com`. - `x
   * -goog-cloud-target-resource`: The full, canonical resource name of the workload identity pool
   * provider, with or without an `https:` prefix. To help ensure data integrity, we recommend
   * including this header in the `SignedHeaders` field of the signed request. For example:
   * //iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/
   * https://iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/ If you
   * are using temporary security credentials provided by AWS, you must also include the header `x
   * -amz-security-token`, with the value set to the session token. The following example shows a
   * `GetCallerIdentity` token: ``` { "headers": [ {"key": "x-amz-date", "value":
   * "20200815T015049Z"}, {"key": "Authorization", "value": "AWS4-HMAC-
   * SHA256+Credential=$credential,+SignedHeaders=host;x-amz-date;x-goog-cloud-target-
   * resource,+Signature=$signature"}, {"key": "x-goog-cloud-target-resource", "value":
   * "//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/"}, {"key":
   * "host", "value": "sts.amazonaws.com"} . ], "method": "POST", "url":
   * "https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15" } ``` You can also use a
   * Google-issued OAuth 2.0 access token with this field to obtain an access token with new
   * security attributes applied, such as a Credential Access Boundary. In this case, set
   * `subject_token_type` to `urn:ietf:params:oauth:token-type:access_token`. If an access token
   * already contains security attributes, you cannot apply additional security attributes.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubjectToken() {
    return subjectToken;
  }

  /**
   * Required. The input token. This token is either an external credential issued by a workload
   * identity pool provider, or a short-lived access token issued by Google. If the token is an OIDC
   * JWT, it must use the JWT format defined in [RFC 7523](https://tools.ietf.org/html/rfc7523), and
   * the `subject_token_type` must be either `urn:ietf:params:oauth:token-type:jwt` or
   * `urn:ietf:params:oauth:token-type:id_token`. The following headers are required: - `kid`: The
   * identifier of the signing key securing the JWT. - `alg`: The cryptographic algorithm securing
   * the JWT. Must be `RS256` or `ES256`. The following payload fields are required. For more
   * information, see [RFC 7523, Section 3](https://tools.ietf.org/html/rfc7523#section-3): - `iss`:
   * The issuer of the token. The issuer must provide a discovery document at the URL `/.well-known
   * /openid-configuration`, where `` is the value of this field. The document must be formatted
   * according to section 4.2 of the [OIDC 1.0 Discovery specification](https://openid.net/specs
   * /openid-connect-discovery-1_0.html#ProviderConfigurationResponse). - `iat`: The issue time, in
   * seconds, since the Unix epoch. Must be in the past. - `exp`: The expiration time, in seconds,
   * since the Unix epoch. Must be less than 48 hours after `iat`. Shorter expiration times are more
   * secure. If possible, we recommend setting an expiration time less than 6 hours. - `sub`: The
   * identity asserted in the JWT. - `aud`: For workload identity pools, this must be a value
   * specified in the allowed audiences for the workload identity pool provider, or one of the
   * audiences allowed by default if no audiences were specified. See https://cloud.google.com/iam/d
   * ocs/reference/rest/v1/projects.locations.workloadIdentityPools.providers#oidc Example header:
   * ``` { "alg": "RS256", "kid": "us-east-11" } ``` Example payload: ``` { "iss":
   * "https://accounts.google.com", "iat": 1517963104, "exp": 1517966704, "aud":
   * "//iam.googleapis.com/projects/1234567890123/locations/global/workloadIdentityPools/my-
   * pool/providers/my-provider", "sub": "113475438248934895348", "my_claims": { "additional_claim":
   * "value" } } ``` If `subject_token` is for AWS, it must be a serialized `GetCallerIdentity`
   * token. This token contains the same information as a request to the AWS [`GetCallerIdentity()`]
   * (https://docs.aws.amazon.com/STS/latest/APIReference/API_GetCallerIdentity) method, as well as
   * the AWS
   * [signature](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) for
   * the request information. Use Signature Version 4. Format the request as URL-encoded JSON, and
   * set the `subject_token_type` parameter to `urn:ietf:params:aws:token-type:aws4_request`. The
   * following parameters are required: - `url`: The URL of the AWS STS endpoint for
   * `GetCallerIdentity()`, such as `https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15`.
   * Regional endpoints are also supported. - `method`: The HTTP request method: `POST`. -
   * `headers`: The HTTP request headers, which must include: - `Authorization`: The request
   * signature. - `x-amz-date`: The time you will send the request, formatted as an [ISO8601
   * Basic](https://docs.aws.amazon.com/general/latest/gr/sigv4_elements.html#sigv4_elements_date)
   * string. This value is typically set to the current time and is used to help prevent replay
   * attacks. - `host`: The hostname of the `url` field; for example, `sts.amazonaws.com`. - `x
   * -goog-cloud-target-resource`: The full, canonical resource name of the workload identity pool
   * provider, with or without an `https:` prefix. To help ensure data integrity, we recommend
   * including this header in the `SignedHeaders` field of the signed request. For example:
   * //iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/
   * https://iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/ If you
   * are using temporary security credentials provided by AWS, you must also include the header `x
   * -amz-security-token`, with the value set to the session token. The following example shows a
   * `GetCallerIdentity` token: ``` { "headers": [ {"key": "x-amz-date", "value":
   * "20200815T015049Z"}, {"key": "Authorization", "value": "AWS4-HMAC-
   * SHA256+Credential=$credential,+SignedHeaders=host;x-amz-date;x-goog-cloud-target-
   * resource,+Signature=$signature"}, {"key": "x-goog-cloud-target-resource", "value":
   * "//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/"}, {"key":
   * "host", "value": "sts.amazonaws.com"} . ], "method": "POST", "url":
   * "https://sts.amazonaws.com?Action=GetCallerIdentity=2011-06-15" } ``` You can also use a
   * Google-issued OAuth 2.0 access token with this field to obtain an access token with new
   * security attributes applied, such as a Credential Access Boundary. In this case, set
   * `subject_token_type` to `urn:ietf:params:oauth:token-type:access_token`. If an access token
   * already contains security attributes, you cannot apply additional security attributes.
   * @param subjectToken subjectToken or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setSubjectToken(java.lang.String subjectToken) {
    this.subjectToken = subjectToken;
    return this;
  }

  /**
   * Required. An identifier that indicates the type of the security token in the `subject_token`
   * parameter. Supported values are `urn:ietf:params:oauth:token-type:jwt`, `urn:ietf:params:oauth
   * :token-type:id_token`, `urn:ietf:params:aws:token-type:aws4_request`, and
   * `urn:ietf:params:oauth:token-type:access_token`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubjectTokenType() {
    return subjectTokenType;
  }

  /**
   * Required. An identifier that indicates the type of the security token in the `subject_token`
   * parameter. Supported values are `urn:ietf:params:oauth:token-type:jwt`, `urn:ietf:params:oauth
   * :token-type:id_token`, `urn:ietf:params:aws:token-type:aws4_request`, and
   * `urn:ietf:params:oauth:token-type:access_token`.
   * @param subjectTokenType subjectTokenType or {@code null} for none
   */
  public GoogleIdentityStsV1ExchangeTokenRequest setSubjectTokenType(java.lang.String subjectTokenType) {
    this.subjectTokenType = subjectTokenType;
    return this;
  }

  @Override
  public GoogleIdentityStsV1ExchangeTokenRequest set(String fieldName, Object value) {
    return (GoogleIdentityStsV1ExchangeTokenRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityStsV1ExchangeTokenRequest clone() {
    return (GoogleIdentityStsV1ExchangeTokenRequest) super.clone();
  }

}
