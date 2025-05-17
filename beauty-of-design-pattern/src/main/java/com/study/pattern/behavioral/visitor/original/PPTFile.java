package com.study.pattern.behavioral.visitor.original;

public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt()

    {
// PPT 형식의 파일에서 본문을 추출하는 코드 1/ 추출한 데이터는 동일한 경로에 같은 이름을 가진 TXT 파일에 저장
        System.out.println("Extract PPT.");
    }
}
