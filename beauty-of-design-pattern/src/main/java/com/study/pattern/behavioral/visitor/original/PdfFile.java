package com.study.pattern.behavioral.visitor.original;

public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("Extract PDF.");
    }
}
