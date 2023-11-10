package org.GITHUB.Payload;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "homepage",
        "private",
        "is_template"
})
@Generated("jsonschema2pojo")
public class CreateRepo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("is_template")
    private Boolean isTemplate;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateRepo() {
    }

    /**
     *
     * @param _private
     * @param isTemplate
     * @param name
     * @param description
     * @param homepage
     */
    public CreateRepo(String name, String description, String homepage, Boolean _private, Boolean isTemplate) {
        super();
        this.name = name;
        this.description = description;
        this.homepage = homepage;
        this._private = _private;
        this.isTemplate = isTemplate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    @JsonProperty("is_template")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
