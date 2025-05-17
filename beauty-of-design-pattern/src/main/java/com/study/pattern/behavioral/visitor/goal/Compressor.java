package com.study.pattern.behavioral.visitor.goal;

public class Compressor implements Visitor {
    public void visit(PPTFile pptFile) {
        System.out.println("Compress PPT.");
    }

    public void visit(PdfFile pdfFile) {
        System.out.println("Compress PDF.");
    }

    public void visit(WordFile wordFile) {
        System.out.println("Compress WORD.");
    }
}