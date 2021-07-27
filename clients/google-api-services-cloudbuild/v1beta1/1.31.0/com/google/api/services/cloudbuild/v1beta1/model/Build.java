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

package com.google.api.services.cloudbuild.v1beta1.model;

/**
 * A build resource in the Cloud Build API. At a high level, a `Build` describes where to find
 * source code, how to build it (for example, the builder image to run on the source), and where to
 * store the built artifacts. Fields can include the following variables, which will be expanded
 * when the build is created: - $PROJECT_ID: the project ID of the build. - $PROJECT_NUMBER: the
 * project number of the build. - $BUILD_ID: the autogenerated ID of the build. - $REPO_NAME: the
 * source repository name specified by RepoSource. - $BRANCH_NAME: the branch name specified by
 * RepoSource. - $TAG_NAME: the tag name specified by RepoSource. - $REVISION_ID or $COMMIT_SHA: the
 * commit SHA specified by RepoSource or resolved from the specified branch or tag. - $SHORT_SHA:
 * first 7 characters of $REVISION_ID or $COMMIT_SHA.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Build extends com.google.api.client.json.GenericJson {

  /**
   * Artifacts produced by the build that should be uploaded upon successful completion of all build
   * steps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Artifacts artifacts;

  /**
   * Secrets and secret environment variables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Secrets availableSecrets;

  /**
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it was triggered
   * automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildTriggerId;

  /**
   * Output only. Time at which the request to create the build was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Contains information about the build when status=FAILURE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FailureInfo failureInfo;

  /**
   * Output only. Time at which execution of the build was finished. The difference between
   * finish_time and start_time is the duration of the build's execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String finishTime;

  /**
   * Output only. Unique identifier of the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images are
   * pushed using the builder service account's credentials. The digests of the pushed images will
   * be stored in the `Build` resource's results field. If any of the images fail to be pushed, the
   * build status is marked `FAILURE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> images;

  /**
   * Output only. URL to logs for this build in Google Cloud Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logUrl;

  /**
   * Google Cloud Storage bucket where logs should be written (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file
   * names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logsBucket;

  /**
   * Output only. The 'Build' name with format:
   * `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier
   * generated by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Special options for this build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildOptions options;

  /**
   * Output only. ID of the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * TTL in queue for this build. If provided and the build is enqueued longer than this value, the
   * build will expire and the build status will be `EXPIRED`. The TTL starts ticking from
   * create_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String queueTtl;

  /**
   * Output only. Results of the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Results results;

  /**
   * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended
   * technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure
   * builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com
   * /cloud-build/docs/securing-builds/use-secrets
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Secret> secrets;

  /**
   * IAM service account whose credentials will be used at build runtime. Must be of the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of
   * the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The location of the source files to build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * Output only. A permanent fixed identifier for source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceProvenance sourceProvenance;

  /**
   * Output only. Time at which execution of the build was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. Status of the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. Customer-readable message about the current status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusDetail;

  /**
   * Required. The operations to be performed on the workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildStep> steps;

  /**
   * Substitutions data for `Build` resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> substitutions;

  /**
   * Tags for annotation of a `Build`. These are not docker tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Amount of time that this build should be allowed to run, to second granularity. If this amount
   * of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout`
   * starts ticking from `startTime`. Default time is ten minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Output only. Stores timing information for phases of the build. Valid keys are: * BUILD: time
   * to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to
   * fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or
   * images, these keys will not be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, TimeSpan> timing;

  /**
   * Output only. Non-fatal problems encountered during the execution of the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warning> warnings;

  /**
   * Artifacts produced by the build that should be uploaded upon successful completion of all build
   * steps.
   * @return value or {@code null} for none
   */
  public Artifacts getArtifacts() {
    return artifacts;
  }

  /**
   * Artifacts produced by the build that should be uploaded upon successful completion of all build
   * steps.
   * @param artifacts artifacts or {@code null} for none
   */
  public Build setArtifacts(Artifacts artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  /**
   * Secrets and secret environment variables.
   * @return value or {@code null} for none
   */
  public Secrets getAvailableSecrets() {
    return availableSecrets;
  }

  /**
   * Secrets and secret environment variables.
   * @param availableSecrets availableSecrets or {@code null} for none
   */
  public Build setAvailableSecrets(Secrets availableSecrets) {
    this.availableSecrets = availableSecrets;
    return this;
  }

  /**
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it was triggered
   * automatically.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildTriggerId() {
    return buildTriggerId;
  }

  /**
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it was triggered
   * automatically.
   * @param buildTriggerId buildTriggerId or {@code null} for none
   */
  public Build setBuildTriggerId(java.lang.String buildTriggerId) {
    this.buildTriggerId = buildTriggerId;
    return this;
  }

  /**
   * Output only. Time at which the request to create the build was received.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time at which the request to create the build was received.
   * @param createTime createTime or {@code null} for none
   */
  public Build setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Contains information about the build when status=FAILURE.
   * @return value or {@code null} for none
   */
  public FailureInfo getFailureInfo() {
    return failureInfo;
  }

  /**
   * Output only. Contains information about the build when status=FAILURE.
   * @param failureInfo failureInfo or {@code null} for none
   */
  public Build setFailureInfo(FailureInfo failureInfo) {
    this.failureInfo = failureInfo;
    return this;
  }

  /**
   * Output only. Time at which execution of the build was finished. The difference between
   * finish_time and start_time is the duration of the build's execution.
   * @return value or {@code null} for none
   */
  public String getFinishTime() {
    return finishTime;
  }

  /**
   * Output only. Time at which execution of the build was finished. The difference between
   * finish_time and start_time is the duration of the build's execution.
   * @param finishTime finishTime or {@code null} for none
   */
  public Build setFinishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

  /**
   * Output only. Unique identifier of the build.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. Unique identifier of the build.
   * @param id id or {@code null} for none
   */
  public Build setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images are
   * pushed using the builder service account's credentials. The digests of the pushed images will
   * be stored in the `Build` resource's results field. If any of the images fail to be pushed, the
   * build status is marked `FAILURE`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getImages() {
    return images;
  }

  /**
   * A list of images to be pushed upon the successful completion of all build steps. The images are
   * pushed using the builder service account's credentials. The digests of the pushed images will
   * be stored in the `Build` resource's results field. If any of the images fail to be pushed, the
   * build status is marked `FAILURE`.
   * @param images images or {@code null} for none
   */
  public Build setImages(java.util.List<java.lang.String> images) {
    this.images = images;
    return this;
  }

  /**
   * Output only. URL to logs for this build in Google Cloud Console.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogUrl() {
    return logUrl;
  }

  /**
   * Output only. URL to logs for this build in Google Cloud Console.
   * @param logUrl logUrl or {@code null} for none
   */
  public Build setLogUrl(java.lang.String logUrl) {
    this.logUrl = logUrl;
    return this;
  }

  /**
   * Google Cloud Storage bucket where logs should be written (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file
   * names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogsBucket() {
    return logsBucket;
  }

  /**
   * Google Cloud Storage bucket where logs should be written (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file
   * names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * @param logsBucket logsBucket or {@code null} for none
   */
  public Build setLogsBucket(java.lang.String logsBucket) {
    this.logsBucket = logsBucket;
    return this;
  }

  /**
   * Output only. The 'Build' name with format:
   * `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier
   * generated by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The 'Build' name with format:
   * `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier
   * generated by the service.
   * @param name name or {@code null} for none
   */
  public Build setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Special options for this build.
   * @return value or {@code null} for none
   */
  public BuildOptions getOptions() {
    return options;
  }

  /**
   * Special options for this build.
   * @param options options or {@code null} for none
   */
  public Build setOptions(BuildOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Output only. ID of the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Output only. ID of the project.
   * @param projectId projectId or {@code null} for none
   */
  public Build setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * TTL in queue for this build. If provided and the build is enqueued longer than this value, the
   * build will expire and the build status will be `EXPIRED`. The TTL starts ticking from
   * create_time.
   * @return value or {@code null} for none
   */
  public String getQueueTtl() {
    return queueTtl;
  }

  /**
   * TTL in queue for this build. If provided and the build is enqueued longer than this value, the
   * build will expire and the build status will be `EXPIRED`. The TTL starts ticking from
   * create_time.
   * @param queueTtl queueTtl or {@code null} for none
   */
  public Build setQueueTtl(String queueTtl) {
    this.queueTtl = queueTtl;
    return this;
  }

  /**
   * Output only. Results of the build.
   * @return value or {@code null} for none
   */
  public Results getResults() {
    return results;
  }

  /**
   * Output only. Results of the build.
   * @param results results or {@code null} for none
   */
  public Build setResults(Results results) {
    this.results = results;
    return this;
  }

  /**
   * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended
   * technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure
   * builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com
   * /cloud-build/docs/securing-builds/use-secrets
   * @return value or {@code null} for none
   */
  public java.util.List<Secret> getSecrets() {
    return secrets;
  }

  /**
   * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended
   * technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure
   * builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com
   * /cloud-build/docs/securing-builds/use-secrets
   * @param secrets secrets or {@code null} for none
   */
  public Build setSecrets(java.util.List<Secret> secrets) {
    this.secrets = secrets;
    return this;
  }

  /**
   * IAM service account whose credentials will be used at build runtime. Must be of the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of
   * the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * IAM service account whose credentials will be used at build runtime. Must be of the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of
   * the service account.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Build setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The location of the source files to build.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * The location of the source files to build.
   * @param source source or {@code null} for none
   */
  public Build setSource(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Output only. A permanent fixed identifier for source.
   * @return value or {@code null} for none
   */
  public SourceProvenance getSourceProvenance() {
    return sourceProvenance;
  }

  /**
   * Output only. A permanent fixed identifier for source.
   * @param sourceProvenance sourceProvenance or {@code null} for none
   */
  public Build setSourceProvenance(SourceProvenance sourceProvenance) {
    this.sourceProvenance = sourceProvenance;
    return this;
  }

  /**
   * Output only. Time at which execution of the build was started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Time at which execution of the build was started.
   * @param startTime startTime or {@code null} for none
   */
  public Build setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. Status of the build.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Status of the build.
   * @param status status or {@code null} for none
   */
  public Build setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. Customer-readable message about the current status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusDetail() {
    return statusDetail;
  }

  /**
   * Output only. Customer-readable message about the current status.
   * @param statusDetail statusDetail or {@code null} for none
   */
  public Build setStatusDetail(java.lang.String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Required. The operations to be performed on the workspace.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildStep> getSteps() {
    return steps;
  }

  /**
   * Required. The operations to be performed on the workspace.
   * @param steps steps or {@code null} for none
   */
  public Build setSteps(java.util.List<BuildStep> steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Substitutions data for `Build` resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSubstitutions() {
    return substitutions;
  }

  /**
   * Substitutions data for `Build` resource.
   * @param substitutions substitutions or {@code null} for none
   */
  public Build setSubstitutions(java.util.Map<String, java.lang.String> substitutions) {
    this.substitutions = substitutions;
    return this;
  }

  /**
   * Tags for annotation of a `Build`. These are not docker tags.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags for annotation of a `Build`. These are not docker tags.
   * @param tags tags or {@code null} for none
   */
  public Build setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Amount of time that this build should be allowed to run, to second granularity. If this amount
   * of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout`
   * starts ticking from `startTime`. Default time is ten minutes.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Amount of time that this build should be allowed to run, to second granularity. If this amount
   * of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout`
   * starts ticking from `startTime`. Default time is ten minutes.
   * @param timeout timeout or {@code null} for none
   */
  public Build setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Output only. Stores timing information for phases of the build. Valid keys are: * BUILD: time
   * to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to
   * fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or
   * images, these keys will not be included.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, TimeSpan> getTiming() {
    return timing;
  }

  /**
   * Output only. Stores timing information for phases of the build. Valid keys are: * BUILD: time
   * to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to
   * fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or
   * images, these keys will not be included.
   * @param timing timing or {@code null} for none
   */
  public Build setTiming(java.util.Map<String, TimeSpan> timing) {
    this.timing = timing;
    return this;
  }

  /**
   * Output only. Non-fatal problems encountered during the execution of the build.
   * @return value or {@code null} for none
   */
  public java.util.List<Warning> getWarnings() {
    return warnings;
  }

  /**
   * Output only. Non-fatal problems encountered during the execution of the build.
   * @param warnings warnings or {@code null} for none
   */
  public Build setWarnings(java.util.List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public Build set(String fieldName, Object value) {
    return (Build) super.set(fieldName, value);
  }

  @Override
  public Build clone() {
    return (Build) super.clone();
  }

}
