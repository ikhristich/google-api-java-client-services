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

package com.google.api.services.language.v1beta2.model;

/**
 * The syntax analysis response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeSyntaxResponse extends com.google.api.client.json.GenericJson {

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Sentences in the input document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Sentence> sentences;

  /**
   * Tokens, along with their syntactic information, in the input document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Token> tokens;

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * @param language language or {@code null} for none
   */
  public AnalyzeSyntaxResponse setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Sentences in the input document.
   * @return value or {@code null} for none
   */
  public java.util.List<Sentence> getSentences() {
    return sentences;
  }

  /**
   * Sentences in the input document.
   * @param sentences sentences or {@code null} for none
   */
  public AnalyzeSyntaxResponse setSentences(java.util.List<Sentence> sentences) {
    this.sentences = sentences;
    return this;
  }

  /**
   * Tokens, along with their syntactic information, in the input document.
   * @return value or {@code null} for none
   */
  public java.util.List<Token> getTokens() {
    return tokens;
  }

  /**
   * Tokens, along with their syntactic information, in the input document.
   * @param tokens tokens or {@code null} for none
   */
  public AnalyzeSyntaxResponse setTokens(java.util.List<Token> tokens) {
    this.tokens = tokens;
    return this;
  }

  @Override
  public AnalyzeSyntaxResponse set(String fieldName, Object value) {
    return (AnalyzeSyntaxResponse) super.set(fieldName, value);
  }

  @Override
  public AnalyzeSyntaxResponse clone() {
    return (AnalyzeSyntaxResponse) super.clone();
  }

}
