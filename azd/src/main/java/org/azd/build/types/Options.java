package org.azd.build.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {
    @JsonProperty("enabled")
    private boolean enabled;
    @JsonProperty("definition")
    private Definition definition;
    @JsonProperty("inputs")
    private Inputs inputs;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    @Override
    public String toString() {
        return "Options{" +
                "enabled=" + enabled +
                ", definition=" + definition +
                ", inputs=" + inputs +
                '}';
    }
}
