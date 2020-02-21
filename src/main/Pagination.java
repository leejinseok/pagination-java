package main;

import java.util.ArrayList;
import java.util.List;

public class Pagination {

    private final int currentPage;
    private final int totalPage;
    private final int chapterSize;

    private List<Integer> range = new ArrayList<>();
    private int start;
    private int end;

    private boolean isPrev;
    private boolean isNext;

    private int first;
    private int last;

    public Pagination(int currentPage, int totalPage, int chapterSize) {
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.chapterSize = chapterSize;
    }

    public void calculate() {
        int halfOfFirstChapter = chapterSize / 2;
        int halfOfLastChapter = totalPage - halfOfFirstChapter;

        if (currentPage < halfOfFirstChapter) {
            start = 1;
            end = chapterSize;
        } else if (currentPage > halfOfLastChapter) {
            start = totalPage - chapterSize + 1;
            end = totalPage;
        } else {
            int rest = (chapterSize - 1);
            int halfOfRest = rest / 2;

            start = currentPage - halfOfRest;
            end = currentPage + halfOfRest;

            if (halfOfRest % 2 != 0) {
                start = (int) Math.ceil(start);
                end = (int) Math.ceil(end);
            }
        }

        for (int i = start; i <= end; i++) {
            range.add(i);
        }

        isPrev = currentPage > 1;
        isNext =  currentPage < totalPage;
        first = 1;
        last = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getChapterSize() {
        return chapterSize;
    }

    public List<Integer> getRange() {
        return range;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isPrev() {
        return isPrev;
    }

    public boolean isNext() {
        return isNext;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }
}
