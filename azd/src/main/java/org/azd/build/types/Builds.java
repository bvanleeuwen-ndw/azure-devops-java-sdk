package org.azd.build.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Builds {
    @JsonProperty("value")
    private List<BuildT> buildTS;

    public List<BuildT> getBuildResults() {
        return buildTS;
    }

    public void setBuildResults(List<BuildT> value) {
        this.buildTS = value;
    }

    @Override
    public String toString() {
        return "Builds{" +
                "value=" + buildTS +
                '}';
    }
}
