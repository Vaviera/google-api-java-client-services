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

package com.google.api.services.bigquery.model;

/**
 * Training info of a trial in hyperparameter tuning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HparamTuningTrial extends com.google.api.client.json.GenericJson {

  /**
   * Ending time of the trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTimeMs;

  /**
   * Error message for FAILED and INFEASIBLE trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Loss computed on the eval data at the end of trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double evalLoss;

  /**
   * Evaluation metrics of this trial calculated on the test data. Empty in Job API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EvaluationMetrics evaluationMetrics;

  /**
   * Hyperparameter tuning evaluation metrics of this trial calculated on the eval data. Unlike
   * evaluation_metrics, only the fields corresponding to the hparam_tuning_objectives are set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EvaluationMetrics hparamTuningEvaluationMetrics;

  /**
   * The hyperprameters selected for this trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TrainingOptions hparams;

  /**
   * Starting time of the trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTimeMs;

  /**
   * The status of the trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Loss computed on the training data at the end of trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double trainingLoss;

  /**
   * 1-based index of the trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trialId;

  /**
   * Ending time of the trial.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTimeMs() {
    return endTimeMs;
  }

  /**
   * Ending time of the trial.
   * @param endTimeMs endTimeMs or {@code null} for none
   */
  public HparamTuningTrial setEndTimeMs(java.lang.Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * Error message for FAILED and INFEASIBLE trial.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Error message for FAILED and INFEASIBLE trial.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public HparamTuningTrial setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Loss computed on the eval data at the end of trial.
   * @return value or {@code null} for none
   */
  public java.lang.Double getEvalLoss() {
    return evalLoss;
  }

  /**
   * Loss computed on the eval data at the end of trial.
   * @param evalLoss evalLoss or {@code null} for none
   */
  public HparamTuningTrial setEvalLoss(java.lang.Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * Evaluation metrics of this trial calculated on the test data. Empty in Job API.
   * @return value or {@code null} for none
   */
  public EvaluationMetrics getEvaluationMetrics() {
    return evaluationMetrics;
  }

  /**
   * Evaluation metrics of this trial calculated on the test data. Empty in Job API.
   * @param evaluationMetrics evaluationMetrics or {@code null} for none
   */
  public HparamTuningTrial setEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
    this.evaluationMetrics = evaluationMetrics;
    return this;
  }

  /**
   * Hyperparameter tuning evaluation metrics of this trial calculated on the eval data. Unlike
   * evaluation_metrics, only the fields corresponding to the hparam_tuning_objectives are set.
   * @return value or {@code null} for none
   */
  public EvaluationMetrics getHparamTuningEvaluationMetrics() {
    return hparamTuningEvaluationMetrics;
  }

  /**
   * Hyperparameter tuning evaluation metrics of this trial calculated on the eval data. Unlike
   * evaluation_metrics, only the fields corresponding to the hparam_tuning_objectives are set.
   * @param hparamTuningEvaluationMetrics hparamTuningEvaluationMetrics or {@code null} for none
   */
  public HparamTuningTrial setHparamTuningEvaluationMetrics(EvaluationMetrics hparamTuningEvaluationMetrics) {
    this.hparamTuningEvaluationMetrics = hparamTuningEvaluationMetrics;
    return this;
  }

  /**
   * The hyperprameters selected for this trial.
   * @return value or {@code null} for none
   */
  public TrainingOptions getHparams() {
    return hparams;
  }

  /**
   * The hyperprameters selected for this trial.
   * @param hparams hparams or {@code null} for none
   */
  public HparamTuningTrial setHparams(TrainingOptions hparams) {
    this.hparams = hparams;
    return this;
  }

  /**
   * Starting time of the trial.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTimeMs() {
    return startTimeMs;
  }

  /**
   * Starting time of the trial.
   * @param startTimeMs startTimeMs or {@code null} for none
   */
  public HparamTuningTrial setStartTimeMs(java.lang.Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * The status of the trial.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the trial.
   * @param status status or {@code null} for none
   */
  public HparamTuningTrial setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Loss computed on the training data at the end of trial.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTrainingLoss() {
    return trainingLoss;
  }

  /**
   * Loss computed on the training data at the end of trial.
   * @param trainingLoss trainingLoss or {@code null} for none
   */
  public HparamTuningTrial setTrainingLoss(java.lang.Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  /**
   * 1-based index of the trial.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrialId() {
    return trialId;
  }

  /**
   * 1-based index of the trial.
   * @param trialId trialId or {@code null} for none
   */
  public HparamTuningTrial setTrialId(java.lang.Long trialId) {
    this.trialId = trialId;
    return this;
  }

  @Override
  public HparamTuningTrial set(String fieldName, Object value) {
    return (HparamTuningTrial) super.set(fieldName, value);
  }

  @Override
  public HparamTuningTrial clone() {
    return (HparamTuningTrial) super.clone();
  }

}
