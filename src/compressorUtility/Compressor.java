package compressorUtility;
import java.io.IOException;
public interface Compressor {
    public static String fileType = null;
    public void write(String filename, byte[] data) throws IOException;
    public String getFileType();
}
