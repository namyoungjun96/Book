package com.study.pattern.behavioral.visitor.error;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile > resourceFiles = listAllResourceFiles(args[0]);
//        for (ResourceFile resourceFile : resourceFiles) {
//            extractor.extract2txt(resourceFile); // 컴파일 오류 발생
//        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        // 파일 형식에 따라 Factory 메서드 방식으로 객체 (PdfFile, MordFile, PPTFile)생성 후,
        // resourceFiles에 추가
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}