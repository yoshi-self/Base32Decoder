import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.yoshi_self.Base32Decoder;

/**
 * Example usage of Base32Decoder
 */
public class Main {
    public static void main(String args[]) {
        // encoded: "This is Base32Decoder"
        String encodedString = "KRUGS4ZANFZSAQTBONSTGMSEMVRW6ZDFOI======";
        Charset charset = StandardCharsets.UTF_8;
        Base32Decoder decoder = new Base32Decoder(encodedString.getBytes(charset));
        String result = decoder.decodeToString(charset);
        System.out.println(result);
    }
}
