package nmu.belykh.labs.lab4;

import java.util.List;

public class SearcherListsMinMax {
    private int lengthList;
    private int widthLists;

    public void setLength(ListsOfNum listsOfNum) {
        this.lengthList = listsOfNum.getLength();
    }

    public void setWidth(ListsOfNum listsOfNum) {
        this.widthLists = listsOfNum.getWidth();
    }

    public int getMaximum(ListsOfNum listsOfNum) {
        int max = listsOfNum.getRandomLists().get(0).get(0);
        lengthList= listsOfNum.getLength();
        widthLists = listsOfNum.getWidth();
        for (List<Integer> lists : listsOfNum.getRandomLists()) {
            for (Integer num : lists) {
                if (max < num)
                    max = num;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(ListsOfNum listsOfNum) {
        int min = listsOfNum.getRandomLists().get(0).get(0);
        lengthList= listsOfNum.getLength();
        widthLists = listsOfNum.getWidth();
        for (List<Integer> lists : listsOfNum.getRandomLists()) {
            for (Integer num : lists) {
                if (min > num)
                    min = num;
            }
        }
        System.out.println("Min: " + min);
        return min;

    }
}
