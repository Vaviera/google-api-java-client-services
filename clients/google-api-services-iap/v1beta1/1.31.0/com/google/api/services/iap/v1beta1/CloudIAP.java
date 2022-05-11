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

package com.google.api.services.iap.v1beta1;

/**
 * Service definition for CloudIAP (v1beta1).
 *
 * <p>
 * Controls access to cloud applications running on Google Cloud Platform.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/iap" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudIAPRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudIAP extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.32.1 of the Cloud Identity-Aware Proxy API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://iap.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://iap.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudIAP(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudIAP(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the V1beta1 collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudIAP iap = new CloudIAP(...);}
   *   {@code CloudIAP.V1beta1.List request = iap.v1beta1().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public V1beta1 v1beta1() {
    return new V1beta1();
  }

  /**
   * The "v1beta1" collection of methods.
   */
  public class V1beta1 {

    /**
     * Gets the access control policy for an Identity-Aware Proxy protected resource. More information
     * about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-
     * access#managing_access_via_the_api
     *
     * Create a request for the method "v1beta1.getIamPolicy".
     *
     * This request holds the parameters needed by the iap server.  After setting any optional
     * parameters, call the {@link GetIamPolicy#execute()} method to invoke the remote operation.
     *
     * @param resource REQUIRED: The resource for which the policy is being requested. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
     * @param content the {@link com.google.api.services.iap.v1beta1.model.GetIamPolicyRequest}
     * @return the request
     */
    public GetIamPolicy getIamPolicy(java.lang.String resource, com.google.api.services.iap.v1beta1.model.GetIamPolicyRequest content) throws java.io.IOException {
      GetIamPolicy result = new GetIamPolicy(resource, content);
      initialize(result);
      return result;
    }

    public class GetIamPolicy extends CloudIAPRequest<com.google.api.services.iap.v1beta1.model.Policy> {

      private static final String REST_PATH = "v1beta1/{+resource}:getIamPolicy";

      private final java.util.regex.Pattern RESOURCE_PATTERN =
          java.util.regex.Pattern.compile("^.*$");

      /**
       * Gets the access control policy for an Identity-Aware Proxy protected resource. More information
       * about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-
       * access#managing_access_via_the_api
       *
       * Create a request for the method "v1beta1.getIamPolicy".
       *
       * This request holds the parameters needed by the the iap server.  After setting any optional
       * parameters, call the {@link GetIamPolicy#execute()} method to invoke the remote operation. <p>
       * {@link
       * GetIamPolicy#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param resource REQUIRED: The resource for which the policy is being requested. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
       * @param content the {@link com.google.api.services.iap.v1beta1.model.GetIamPolicyRequest}
       * @since 1.13
       */
      protected GetIamPolicy(java.lang.String resource, com.google.api.services.iap.v1beta1.model.GetIamPolicyRequest content) {
        super(CloudIAP.this, "POST", REST_PATH, content, com.google.api.services.iap.v1beta1.model.Policy.class);
        this.resource = com.google.api.client.util.Preconditions.checkNotNull(resource, "Required parameter resource must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
      }

      @Override
      public GetIamPolicy set$Xgafv(java.lang.String $Xgafv) {
        return (GetIamPolicy) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetIamPolicy setAccessToken(java.lang.String accessToken) {
        return (GetIamPolicy) super.setAccessToken(accessToken);
      }

      @Override
      public GetIamPolicy setAlt(java.lang.String alt) {
        return (GetIamPolicy) super.setAlt(alt);
      }

      @Override
      public GetIamPolicy setCallback(java.lang.String callback) {
        return (GetIamPolicy) super.setCallback(callback);
      }

      @Override
      public GetIamPolicy setFields(java.lang.String fields) {
        return (GetIamPolicy) super.setFields(fields);
      }

      @Override
      public GetIamPolicy setKey(java.lang.String key) {
        return (GetIamPolicy) super.setKey(key);
      }

      @Override
      public GetIamPolicy setOauthToken(java.lang.String oauthToken) {
        return (GetIamPolicy) super.setOauthToken(oauthToken);
      }

      @Override
      public GetIamPolicy setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetIamPolicy) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetIamPolicy setQuotaUser(java.lang.String quotaUser) {
        return (GetIamPolicy) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetIamPolicy setUploadType(java.lang.String uploadType) {
        return (GetIamPolicy) super.setUploadType(uploadType);
      }

      @Override
      public GetIamPolicy setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetIamPolicy) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * REQUIRED: The resource for which the policy is being requested. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      @com.google.api.client.util.Key
      private java.lang.String resource;

      /** REQUIRED: The resource for which the policy is being requested. See [Resource
     names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this
     field.
       */
      public java.lang.String getResource() {
        return resource;
      }

      /**
       * REQUIRED: The resource for which the policy is being requested. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      public GetIamPolicy setResource(java.lang.String resource) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
        this.resource = resource;
        return this;
      }

      @Override
      public GetIamPolicy set(String parameterName, Object value) {
        return (GetIamPolicy) super.set(parameterName, value);
      }
    }
    /**
     * Sets the access control policy for an Identity-Aware Proxy protected resource. Replaces any
     * existing policy. More information about managing access via IAP can be found at:
     * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
     *
     * Create a request for the method "v1beta1.setIamPolicy".
     *
     * This request holds the parameters needed by the iap server.  After setting any optional
     * parameters, call the {@link SetIamPolicy#execute()} method to invoke the remote operation.
     *
     * @param resource REQUIRED: The resource for which the policy is being specified. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
     * @param content the {@link com.google.api.services.iap.v1beta1.model.SetIamPolicyRequest}
     * @return the request
     */
    public SetIamPolicy setIamPolicy(java.lang.String resource, com.google.api.services.iap.v1beta1.model.SetIamPolicyRequest content) throws java.io.IOException {
      SetIamPolicy result = new SetIamPolicy(resource, content);
      initialize(result);
      return result;
    }

    public class SetIamPolicy extends CloudIAPRequest<com.google.api.services.iap.v1beta1.model.Policy> {

      private static final String REST_PATH = "v1beta1/{+resource}:setIamPolicy";

      private final java.util.regex.Pattern RESOURCE_PATTERN =
          java.util.regex.Pattern.compile("^.*$");

      /**
       * Sets the access control policy for an Identity-Aware Proxy protected resource. Replaces any
       * existing policy. More information about managing access via IAP can be found at:
       * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
       *
       * Create a request for the method "v1beta1.setIamPolicy".
       *
       * This request holds the parameters needed by the the iap server.  After setting any optional
       * parameters, call the {@link SetIamPolicy#execute()} method to invoke the remote operation. <p>
       * {@link
       * SetIamPolicy#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param resource REQUIRED: The resource for which the policy is being specified. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
       * @param content the {@link com.google.api.services.iap.v1beta1.model.SetIamPolicyRequest}
       * @since 1.13
       */
      protected SetIamPolicy(java.lang.String resource, com.google.api.services.iap.v1beta1.model.SetIamPolicyRequest content) {
        super(CloudIAP.this, "POST", REST_PATH, content, com.google.api.services.iap.v1beta1.model.Policy.class);
        this.resource = com.google.api.client.util.Preconditions.checkNotNull(resource, "Required parameter resource must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
      }

      @Override
      public SetIamPolicy set$Xgafv(java.lang.String $Xgafv) {
        return (SetIamPolicy) super.set$Xgafv($Xgafv);
      }

      @Override
      public SetIamPolicy setAccessToken(java.lang.String accessToken) {
        return (SetIamPolicy) super.setAccessToken(accessToken);
      }

      @Override
      public SetIamPolicy setAlt(java.lang.String alt) {
        return (SetIamPolicy) super.setAlt(alt);
      }

      @Override
      public SetIamPolicy setCallback(java.lang.String callback) {
        return (SetIamPolicy) super.setCallback(callback);
      }

      @Override
      public SetIamPolicy setFields(java.lang.String fields) {
        return (SetIamPolicy) super.setFields(fields);
      }

      @Override
      public SetIamPolicy setKey(java.lang.String key) {
        return (SetIamPolicy) super.setKey(key);
      }

      @Override
      public SetIamPolicy setOauthToken(java.lang.String oauthToken) {
        return (SetIamPolicy) super.setOauthToken(oauthToken);
      }

      @Override
      public SetIamPolicy setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SetIamPolicy) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SetIamPolicy setQuotaUser(java.lang.String quotaUser) {
        return (SetIamPolicy) super.setQuotaUser(quotaUser);
      }

      @Override
      public SetIamPolicy setUploadType(java.lang.String uploadType) {
        return (SetIamPolicy) super.setUploadType(uploadType);
      }

      @Override
      public SetIamPolicy setUploadProtocol(java.lang.String uploadProtocol) {
        return (SetIamPolicy) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * REQUIRED: The resource for which the policy is being specified. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      @com.google.api.client.util.Key
      private java.lang.String resource;

      /** REQUIRED: The resource for which the policy is being specified. See [Resource
     names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this
     field.
       */
      public java.lang.String getResource() {
        return resource;
      }

      /**
       * REQUIRED: The resource for which the policy is being specified. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      public SetIamPolicy setResource(java.lang.String resource) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
        this.resource = resource;
        return this;
      }

      @Override
      public SetIamPolicy set(String parameterName, Object value) {
        return (SetIamPolicy) super.set(parameterName, value);
      }
    }
    /**
     * Returns permissions that a caller has on the Identity-Aware Proxy protected resource. If the
     * resource does not exist or the caller does not have Identity-Aware Proxy permissions a
     * [google.rpc.Code.PERMISSION_DENIED] will be returned. More information about managing access via
     * IAP can be found at: https://cloud.google.com/iap/docs/managing-
     * access#managing_access_via_the_api
     *
     * Create a request for the method "v1beta1.testIamPermissions".
     *
     * This request holds the parameters needed by the iap server.  After setting any optional
     * parameters, call the {@link TestIamPermissions#execute()} method to invoke the remote operation.
     *
     * @param resource REQUIRED: The resource for which the policy detail is being requested. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
     * @param content the {@link com.google.api.services.iap.v1beta1.model.TestIamPermissionsRequest}
     * @return the request
     */
    public TestIamPermissions testIamPermissions(java.lang.String resource, com.google.api.services.iap.v1beta1.model.TestIamPermissionsRequest content) throws java.io.IOException {
      TestIamPermissions result = new TestIamPermissions(resource, content);
      initialize(result);
      return result;
    }

    public class TestIamPermissions extends CloudIAPRequest<com.google.api.services.iap.v1beta1.model.TestIamPermissionsResponse> {

      private static final String REST_PATH = "v1beta1/{+resource}:testIamPermissions";

      private final java.util.regex.Pattern RESOURCE_PATTERN =
          java.util.regex.Pattern.compile("^.*$");

      /**
       * Returns permissions that a caller has on the Identity-Aware Proxy protected resource. If the
       * resource does not exist or the caller does not have Identity-Aware Proxy permissions a
       * [google.rpc.Code.PERMISSION_DENIED] will be returned. More information about managing access
       * via IAP can be found at: https://cloud.google.com/iap/docs/managing-
       * access#managing_access_via_the_api
       *
       * Create a request for the method "v1beta1.testIamPermissions".
       *
       * This request holds the parameters needed by the the iap server.  After setting any optional
       * parameters, call the {@link TestIamPermissions#execute()} method to invoke the remote
       * operation. <p> {@link TestIamPermissions#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param resource REQUIRED: The resource for which the policy detail is being requested. See [Resource
     *        names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
     *        this field.
       * @param content the {@link com.google.api.services.iap.v1beta1.model.TestIamPermissionsRequest}
       * @since 1.13
       */
      protected TestIamPermissions(java.lang.String resource, com.google.api.services.iap.v1beta1.model.TestIamPermissionsRequest content) {
        super(CloudIAP.this, "POST", REST_PATH, content, com.google.api.services.iap.v1beta1.model.TestIamPermissionsResponse.class);
        this.resource = com.google.api.client.util.Preconditions.checkNotNull(resource, "Required parameter resource must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
      }

      @Override
      public TestIamPermissions set$Xgafv(java.lang.String $Xgafv) {
        return (TestIamPermissions) super.set$Xgafv($Xgafv);
      }

      @Override
      public TestIamPermissions setAccessToken(java.lang.String accessToken) {
        return (TestIamPermissions) super.setAccessToken(accessToken);
      }

      @Override
      public TestIamPermissions setAlt(java.lang.String alt) {
        return (TestIamPermissions) super.setAlt(alt);
      }

      @Override
      public TestIamPermissions setCallback(java.lang.String callback) {
        return (TestIamPermissions) super.setCallback(callback);
      }

      @Override
      public TestIamPermissions setFields(java.lang.String fields) {
        return (TestIamPermissions) super.setFields(fields);
      }

      @Override
      public TestIamPermissions setKey(java.lang.String key) {
        return (TestIamPermissions) super.setKey(key);
      }

      @Override
      public TestIamPermissions setOauthToken(java.lang.String oauthToken) {
        return (TestIamPermissions) super.setOauthToken(oauthToken);
      }

      @Override
      public TestIamPermissions setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (TestIamPermissions) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public TestIamPermissions setQuotaUser(java.lang.String quotaUser) {
        return (TestIamPermissions) super.setQuotaUser(quotaUser);
      }

      @Override
      public TestIamPermissions setUploadType(java.lang.String uploadType) {
        return (TestIamPermissions) super.setUploadType(uploadType);
      }

      @Override
      public TestIamPermissions setUploadProtocol(java.lang.String uploadProtocol) {
        return (TestIamPermissions) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * REQUIRED: The resource for which the policy detail is being requested. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      @com.google.api.client.util.Key
      private java.lang.String resource;

      /** REQUIRED: The resource for which the policy detail is being requested. See [Resource
     names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this
     field.
       */
      public java.lang.String getResource() {
        return resource;
      }

      /**
       * REQUIRED: The resource for which the policy detail is being requested. See [Resource
       * names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for
       * this field.
       */
      public TestIamPermissions setResource(java.lang.String resource) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_PATTERN.matcher(resource).matches(),
              "Parameter resource must conform to the pattern " +
              "^.*$");
        }
        this.resource = resource;
        return this;
      }

      @Override
      public TestIamPermissions set(String parameterName, Object value) {
        return (TestIamPermissions) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link CloudIAP}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudIAP}. */
    @Override
    public CloudIAP build() {
      return new CloudIAP(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudIAPRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudIAPRequestInitializer(
        CloudIAPRequestInitializer cloudiapRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudiapRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
