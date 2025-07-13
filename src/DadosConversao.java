import com.google.gson.annotations.SerializedName;

public record DadosConversao(@SerializedName("base_code") String moedaBase,
                             @SerializedName("target_code") String moedaAlvo,
                             @SerializedName("conversion_result") double quantidade) {
}
