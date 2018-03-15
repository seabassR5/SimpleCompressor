package compressorUtility.formats;

import compressorUtility.Compressor;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.
import java.util.zip.ZipOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.zip.


public class GZIP implements Compressor {
    public static String fileType = "GZIP";

    @Override
    public void write(String filename, byte[] data) {

        InputStream in = Files.newInputStream(Paths.get("archive.tar"));
        OutputStream fout = Files.newOutputStream(Paths.get("archive.tar.gz"));
        BufferedOutputStream out = new BufferedInputStream(fout);
        GZipCompressorOutputStream gzOut = new GZipCompressorOutputStream(out);
        final byte[] buffer = new byte[buffersize];
        int n = 0;
        while (-1 != (n = in.read(buffer))) {
            gzOut.write(buffer, 0, n);
        }
        gzOut.close();
        in.close();

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
