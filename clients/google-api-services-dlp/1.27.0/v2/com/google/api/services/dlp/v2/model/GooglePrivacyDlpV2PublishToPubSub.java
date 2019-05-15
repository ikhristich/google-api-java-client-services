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

package com.google.api.services.dlp.v2.model;

/**
 * Publish a message into given Pub/Sub topic when DlpJob has completed. The message contains a
 * single field, `DlpJobName`, which is equal to the finished job's
 * [`DlpJob.name`](/dlp/docs/reference/rest/v2/projects.dlpJobs#DlpJob). Compatible with: Inspect,
 * Risk
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2PublishToPubSub extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access
   * rights to the DLP API service account executing the long running DlpJob sending the
   * notifications. Format is projects/{project}/topics/{topic}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access
   * rights to the DLP API service account executing the long running DlpJob sending the
   * notifications. Format is projects/{project}/topics/{topic}.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access
   * rights to the DLP API service account executing the long running DlpJob sending the
   * notifications. Format is projects/{project}/topics/{topic}.
   * @param topic topic or {@code null} for none
   */
  public GooglePrivacyDlpV2PublishToPubSub setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2PublishToPubSub set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PublishToPubSub) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PublishToPubSub clone() {
    return (GooglePrivacyDlpV2PublishToPubSub) super.clone();
  }

}
