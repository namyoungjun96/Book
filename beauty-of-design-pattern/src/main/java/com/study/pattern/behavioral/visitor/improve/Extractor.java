package com.study.pattern.behavioral.visitor.improve;

public class Extractor {
    public void extract2txt(PPTFile pptFile) {
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        System.out.println("Extract WORD.");
    }
}