package compressorUtility.formats;

import compressorUtility.Compressor;

import java.io.*;

import java.util.zip.ZipOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.compressors.gzip.*;
import org.apache.commons.compress.utils.*;


public class GZIP implements Compressor {
    public static String fileType = "GZIP";

    @Override
    public void write(String filename, byte[] data) {
        File output = new File("gzipTest.gz");
        File input = new File(filename);
        try (GzipCompressorOutputStream out = new GzipCompressorOutputStream(new FileOutputStream(output))) {
            try {
                IOUtils.copy(new FileInputStream(input), out);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }




//        InputStream in = Files.newInputStream(Paths.get("archive.tar"));
//        OutputStream fout = Files.newOutputStream(Paths.get("archive.tar.gz"));
//


        //        BufferedOutputStream out = new BufferedInputStream(fout);
//        GZipCompressorOutputStream gzOut = new GZipCompressorOutputStream(out);
//        final byte[] buffer = new byte[buffersize];
//        int n = 0;
//        while (-1 != (n = in.read(buffer))) {
//            gzOut.write(buffer, 0, n);
//        }
//        gzOut.close();
//        in.close();

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
