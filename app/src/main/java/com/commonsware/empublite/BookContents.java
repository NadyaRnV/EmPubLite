package com.commonsware.empublite;

import android.net.Uri;

import java.io.File;
import java.util.List;

/**
 * Created by monarnv on 09.07.2016.
 */
public class BookContents {
    List<BookContents.Chapter> chapters;
    File baseDir=null;

    public int getChapterCount() {
        return chapters.size();
    }

    public String getChapterFile(int position) {
        return  chapters.get(position).file;
    }

    static class Chapter {
        String file;
    }

    String getChapterPath(int position) {
        String file = getChapterFile(position);

        if (baseDir == null) {
            return("file:///android_asset/book/" + file);
        }

        return(Uri.fromFile(new File(baseDir, file)).toString());
    }

    void setBaseDir(File baseDir) {
        this.baseDir = baseDir;
    }
}
