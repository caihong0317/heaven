package com.caihong.learn.service;

import java.io.File;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello git!");
        System.out.println("hello git!");
    }

    /**
     * 删除文件
     * @param srcFile 待删除文件
     */
    public static void deleteFile(File srcFile){
        if (srcFile.isFile()) {
            boolean delete = srcFile.delete();
        } else {
            File[] listFiles = srcFile.listFiles();
            //不是空目录
            if (listFiles.length>0) {
                for (File file : listFiles) {
                    if (file.isFile()) {
                        file.delete();
                    } else {
                        deleteFile(file);
                    }
                    file.delete();
                }
            }else {
                //删除空目录
                srcFile.delete();
            }
        }
    }

    public  void add(int a, int b){
        System.out.println(a +b);
    }
}
