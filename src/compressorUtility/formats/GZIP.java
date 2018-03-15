package compressorUtility.formats;

import compressorUtility.Compressor;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GZIP implements Compressor {
    public static String fileType = "GZIP";

    @Override
    public void write(String filename, byte[] data) {

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
