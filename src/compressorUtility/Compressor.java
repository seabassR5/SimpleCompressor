package compressorUtility;

public interface Compressor {
    public static String fileType = null;
    public void write(String filename, byte[] data);
    public String getFileType();
}
