package compressorUtility.formats;

import compressorUtility.Compressor;

public class GzipCompressor implements Compressor {
    public static String fileType = "GZIP";

    @Override
    public void write(String filename, byte[] data) {

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}