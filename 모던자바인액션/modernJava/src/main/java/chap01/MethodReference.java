package chap01;

import java.io.File;

public class MethodReference {
    public File[] checkHiddenFile() {
//        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.isHidden();
//            }
//        });

//        File[] hiddenFiles = new File(".").listFiles();
//        for(File file : hiddenFiles) {
//            file.isHidden();
//        }

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        return hiddenFiles;
    }
}
