package org.azd.core.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionControl {
    @JsonProperty("sourceControlType")
    private String sourceControlType;
    @JsonProperty("gitEnabled")
    private boolean gitEnabled;
    @JsonProperty("tfvcEnabled")
    private boolean tfvcEnabled;

    public String getSourceControlType() {
        return sourceControlType;
    }

    public void setSourceControlType(String sourceControlType) {
        this.sourceControlType = sourceControlType;
    }

    public boolean isGitEnabled() {
        return gitEnabled;
    }

    public void setGitEnabled(boolean gitEnabled) {
        this.gitEnabled = gitEnabled;
    }

    public boolean isTfvcEnabled() {
        return tfvcEnabled;
    }

    public void setTfvcEnabled(boolean tfvcEnabled) {
        this.tfvcEnabled = tfvcEnabled;
    }

    @Override
    public String toString() {
        return "VersionControl{" +
                "sourceControlType='" + sourceControlType + '\'' +
                ", gitEnabled=" + gitEnabled +
                ", tfvcEnabled=" + tfvcEnabled +
                '}';
    }
}
