package com.commonsware.empublite;

import java.util.List;

/**
 * Created by monarnv on 09.07.2016.
 */
public class BookContents {
    List<BookContents.Chapter> chapters;

    public int getChapterCount() {
        return chapters.size();
    }

    public String getChapterFile(int position) {
        return  chapters.get(position).file;
    }

    static class Chapter {
        String file;
    }
}
