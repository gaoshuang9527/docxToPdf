package com.shuang;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import java.io.OutputStream;

public class WordToPdfUtil2 {
    public static void word2pdf(String inPath, String outPath) throws Exception {
        Document document = new Document();
        document.loadFromFile(inPath);
        document.saveToFile(outPath, FileFormat.PDF);
    }

    public static void word2pdf(String inPath, OutputStream outputStream){
        Document document = new Document();
        document.loadFromFile(inPath);
        document.saveToStream(outputStream,FileFormat.PDF);
    }
}