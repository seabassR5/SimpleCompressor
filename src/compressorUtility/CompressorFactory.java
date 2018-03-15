package compressorUtility;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;
public class CompressorFactory {
        public static Compressor createCompressor(String name) {
            Compressor jClass = null;
            try {
                jClass = (Compressor) Class.forName("compressorUtility.formats." + name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Unsuported");
                e.printStackTrace();
            }
            return  jClass;

        }
        public static ArrayList<String> getCompressionOptions(){
            ArrayList<String> fileTypes = new ArrayList<>();
            String[] availableTypes = new File("../SReyes_Strategy_F18/src/compressorUtility/formats").list();

            for(String type: availableTypes){
                //System.out.println(type.split("\\.")[0]);
                fileTypes.add(type.split("\\.")[0]);
            }

            return fileTypes;
        }

}
