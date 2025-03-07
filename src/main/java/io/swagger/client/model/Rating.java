/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.RatingAggregate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * A person can rate an item of content by liking it. They can also remove their like of an item of content. API methods exist to get a list of ratings and to add a new rating. 
 */
@Schema(description = "A person can rate an item of content by liking it. They can also remove their like of an item of content. API methods exist to get a list of ratings and to add a new rating. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class Rating {
  @SerializedName("id")
  private String id = null;

  @SerializedName("aggregate")
  private RatingAggregate aggregate = null;

  @SerializedName("ratedAt")
  private OffsetDateTime ratedAt = null;

  @SerializedName("myRating")
  private String myRating = null;

  public Rating id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rating aggregate(RatingAggregate aggregate) {
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @Schema(required = true, description = "")
  public RatingAggregate getAggregate() {
    return aggregate;
  }

  public void setAggregate(RatingAggregate aggregate) {
    this.aggregate = aggregate;
  }

  public Rating ratedAt(OffsetDateTime ratedAt) {
    this.ratedAt = ratedAt;
    return this;
  }

   /**
   * Get ratedAt
   * @return ratedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getRatedAt() {
    return ratedAt;
  }

  public void setRatedAt(OffsetDateTime ratedAt) {
    this.ratedAt = ratedAt;
  }

  public Rating myRating(String myRating) {
    this.myRating = myRating;
    return this;
  }

   /**
   * The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.
   * @return myRating
  **/
  @Schema(description = "The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.")
  public String getMyRating() {
    return myRating;
  }

  public void setMyRating(String myRating) {
    this.myRating = myRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.id, rating.id) &&
        Objects.equals(this.aggregate, rating.aggregate) &&
        Objects.equals(this.ratedAt, rating.ratedAt) &&
        Objects.equals(this.myRating, rating.myRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, aggregate, ratedAt, myRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
    sb.append("    ratedAt: ").append(toIndentedString(ratedAt)).append("\n");
    sb.append("    myRating: ").append(toIndentedString(myRating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
