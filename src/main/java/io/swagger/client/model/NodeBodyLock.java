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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NodeBodyLock
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class NodeBodyLock {
  @SerializedName("timeToExpire")
  private Integer timeToExpire = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("ALLOW_OWNER_CHANGES")
    ALLOW_OWNER_CHANGES("ALLOW_OWNER_CHANGES"),
    @SerializedName("FULL")
    FULL("FULL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = TypeEnum.ALLOW_OWNER_CHANGES;

  /**
   * Gets or Sets lifetime
   */
  @JsonAdapter(LifetimeEnum.Adapter.class)
  public enum LifetimeEnum {
    @SerializedName("PERSISTENT")
    PERSISTENT("PERSISTENT"),
    @SerializedName("EPHEMERAL")
    EPHEMERAL("EPHEMERAL");

    private String value;

    LifetimeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LifetimeEnum fromValue(String input) {
      for (LifetimeEnum b : LifetimeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LifetimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LifetimeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LifetimeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LifetimeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("lifetime")
  private LifetimeEnum lifetime = LifetimeEnum.PERSISTENT;

  public NodeBodyLock timeToExpire(Integer timeToExpire) {
    this.timeToExpire = timeToExpire;
    return this;
  }

   /**
   * Get timeToExpire
   * minimum: 0
   * @return timeToExpire
  **/
  @Schema(description = "")
  public Integer getTimeToExpire() {
    return timeToExpire;
  }

  public void setTimeToExpire(Integer timeToExpire) {
    this.timeToExpire = timeToExpire;
  }

  public NodeBodyLock type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NodeBodyLock lifetime(LifetimeEnum lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public LifetimeEnum getLifetime() {
    return lifetime;
  }

  public void setLifetime(LifetimeEnum lifetime) {
    this.lifetime = lifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyLock nodeBodyLock = (NodeBodyLock) o;
    return Objects.equals(this.timeToExpire, nodeBodyLock.timeToExpire) &&
        Objects.equals(this.type, nodeBodyLock.type) &&
        Objects.equals(this.lifetime, nodeBodyLock.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeToExpire, type, lifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyLock {\n");
    
    sb.append("    timeToExpire: ").append(toIndentedString(timeToExpire)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
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
