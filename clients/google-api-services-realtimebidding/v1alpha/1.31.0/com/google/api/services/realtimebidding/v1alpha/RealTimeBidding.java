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

package com.google.api.services.realtimebidding.v1alpha;

/**
 * Service definition for RealTimeBidding (v1alpha).
 *
 * <p>
 * Allows external bidders to manage their RTB integration with Google. This includes managing bidder endpoints, QPS quotas, configuring what ad inventory to receive via pretargeting, submitting creatives for verification, and accessing creative metadata such as approval status.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link RealTimeBiddingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class RealTimeBidding extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.32.1 of the Real-time Bidding API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://realtimebidding.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://realtimebidding.mtls.googleapis.com/";

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
  public RealTimeBidding(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  RealTimeBidding(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Bidders collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code RealTimeBidding realtimebidding = new RealTimeBidding(...);}
   *   {@code RealTimeBidding.Bidders.List request = realtimebidding.bidders().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Bidders bidders() {
    return new Bidders();
  }

  /**
   * The "bidders" collection of methods.
   */
  public class Bidders {

    /**
     * An accessor for creating requests from the BiddingFunctions collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code RealTimeBidding realtimebidding = new RealTimeBidding(...);}
     *   {@code RealTimeBidding.BiddingFunctions.List request = realtimebidding.biddingFunctions().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public BiddingFunctions biddingFunctions() {
      return new BiddingFunctions();
    }

    /**
     * The "biddingFunctions" collection of methods.
     */
    public class BiddingFunctions {

      /**
       * Activates an existing bidding function. An activated function is available for invocation for the
       * server-side TURTLEDOVE simulations.
       *
       * Create a request for the method "biddingFunctions.activate".
       *
       * This request holds the parameters needed by the realtimebidding server.  After setting any
       * optional parameters, call the {@link Activate#execute()} method to invoke the remote operation.
       *
       * @param name Required. The name of the bidding function to activate. Format:
       *        `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
       * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.ActivateBiddingFunctionRequest}
       * @return the request
       */
      public Activate activate(java.lang.String name, com.google.api.services.realtimebidding.v1alpha.model.ActivateBiddingFunctionRequest content) throws java.io.IOException {
        Activate result = new Activate(name, content);
        initialize(result);
        return result;
      }

      public class Activate extends RealTimeBiddingRequest<com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction> {

        private static final String REST_PATH = "v1alpha/{+name}:activate";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^bidders/[^/]+/biddingFunctions/[^/]+$");

        /**
         * Activates an existing bidding function. An activated function is available for invocation for
         * the server-side TURTLEDOVE simulations.
         *
         * Create a request for the method "biddingFunctions.activate".
         *
         * This request holds the parameters needed by the the realtimebidding server.  After setting any
         * optional parameters, call the {@link Activate#execute()} method to invoke the remote operation.
         * <p> {@link
         * Activate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Required. The name of the bidding function to activate. Format:
       *        `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.ActivateBiddingFunctionRequest}
         * @since 1.13
         */
        protected Activate(java.lang.String name, com.google.api.services.realtimebidding.v1alpha.model.ActivateBiddingFunctionRequest content) {
          super(RealTimeBidding.this, "POST", REST_PATH, content, com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^bidders/[^/]+/biddingFunctions/[^/]+$");
          }
        }

        @Override
        public Activate set$Xgafv(java.lang.String $Xgafv) {
          return (Activate) super.set$Xgafv($Xgafv);
        }

        @Override
        public Activate setAccessToken(java.lang.String accessToken) {
          return (Activate) super.setAccessToken(accessToken);
        }

        @Override
        public Activate setAlt(java.lang.String alt) {
          return (Activate) super.setAlt(alt);
        }

        @Override
        public Activate setCallback(java.lang.String callback) {
          return (Activate) super.setCallback(callback);
        }

        @Override
        public Activate setFields(java.lang.String fields) {
          return (Activate) super.setFields(fields);
        }

        @Override
        public Activate setKey(java.lang.String key) {
          return (Activate) super.setKey(key);
        }

        @Override
        public Activate setOauthToken(java.lang.String oauthToken) {
          return (Activate) super.setOauthToken(oauthToken);
        }

        @Override
        public Activate setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Activate) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Activate setQuotaUser(java.lang.String quotaUser) {
          return (Activate) super.setQuotaUser(quotaUser);
        }

        @Override
        public Activate setUploadType(java.lang.String uploadType) {
          return (Activate) super.setUploadType(uploadType);
        }

        @Override
        public Activate setUploadProtocol(java.lang.String uploadProtocol) {
          return (Activate) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the bidding function to activate. Format:
         * `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. The name of the bidding function to activate. Format:
       `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. The name of the bidding function to activate. Format:
         * `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        public Activate setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^bidders/[^/]+/biddingFunctions/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Activate set(String parameterName, Object value) {
          return (Activate) super.set(parameterName, value);
        }
      }
      /**
       * Archives an existing bidding function. An archived function will not be available for function
       * invocation for the server-side TURTLEDOVE simulations unless it is activated.
       *
       * Create a request for the method "biddingFunctions.archive".
       *
       * This request holds the parameters needed by the realtimebidding server.  After setting any
       * optional parameters, call the {@link Archive#execute()} method to invoke the remote operation.
       *
       * @param name Required. The name of the bidding function to archive. Format:
       *        `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
       * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.ArchiveBiddingFunctionRequest}
       * @return the request
       */
      public Archive archive(java.lang.String name, com.google.api.services.realtimebidding.v1alpha.model.ArchiveBiddingFunctionRequest content) throws java.io.IOException {
        Archive result = new Archive(name, content);
        initialize(result);
        return result;
      }

      public class Archive extends RealTimeBiddingRequest<com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction> {

        private static final String REST_PATH = "v1alpha/{+name}:archive";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^bidders/[^/]+/biddingFunctions/[^/]+$");

        /**
         * Archives an existing bidding function. An archived function will not be available for function
         * invocation for the server-side TURTLEDOVE simulations unless it is activated.
         *
         * Create a request for the method "biddingFunctions.archive".
         *
         * This request holds the parameters needed by the the realtimebidding server.  After setting any
         * optional parameters, call the {@link Archive#execute()} method to invoke the remote operation.
         * <p> {@link
         * Archive#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Required. The name of the bidding function to archive. Format:
       *        `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.ArchiveBiddingFunctionRequest}
         * @since 1.13
         */
        protected Archive(java.lang.String name, com.google.api.services.realtimebidding.v1alpha.model.ArchiveBiddingFunctionRequest content) {
          super(RealTimeBidding.this, "POST", REST_PATH, content, com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^bidders/[^/]+/biddingFunctions/[^/]+$");
          }
        }

        @Override
        public Archive set$Xgafv(java.lang.String $Xgafv) {
          return (Archive) super.set$Xgafv($Xgafv);
        }

        @Override
        public Archive setAccessToken(java.lang.String accessToken) {
          return (Archive) super.setAccessToken(accessToken);
        }

        @Override
        public Archive setAlt(java.lang.String alt) {
          return (Archive) super.setAlt(alt);
        }

        @Override
        public Archive setCallback(java.lang.String callback) {
          return (Archive) super.setCallback(callback);
        }

        @Override
        public Archive setFields(java.lang.String fields) {
          return (Archive) super.setFields(fields);
        }

        @Override
        public Archive setKey(java.lang.String key) {
          return (Archive) super.setKey(key);
        }

        @Override
        public Archive setOauthToken(java.lang.String oauthToken) {
          return (Archive) super.setOauthToken(oauthToken);
        }

        @Override
        public Archive setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Archive) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Archive setQuotaUser(java.lang.String quotaUser) {
          return (Archive) super.setQuotaUser(quotaUser);
        }

        @Override
        public Archive setUploadType(java.lang.String uploadType) {
          return (Archive) super.setUploadType(uploadType);
        }

        @Override
        public Archive setUploadProtocol(java.lang.String uploadProtocol) {
          return (Archive) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the bidding function to archive. Format:
         * `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. The name of the bidding function to archive. Format:
       `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. The name of the bidding function to archive. Format:
         * `bidders/{bidder_account_id}/biddingFunction/{bidding_function_name}`
         */
        public Archive setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^bidders/[^/]+/biddingFunctions/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Archive set(String parameterName, Object value) {
          return (Archive) super.set(parameterName, value);
        }
      }
      /**
       * Creates a new bidding function.
       *
       * Create a request for the method "biddingFunctions.create".
       *
       * This request holds the parameters needed by the realtimebidding server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param parent Required. The name of the bidder for which to create the bidding function. Format:
       *        `bidders/{bidderAccountId}`
       * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction}
       * @return the request
       */
      public Create create(java.lang.String parent, com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction content) throws java.io.IOException {
        Create result = new Create(parent, content);
        initialize(result);
        return result;
      }

      public class Create extends RealTimeBiddingRequest<com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction> {

        private static final String REST_PATH = "v1alpha/{+parent}/biddingFunctions";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^bidders/[^/]+$");

        /**
         * Creates a new bidding function.
         *
         * Create a request for the method "biddingFunctions.create".
         *
         * This request holds the parameters needed by the the realtimebidding server.  After setting any
         * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
         * <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Required. The name of the bidder for which to create the bidding function. Format:
       *        `bidders/{bidderAccountId}`
         * @param content the {@link com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction}
         * @since 1.13
         */
        protected Create(java.lang.String parent, com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction content) {
          super(RealTimeBidding.this, "POST", REST_PATH, content, com.google.api.services.realtimebidding.v1alpha.model.BiddingFunction.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^bidders/[^/]+$");
          }
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the bidder for which to create the bidding function. Format:
         * `bidders/{bidderAccountId}`
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Required. The name of the bidder for which to create the bidding function. Format:
       `bidders/{bidderAccountId}`
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Required. The name of the bidder for which to create the bidding function. Format:
         * `bidders/{bidderAccountId}`
         */
        public Create setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^bidders/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }
      /**
       * Lists the bidding functions that a bidder currently has registered.
       *
       * Create a request for the method "biddingFunctions.list".
       *
       * This request holds the parameters needed by the realtimebidding server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
       *
       * @param parent Required. Name of the bidder whose bidding functions will be listed. Format:
       *        `bidders/{bidder_account_id}`
       * @return the request
       */
      public List list(java.lang.String parent) throws java.io.IOException {
        List result = new List(parent);
        initialize(result);
        return result;
      }

      public class List extends RealTimeBiddingRequest<com.google.api.services.realtimebidding.v1alpha.model.ListBiddingFunctionsResponse> {

        private static final String REST_PATH = "v1alpha/{+parent}/biddingFunctions";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^bidders/[^/]+$");

        /**
         * Lists the bidding functions that a bidder currently has registered.
         *
         * Create a request for the method "biddingFunctions.list".
         *
         * This request holds the parameters needed by the the realtimebidding server.  After setting any
         * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
         * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Required. Name of the bidder whose bidding functions will be listed. Format:
       *        `bidders/{bidder_account_id}`
         * @since 1.13
         */
        protected List(java.lang.String parent) {
          super(RealTimeBidding.this, "GET", REST_PATH, null, com.google.api.services.realtimebidding.v1alpha.model.ListBiddingFunctionsResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^bidders/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public List set$Xgafv(java.lang.String $Xgafv) {
          return (List) super.set$Xgafv($Xgafv);
        }

        @Override
        public List setAccessToken(java.lang.String accessToken) {
          return (List) super.setAccessToken(accessToken);
        }

        @Override
        public List setAlt(java.lang.String alt) {
          return (List) super.setAlt(alt);
        }

        @Override
        public List setCallback(java.lang.String callback) {
          return (List) super.setCallback(callback);
        }

        @Override
        public List setFields(java.lang.String fields) {
          return (List) super.setFields(fields);
        }

        @Override
        public List setKey(java.lang.String key) {
          return (List) super.setKey(key);
        }

        @Override
        public List setOauthToken(java.lang.String oauthToken) {
          return (List) super.setOauthToken(oauthToken);
        }

        @Override
        public List setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (List) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public List setQuotaUser(java.lang.String quotaUser) {
          return (List) super.setQuotaUser(quotaUser);
        }

        @Override
        public List setUploadType(java.lang.String uploadType) {
          return (List) super.setUploadType(uploadType);
        }

        @Override
        public List setUploadProtocol(java.lang.String uploadProtocol) {
          return (List) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. Name of the bidder whose bidding functions will be listed. Format:
         * `bidders/{bidder_account_id}`
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Required. Name of the bidder whose bidding functions will be listed. Format:
       `bidders/{bidder_account_id}`
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Required. Name of the bidder whose bidding functions will be listed. Format:
         * `bidders/{bidder_account_id}`
         */
        public List setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^bidders/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        /** The maximum number of bidding functions to return. */
        @com.google.api.client.util.Key
        private java.lang.Integer pageSize;

        /** The maximum number of bidding functions to return.
         */
        public java.lang.Integer getPageSize() {
          return pageSize;
        }

        /** The maximum number of bidding functions to return. */
        public List setPageSize(java.lang.Integer pageSize) {
          this.pageSize = pageSize;
          return this;
        }

        /**
         * A token identifying a page of results the server should return. This value is received
         * from a previous `ListBiddingFunctions` call in
         * ListBiddingFunctionsResponse.nextPageToken.
         */
        @com.google.api.client.util.Key
        private java.lang.String pageToken;

        /** A token identifying a page of results the server should return. This value is received from a
       previous `ListBiddingFunctions` call in ListBiddingFunctionsResponse.nextPageToken.
         */
        public java.lang.String getPageToken() {
          return pageToken;
        }

        /**
         * A token identifying a page of results the server should return. This value is received
         * from a previous `ListBiddingFunctions` call in
         * ListBiddingFunctionsResponse.nextPageToken.
         */
        public List setPageToken(java.lang.String pageToken) {
          this.pageToken = pageToken;
          return this;
        }

        @Override
        public List set(String parameterName, Object value) {
          return (List) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link RealTimeBidding}.
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

    /** Builds a new instance of {@link RealTimeBidding}. */
    @Override
    public RealTimeBidding build() {
      return new RealTimeBidding(this);
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
     * Set the {@link RealTimeBiddingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setRealTimeBiddingRequestInitializer(
        RealTimeBiddingRequestInitializer realtimebiddingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(realtimebiddingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
