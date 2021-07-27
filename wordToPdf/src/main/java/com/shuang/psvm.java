package com.shuang;

public class psvm {
    public static void main(String[] args) {
        //aspose
        //        String docPath = "C:\\Users\\linxishui\\Desktop\\test1.doc";
        //        String pdfPath = "C:\\Users\\linxishui\\Desktop\\test.pdf";
        //        WordToPdfUtil.doc2pdf(docPath,pdfPath);

        //spire
        String docPath2 = "C:\\Users\\dell\\Desktop\\高爽.docx";
        String pdfPath2 = "C:\\Users\\dell\\Desktop\\高爽2.pdf";
        try {
            WordToPdfUtil2.word2pdf(docPath2,pdfPath2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
