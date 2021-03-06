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

package com.google.api.services.datastore.v1.model;

/**
 * The request for google.datastore.admin.v1.DatastoreAdmin.ExportEntities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1ExportEntitiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Description of what data from the project is included in the export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1EntityFilter entityFilter;

  /**
   * Client-assigned labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Location for the export metadata and data files.
   *
   * The full resource URL of the external storage location. Currently, only Google Cloud Storage is
   * supported. So output_url_prefix should be of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`,
   * where `BUCKET_NAME` is the name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional
   * Cloud Storage namespace path (this is not a Cloud Datastore namespace). For more information
   * about Cloud Storage namespace paths, see [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   *
   * The resulting files will be nested deeper than the specified URL prefix. The final output URL
   * will be provided in the google.datastore.admin.v1.ExportEntitiesResponse.output_url field. That
   * value should be used for subsequent ImportEntities operations.
   *
   * By nesting the data files deeper, the same Cloud Storage bucket can be used in multiple
   * ExportEntities operations without conflict.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUrlPrefix;

  /**
   * Description of what data from the project is included in the export.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1EntityFilter getEntityFilter() {
    return entityFilter;
  }

  /**
   * Description of what data from the project is included in the export.
   * @param entityFilter entityFilter or {@code null} for none
   */
  public GoogleDatastoreAdminV1ExportEntitiesRequest setEntityFilter(GoogleDatastoreAdminV1EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Client-assigned labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Client-assigned labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleDatastoreAdminV1ExportEntitiesRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Location for the export metadata and data files.
   *
   * The full resource URL of the external storage location. Currently, only Google Cloud Storage is
   * supported. So output_url_prefix should be of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`,
   * where `BUCKET_NAME` is the name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional
   * Cloud Storage namespace path (this is not a Cloud Datastore namespace). For more information
   * about Cloud Storage namespace paths, see [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   *
   * The resulting files will be nested deeper than the specified URL prefix. The final output URL
   * will be provided in the google.datastore.admin.v1.ExportEntitiesResponse.output_url field. That
   * value should be used for subsequent ImportEntities operations.
   *
   * By nesting the data files deeper, the same Cloud Storage bucket can be used in multiple
   * ExportEntities operations without conflict.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUrlPrefix() {
    return outputUrlPrefix;
  }

  /**
   * Location for the export metadata and data files.
   *
   * The full resource URL of the external storage location. Currently, only Google Cloud Storage is
   * supported. So output_url_prefix should be of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`,
   * where `BUCKET_NAME` is the name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional
   * Cloud Storage namespace path (this is not a Cloud Datastore namespace). For more information
   * about Cloud Storage namespace paths, see [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   *
   * The resulting files will be nested deeper than the specified URL prefix. The final output URL
   * will be provided in the google.datastore.admin.v1.ExportEntitiesResponse.output_url field. That
   * value should be used for subsequent ImportEntities operations.
   *
   * By nesting the data files deeper, the same Cloud Storage bucket can be used in multiple
   * ExportEntities operations without conflict.
   * @param outputUrlPrefix outputUrlPrefix or {@code null} for none
   */
  public GoogleDatastoreAdminV1ExportEntitiesRequest setOutputUrlPrefix(java.lang.String outputUrlPrefix) {
    this.outputUrlPrefix = outputUrlPrefix;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1ExportEntitiesRequest set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1ExportEntitiesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1ExportEntitiesRequest clone() {
    return (GoogleDatastoreAdminV1ExportEntitiesRequest) super.clone();
  }

}
