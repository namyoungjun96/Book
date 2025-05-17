package com.study.pattern.behavioral.visitor.goal;

public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(PPTFile pptFIle) {
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extract WORD.");
    }
}
