
package samplesource;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "key1",
    "key2"
})
public class SampleSource {

    @JsonProperty("key1")
    private String key1;
    @JsonProperty("key2")
    private String key2;

    /**
     * 
     * @return
     *     The key1
     */
    @JsonProperty("key1")
    public String getKey1() {
        return key1;
    }

    /**
     * 
     * @param key1
     *     The key1
     */
    @JsonProperty("key1")
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    /**
     * 
     * @return
     *     The key2
     */
    @JsonProperty("key2")
    public String getKey2() {
        return key2;
    }

    /**
     * 
     * @param key2
     *     The key2
     */
    @JsonProperty("key2")
    public void setKey2(String key2) {
        this.key2 = key2;
    }

}
