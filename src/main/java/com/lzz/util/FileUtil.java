package com.lzz.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李壮壮 on 2019/8/7.
 */
public class FileUtil {

    private static List<String> imgFiles = new ArrayList<String>();
    private static List<String> mp4Files = new ArrayList<String>();
    static {
        imgFiles.add("img");imgFiles.add("jpg");imgFiles.add("png");
        imgFiles.add("bmp");imgFiles.add("jpeg");imgFiles.add("gif");
        imgFiles.add("tif");
        mp4Files.add("mp4");mp4Files.add("avi");mp4Files.add("flv");
        mp4Files.add("wmv");mp4Files.add("mkv");
    }
    public static boolean isImgFiles(String file) {
        for (String s : imgFiles) {
            if (file.toLowerCase().contains(s)){
                return true;
            }
        }
        return false;
    }
    public static boolean isMp4Files(String file) {
        for (String s : mp4Files) {
            if (file.toLowerCase().contains(s)){
                return true;
            }
        }
        return false;
    }
}
