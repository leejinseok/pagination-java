package main;

public class Pagination {
    private final int currentPage;
    private final int totalPage;
    private final int chapterSize;
    private int[] range;
    private int start;
    private int end;

    public Pagination(int currentPage, int totalPage, int chapterSize) {
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.chapterSize = chapterSize;
    }

    public void calculate() {
//        int halfOfFirstChapter = Math.ceil(chapterSize / 2);
//        int halfOfLastChapter = totalPage - halfOfFirstChapter;

        int halfOfFirstChapter = chapterSize / 2;
        int halfOfLastChapter = totalPage - halfOfFirstChapter;

    }
}
