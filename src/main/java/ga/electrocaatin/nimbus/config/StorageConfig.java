package ga.electrocaatin.nimbus.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("storage")
public class StorageConfig {

    public String location = "upload-dir";
}
