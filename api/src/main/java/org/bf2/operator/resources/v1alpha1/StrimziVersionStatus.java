package org.bf2.operator.resources.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;

import java.util.List;

/**
 * Define the status for installed Strimzi versions on the Kubernetes cluster
 * and if they are ready or not
 */
@Buildable(
        builderPackage = "io.fabric8.kubernetes.api.builder",
        editableEnabled = false
)
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
public class StrimziVersionStatus {

    @NotNull
    private String version;
    @NotNull
    private boolean ready;

    private List<String> kafkaVersions;

    private List<String> kafkaIbpVersions;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public List<String> getKafkaVersions() {
        return kafkaVersions;
    }

    public void setKafkaVersions(List<String> kafkaVersions) {
        this.kafkaVersions = kafkaVersions;
    }

    public List<String> getKafkaIbpVersions() {
        return kafkaIbpVersions;
    }

    public void setKafkaIbpVersions(List<String> kafkaIbpVersions) {
        this.kafkaIbpVersions = kafkaIbpVersions;
    }
}
