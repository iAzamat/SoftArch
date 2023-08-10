/*
 * Заказ ресурсов на облаке
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
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
 * Cloud
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-10T13:31:47.697782314Z[GMT]")

public class Cloud {
  @SerializedName("cloud_id")
  private String cloudId = null;

  @SerializedName("id_client")
  private String idClient = null;

  /**
   * Операционная система сервера
   */
  @JsonAdapter(OSEnum.Adapter.class)
  public enum OSEnum {
    @SerializedName("Windows")
    WINDOWS("Windows"),
    @SerializedName("Linux")
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OSEnum fromValue(String input) {
      for (OSEnum b : OSEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OSEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OSEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OSEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OSEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("OS")
  private OSEnum OS = null;

  @SerializedName("RAM")
  private String RAM = null;

  @SerializedName("CPU")
  private String CPU = null;

  public Cloud cloudId(String cloudId) {
    this.cloudId = cloudId;
    return this;
  }

   /**
   * Get cloudId
   * @return cloudId
  **/
  @Schema(example = "f102b615", description = "")
  public String getCloudId() {
    return cloudId;
  }

  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }

  public Cloud idClient(String idClient) {
    this.idClient = idClient;
    return this;
  }

   /**
   * Get idClient
   * @return idClient
  **/
  @Schema(example = "f102b615", required = true, description = "")
  public String getIdClient() {
    return idClient;
  }

  public void setIdClient(String idClient) {
    this.idClient = idClient;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

   /**
   * Операционная система сервера
   * @return OS
  **/
  @Schema(required = true, description = "Операционная система сервера")
  public OSEnum getOS() {
    return OS;
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud RAM(String RAM) {
    this.RAM = RAM;
    return this;
  }

   /**
   * Объем оперативной памяти
   * @return RAM
  **/
  @Schema(example = "128", required = true, description = "Объем оперативной памяти")
  public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public Cloud CPU(String CPU) {
    this.CPU = CPU;
    return this;
  }

   /**
   * Количество ядер процессора
   * @return CPU
  **/
  @Schema(example = "8", required = true, description = "Количество ядер процессора")
  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.cloudId, cloud.cloudId) &&
        Objects.equals(this.idClient, cloud.idClient) &&
        Objects.equals(this.OS, cloud.OS) &&
        Objects.equals(this.RAM, cloud.RAM) &&
        Objects.equals(this.CPU, cloud.CPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, idClient, OS, RAM, CPU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
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
