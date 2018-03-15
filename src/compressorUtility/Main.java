package compressorUtility;

import java.util.ArrayList;
import java.lang.System;

import static compressorUtility.CompressorFactory.*;

class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> compressionTypes = getCompressionOptions();
        //ArrayList<Compressor> compressionStrats = new ArrayList<>();
        for(String type: compressionTypes){
            System.out.println(type);
            createCompressor(type).getFileType();
        }
//        for( Compressor type: compressionStrats){
//            System.out.println(type.getFileType());
//        }
    }
}