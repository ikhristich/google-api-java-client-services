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
 * Buckets values based on fixed size ranges. The Bucketing transformation can provide all of this
 * functionality, but requires more configuration. This message is provided as a convenience to the
 * user for simple bucketing strategies.
 *
 * The transformed value will be a hyphenated string of {lower_bound}-{upper_bound}, i.e if
 * lower_bound = 10 and upper_bound = 20 all values that are within this bucket will be replaced
 * with "10-20".
 *
 * This can be used on data of type: double, long.
 *
 * If the bound Value type differs from the type of data being transformed, we will first attempt
 * converting the type of the data to be transformed to match the type of the bound before
 * comparing.
 *
 * See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
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
public final class GooglePrivacyDlpV2FixedSizeBucketingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` =
   * 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10,
   * 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double bucketSize;

  /**
   * Required. Lower bound value of buckets. All values less than `lower_bound` are grouped together
   * into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are
   * replaced with the value "-10".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value lowerBound;

  /**
   * Required. Upper bound value of buckets. All values greater than upper_bound are grouped
   * together into a single bucket; for example if `upper_bound` = 89, then all values greater than
   * 89 are replaced with the value "89+".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value upperBound;

  /**
   * Required. Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` =
   * 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10,
   * 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBucketSize() {
    return bucketSize;
  }

  /**
   * Required. Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` =
   * 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10,
   * 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
   * @param bucketSize bucketSize or {@code null} for none
   */
  public GooglePrivacyDlpV2FixedSizeBucketingConfig setBucketSize(java.lang.Double bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

  /**
   * Required. Lower bound value of buckets. All values less than `lower_bound` are grouped together
   * into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are
   * replaced with the value "-10".
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getLowerBound() {
    return lowerBound;
  }

  /**
   * Required. Lower bound value of buckets. All values less than `lower_bound` are grouped together
   * into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are
   * replaced with the value "-10".
   * @param lowerBound lowerBound or {@code null} for none
   */
  public GooglePrivacyDlpV2FixedSizeBucketingConfig setLowerBound(GooglePrivacyDlpV2Value lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  /**
   * Required. Upper bound value of buckets. All values greater than upper_bound are grouped
   * together into a single bucket; for example if `upper_bound` = 89, then all values greater than
   * 89 are replaced with the value "89+".
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getUpperBound() {
    return upperBound;
  }

  /**
   * Required. Upper bound value of buckets. All values greater than upper_bound are grouped
   * together into a single bucket; for example if `upper_bound` = 89, then all values greater than
   * 89 are replaced with the value "89+".
   * @param upperBound upperBound or {@code null} for none
   */
  public GooglePrivacyDlpV2FixedSizeBucketingConfig setUpperBound(GooglePrivacyDlpV2Value upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2FixedSizeBucketingConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2FixedSizeBucketingConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2FixedSizeBucketingConfig clone() {
    return (GooglePrivacyDlpV2FixedSizeBucketingConfig) super.clone();
  }

}
