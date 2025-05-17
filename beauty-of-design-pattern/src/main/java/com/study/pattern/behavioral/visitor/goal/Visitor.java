package com.study.pattern.behavioral.visitor.goal;

public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFIle);
    void visit(WordFile wordFile);
}
